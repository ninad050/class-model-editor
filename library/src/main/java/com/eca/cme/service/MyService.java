package com.eca.cme.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.eca.cme.entities.Location;



@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {

    private final ServiceProperties serviceProperties;

    public MyService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String message() {
        return this.serviceProperties.getMessage();
    }
    
    public List<Location> getAllLocation(){
    	Location l = new Location();
    	l.setId(1);
    	l.setName("Ninad");
    	l.setType("Gladiator");
    	List<Location> l1 = new ArrayList();
    	l1.add(l);
		return l1;
    	
    }
}
