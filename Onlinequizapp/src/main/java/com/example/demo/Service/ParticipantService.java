package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Participant;
import com.example.demo.repository.ParticipantRepo;

@Service
public class ParticipantService {
	@Autowired
	ParticipantRepo participantsRepository;
	
	public String addParticipant(Participant participants) {
		Optional<Participant> op = participantsRepository.findById(participants.getPid());
		if(op.isPresent()) {
			return "Participant id must be unique";
		}else {
			participantsRepository.save(participants);
			return "Participant details added successfully";
		}
	}
	
	
	
}