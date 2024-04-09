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
import com.izuiw.eodim.comm.service.RoutineService;

//@Slf4j
@RestController
@RequestMapping("/eodim/routine")
public class RoutineController {
	
	/*
	 * 개인 루틴 - 반복 일정  Controller 
	 *  1. 관리 기능
	 *  2. 오늘 등록 루틴 성공 실패 기능 구현  
	 * 
	 */
	
	private final Logger log = LoggerFactory.getLogger(CommServiceImpl.class);
	
	private RoutineService commService;
	
	@Autowired
	public RoutineController(RoutineService commService) {
		this.commService = commService;
	}
	
	
	@GetMapping("/RoutineMain")
	public HashMap<String, String> reminderMainList() {
		
		
		log.debug("Rutine Main 호출 성공 ");
		
		//service
		HashMap<String, String> result = commService.getTime();
		
		log.debug("조회 완료 : " + result);
		
		return result;
	}
	
	
}
