package com.tscode.lawyersreckoner.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tscode.lawyersreckoner.model.Case;
import com.tscode.lawyersreckoner.repo.CaseRepository;

public class CaseService {

	@Autowired
	CaseRepository caseRepository;

	public boolean delete(List<String> caseIds) {
		boolean isDeleted = false;
		try {
			for (String id : caseIds) {
				Case cs = caseRepository.findById(id);
				caseRepository.delete(cs);
			}
			isDeleted = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return isDeleted;

	}

	public boolean create(Case caseToAdd) {
		boolean isCreated = false;
		try {
			this.caseRepository.save(caseToAdd);
			isCreated = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return isCreated;
	}

	public Case getCaseById(String caseId) {
		Case casebyID = null;
		try {
			casebyID = this.caseRepository.findById(caseId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return casebyID;
	}

	public boolean update(Case caseToUpdate) {
		boolean isUpdated= false;
		try {
			Case oldCase = caseRepository.findById(caseToUpdate.getId());
			this.caseRepository.delete(oldCase);
			caseRepository.save(caseToUpdate);
			isUpdated=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return isUpdated;
	}

}
