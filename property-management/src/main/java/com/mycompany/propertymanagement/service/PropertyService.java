package com.mycompany.propertymanagement.service;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.mycompany.propertymanagement.dto.PropertyDTO;
import org.springframework.web.bind.annotation.RequestBody;

/* While in the case of an interface only
those behaviours of an object are present,
 those are implemented by the class.*/
public interface PropertyService {
<<<<<<< HEAD
     PropertyDTO saveProperty(PropertyDTO propertyDTO);
     List<PropertyDTO> getAllProperties();
     PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);
     PropertyDTO updatePropertyDescription(@RequestBody PropertyDTO propertyDTO, Long propertyId);

=======
    public PropertyDTO saveProperty(PropertyDTO propertyDTO);
>>>>>>> parent of 7e937cc (wednesday practice)
}
