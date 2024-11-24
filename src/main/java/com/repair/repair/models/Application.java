package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "application")

public class Application {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "application_id")
  private Long applicationId;
  @Column(name = "application_date_creation")
  private Date applicationDateCreation;
  @Column(name = "application_date_end")
  private Date applicationDateEnd;
  @Column(name = "application_price")
  private float applicationPrice;

  @OneToOne
  @JoinColumn(name = "equipment_client_id")
  private EquipmentClient equipmentClient;
}
