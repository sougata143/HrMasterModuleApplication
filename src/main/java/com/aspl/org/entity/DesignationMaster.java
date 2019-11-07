package com.aspl.org.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="designation" , schema = "crawley" )
public class DesignationMaster 
{
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer designId;
	
	private String designation;
	private String describedetails;
	
	
	public Integer getDesignId() {
		return designId;
	}
	/**
	 * @param designId the designId to set
	 */
	public void setDesignId(Integer designId) {
		this.designId = designId;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the describe
	 */
	
	public String getDescribedetails() {
		return describedetails;
	}
	public void setDescribedetails(String describedetails) {
		this.describedetails = describedetails;
	}
	
	

}
