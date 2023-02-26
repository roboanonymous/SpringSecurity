package com.smart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.Services.UserServices;
import com.smart.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServices userSercices;
	
	//all users
	public List<User> getalluser()
	{
		return this.userSercices.getalllist();
	}
}
