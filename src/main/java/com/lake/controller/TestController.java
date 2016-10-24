package com.lake.controller;

import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.lake.pojo.User;
import com.lake.service.UserService;

@Controller
@RequestMapping("/")
public class TestController {
	private static final Logger log = Logger.getLogger(TestController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/add")
    public void add(HttpServletRequest request,HttpServletResponse response) throws Exception{  
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("age"));
		PrintWriter pw = response.getWriter();
//		pw.write(JSON.toJSONString(new Student(new User(26,"cainiao"),"caibi")));
		User u = new User();
		u.setAge(id);
		u.setName(name);
		u.setDate(new Timestamp(System.currentTimeMillis()));
//		u.setId(15);
		userService.insert(u);
		log.info("add success");
		pw.write("success");
        return ;
    }
	
	@RequestMapping("/search")
    public void search(HttpServletRequest request,HttpServletResponse response) throws Exception{  
		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter pw = response.getWriter();
//		pw.write(JSON.toJSONString(new Student(new User(26,"cainiao"),"caibi")));
		
		User u = userService.getUserById(id);
		pw.write(JSON.toJSONString(u));
        return ;
    }
	
	@RequestMapping("/update")
    public void update(HttpServletRequest request,HttpServletResponse response) throws Exception{  
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		PrintWriter pw = response.getWriter();
//		pw.write(JSON.toJSONString(new Student(new User(26,"cainiao"),"caibi")));
		
		User u = new User();
		u.setAge(age);
		u.setName(name);
		u.setDate(new Timestamp(System.currentTimeMillis()));
		userService.update(u);
		pw.write(JSON.toJSONString(u));
        return ;
    }
	
	@RequestMapping("/delete")
    public void delete(HttpServletRequest request,HttpServletResponse response) throws Exception{  
		String name = request.getParameter("name");
		PrintWriter pw = response.getWriter();
//		pw.write(JSON.toJSONString(new Student(new User(26,"cainiao"),"caibi")));
		
		userService.deleteByName(name);
		log.warn("delete");
		pw.write("success");
        return ;
    }
}
