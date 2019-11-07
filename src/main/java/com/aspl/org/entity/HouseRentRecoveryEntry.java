package com.aspl.org.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="houserentrecoveryentry")
public class HouseRentRecoveryEntry 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer houserentID;
	private String empCode;
	private String empName;
	private String houseRentstatus;
	private Double ratepermonth;
	private String remarks;
	
	
	/**
	 * @return the houserentID
	 */
	public Integer getHouserentID() {
		return houserentID;
	}
	/**
	 * @param houserentID the houserentID to set
	 */
	public void setHouserentID(Integer houserentID) {
		this.houserentID = houserentID;
	}
	/**
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}
	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the houseRentstatus
	 */
	public String getHouseRentstatus() {
		return houseRentstatus;
	}
	/**
	 * @param houseRentstatus the houseRentstatus to set
	 */
	public void setHouseRentstatus(String houseRentstatus) {
		this.houseRentstatus = houseRentstatus;
	}
	/**
	 * @return the ratepermonth
	 */
	public Double getRatepermonth() {
		return ratepermonth;
	}
	/**
	 * @param ratepermonth the ratepermonth to set
	 */
	public void setRatepermonth(Double ratepermonth) {
		this.ratepermonth = ratepermonth;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	

}
