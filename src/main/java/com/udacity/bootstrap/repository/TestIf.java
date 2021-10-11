package com.udacity.bootstrap.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestIf {

    @Select("SELECT address FROM LOCATION")
	List<String> getAddress();
}
