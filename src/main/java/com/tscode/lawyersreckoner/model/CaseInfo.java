package com.tscode.lawyersreckoner.model;

import java.util.Date;

/**
 * 
 * @author Shree
 *
 */
public class CaseInfo {

	/**
	 * id = casenumber+"_"+days;
	 */
	private String id;
	
	private String caseNumber;
	
	private Date prevDate;
	
	private Date nextDate;
	
	private String prevStage;
	
	private String nextStage;
	
	private int days;

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

	public Date getPrevDate() {
		return prevDate;
	}

	public void setPrevDate(Date prevDate) {
		this.prevDate = prevDate;
	}

	public Date getNextDate() {
		return nextDate;
	}

	public void setNextDate(Date nextDate) {
		this.nextDate = nextDate;
	}

	public String getPrevStage() {
		return prevStage;
	}

	public void setPrevStage(String prevStage) {
		this.prevStage = prevStage;
	}

	public String getNextStage() {
		return nextStage;
	}

	public void setNextStage(String nextStage) {
		this.nextStage = nextStage;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	
	
	
	
}
