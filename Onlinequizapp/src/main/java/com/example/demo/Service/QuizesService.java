package com.example.demo.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Quizes;
import com.example.demo.repository.QuizesRepo;



@Service
public class QuizesService {
	@Autowired
	QuizesRepo quizesRepository;
	
	public String addQuiz(Quizes quiz) {
		Optional<Quizes> op = quizesRepository.findById(quiz.getQzid());
		if(op.isPresent()) {
			return "Quiz id must be unique";
		}else {
			quizesRepository.save(quiz);
			return "Quiz added succesfully";
		}
	}
	
	
	public String findQuiz(Quizes quiz) {
		Optional<Quizes> op = quizesRepository.findById(quiz.getQzid());
		if(op.isPresent()) {
			Quizes q = op.get();
			return q.toString();
		}else {
			return "There is no quiz for this quiz Id";
		}
	}
	
	public List<Quizes> getAllQuizes(){
		return quizesRepository.findAll();
	}

}