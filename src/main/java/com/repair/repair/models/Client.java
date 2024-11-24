package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "client")
public class Client {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "client_id")
  private Long clientId;
  @Column(name = "client_login")
  private String clientLogin;
  @Column(name = "client_password")
  private String clientPassword;
  @Column(name = "client_firstname")
  private String clientFirstname;
  @Column(name = "client_lastname")
  private String clientLastname;
  @Column(name = "client_middlename")
  private String clientMiddlename;
}
