package com.aspl.org.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.DepartmentMaster;
import com.aspl.org.repository.DepartmentMasterRepo;
import com.aspl.org.service.DepartmentMasterService;

@Service
@Transactional
public class DepartmentMasterServiceImpl implements DepartmentMasterService{
	
	
	@Autowired DepartmentMasterRepo  departmentMasterRepo;

	@Override
	public DepartmentMaster getByName(String departmentname) {
		return null;
	}

	@Override
	public List<DepartmentMaster> getallDeptMaster() {
		return departmentMasterRepo.findAll();
	}

	@Override
	public Optional<DepartmentMaster> findbyiddepartmentmaster(Integer departmentId) {
		return departmentMasterRepo.findById(departmentId);
	}

	@Override
	public DepartmentMaster departmentsave(DepartmentMaster departmentMaster) {
		
		
		return departmentMasterRepo.save(departmentMaster);
	}

	
	

}
