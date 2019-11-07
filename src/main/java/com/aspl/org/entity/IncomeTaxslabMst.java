package com.aspl.org.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="incometaxslabmst")
public class IncomeTaxslabMst 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer incometaxID;
	private Double lowerrange;
	private Double upperrange;
	private Double rate;
	
	/**
	 * @return the incometaxID
	 */
	public Integer getIncometaxID() {
		return incometaxID;
	}
	/**
	 * @param incometaxID the incometaxID to set
	 */
	public void setIncometaxID(Integer incometaxID) {
		this.incometaxID = incometaxID;
	}
	/**
	 * @return the lowerrange
	 */
	public Double getLowerrange() {
		return lowerrange;
	}
	/**
	 * @param lowerrange the lowerrange to set
	 */
	public void setLowerrange(Double lowerrange) {
		this.lowerrange = lowerrange;
	}
	/**
	 * @return the upperrange
	 */
	public Double getUpperrange() {
		return upperrange;
	}
	/**
	 * @param upperrange the upperrange to set
	 */
	public void setUpperrange(Double upperrange) {
		this.upperrange = upperrange;
	}
	/**
	 * @return the rate
	 */
	public Double getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	

}
