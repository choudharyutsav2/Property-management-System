package com.prop.management.service;

import com.prop.management.entity.Property;
import  org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class PropertyService {

    private final List<Property> propertyList = new ArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public List<Property> getAllProperties(){
        return propertyList;
    }

    public Property addNewProperty(Property property){
        property.setId((long) idCounter.getAndIncrement());
        propertyList.add(property);
        return property;
    }
}
