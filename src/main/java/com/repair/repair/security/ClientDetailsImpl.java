package com.repair.repair.security;

import com.repair.repair.models.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;


@Data
@AllArgsConstructor
public class ClientDetailsImpl implements UserDetails {

    private Long clientId;
    private String fullName;
    private String phoneNumber;
    private String mail;
    private String password;

    public static ClientDetailsImpl build(Client client){
        return new ClientDetailsImpl(
                client.getClientId(),
                client.getFullName(),
                client.getPhoneNumber(),
                client.getMail(),
                client.getPassword());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return mail;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
