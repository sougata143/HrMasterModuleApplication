package com.aspl.org.service;

import java.util.List;
import com.aspl.org.entity.IncomeTaxslabMst;

public interface IncomeTaxMasterService {

	//DesignationMaster designationMaster(DesignationMaster designationMaster);
	IncomeTaxslabMst getByID(Integer incometaxID);
	List<IncomeTaxslabMst> getallIncomeTaxslabMst();
	
	IncomeTaxslabMst incomeTaxslabMstsave(IncomeTaxslabMst incomeTaxslabMst);
	
	
	IncomeTaxslabMst findByincomeminmaxamt(Double basic);
}
