package com.repair.repair.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtCore {

    private final SecretKey secretKey; // Используем SecretKey вместо строки
    private final int lifeTime;

    public JwtCore(@Value("${repair.app.lifeTime}") int lifeTime) {
        // Генерация безопасного ключа для HS256
        this.secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        this.lifeTime = lifeTime;
    }

    public String generateToken(Authentication authentication) {
        ClientDetailsImpl clientDetails = (ClientDetailsImpl) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(clientDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + lifeTime))
                .signWith(secretKey) // Используем SecretKey для подписи
                .compact();
    }

    public String getNameFromJwt(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey) // Используем SecretKey для проверки подписи
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
