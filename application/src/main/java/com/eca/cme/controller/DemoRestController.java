package com.eca.cme.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eca.cme.entities.Location;
import com.eca.cme.service.MyService;

@RestController
public class DemoRestController {
	
	@Autowired
	private  MyService myService;
	
	@GetMapping("/home")
    public String home() {
        return this.myService.message();
    }
	
	@GetMapping("/location")
	public List<Location> getAllLocations(){
		
		return this.myService.getAllLocation();
	}
 
}
