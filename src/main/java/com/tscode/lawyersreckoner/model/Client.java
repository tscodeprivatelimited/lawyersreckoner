/**
 * 
 */
package com.tscode.lawyersreckoner.model;

import java.util.List;

/**
 * @author Shree
 *
 */
public class Client {

	private String name;
	
	private int contactNumber;
	
	private String address;
	
	private List<String> caseNumbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getCaseNumbers() {
		return caseNumbers;
	}

	public void setCaseNumbers(List<String> caseNumbers) {
		this.caseNumbers = caseNumbers;
	}


}
