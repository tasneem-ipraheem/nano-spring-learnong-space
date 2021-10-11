package com.udacity.bootstrap.web;

import com.udacity.bootstrap.entity.Location;
import com.udacity.bootstrap.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    private LocationService locationService;

//    @Autowired
//    public void setLocationService(LocationService locationService) {
//        this.locationService = locationService;
//    }
    
    public LocationController(LocationService locationService) {
    	 this.locationService = locationService;		
	}

    @GetMapping("/location")
    public ResponseEntity<List<Location>> getAllLocations() {
        List<Location> list = locationService.retrieveLocations();
        return new ResponseEntity<List<Location>>(list, HttpStatus.OK);
    }
    
    @GetMapping("/address")
    public ResponseEntity<List<String>> getAllLAddress() {
        List<String> list = locationService.getAddress();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }
    
    @GetMapping("/names")
    public ResponseEntity<List<String>> getAllNames() {
        List<String> list = locationService.getName();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }
    
    

}
