package com.aspl.org.service;

import java.util.List;
import java.util.Optional;


import com.aspl.org.entity.DesignationMaster;

public interface DesignationMasterService {

	//DesignationMaster designationMaster(DesignationMaster designationMaster);
	DesignationMaster getByName(String designation);
	List<DesignationMaster> getalldesignationmaster();
	Optional<DesignationMaster> findbyiddesignationmaster(Integer designId);
	DesignationMaster designationMastersave(DesignationMaster designationMaster);
}
