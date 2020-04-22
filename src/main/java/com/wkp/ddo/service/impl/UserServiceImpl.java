package com.wkp.ddo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wkp.ddo.dao.UserDao;
import com.wkp.ddo.domain.User;
import com.wkp.ddo.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Override
	public User dl(User user) {
		// TODO Auto-generated method stub
		return userDao.dl(user);
	}

}
