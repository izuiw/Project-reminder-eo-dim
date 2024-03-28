package com.izuiw.eodim.comm.service;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izuiw.eodim.mapper.comm.CommMapper;

@Service
public class CommServiceImpl implements CommService{
	
	private final Logger log = LoggerFactory.getLogger(CommServiceImpl.class);
	
	private final CommMapper mapper;
	
	@Autowired
	public CommServiceImpl(CommMapper mapper) {
		this.mapper = mapper;
	}


	public String getTime() {
		log.debug("서비스 클래스 호출");
		
		return mapper.getTime();
	}
	
}
