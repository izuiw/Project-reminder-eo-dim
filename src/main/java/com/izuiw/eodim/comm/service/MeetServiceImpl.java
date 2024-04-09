package com.izuiw.eodim.comm.service;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izuiw.eodim.mapper.CommMapper;
import com.izuiw.eodim.mapper.MeetMapper;

@Service
public class MeetServiceImpl implements MeetService{
	
	private final Logger log = LoggerFactory.getLogger(MeetServiceImpl.class);
	
	private final MeetMapper mapper;
	
	@Autowired
	public MeetServiceImpl(MeetMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public HashMap<String, String> getTime() {
		log.debug("서비스 클래스 호출");
		
		return mapper.getTime();
	}
	
}
