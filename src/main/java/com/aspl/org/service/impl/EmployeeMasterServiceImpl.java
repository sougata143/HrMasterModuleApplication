package com.aspl.org.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.repository.EmployeeMasterRepo;

import com.aspl.org.service.EmployeeMasterService;

@Service
@Transactional
public class EmployeeMasterServiceImpl implements EmployeeMasterService {
	
	@Autowired EmployeeMasterRepo employeemasterRepo;

	@Override
	public EmployeeMaster getByidcardno(String idcardno) {
		// TODO Auto-generated method stub
		return employeemasterRepo.findByidcardno(idcardno);
	}

	@Override
	public List<EmployeeMaster> getallEmployeemaster() {
		// TODO Auto-generated method stub
		return employeemasterRepo.findAll();
	}

	@Override
	public EmployeeMaster findbyidempcoder(String empcode) {
		// TODO Auto-generated method stub
		EmployeeMaster emp = new EmployeeMaster();
		try {
		List<EmployeeMaster> empO = employeemasterRepo.findByempcode(empcode);
		
		if(!empO.isEmpty()) {
			emp = empO.get(0);
		}
		 
	}catch(Exception ex) {
		ex.printStackTrace();
	}
		return emp;

		}

	/*
	 * @Override public EmployeeMaster EmployeeMastersave(EmployeeMaster
	 * employeeMaster , @RequestParam("dateofbirth") String dateofbirth ,
	 * 
	 * @RequestParam("dateofjoining") String dateofjoining
	 * ,@RequestParam("dateoftermination") String dateoftermination
	 * 
	 * ) { // TODO Auto-generated method stub
	 * 
	 * 
	 * Date date1; try { date1 = new
	 * SimpleDateFormat("yyyy-MM-dd").parse(dateofbirth);
	 * 
	 * Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(dateofjoining); Date
	 * date3 = new SimpleDateFormat("yyyy-MM-dd").parse(dateoftermination);
	 * employeeMaster.setDateofbirth(date1); employeeMaster.setDateofjoining(date2);
	 * employeeMaster.setDateoftermination(date3);
	 * 
	 * 
	 * } catch (ParseException e) { 
	 * e.printStackTrace(); }
	 * 
	 * return employeemasterRepo.save(employeeMaster);
	 * 
	 * }
	 */
	
	  @Override 
	  public EmployeeMaster EmployeeMastersavediff(EmployeeMaster employeeMaster) 
	  { // TODO Auto-generated method stub return
	  return employeemasterRepo.save(employeeMaster); 
	  }

	/*
	 * @Override public EmployeeMaster findbyidempcoder(Integer empcode, int month)
	 * { EmployeeMaster emp = new EmployeeMaster(); try { List<EmployeeMaster> empO
	 * = employeemasterRepo.findByempcode(empcode,month);
	 * 
	 * if(!empO.isEmpty()) { emp = empO.get(0); }
	 * 
	 * }catch(Exception ex) { ex.printStackTrace(); } return emp;
	 * 
	 * }
	 */
	  
	  
	  @Override
		public List<EmployeeMaster> findByemptype(String emptype) {
			// TODO Auto-generated method stub
			List<EmployeeMaster> emp = employeemasterRepo.findByemptype(emptype);
			return emp;

			}
	  
	  
	  
	  
	  
	}
	 
	
	
	


