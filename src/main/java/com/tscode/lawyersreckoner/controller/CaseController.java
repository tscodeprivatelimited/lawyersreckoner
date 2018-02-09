/**
 * 
 */
package com.tscode.lawyersreckoner.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tscode.lawyersreckoner.model.Case;
import com.tscode.lawyersreckoner.repo.CaseRepository;
import com.tscode.lawyersreckoner.service.impl.CaseService;

/**
 * @author Shree
 *
 */
@RestController
@RequestMapping("/case")
public class CaseController {

	@Autowired
	CaseRepository caseRepo;
	
	@Autowired
	CaseService caseService;
	
	@RequestMapping(method = RequestMethod.POST)
	    boolean create(@RequestBody Case caseToAdd) {
		 boolean isCreated= caseService.create(caseToAdd);
		 return isCreated;
	 }
	

	 @RequestMapping(method = RequestMethod.GET)
	    Case getCaseById(@RequestBody String caseId) {
		 Case casebyID = caseService.getCaseById(caseId);
		
		 return casebyID;
	 }
	 
	 @RequestMapping(method = RequestMethod.GET)
	    List<Case> getAllCase(@RequestBody String caseId) {
		 List<Case> allCases= new ArrayList<>();
		 try {
			 allCases= this.caseRepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return allCases;
	 }
	
	 @RequestMapping(method = RequestMethod.GET)
	    boolean delete(@RequestBody List<String> caseIds) {
		 	boolean isDeleted = caseService.delete(caseIds); 
		 	return isDeleted;
	 }
	 
	 
	 @RequestMapping(method = RequestMethod.POST)
	    boolean update(@RequestBody Case caseToUpdate) {
		 boolean isCreated= caseService.update(caseToUpdate);
		 return isCreated;
	 }
}
