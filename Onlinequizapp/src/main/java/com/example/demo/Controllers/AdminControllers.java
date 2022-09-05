package com.example.demo.Controllers;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LoginService;
import com.example.demo.Service.QuestionsService;
import com.example.demo.Service.QuizesService;
import com.example.demo.Service.ResultsService;
import com.example.demo.bean.Questions;
import com.example.demo.bean.Quizes;
import com.example.demo.bean.Results;
import com.example.demo.bean.login;


//	http://localhost:8080/admin

@RestController
@RequestMapping("admin")
public class AdminControllers {
	@Autowired
	LoginService loginService;
	@Autowired
	QuestionsService questionsService;
	@Autowired
	QuizesService quizesService;
	@Autowired
	ResultsService resultService;
	
//	http://localhost:8080/admin/print
	@GetMapping (value = "print")
	public String print() {
		return "Welcome to the Quiz rest API";
	}
	
	
//	http://localhost:8080/admin/signIn
	@PostMapping (value = "signIn", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signIn(@RequestBody login login) {
		return loginService.signIn(login);
	}
	
//	http://localhost:8080/admin/changePassword
	@PostMapping (value = "changePassword", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String changePassword(@RequestBody login login) {
		return loginService.updatePassword(login);
	}
	
//	http://localhost:8080/admin/addQuestion
	@PostMapping (value = "addQuestion", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuestion(@RequestBody Questions ques) {
		return questionsService.storeQuestion(ques);
	}
	
	
//	http://localhost:8080/admin/findQuestionById/2
	@GetMapping (value = "findQuestionById/{qid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Questions findQuestionById(@PathVariable("qid") int qid) {
		return questionsService.findQuestion(qid);
	}
	
//	http://localhost:8080/admin/createQuiz
	@PostMapping(value = "createQuiz", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createQuiz(@RequestBody Quizes quiz) {
		return quizesService.addQuiz(quiz);
	}	
//	http://localhost:8080/admin/checkResult
	@GetMapping(value = "checkResult", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Results> checkResult(){
		return resultService.getAllResult();
	
}
}
