package com.tscode.lawyersreckoner.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "clientName", "adress", "contactNumber", "caseNumbers", "totalFees", "feesPaid",
		"feesPending" })
public class Client extends DTO{
	@XmlElement(name = "id")
	protected String id;

	@XmlElement(name = "ClientName", required = true)
	protected String clientName;
	@XmlElement(name = "Adress", required = true)
	protected String adress;
	@XmlElement(name = "ContactNumber", required = true)
	protected String contactNumber;
	@XmlElement(name = "CaseNumbers", required = true)
	protected String caseNumbers;
	@XmlElement(name = "TotalFees")
	protected int totalFees;
	@XmlElement(name = "FeesPaid")
	protected int feesPaid;
	@XmlElement(name = "FeesPending")
	protected int feesPending;

	/**
	 * Gets the value of the clientName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * Sets the value of the clientName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientName(String value) {
		this.clientName = value;
	}

	/**
	 * Gets the value of the adress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * Sets the value of the adress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdress(String value) {
		this.adress = value;
	}

	/**
	 * Gets the value of the contactNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * Sets the value of the contactNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContactNumber(String value) {
		this.contactNumber = value;
	}

	/**
	 * Gets the value of the caseNumbers property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCaseNumbers() {
		return caseNumbers;
	}

	/**
	 * Sets the value of the caseNumbers property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCaseNumbers(String value) {
		this.caseNumbers = value;
	}

	/**
	 * Gets the value of the totalFees property.
	 * 
	 */
	public int getTotalFees() {
		return totalFees;
	}

	/**
	 * Sets the value of the totalFees property.
	 * 
	 */
	public void setTotalFees(int value) {
		this.totalFees = value;
	}

	/**
	 * Gets the value of the feesPaid property.
	 * 
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	/**
	 * Sets the value of the feesPaid property.
	 * 
	 */
	public void setFeesPaid(int value) {
		this.feesPaid = value;
	}

	/**
	 * Gets the value of the feesPending property.
	 * 
	 */
	public int getFeesPending() {
		return feesPending;
	}

	/**
	 * Sets the value of the feesPending property.
	 * 
	 */
	public void setFeesPending(int value) {
		this.feesPending = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
