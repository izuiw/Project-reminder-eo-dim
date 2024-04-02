package com.izuiw.eodim.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoutineMapper {
	HashMap<String, String> getTime();
}
