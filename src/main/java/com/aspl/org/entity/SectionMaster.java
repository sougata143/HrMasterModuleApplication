package com.aspl.org.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="sectionmaster" , schema = "crawley" )
public class SectionMaster
{
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer sectionId;
	
	private String sectionName;
	private String details;
	
	

	
	
	/**
	 * @return the sectionId
	 */
	public Integer getSectionId() {
		return sectionId;
	}
	/**
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	
	
	
	
	
	
	
	
	/**
	 * @return the sectionName
	 */
	public String getSectionName() {
		return sectionName;
	}
	/**
	 * @param sectionName the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	
	
	
	

}
