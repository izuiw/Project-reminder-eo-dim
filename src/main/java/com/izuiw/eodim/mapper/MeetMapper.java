package com.izuiw.eodim.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MeetMapper {
	HashMap<String, String> getTime();
}
