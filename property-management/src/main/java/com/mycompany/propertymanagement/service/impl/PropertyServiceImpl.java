package com.mycompany.propertymanagement.service.impl;

import com.mycompany.propertymanagement.converter.PropertyConverter;
import com.mycompany.propertymanagement.dto.PropertyDTO;
import com.mycompany.propertymanagement.entity.PropertyEntity;
import com.mycompany.propertymanagement.repository.PropertyRepository;
import com.mycompany.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// service annotation makes PropertyServiceImpl object as singleton instance
// next time when request is made for this object, same created object is returned making it memory efficient
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConverter propertyConverter;

    @Override

// convert propertyDTO to property entity
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
PropertyEntity pe = propertyConverter.convertDTOtoEntity(propertyDTO);
       pe = propertyRepository.save(pe);

       propertyDTO = propertyConverter.convertEntityToDTO(pe);

        return propertyDTO;
        // use of abstract pattern converting dto to entity
    }
}
