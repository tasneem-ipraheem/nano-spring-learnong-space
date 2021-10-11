package com.udacity.bootstrap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udacity.bootstrap.entity.Location;
import com.udacity.bootstrap.repository.LocationRepository;
import com.udacity.bootstrap.repository.TestIf;

@Service
public class LocationServiceImpl implements LocationService {
   
//	@Autowired
    LocationRepository locationRepository;
    TestIf testIf;
    

    public LocationServiceImpl(LocationRepository locationRepository , TestIf testIf) {
		this.locationRepository = locationRepository;
		this.testIf = testIf;
	}


	public List<Location> retrieveLocations() {
        return (List<Location>) locationRepository.findAll();
    }
	
	
	public List<String> getAddress() {
		
		return testIf.getAddress();
		
	}


	@Override
	public List<String> getName() {
        return locationRepository.getName();

	}
}
