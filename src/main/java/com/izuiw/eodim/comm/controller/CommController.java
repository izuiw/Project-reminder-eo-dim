package com.izuiw.eodim.comm.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Slf4j
@Controller
public class CommController {

	private final Logger log = LoggerFactory.getLogger(CommController.class);
	
	@GetMapping("/main")
	public String index() {
		log.debug("로그 호출");

		
		return "index.html";
	}
	
}
