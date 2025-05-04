package com.example.demo.Entiry;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@jakarta.persistence.Entity
public class Entity {
	
	@Id
	int id;
	String name;

}
