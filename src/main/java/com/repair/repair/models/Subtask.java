package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "subtask")

public class Subtask {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "subtask_id")
  private Long subtaskId;
  @Column(name = "subtask_description")
  private String subtaskDescription;
  @Column(name = "subtask_status")
  private String subtaskStatus;
  @Column(name = "subtask_deadline")
  private Date subtaskDeadline;

  @ManyToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;

  @OneToOne // у одной подзадачи одна задача. у одной задачи много подзадач???????
  @JoinColumn(name = "task_id")
  private Task task;

  @ManyToOne
  @JoinColumn(name = "detail_id")
  private Detail detail;

  @ManyToOne
  @JoinColumn(name = "service_id")
  private Service service;

}
