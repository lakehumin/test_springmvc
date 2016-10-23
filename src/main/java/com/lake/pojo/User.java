package com.lake.pojo;

import java.sql.Timestamp;

/**
 * @author LakeHm
 *
 * 2016年10月23日上午11:37:42
 */
public class User {
	private int id;
	private String name;
	private int age;
	private Timestamp date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
}
