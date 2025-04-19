package com.webwithserver.webtest1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webwithserver.webtest1.entity.UserPass;
import com.webwithserver.webtest1.services.MyServeices;
import static com.tools.AppLogger.logger;


@Controller
@RequestMapping("/api")
public class MyController {
	
	private MyServeices myServeices;
	public MyController(MyServeices myServeices) {
		this.myServeices = myServeices;
	}


	@GetMapping("/home")
	public String get() {
		return "home";
	}
	
	@PostMapping("/adduser")
	public void addUser(@RequestBody UserPass userPass) {
	    logger.info("----------------USER IS ADDED -----------------");
		logger.info("{}",myServeices.addUserPass(userPass));		
		
	}
	
	
}
