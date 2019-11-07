package com.aspl.org.service;



import java.util.Date;
import java.util.List;

import com.aspl.org.entity.Attendance;


public interface AttendanceService {

	
	
	Attendance attendacesave(Attendance attendace);
	
	List<Attendance> Attendancebydateempcode(String employeeType, Date from_date, Date to_date);

	List<Attendance> attendaceList();

	Attendance attendaceupdate(Attendance attendace);

	
}
