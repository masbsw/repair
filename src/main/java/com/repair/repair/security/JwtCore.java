package com.repair.repair.security;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class JwtCore {
    @Value("${repair.app.secret}")
    private String secret;
    @Value("${repair.app.lifeTime}")
    private int lifeTime;

    public String generateToken(Authentication authentication){
        ClientDetailsImpl clientDetails = (ClientDetailsImpl)authentication.getPrincipal();
        return Jwts.builder().setSubject((clientDetails.getUsername())).setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + lifeTime))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }


}
