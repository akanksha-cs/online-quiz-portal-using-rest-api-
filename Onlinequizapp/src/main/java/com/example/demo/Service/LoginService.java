package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.login;
import com.example.demo.repository.loginRepo;

@Service
public class LoginService {
	@Autowired
	static
	loginRepo loginRepository;
	

	
	
	public static String signIn(login login) {
		Optional<login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent() && login.getPassword().equals("admin#123")) {
			login user = op.get();
			return "Admin logged in successfully";
		}else {
			return "Wrong credentials, Try again";
		}
	}
	
	
	public String updatePassword(login login) {
		Optional<login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent()) {
			login user = op.get();
			user.setPassword(login.getPassword());
			loginRepository.saveAndFlush(user);
			return "Password updated successfully";
		}else {
			return "Password didn't update";
		}
	}
	
	

	public String signInUser(login login) {
		Optional<login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent() && ((login.getEmailid().equals("user1@gmail.com") && login.getPassword().equals("user1@123")) || (login.getEmailid().equals("user2@gmail.com") && login.getPassword().equals("user2@123")))) {
			login user = op.get();
			return "Participant logged in successfully";
		}else {
			return "Wrong credentials, Try again";
		}
	}
	
	
	
	
	

}