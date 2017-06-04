package com.drbotro.demo_spring_boot.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String getIndexPage(){
		return "UserManagement";
	}
}
