package com.example.schoolDB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	private String email;
	
	public int getId() { 
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	public String getName() {
	    return name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Teacher[Id: "+id+", Name: "+name+", Email: "+email+"]";
	}
}
