package com.tscode.lawyersreckoner.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tscode.lawyersreckoner.model.Case;

//import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaseRepository extends MongoRepository<Case, String> {

	Case findById(String caseId);
 
	
}
