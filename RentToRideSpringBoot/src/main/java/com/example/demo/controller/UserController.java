package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.DummyUserEntity;
import com.example.demo.entities.UserEntity;
import com.example.demo.services.RoleService;
import com.example.demo.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

	@Autowired
	UserService uservice;

	@Autowired
	RoleService rservice;

	@PostMapping("/saveUser")
	public UserEntity saveUser(@RequestBody UserEntity u) {
		return uservice.saveUser(u);
	}

	@GetMapping("/getAllUser")
	public List<UserEntity> getAllUser() {
		return uservice.getAllUser();
	}

	@PostMapping("/verifyLogin")
	public UserEntity checkLogin(@RequestBody DummyUserEntity dummy) {
		return uservice.getUserDetails(dummy.getUsername(), dummy.getPassword());
	}

//	@PutMapping("/approve/{user_id}")
//	public ResponseEntity<Void> approveLogin(@PathVariable("user_id") int user_id) {
//		uservice.approveLogin(user_id);
//		return ResponseEntity.ok().build();
//	}

	@PutMapping("/disapprove/{user_id}")
	public ResponseEntity<Void> disapproveLogin(@PathVariable("user_id") int user_id) {
		uservice.disapproveLogin(user_id);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/approveDriver/{user_id}")
	public ResponseEntity<Void> approveLogin(@PathVariable("user_id") int user_id) 
	{
		uservice.approveLogin(user_id);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/disapproveDriver/{user_id}")
	public ResponseEntity<Void> rejectLogin(@PathVariable("user_id") int user_id)
	{
		uservice.disapproveLogin(user_id);
		return ResponseEntity.ok().build();
	}
}
