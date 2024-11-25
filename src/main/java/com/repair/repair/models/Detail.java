package com.repair.repair.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detail")
public class Detail {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "detail_id")
  private Long detailId;
  @Column(name = "detail_name")
  private String detailName;
  @Column(name = "detail_brand")
  private String detailBrand;
  @Column(name = "detail_model")
  private String detailModel;
  @Column(name = "detail_price")
  private float detailPrice;
  @Column(name = "detail_quantity")
  private int detailQuantity;

}
