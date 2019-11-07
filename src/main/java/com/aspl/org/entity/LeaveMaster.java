package com.aspl.org.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="leavemaster" , schema = "crawley" )
public class LeaveMaster 
{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer leaveID;
	
	private String leavetype;
	private String empcode;
	private Integer noofleave;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date effectofdate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date effectenddate;
	/**
	 * @return the leaveID
	 */
	public Integer getLeaveID() {
		return leaveID;
	}
	/**
	 * @param leaveID the leaveID to set
	 */
	public void setLeaveID(Integer leaveID) {
		this.leaveID = leaveID;
	}
	/**
	 * @return the leavetype
	 */
	public String getLeavetype() {
		return leavetype;
	}
	/**
	 * @param leavetype the leavetype to set
	 */
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	/**
	 * @return the empcode
	 */
	public String getEmpcode() {
		return empcode;
	}
	/**
	 * @param empcode the empcode to set
	 */
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	/**
	 * @return the noofleave
	 */
	public Integer getNoofleave() {
		return noofleave;
	}
	/**
	 * @param noofleave the noofleave to set
	 */
	public void setNoofleave(Integer noofleave) {
		this.noofleave = noofleave;
	}
	/**
	 * @return the effectofdate
	 */
	public Date getEffectofdate() {
		return effectofdate;
	}
	/**
	 * @param effectofdate the effectofdate to set
	 */
	public void setEffectofdate(Date effectofdate) {
		this.effectofdate = effectofdate;
	}
	/**
	 * @return the effectenddate
	 */
	public Date getEffectenddate() {
		return effectenddate;
	}
	/**
	 * @param effectenddate the effectenddate to set
	 */
	public void setEffectenddate(Date effectenddate) {
		this.effectenddate = effectenddate;
	}
	
	
	
	
	
}
