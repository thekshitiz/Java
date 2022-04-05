package com.mycompany.propertymanagement.service;

import com.mycompany.propertymanagement.dto.PropertyDTO;

/* While in the case of an interface only
those behaviours of an object are present,
 those are implemented by the class.*/
public interface PropertyService {
    public PropertyDTO saveProperty(PropertyDTO propertyDTO);
}
