package com.aspl.org.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.SectionMaster;
import com.aspl.org.repository.SectionMasterRepo;
import com.aspl.org.service.SectionMasterService;
@Service
@Transactional
public class SectionMasterServiceImpl implements SectionMasterService{
	
	
	@Autowired SectionMasterRepo sectionMasterRepo;

	@Override
	public SectionMaster getByName(String sectionName) {
		// TODO Auto-generated method stub
		return sectionMasterRepo.findBysectionName(sectionName);
	}

	@Override
	public List<SectionMaster> getallsectionMaster() {
		// TODO Auto-generated method stub
		return sectionMasterRepo.findAll();
	}

	@Override
	public Optional<SectionMaster> findbyidsectionmaster(Integer designId) {
		// TODO Auto-generated method stub
		return sectionMasterRepo.findById(designId);
	}

	@Override
	public SectionMaster sectionMastersave(SectionMaster sectionMaster) {
		// TODO Auto-generated method stub
		return sectionMasterRepo.save(sectionMaster);
	} 
	

	

}
