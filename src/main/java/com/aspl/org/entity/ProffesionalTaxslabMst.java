package com.aspl.org.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professionaltaxslabmst")
public class ProffesionalTaxslabMst 
{
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer professionaltaxID;
	private Double lowerrange;
	private Double upperrange;
	private Double rate;
	
		
	
	/**
	 * @return the professionaltaxID
	 */
	public Integer getProfessionaltaxID() {
		return professionaltaxID;
	}
	/**
	 * @param professionaltaxID the professionaltaxID to set
	 */
	public void setProfessionaltaxID(Integer professionaltaxID) {
		this.professionaltaxID = professionaltaxID;
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
