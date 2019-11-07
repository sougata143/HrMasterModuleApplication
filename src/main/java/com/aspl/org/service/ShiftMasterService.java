package com.aspl.org.service;

import java.util.List;
import java.util.Optional;
import com.aspl.org.entity.ShiftMaster;



public interface ShiftMasterService {

	//DesignationMaster designationMaster(DesignationMaster designationMaster);
	ShiftMaster getByName(String shiftName);
	List<ShiftMaster> getallShiftMaster();
	Optional<ShiftMaster> findbyidShiftMaster(Integer shiftID);
	ShiftMaster shiftMastersave(ShiftMaster shifttMaster);
}
