package com.aspl.org.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.ShiftMaster;
import com.aspl.org.repository.ShiftMasterRepo;
import com.aspl.org.service.ShiftMasterService;
@Service
@Transactional
public class ShiftMasterServiceImpl implements ShiftMasterService{
	
	
	@Autowired ShiftMasterRepo  shiftMasterRepo;

	@Override
	public ShiftMaster getByName(String shiftName) {
		// TODO Auto-generated method stub
		return shiftMasterRepo.findByshiftName(shiftName);
	}

	@Override
	public List<ShiftMaster> getallShiftMaster() {
		// TODO Auto-generated method stub
		return shiftMasterRepo.findAll();
	}

	@Override
	public Optional<ShiftMaster> findbyidShiftMaster(Integer shiftID) {
		// TODO Auto-generated method stub
		return shiftMasterRepo.findById(shiftID);
	}

	@Override
	public ShiftMaster shiftMastersave(ShiftMaster shiftMaster) {
		// TODO Auto-generated method stub
		return shiftMasterRepo.save(shiftMaster);
	}

	
	

}
