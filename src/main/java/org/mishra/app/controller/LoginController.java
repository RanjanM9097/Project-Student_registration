package org.mishra.app.controller;

import org.mishra.app.dto.LoginDTO;
import org.mishra.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	@PostMapping("/loginvalue")
	public ResponseEntity<?> login(@RequestBody LoginDTO dto) {
		
		boolean isVerified = loginservice.Login(dto.getEmail(), dto.getPassword());
		
		if(isVerified)
			return new ResponseEntity<>(dto.getEmail(),HttpStatus.OK);
		return new ResponseEntity<>("Incorrect Email or Password", HttpStatus.UNAUTHORIZED);
	}

}
