package com.lzc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzc.bean.User;
import com.lzc.mapper.UserMapper;
import com.lzc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectById(int id) {
		return userMapper.selectById(id);
		/*User user = new User();
		user.setName("lzc");
		user.setAge(33);*/
		//return user;
	}

}
