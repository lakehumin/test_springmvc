package com.lake.service;

import com.lake.pojo.User;

/**
 * @author LakeHm
 *
 * 2016��10��23������12:45:13
 */
public interface UserService {
	User getUserById(int id);
	
	void insert(User u);
	
	void update(User u);
	
	void deleteByName(String name);
}
