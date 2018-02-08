/**
 * 
 */
package com.tscode.lawyersreckoner.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Shree
 *
 */
@Document(collection = "case")
public class Case {

	@Id
	private String id;
	
	private String caseNumber;
	
	private String courtName;
	
	private String oppositePartyName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCourtName() {
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public String getOppositePartyName() {
		return oppositePartyName;
	}

	public void setOppositePartyName(String oppositePartyName) {
		this.oppositePartyName = oppositePartyName;
	}
	
	
}
