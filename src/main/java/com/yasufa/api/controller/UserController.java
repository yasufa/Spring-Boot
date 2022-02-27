package com.yasufa.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.yasufa.business.abstracts.UserService;
import com.yasufa.core.utilities.result.DataResult;
import com.yasufa.core.utilities.result.Result;
import com.yasufa.entities.concretes.User;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	private UserService userService;

	/**
	 * @param userService
	 */
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();	
		}
	@PostMapping
	public Result add( @RequestBody User user) {
		return this.userService.add(user);
	}
}