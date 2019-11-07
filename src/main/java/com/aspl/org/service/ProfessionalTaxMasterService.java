package com.aspl.org.service;

import java.util.List;
import com.aspl.org.entity.ProffesionalTaxslabMst;

public interface ProfessionalTaxMasterService {

	//DesignationMaster designationMaster(DesignationMaster designationMaster);
	ProffesionalTaxslabMst getByID(Integer professionaltaxID);
	List<ProffesionalTaxslabMst> getallProffesionalTaxslabMst();
	
	ProffesionalTaxslabMst professionalTaxslabMstsave(ProffesionalTaxslabMst proffesionalTaxslabMst);
	
	ProffesionalTaxslabMst findByproffesionalminmaxamt(Double basic);
}
