package com.lzc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzc.bean.User;
import com.lzc.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public User getUser() {
		User user = userService.selectById(1);
		/*user.setName("lzc");
		System.out.println(user.toString());*/
		return user;
	}

}
