package com.aspl.org.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="holidaymaster")
public class HolidayMaster {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer holidayid;
private String holidayname;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private Date holidaystardate;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private Date holidayenddate;
private Integer totalholidaydate;
private String description;

public Integer getHolidayid() {
	return holidayid;
}
public void setHolidayid(Integer holidayid) {
	this.holidayid = holidayid;
}
public String getHolidayname() {
	return holidayname;
}
public void setHolidayname(String holidayname) {
	this.holidayname = holidayname;
}
public Date getHolidaystardate() {
	return holidaystardate;
}
public void setHolidaystardate(Date holidaystardate) {
	this.holidaystardate = holidaystardate;
}
public Date getHolidayenddate() {
	return holidayenddate;
}
public void setHolidayenddate(Date holidayenddate) {
	this.holidayenddate = holidayenddate;
}
public Integer getTotalholidaydate() {
	return totalholidaydate;
}
public void setTotalholidaydate(Integer totalholidaydate) {
	this.totalholidaydate = totalholidaydate;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "HolidayMaster [holidayid=" + holidayid + ", holidayname=" + holidayname + ", holidaystardate="
			+ holidaystardate + ", holidayenddate=" + holidayenddate + ", totalholidaydate=" + totalholidaydate
			+ ", description=" + description + "]";
}


}
