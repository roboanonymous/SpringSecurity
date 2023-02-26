package com.smart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/")
	public List<User> getalluser()
	{
		return this.userSercices.getalllist();
	}
	
	
	//all users
	@GetMapping("/{username}")
	public User getuser(@PathVariable("username") String username)
	{
		return this.userSercices.getUser(username);
	}
	
	// add user
	@PostMapping("/")
	public User add(@RequestBody User user)
	{
		return this.userSercices.addUser(user);
	}
	
	
	
}
