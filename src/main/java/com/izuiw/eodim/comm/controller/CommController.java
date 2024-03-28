package com.izuiw.eodim.comm.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izuiw.eodim.comm.service.CommService;
import com.izuiw.eodim.comm.service.CommServiceImpl;

//@Slf4j
@RestController
@RequestMapping("/eodim/Reminder")
public class CommController {

	private final Logger log = LoggerFactory.getLogger(CommController.class);
	

	private CommServiceImpl commService;
	
	@Autowired
	public CommController(CommServiceImpl commService) {
		this.commService = commService;
	}
	
	
	@GetMapping("/mainList")
	public String reminderMainList() {
		log.debug("reminder Main List 호출 성공 ");
		
		//service
		String result = commService.getTime();
		
		log.debug("조회 완료 : " + result);
		
		return result;
	}
	
	
}
