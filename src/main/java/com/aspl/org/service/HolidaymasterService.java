package com.aspl.org.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aspl.org.entity.HolidayMaster;


public interface HolidaymasterService {

	
	HolidayMaster holidaymastersave(HolidayMaster holidayMaster);

	List<HolidayMaster> getallHolidayEntrylist();

	
	HolidayMaster findbyholidayId(Integer holidayid);

	HolidayMaster updateholidayMaster(HolidayMaster holidayMaster);

	void permDeleteholidayMaster(Integer holidayid);


	Map<String, Integer> gettotalholidaymonthwise(String month)throws ParseException;

	List<HolidayMaster> getallHolidaydatebetween(Date holidayfromdate, Date holidayendate);

	




	



	

	
	
	
}
