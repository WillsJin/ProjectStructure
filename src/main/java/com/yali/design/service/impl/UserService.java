package com.yali.design.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yali.design.mapper.UserMapper;
import com.yali.design.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int countAll() {

		return userMapper.countAll();
	}

}
