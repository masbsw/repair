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
  @Column(name = "full_name")
  private String fullName;
  @Column(name = "phone_number")
  private String phoneNumber;
  @Column(name = "mail")
  private String mail;
  @Column(name = "password")
  private String password;
}
