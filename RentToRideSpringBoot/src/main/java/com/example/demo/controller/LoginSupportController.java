package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Dummy_Login;
import com.example.demo.entities.Login;
import com.example.demo.services.LoginSupportService;

@RestController
public class LoginSupportController {
	@Autowired
	LoginSupportService lservice;
	
	@PostMapping("/Save_login")
	public void save(@RequestBody Login info)
	{
		lservice.save_Login(info);
	}
	@PostMapping("/Login_Check")
	public Login getUser(@RequestBody Dummy_Login d)
	{
		String uname=d.getUsername();
		String pwd=d.getPassword();
		return lservice.getUser(uname, pwd);
		
	}
}