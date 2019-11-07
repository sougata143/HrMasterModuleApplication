package com.aspl.org.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="departmentmaster" , schema = "crawley" )
public class DepartmentMaster 
{
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer departmentId;
	
	private String departmentname;
	private String departmentdetails;
	
	private Integer sectionId;
	private String  sectionName;

	
	
	/**
	 * @return the departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the departmentname
	 */
	public String getDepartmentname() {
		return departmentname;
	}
	/**
	 * @param departmentname the departmentname to set
	 */
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	/**
	 * @return the departmentdetails
	 */
	public String getDepartmentdetails() {
		return departmentdetails;
	}
	
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	
	
	
	
	
	
	
	

}
