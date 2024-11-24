package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "task")

public class Task {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "task_id")
  private Long taskId;
  @Column(name = "task_date_creation")
  private Date taskDateCreation;
  @Column(name = "task_status")
  private String taskStatus;

  @OneToOne
  @JoinColumn(name = "application_id")
  private Application application;

  @ManyToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;

}
