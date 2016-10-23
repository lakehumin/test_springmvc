package com.lake.dao;

import com.lake.pojo.User;

/**
 * @author LakeHm
 *
 * 2016年10月23日下午12:36:45
 */
public interface UserDao {

	void insert(User user);
	
	User searchById(int id);
	
	void update(User user);
	
	void deleteByName(String name);
}
