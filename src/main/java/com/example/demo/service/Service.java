package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entiry.Entity;
import com.example.demo.repo.Repo;

@Component
public class Service {
	
	@Autowired
	Repo repo ;
	
	public List<Entity> getUser() {
		
		return repo.findAll();
		
	}

}
