package com.aspl.org.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.DesignationMaster;
import com.aspl.org.repository.DesignationMasterRepo;
import com.aspl.org.service.DesignationMasterService;
@Service
@Transactional
public class DesignationMasterServiceImpl implements DesignationMasterService{
	
	
	@Autowired DesignationMasterRepo designationMasterRepo; 
	

	@Override
	public DesignationMaster designationMastersave(DesignationMaster designationMaster) {
		// TODO Auto-generated method stub
		designationMasterRepo.save(designationMaster);
		return designationMaster;
	}

	@Override
	public DesignationMaster getByName(String designation) {
		// TODO Auto-generated method stub
		return designationMasterRepo.getDesignationMasterByDesignation(designation);
	}

	@Override
	public List<DesignationMaster> getalldesignationmaster() {
		// TODO Auto-generated method stub
		return designationMasterRepo.findAll();
	}

	@Override
	public Optional<DesignationMaster> findbyiddesignationmaster(Integer designId) {
		// TODO Auto-generated method stub
		return designationMasterRepo.findById(designId);
	}

}
