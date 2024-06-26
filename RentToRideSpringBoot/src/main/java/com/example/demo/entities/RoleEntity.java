package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")

public class RoleEntity {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;
	@Column
	private String role_name;
	public int getRole_id() {
		return role_id;
	}
	
	@JsonCreator
    public RoleEntity(@JsonProperty("role_id") int role_id) {
        this.role_id = role_id;
    }
	public String getRole_name() {
		return role_name;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public RoleEntity(int role_id, String role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}
	public RoleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
