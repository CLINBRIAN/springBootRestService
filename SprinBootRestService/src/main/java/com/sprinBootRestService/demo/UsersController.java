package com.sprinBootRestService.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")      //                         http://localhost:8080/users
public class UsersController {

//	@GetMapping()
//	public String getUsers() {
//		return "http GET request was  sent";
//
//	}
	
	@GetMapping(path="/{userId}") //userId is path parameter        http://localhost:8080/users/userId
	public String getUser(@PathVariable String userId) {
		
		return "http GET request was  sent: "+userId;
		
	}
	
	@GetMapping()                     //  Query Parameter             http://localhost:8080/users?page=1&limit=50
	public String getUsersParams(@RequestParam(value="page") int pageNo, @RequestParam(value="limit") int pagelimit) {
		return "http GET request was  sent for page no: "+ pageNo+ " and limit " +pagelimit;

	}
	
	

	@PostMapping()
	public String createUser() {
		return "http POST request was  sent";

	}

	@PutMapping()
	public String updateUser() {
		return "http PUT request was  sent";

	}

	@DeleteMapping()
	public String deleteUser() {
		return "http DELETE request was  sent";

	}

}
