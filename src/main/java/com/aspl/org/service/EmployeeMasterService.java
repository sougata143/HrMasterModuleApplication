package com.aspl.org.service;

import java.util.List;

import com.aspl.org.entity.EmployeeMaster;



public interface EmployeeMasterService {

	//DesignationMaster designationMaster(DesignationMaster designationMaster);
	//EmployeeMaster getByidcardno(Integer idcardno);
	List<EmployeeMaster> getallEmployeemaster();
	EmployeeMaster findbyidempcoder(String empcode);
	//EmployeeMaster findbyidempcoder(Integer empcode, int month);

	/* EmployeeMaster EmployeeMastersave(EmployeeMaster employeeMaster); */
	/*
	 * EmployeeMaster EmployeeMastersave(EmployeeMaster employeeMaster, String
	 * dateofbirth, String dateofjoining, String dateoftermination);
	 */
	EmployeeMaster EmployeeMastersavediff(EmployeeMaster employeeMaster);
	List<EmployeeMaster> findByemptype(String emptype);
	//EmployeeMaster findbyidempcoder(String empcode);
	EmployeeMaster getByidcardno(String idcardno);
}
