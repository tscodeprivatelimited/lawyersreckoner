package com.tscode.lawyersreckoner.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tscode.lawyersreckoner.model.Case;

public interface CaseInfoRepository  extends MongoRepository<Case, String> {

}
