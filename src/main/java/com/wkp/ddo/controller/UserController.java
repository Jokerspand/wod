package com.wkp.ddo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wkp.ddo.domain.User;
import com.wkp.ddo.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("dl")
	public String dl(User user) {
		
		User u=userService.dl(user);
		if(u!=null) {
			
			return "list";
		}
		return "dl";
	}
	
}
