package com.aspl.org.service;

import java.util.List;
import java.util.Optional;

import com.aspl.org.entity.DepartmentMaster;



public interface DepartmentMasterService {

	//DesignationMaster designationMaster(DesignationMaster designationMaster);
	DepartmentMaster getByName(String departmentname);
	List<DepartmentMaster> getallDeptMaster();
	Optional<DepartmentMaster> findbyiddepartmentmaster(Integer departmentId);

	/* DepartmentMaster departmentsave(DepartmentMaster departmentMaster); */
	/*
	 * DepartmentMaster departmentsave(DepartmentMaster departmentMaster,
	 * SectionMaster sectionMaster);
	 */
	DepartmentMaster departmentsave(DepartmentMaster departmentMaster);
}
