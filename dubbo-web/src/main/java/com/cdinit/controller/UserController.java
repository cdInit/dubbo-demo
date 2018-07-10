package com.cdinit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.cdinit.po.User;
import com.cdinit.service.UserService;

@Controller
public class UserController {

	@Reference
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/user/list")
	public String listUser() {
		List<User> user = userService.list();
		String userStr = JSONObject.toJSONString(user);		
//		System.out.println("user log ....");
		return userStr;		
	}
}
