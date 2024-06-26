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

//@Slf4j
@RestController
@RequestMapping("/eodim/meet")
public class CommController {
	
	/*
	 * 공통 기능 Controller 
	 *  1. Login 기능 구현
	 *  2. 회원 개인정보 관리
	 *  3. 월별 통계
	 * 
	 */
	
	private final Logger log = LoggerFactory.getLogger(CommController.class);
	
	private CommService commService;
	
	@Autowired
	public CommController(CommService commService) {
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
