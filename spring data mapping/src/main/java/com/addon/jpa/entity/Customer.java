package com.addon.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;
// declaring relation
@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
// customer_foreignKey = cp_fk
@JoinColumn(name = "cp_fk", referencedColumnName =  "id")
    private List<Product> products;


}
