package com.aspl.org.service;

import java.util.List;
import java.util.Optional;
import com.aspl.org.entity.SectionMaster;

public interface SectionMasterService {

	//DesignationMaster designationMaster(DesignationMaster designationMaster);
	SectionMaster getByName(String sectionnme);
	List<SectionMaster> getallsectionMaster();
	Optional<SectionMaster> findbyidsectionmaster(Integer sectionId);
	SectionMaster sectionMastersave(SectionMaster sectionMaster);
}
