package com.lake.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lake.dao.UserDao;
import com.lake.pojo.User;
import com.lake.service.UserService;

/**
 * @author LakeHm
 *
 * 2016年10月23日下午12:49:32
 */
@Service("userService") 
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int id) {
		return userDao.searchById(id);
	}

	@Override
	public void insert(User u) {
		userDao.insert(u);
	}

	@Override
	public void update(User u) {
		userDao.update(u);
	}

	@Override
	public void deleteByName(String name) {
		userDao.deleteByName(name);
	}
}
