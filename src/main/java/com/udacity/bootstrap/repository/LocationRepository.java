package com.udacity.bootstrap.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.CrudRepository;

import com.udacity.bootstrap.entity.Location;

@Mapper
public interface LocationRepository extends CrudRepository<Location, Long> {
	
	  @Select("SELECT name FROM LOCATION")
		List<String> getName();		
		
}
