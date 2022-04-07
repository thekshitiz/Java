package com.mycompany.propertymanagement.entity;

import javax.persistence.*;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Entity
@Table(name = "PROPERTY_TABLE")

@NoArgsConstructor

public class PropertyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // to generate auto increment value for id
    private Long id;
    @Column(name = "PROPERTY_TITLE", nullable = false)
    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private String price;
    private String address;

}
