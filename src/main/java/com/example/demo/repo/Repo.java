package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entiry.Entity;

@Repository
public interface Repo extends JpaRepository<Entity, Integer> {
	
	

}
