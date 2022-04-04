package com.addon.jpa.repository;

import com.addon.jpa.dto.OrderResponse;
import com.addon.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Integer >{
    // c and p in the query is alias for column name
    // specify package name and class name so that spring boot recognizes

@Query("select new com.addon.jpa.dto.OrderResponse( c.name, p.productName)  FROM Customer c JOIN c.products p")
 public List<OrderResponse> getJoinInformation();

// to verify the method we need to call this method from controller
}

