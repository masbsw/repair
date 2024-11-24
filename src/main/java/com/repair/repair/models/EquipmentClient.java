package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "equipmentClient")

public class EquipmentClient {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "equipment_client_id)")
  private Long equipmentClientId;
  @Column(name = "equipment_client_name")
  private String equipmentClientName;
  @Column(name = "equipment_client_brand")
  private String equipmentClientBrand;
  @Column(name = "equipment_client_model")
  private String equipmentClientModel;

  @ManyToOne
  @JoinColumn(name = "client_id")
  private Client client;

}
