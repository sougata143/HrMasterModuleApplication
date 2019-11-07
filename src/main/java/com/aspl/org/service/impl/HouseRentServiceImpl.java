package com.aspl.org.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.HouseRentRecoveryEntry;
import com.aspl.org.repository.HouseRentcoveryRepo;
import com.aspl.org.service.HouseRentService;

@Service
@Transactional
public class HouseRentServiceImpl implements HouseRentService{
	
	
	@Autowired HouseRentcoveryRepo houseRentcoveryRepo;

	@Override
	public HouseRentRecoveryEntry getByhouserentID(Integer houserentID) {
		
		return houseRentcoveryRepo.findById(houserentID).get();
	}

	@Override
	public List<HouseRentRecoveryEntry> getallHouseRentRecoveryEntry() {
		
		return houseRentcoveryRepo.findAll();
	}

	@Override
	public Optional<HouseRentRecoveryEntry> findByempCode(String empCode) {
		
		return houseRentcoveryRepo.findByempCode(empCode);
	}

	@Override
	public HouseRentRecoveryEntry findByempCodeandhouseRentstatus(String empCode, String houseRentstatus) {
		
		return houseRentcoveryRepo.getHouseRentRecoverybyempcodeandstatus(empCode, houseRentstatus);
	}

	@Override
	public HouseRentRecoveryEntry houserentsave(HouseRentRecoveryEntry houseRentstatus) {
		
		return houseRentcoveryRepo.save(houseRentstatus);
	} 
	


	

	
	
	

}
