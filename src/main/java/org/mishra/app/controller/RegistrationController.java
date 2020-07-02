package org.mishra.app.controller;

import org.mishra.app.model.Registration;
import org.mishra.app.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService regservice;
	
	@PostMapping("/insert")
	public String addRegistration(@RequestBody Registration registration) {
		registration.setRegID(regservice.setAlphaNumericString(10));
       regservice.addRegistration(registration);
	return "Registration Successfully Reg_ID : " +registration.getRegID();
  }
	
	
	

}
