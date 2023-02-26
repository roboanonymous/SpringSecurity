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
	}
	
	
}
