package org.mishra.app.service;
import org.mishra.app.model.Registration;
import org.mishra.app.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private RegistrationRepository registrationrepo;

	@Override
	public boolean Login(String email, String pwd) {
		System.out.println(email);
		System.out.println(pwd);
		
		Registration reg = registrationrepo.findByEmailAndPwd(email, pwd);
		if(reg != null) {
			return true;
		}
		return false;
	}
}
