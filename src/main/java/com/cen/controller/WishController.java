package com.cen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {
	
	
	@GetMapping("/msg")
	public String Msg() {
		return "Hellow Sir";
		
	}

}
