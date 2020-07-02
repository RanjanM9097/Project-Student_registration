package org.mishra.app.service;
import org.mishra.app.model.Registration;
import org.mishra.app.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private RegistrationRepository regrepository;

	@Override
	public String setAlphaNumericString(int id) {

        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(10); 
  
        for (int i = 0; i <10; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index = (int)(AlphaNumericString.length() * Math.random()); 
                
                        
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString.charAt(index)); 
                         
        } 
  
        return sb.toString(); 
	}

	@Override
	public String addRegistration(Registration registration) {
	        regrepository.save(registration);
		return "success";
	}

}
