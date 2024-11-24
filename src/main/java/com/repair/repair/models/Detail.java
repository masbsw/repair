package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detail")
public class Detail {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "component_id")
  private Long componentId;
  @Column(name = "component_name")
  private String componentName;
  @Column(name = "component_brand")
  private String componentBrand;
  @Column(name = "component_model")
  private String componentModel;
  @Column(name = "component_price")
  private float componentPrice;
  @Column(name = "component_quantity")
  private int componentQuantity;

}
