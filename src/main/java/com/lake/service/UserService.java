package com.lake.service;

import com.lake.pojo.User;

/**
 * @author LakeHm
 *
 * 2016年10月23日下午12:45:13
 */
public interface UserService {
	User getUserById(int id);
	
	void insert(User u);
	
	void update(User u);
	
	void deleteByName(String name);
}
