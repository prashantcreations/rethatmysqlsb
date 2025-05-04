package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entiry.Entity;
import com.example.demo.service.Service;


@RestController
public class TestController {
	
	@Autowired
	Service service ;
	

	@RequestMapping("/")
	public String getData() {
		return "hello world prashant";
	}
	
	@RequestMapping("/user")
	public List<Entity> getUser() {
		return service.getUser();
	}	
}
