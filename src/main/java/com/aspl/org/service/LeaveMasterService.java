package com.aspl.org.service;

import java.util.List;
import java.util.Optional;

import com.aspl.org.dto.LeaveStatementDTO;
import com.aspl.org.entity.LeaveMaster;

public interface LeaveMasterService {

	//DesignationMaster designationMaster(DesignationMaster designationMaster);
	LeaveMaster getByleavetype(String leavetype);
	List<LeaveMaster> getallLeavemaster();
	//Optional<LeaveMaster> findbyidleaveMaster(Integer leaveID);
	LeaveMaster leavemastersave(LeaveMaster leaveMaster);
	List<LeaveMaster> getByleavetypelist(String leavetype);
	List<LeaveMaster> findByempcode(String empcode);
	Optional<LeaveMaster> findbyidleaveMaster(Integer leaveID);
	List<LeaveStatementDTO> getLeaveStatementReport(String currentyear);
	//List<LeaveMaster> findByempcode(String empcode);
}
