package com.izuiw.eodim.comm.controller;


import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izuiw.eodim.comm.service.CommService;
import com.izuiw.eodim.comm.service.CommServiceImpl;
import com.izuiw.eodim.comm.service.MeetService;

//@Slf4j
@RestController
@RequestMapping("/eodim/meet")
public class MeetController {
	
	/*
	 * 일정 / Meet Controller 
	 *  1. 일정 추가 및 조회 삭제등 일정 관리 기능
	 *  2. Map api 연동하여,일정관련 장소 저장 및 조회하도록 구현 필요 
	 *  3. 추후 일정에 모임 인원 추가 기능 구현 예정 
	 * 
	 */
	
	private final Logger log = LoggerFactory.getLogger(MeetController.class);
	
	private MeetService commService;
	
	@Autowired
	public MeetController(MeetService commService) {
		this.commService = commService;
	}
	
	
	@GetMapping("/MeetMain")
	public HashMap<String, String> reminderMainList() {
		
		
		log.debug("MeetMain 호출 성공 ");
		
		//service
		HashMap<String, String> result = commService.getTime();
		
		log.debug("조회 완료 : " + result);
		
		return result;
	}
	
	
}
