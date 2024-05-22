package com.rms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entity.ResponseDTO;
import com.rms.entity.User;
import com.rms.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	// This API endpoint is used for registering users.
	@PostMapping("/user")
	public ResponseEntity<ResponseDTO> createUser(@RequestBody User user) {
		User createdUser = userService.createUser(user);

		return ResponseEntity.ok(new ResponseDTO(false, "user saved successfully", HttpStatus.OK));

	}

	// This API endpoint is used for displaying all users.
	@GetMapping("/users")
	public ResponseEntity<ResponseDTO> getAllUsers() {
		List<User> users = userService.getAllUsers();
		return ResponseEntity.ok(new ResponseDTO(false, "users fetched successfully", users));
	}

}
