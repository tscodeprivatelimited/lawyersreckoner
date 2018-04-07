package com.tscode.lawyersreckoner.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "caseNumber",
        "numberOfDay",
        "description",
        "previousDate",
        "previousStage",
        "nextDate",
        "nextStage"
    })
    public  class CaseHistory extends DTO{

        @XmlElement(required = true)
        protected String id;
        @XmlElement(name = "CaseNumber")
        protected int caseNumber;
        @XmlElement(name = "NumberOfDay")
        protected int numberOfDay;
        @XmlElement(name = "Description", required = true)
        protected String description;
        @XmlElement(name = "PreviousDate", required = true)
        protected String previousDate;
        @XmlElement(name = "PreviousStage", required = true)
        protected String previousStage;
        @XmlElement(name = "NextDate", required = true)
        protected String nextDate;
        @XmlElement(name = "NextStage", required = true)
        protected String nextStage;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

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
         * Gets the value of the numberOfDay property.
         * 
         */
        public int getNumberOfDay() {
            return numberOfDay;
        }

        /**
         * Sets the value of the numberOfDay property.
         * 
         */
        public void setNumberOfDay(int value) {
            this.numberOfDay = value;
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

        /**
         * Gets the value of the previousDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousDate() {
            return previousDate;
        }

        /**
         * Sets the value of the previousDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousDate(String value) {
            this.previousDate = value;
        }

        /**
         * Gets the value of the previousStage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousStage() {
            return previousStage;
        }

        /**
         * Sets the value of the previousStage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousStage(String value) {
            this.previousStage = value;
        }

        /**
         * Gets the value of the nextDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextDate() {
            return nextDate;
        }

        /**
         * Sets the value of the nextDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextDate(String value) {
            this.nextDate = value;
        }

        /**
         * Gets the value of the nextStage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextStage() {
            return nextStage;
        }

        /**
         * Sets the value of the nextStage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextStage(String value) {
            this.nextStage = value;
        }

    }
