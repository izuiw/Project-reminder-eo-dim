package com.izuiw.eodim.comm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommController {

	@GetMapping("/main")
	public String index() {
		
		return "index.html";
	}
	
}
