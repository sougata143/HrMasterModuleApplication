package com.aspl.org.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.Esientry;
import com.aspl.org.repository.EsiMasterRepo;
import com.aspl.org.service.EsimasterService;

@Service
@Transactional
public class EsiMasterServiceImpl implements EsimasterService{
	
	
	@Autowired EsiMasterRepo esiMasterRepo  ;

	@Override
	public Esientry esimastersave(Esientry esientry) {
		// TODO Auto-generated method stub
		return esiMasterRepo.save(esientry);
	}

	@Override
	public void esimasterdelete(Esientry esientry) {
		// TODO Auto-generated method stub
		esiMasterRepo.delete(esientry);
		
	}

	
	@Override
	public List<Esientry> getallEsientrylist() {
		// TODO Auto-generated method stub
		return esiMasterRepo.findAll();
	}

	@Override
	public Optional<Esientry> findbyidesiId(Integer esiId) {
		// TODO Auto-generated method stub
		return esiMasterRepo.findById(esiId);
	}

	@Override
	public Esientry esientryupdate(Esientry esientry) {
		// TODO Auto-generated method stub
		return esiMasterRepo.save(esientry);
	}

	@Override
	public Esientry getByempCode(String empCode) {
		// TODO Auto-generated method stub
		return esiMasterRepo.findByempCode(empCode);
	}

	@Override
	public List<Esientry> getByesiNo(String esiNo) {
		// TODO Auto-generated method stub
		return esiMasterRepo.findByesiNo(esiNo);
	}

	
	
	

}
