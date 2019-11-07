package com.aspl.org.service.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspl.org.entity.Attendance;
import com.aspl.org.repository.AttendanceRepo;
import com.aspl.org.service.AttendanceService;
@Service
@Transactional
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired AttendanceRepo attendanceeRepo; 
	

	@Override
	public Attendance attendacesave(Attendance attendace) {
		return attendanceeRepo.save(attendace);
	}


	@Override
	public List<Attendance> Attendancebydateempcode(String employeeType, Date from_date, Date to_date) {
	
				
		
		
		
		
		
		
		return attendanceeRepo.Attendancebydateempcode(employeeType, from_date, to_date);
	}
	
	
	
	
	
	@Override
	public List<Attendance> attendaceList() {
		
				
				
		return attendanceeRepo.findAll();
	}
	
	@Override
	public Attendance attendaceupdate(Attendance attendace) {
		
		return attendanceeRepo.save(attendace);
	}
	
	

}
