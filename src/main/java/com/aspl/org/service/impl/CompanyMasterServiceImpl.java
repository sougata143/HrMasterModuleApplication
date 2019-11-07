package com.aspl.org.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.dao.CompanyMasterDao;
import com.aspl.org.entity.CompanyMaster;
import com.aspl.org.entity.ResponseDetails;
import com.aspl.org.service.CompanymasterService;

@Service
@Transactional
public class CompanyMasterServiceImpl implements CompanymasterService {

	
	@Autowired CompanyMasterDao companyMasterDao;
	
	@Override
	public CompanyMaster companymastersave(CompanyMaster companyMaster) {
		
		//companyMaster.setRegdOfficeAddr(companyMaster.getRegdOfficeAddr().replaceAll("\\n",","));
		
		
		return companyMasterDao.save(companyMaster);
	}

	@Override
	public CompanyMaster companymasterupdate(CompanyMaster companyMaster) {
		return companyMasterDao.save(companyMaster);
	}


	@Override
	public void companymasterdelete(CompanyMaster companyMaster) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompanyMaster getByName(String companyname) {
		// TODO Auto-generated method stub
		return companyMasterDao.findByCompanyName(companyname);
	}
	
	@Override
	public List<CompanyMaster> getalllist() {
		// TODO Auto-generated method stub
		return companyMasterDao.findAll();
	}

	@Override
	public Optional<CompanyMaster> findbyidcompanymaster(Integer companyID)
	{
		return companyMasterDao.findById(companyID);
		
	}
	
	@Override
	public ResponseDetails softDeleteCompany(Integer cin) {
		CompanyMaster company = companyMasterDao.findById(cin).get();
		company.setStatus(0);
		companyMasterDao.save(company);
		return new ResponseDetails(new Date(), "Company Deleted Successfully", "200");
	}


	

}
