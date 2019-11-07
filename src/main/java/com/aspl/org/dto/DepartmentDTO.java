package com.aspl.org.dto;

public class DepartmentDTO {

	private Integer departmentId;
	
	private String departmentname;
	private String departmentdetails;	
	
	private SectionMasterDTO SectionMaster;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentdetails() {
		return departmentdetails;
	}

	public void setDepartmentdetails(String departmentdetails) {
		this.departmentdetails = departmentdetails;
	}

	public SectionMasterDTO getSectionMaster() {
		return SectionMaster;
	}

	public void setSectionMaster(SectionMasterDTO sectionMaster) {
		SectionMaster = sectionMaster;
	}


}
