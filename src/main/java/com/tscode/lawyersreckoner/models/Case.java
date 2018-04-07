package com.tscode.lawyersreckoner.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
    		"id",
    		"caseNumber",
        "courtName",
        "clientName",
        "oppositePartyName",
        "description"
    })
    public class Case extends DTO {

		
	@XmlElement(name = "id")
	protected String id;

        @XmlElement(name = "CaseNumber")
        protected int caseNumber;
        @XmlElement(name = "CourtName", required = true)
        protected String courtName;
        @XmlElement(name = "ClientName", required = true)
        protected String clientName;
        @XmlElement(name = "OppositePartyName", required = true)
        protected String oppositePartyName;
        @XmlElement(name = "Description", required = true)
        protected String description;

        /**
         * Gets the value of the caseNumber property.
         * 
         */
        public int getCaseNumber() {
            return caseNumber;
        }

        /**
         * Sets the value of the caseNumber property.
         * 
         */
        public void setCaseNumber(int value) {
            this.caseNumber = value;
        }

        /**
         * Gets the value of the courtName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourtName() {
            return courtName;
        }

        /**
         * Sets the value of the courtName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCourtName(String value) {
            this.courtName = value;
        }

        /**
         * Gets the value of the clientName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientName() {
            return clientName;
        }

        /**
         * Sets the value of the clientName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientName(String value) {
            this.clientName = value;
        }

        /**
         * Gets the value of the oppositePartyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOppositePartyName() {
            return oppositePartyName;
        }

        /**
         * Sets the value of the oppositePartyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOppositePartyName(String value) {
            this.oppositePartyName = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
        

    }
