package com.izuiw.eodim.comm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommController {

	@GetMapping("/error")
	public String index() {
		
		System.out.println("호출 완 ");
		return "index.html";
	}
	
}
