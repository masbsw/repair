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
  @Column(name = "employee_login")
  private String employeeLogin;
  @Column(name = "employee_password")
  private String employeePassword;
  @Column(name = "employee_firstname")
  private String employeeFirstname;
  @Column(name = "employee_lastname")
  private String employeeLastname;
  @Column(name = "employee_middlename")
  private String employeeMiddlename;
  @Column(name = "employee_post")
  private String employeePost;

}
