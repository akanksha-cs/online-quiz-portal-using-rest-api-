package com.example.demo.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Results;
import com.example.demo.repository.ResultsRepo;



@Service
public class ResultsService {
	@Autowired
	static
	ResultsRepo resultRepository;
	

	public static String findByIdUser(Results result) {
		Optional<Results> op = resultRepository.findById(result.getEmailid());
		if(op.isEmpty()) {
			return "You have not attempted any test";
			
		}else {
			Results r = op.get();
			return r.toString();
		}
	}
	
	public List<Results> getAllResult(){
		return resultRepository.findAll();
	}

}