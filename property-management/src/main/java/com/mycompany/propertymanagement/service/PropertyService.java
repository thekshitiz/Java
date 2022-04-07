package com.mycompany.propertymanagement.service;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.mycompany.propertymanagement.dto.PropertyDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/* While in the case of an interface only
those behaviours of an object are present,
 those are implemented by the class.*/
public interface PropertyService {
     PropertyDTO saveProperty(PropertyDTO propertyDTO);
     List<PropertyDTO> getAllProperties();
     PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);
     PropertyDTO updatePropertyDescription(@RequestBody PropertyDTO propertyDTO, Long propertyId);

}