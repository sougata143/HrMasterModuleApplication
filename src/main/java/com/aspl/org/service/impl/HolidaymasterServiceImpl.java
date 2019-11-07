package com.aspl.org.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.HolidayMaster;
import com.aspl.org.repository.HolidayMasterRepo;
import com.aspl.org.repository.PayslipRepo;
import com.aspl.org.service.HolidaymasterService;
import com.aspl.org.service.UtilService;
import com.aspl.org.utils.GlobalDefine_;



@Service
@Transactional
public class HolidaymasterServiceImpl  implements HolidaymasterService{

	@Autowired HolidayMasterRepo holidayMasterRepo; 
	@Autowired PayslipRepo payslipRepo;
	@Autowired UtilService utilService;
	@Override
	public HolidayMaster holidaymastersave(HolidayMaster holidayMaster) {
	
		return holidayMasterRepo.save(holidayMaster);
	}

	@Override
	public List<HolidayMaster> getallHolidayEntrylist() {
		
		return holidayMasterRepo.findAll();
	}

	
	@Override
	public List<HolidayMaster> getallHolidaydatebetween(Date holidayfromdate, Date holidayendate) {
		
		String  fromDate = utilService.dateFormatConversion(holidayfromdate, GlobalDefine_.dateFormat1);
		String  toDate = utilService.dateFormatConversion(holidayendate, GlobalDefine_.dateFormat1);
		
		return holidayMasterRepo.getallHolidaydatebetween(fromDate, toDate);
	}

	
	
	@Override
	public HolidayMaster findbyholidayId(Integer Holidayid) {
	return holidayMasterRepo.getOne(Holidayid);
	}

	@Override
	public HolidayMaster updateholidayMaster(HolidayMaster holidayMaster) {
		try {
			holidayMasterRepo.save(holidayMaster);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return holidayMaster;
	}

	@Override
	public void permDeleteholidayMaster(Integer holidayid) {
		holidayMasterRepo.deleteById(holidayid);
		
	}
	
	@Override
	public Map<String,Integer> gettotalholidaymonthwise(String month)throws ParseException {
		
		Map<String,Integer> getholidaymap= new HashMap<>();
		
		try {
		
			Date date = new SimpleDateFormat("MMMM").parse(month);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			Integer monthInt = cal.get(Calendar.MONTH)+1;
			
			List<HolidayMaster> holidaylist=holidayMasterRepo.findByholidaystartdate(monthInt);
		
			Integer totalholiday=0;
			
		     if(holidaylist.size()>0) {
			
				for(HolidayMaster hm:holidaylist) {
					
							
							
							totalholiday=totalholiday+hm.getTotalholidaydate();
							getholidaymap.put("total_no_ofdays",totalholiday);
						  }
				
			}	else
			{
				getholidaymap.put("total_no_ofdays",0);
			}
		
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
		
		return getholidaymap;
		
	}
	

}
