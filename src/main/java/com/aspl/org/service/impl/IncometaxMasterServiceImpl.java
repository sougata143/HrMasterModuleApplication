package com.aspl.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.IncomeTaxslabMst;
import com.aspl.org.repository.IncomeTaxslabMasterRepo;
import com.aspl.org.service.IncomeTaxMasterService;
@Service
@Transactional
public class IncometaxMasterServiceImpl implements IncomeTaxMasterService{

	@Autowired IncomeTaxslabMasterRepo incomeTaxMasterrepo;
	
	@Override
	public IncomeTaxslabMst getByID(Integer incometaxID) {
		// TODO Auto-generated method stub
		return incomeTaxMasterrepo.findById(incometaxID).get();
	}

	@Override
	public List<IncomeTaxslabMst> getallIncomeTaxslabMst() {
		// TODO Auto-generated method stub
		return incomeTaxMasterrepo.findAll();
	}

	@Override
	public IncomeTaxslabMst incomeTaxslabMstsave(IncomeTaxslabMst incomeTaxslabMst) {
		// TODO Auto-generated method stub
		return incomeTaxMasterrepo.save(incomeTaxslabMst);
	}

	@Override
	public IncomeTaxslabMst findByincomeminmaxamt(Double basic) {
		// TODO Auto-generated method stub
		return incomeTaxMasterrepo.findByincomeminmaxamt(basic);
	}
	
	


	

	
	
	

}
