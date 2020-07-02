package org.mishra.app.repository;

import org.mishra.app.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository  extends JpaRepository<Registration,Long>{
	
	Registration findByEmailAndPwd(String email, String pwd);

}
