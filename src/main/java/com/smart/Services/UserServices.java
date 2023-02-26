package com.smart.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smart.models.User;

@Service
public class UserServices {

	List <User> list = new ArrayList<>();
	
	
	public UserServices() {
		
		list.add(new User("abc" , "abc@gmail.com" , "abc"));
		list.add(new User("xyz" , "xyz@gmail.com" , "xyz"));
		
	}
	
	public List<User> getalllist()
	{
		return this.list;
	}
	
	public User getUser(String username)
	{
		return this.list.stream().filter((User)-> User.getUserName().equals(username)).findAny().orElse(null);
		
	}
	
	public User addUser(User user)
	{
		this.list.add(user);
		return user;
	}
	
}
