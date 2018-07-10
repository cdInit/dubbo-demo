package com.cdinit.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.cdinit.mapper.UserMapper;
import com.cdinit.po.User;
import com.cdinit.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> list() {		
//		List<User> list = new ArrayList<>();
//		User user = new User();
//		user.setUid(1);
//		user.setUsername("aadmin");
//		list.add(user);
		List<User> list = userMapper.list();
		return list;
	}
}
