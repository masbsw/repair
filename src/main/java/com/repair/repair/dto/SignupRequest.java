package com.repair.repair.dto;


import lombok.Data;

@Data
public class SignupRequest {
    private String fullName;
    private String phoneNumber;
    private String mail;
    private String password;
}
