package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "service")
public class Service {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "service_id")
  private Long serviceId;
  @Column(name = "service_name")
  private String serviceName;
  @Column(name = "service_description")
  private String serviceDescription;
  @Column(name = "service_price")
  private float servicePrice;
}
