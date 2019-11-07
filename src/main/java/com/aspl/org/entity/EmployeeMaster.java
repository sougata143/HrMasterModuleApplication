package com.aspl.org.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="employeemaster")
public class EmployeeMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid;
	private String empcode;
	private String empName;
	private String fathersname;
	private String presentAdd;
	private String currentAdd;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateofbirth;
	private String sex;
	private String qualification;
	private String traning;
	private String doctorName;
	private String doctorCode;
	private String weeklyHoliday;
	private String language;
	private String emptype;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateofjoining;
	private String idcardno;
	private String currentstatus;
	private Integer shift;
	private Integer section;
	private Integer designation;
	private Integer department;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateoftermination;
	private String pfacno;
	private String gratuityacno;
	private String resoneoftermination;
	private String esino;
	
	
	private String contactNo;
	private String emailadd;
	
	private String Bankacno;
	private String Bankname;
	private String ifsccode;
	private String branchname;
	
	
	private Double basic;
	private Double hra;
	private Double pf;
	private Double esi;
	private Double ot;
	private Double couponrate;
	private Double hrarecover;
	private Integer esiapplicable;
	private Integer welfare;
	private String addinformation;
	private Integer statusofemp;
	
	
	
	/**
	 * @return the empid
	 */
	public Integer getEmpid() {
		return empid;
	}
	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(Integer empid) {
		this.empid = empid;
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
	 * @return the fathersname
	 */
	public String getFathersname() {
		return fathersname;
	}
	/**
	 * @param fathersname the fathersname to set
	 */
	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}
	/**
	 * @return the presentAdd
	 */
	public String getPresentAdd() {
		return presentAdd;
	}
	/**
	 * @param presentAdd the presentAdd to set
	 */
	public void setPresentAdd(String presentAdd) {
		this.presentAdd = presentAdd;
	}
	/**
	 * @return the currentAdd
	 */
	public String getCurrentAdd() {
		return currentAdd;
	}
	/**
	 * @param currentAdd the currentAdd to set
	 */
	public void setCurrentAdd(String currentAdd) {
		this.currentAdd = currentAdd;
	}
	/**
	 * @return the dateofbirth
	 */
	public Date getDateofbirth() {
		return dateofbirth;
	}
	/**
	 * @param dateofbirth the dateofbirth to set
	 */
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the traning
	 */
	public String getTraning() {
		return traning;
	}
	/**
	 * @param traning the traning to set
	 */
	public void setTraning(String traning) {
		this.traning = traning;
	}
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the doctorCode
	 */
	public String getDoctorCode() {
		return doctorCode;
	}
	/**
	 * @param doctorCode the doctorCode to set
	 */
	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}
	/**
	 * @return the weeklyHoliday
	 */
	public String getWeeklyHoliday() {
		return weeklyHoliday;
	}
	/**
	 * @param weeklyHoliday the weeklyHoliday to set
	 */
	public void setWeeklyHoliday(String weeklyHoliday) {
		this.weeklyHoliday = weeklyHoliday;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the emptype
	 */
	public String getEmptype() {
		return emptype;
	}
	/**
	 * @param emptype the emptype to set
	 */
	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}
	/**
	 * @return the dateofjoining
	 */
	public Date getDateofjoining() {
		return dateofjoining;
	}
	/**
	 * @param dateofjoining the dateofjoining to set
	 */
	public void setDateofjoining(Date dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	/**
	 * @return the idcardno
	 */
	public String getIdcardno() {
		return idcardno;
	}
	/**
	 * @param idcardno the idcardno to set
	 */
	public void setIdcardno(String idcardno) {
		this.idcardno = idcardno;
	}
	/**
	 * @return the currentstatus
	 */
	public String getCurrentstatus() {
		return currentstatus;
	}
	/**
	 * @param currentstatus the currentstatus to set
	 */
	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}
	/**
	 * @return the shift
	 */
	public Integer getShift() {
		return shift;
	}
	/**
	 * @param shift the shift to set
	 */
	public void setShift(Integer shift) {
		this.shift = shift;
	}
	/**
	 * @return the section
	 */
	public Integer getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(Integer section) {
		this.section = section;
	}
	/**
	 * @return the designation
	 */
	public Integer getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(Integer designation) {
		this.designation = designation;
	}
	/**
	 * @return the department
	 */
	public Integer getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Integer department) {
		this.department = department;
	}
		
	/**
	 * @return the dateoftermination
	 */
	public Date getDateoftermination() {
		return dateoftermination;
	}
	/**
	 * @param dateoftermination the dateoftermination to set
	 */
	public void setDateoftermination(Date dateoftermination) {
		this.dateoftermination = dateoftermination;
	}
	/**
	 * @return the pfacno
	 */
	public String getPfacno() {
		return pfacno;
	}
	/**
	 * @param pfacno the pfacno to set
	 */
	public void setPfacno(String pfacno) {
		this.pfacno = pfacno;
	}
	/**
	 * @return the gratuityacno
	 */
	public String getGratuityacno() {
		return gratuityacno;
	}
	/**
	 * @param gratuityacno the gratuityacno to set
	 */
	public void setGratuityacno(String gratuityacno) {
		this.gratuityacno = gratuityacno;
	}
	/**
	 * @return the resoneoftermination
	 */
	public String getResoneoftermination() {
		return resoneoftermination;
	}
	/**
	 * @param resoneoftermination the resoneoftermination to set
	 */
	public void setResoneoftermination(String resoneoftermination) {
		this.resoneoftermination = resoneoftermination;
	}
	/**
	 * @return the esino
	 */
	public String getEsino() {
		return esino;
	}
	/**
	 * @param esino the esino to set
	 */
	public void setEsino(String esino) {
		this.esino = esino;
	}
	/**
	 * @return the basic
	 */
	public Double getBasic() {
		return basic;
	}
	/**
	 * @param basic the basic to set
	 */
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	/**
	 * @return the hra
	 */
	public Double getHra() {
		return hra;
	}
	/**
	 * @param hra the hra to set
	 */
	public void setHra(Double hra) {
		this.hra = hra;
	}
	/**
	 * @return the pf
	 */
	public Double getPf() {
		return pf;
	}
	/**
	 * @param pf the pf to set
	 */
	public void setPf(Double pf) {
		this.pf = pf;
	}
	/**
	 * @return the esi
	 */
	public Double getEsi() {
		return esi;
	}
	/**
	 * @param esi the esi to set
	 */
	public void setEsi(Double esi) {
		this.esi = esi;
	}
	/**
	 * @return the ot
	 */
	public Double getOt() {
		return ot;
	}
	/**
	 * @param ot the ot to set
	 */
	public void setOt(Double ot) {
		this.ot = ot;
	}
	/**
	 * @return the couponrate
	 */
	public Double getCouponrate() {
		return couponrate;
	}
	/**
	 * @param couponrate the couponrate to set
	 */
	public void setCouponrate(Double couponrate) {
		this.couponrate = couponrate;
	}
	/**
	 * @return the hrarecover
	 */
	public Double getHrarecover() {
		return hrarecover;
	}
	/**
	 * @param hrarecover the hrarecover to set
	 */
	public void setHrarecover(Double hrarecover) {
		this.hrarecover = hrarecover;
	}
	/**
	 * @return the esiapplicable
	 */
	public Integer getEsiapplicable() {
		return esiapplicable;
	}
	/**
	 * @param esiapplicable the esiapplicable to set
	 */
	public void setEsiapplicable(Integer esiapplicable) {
		this.esiapplicable = esiapplicable;
	}
	/**
	 * @return the welfare
	 */
	public Integer getWelfare() {
		return welfare;
	}
	/**
	 * @param welfare the welfare to set
	 */
	public void setWelfare(Integer welfare) {
		this.welfare = welfare;
	}
	/**
	 * @return the addinformation
	 */
	public String getAddinformation() {
		return addinformation;
	}
	/**
	 * @param addinformation the addinformation to set
	 */
	public void setAddinformation(String addinformation) {
		this.addinformation = addinformation;
	}
	/**
	 * @return the statusofemp
	 */
	public Integer getStatusofemp() {
		return statusofemp;
	}
	/**
	 * @param statusofemp the statusofemp to set
	 */
	public void setStatusofemp(Integer statusofemp) {
		this.statusofemp = statusofemp;
	}
	public String getBankacno() {
		return Bankacno;
	}
	public void setBankacno(String bankacno) {
		Bankacno = bankacno;
	}
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailadd() {
		return emailadd;
	}
	public void setEmailadd(String emailadd) {
		this.emailadd = emailadd;
	}
	
	
	
	
	
	
	
	

}
