package com.aspl.org.service;

import java.util.List;
import java.util.Optional;

import com.aspl.org.entity.CompanyMaster;
import com.aspl.org.entity.ResponseDetails;

public interface CompanymasterService {

	
	CompanyMaster companymastersave(CompanyMaster companyMaster);

	

	void companymasterdelete(CompanyMaster companyMaster);

	CompanyMaster getByName(String companyname);

	List<CompanyMaster> getalllist();

	
	Optional<CompanyMaster> findbyidcompanymaster(Integer companyID);



	CompanyMaster companymasterupdate(CompanyMaster companyMaster1);



	ResponseDetails softDeleteCompany(Integer cin);

	
	
	
}
