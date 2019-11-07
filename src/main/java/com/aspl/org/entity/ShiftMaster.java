package com.aspl.org.entity;

import java.sql.Time;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shiftmaster" , schema = "crawley" )
public class ShiftMaster 
{
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer shiftID;
	
	private String shiftName;
	private Time intime;
	private Time outtime;
	
	
	
	/**
	 * @return the shiftID
	 */
	public Integer getShiftID() {
		return shiftID;
	}
	/**
	 * @param shiftID the shiftID to set
	 */
	public void setShiftID(Integer shiftID) {
		this.shiftID = shiftID;
	}
	/**
	 * @return the shiftName
	 */
	public String getShiftName() {
		return shiftName;
	}
	/**
	 * @param shiftName the shiftName to set
	 */
	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}
	/**
	 * @return the intime
	 */
	public Time getIntime() {
		return intime;
	}
	/**
	 * @param intime the intime to set
	 */
	public void setIntime(Time intime) {
		this.intime = intime;
	}
	/**
	 * @return the outtime
	 */
	public Time getOuttime() {
		return outtime;
	}
	/**
	 * @param outtime the outtime to set
	 */
	public void setOuttime(Time outtime) {
		this.outtime = outtime;
	}
	
	
	
	
	

}
