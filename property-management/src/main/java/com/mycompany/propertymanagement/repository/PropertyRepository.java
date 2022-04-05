package com.mycompany.propertymanagement.repository;

import com.mycompany.propertymanagement.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

// interface takes 2 parameters
public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {

}
