package com.prop.management.controller;

import com.prop.management.entity.Property;
import com.prop.management.service.PropertyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/properties")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService){
        this.propertyService=propertyService;
    }

    @GetMapping
    public List<Property> getAllProperties(){
        return propertyService.getAllProperties();
    }

    @PostMapping
    public Property addProperty(@RequestBody Property property){
        return propertyService.addNewProperty(property);
    }
}
