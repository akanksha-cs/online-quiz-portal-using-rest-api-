package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LoginService;
import com.example.demo.Service.ParticipantService;
import com.example.demo.Service.QuizesService;
import com.example.demo.Service.ResultsService;
import com.example.demo.bean.Participant;
import com.example.demo.bean.Quizes;
import com.example.demo.bean.Results;
import com.example.demo.bean.login;



//	http://localhost:8080/participant

@RestController
@RequestMapping("participant")
public class ParticipantsControllers {
	
	@Autowired
	LoginService loginService;
	@Autowired
	ParticipantService participantsService;
	@Autowired
	QuizesService quizesService;
	@Autowired
	ResultsService resultService;
	
	
//	http://localhost:8080/participants/signup
	@PostMapping(value = "signup", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signup(@RequestBody Participant participants) {
		return participantsService.addParticipant(participants);
	}
	
//	http://localhost:8080/participants/takeQuiz/1
	@GetMapping(value = "takeQuiz/{id}")
	public String takeQuiz(@PathVariable("id") Quizes quiz) {
		return quizesService.findQuiz(quiz);
	}
	
	
//	http://localhost:8080/participants/signIn
	@PostMapping (value = "signIn", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signIn(@RequestBody login login) {
		return loginService.signInUser(login);
	}
	
	
//	http://localhost:8080/participants/checkAllQuizDetails
	@GetMapping(value = "checkAllQuizDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Quizes> checkAllQuizDetails(){
		return quizesService.getAllQuizes();
	}

	
//	http://localhost:8080/participants/checkResult
	@GetMapping(value = "checkResult", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Results> checkResult(){
		return resultService.getAllResult();
	}
	
//	http://localhost:8080/participants/checkResult1
	@PostMapping(value = "checkResult1", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String checkResult1(@RequestBody Results result) {
		return resultService.findByIdUser(result);
	}

}