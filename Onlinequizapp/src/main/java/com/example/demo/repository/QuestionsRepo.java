package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.Questions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface QuestionsRepo extends JpaRepository<Questions, Integer> {

}