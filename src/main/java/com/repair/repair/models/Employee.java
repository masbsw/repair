package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")

public class Employee {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "employee_id")
  private Long employeeId;
  @Column(name = "full_name")
  private String fullName;
  @Column(name = "phone_number")
  private String phoneNumber;
  @Column(name = "mail")
  private String mail;
  @Column(name = "password")
  private String password;
  @Column(name ="post")
  private String post;

}
