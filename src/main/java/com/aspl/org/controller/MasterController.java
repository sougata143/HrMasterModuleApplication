package com.aspl.org.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aspl.org.entity.AdvancePaymentVoucher;
import com.aspl.org.entity.Attendance;
import com.aspl.org.entity.CanteenVoucherEntry;
import com.aspl.org.entity.CompanyMaster;
import com.aspl.org.entity.DepartmentMaster;
import com.aspl.org.entity.DesignationMaster;
import com.aspl.org.entity.EmployeeMaster;
import com.aspl.org.entity.Esientry;
import com.aspl.org.entity.HolidayMaster;
import com.aspl.org.entity.HouseRentRecoveryEntry;
import com.aspl.org.entity.IncomeTaxslabMst;
import com.aspl.org.entity.LeaveMaster;
import com.aspl.org.entity.PfvoucherEntry;
import com.aspl.org.entity.ProffesionalTaxslabMst;
import com.aspl.org.entity.ResponseDetails;
import com.aspl.org.entity.SectionMaster;
import com.aspl.org.entity.ShiftMaster;
import com.aspl.org.service.AdvSalaryService;
import com.aspl.org.service.AttendanceService;
import com.aspl.org.service.CanteenVouMasterService;
import com.aspl.org.service.CompanymasterService;
import com.aspl.org.service.DepartmentMasterService;
import com.aspl.org.service.DesignationMasterService;
import com.aspl.org.service.EmployeeMasterService;
import com.aspl.org.service.EsimasterService;
import com.aspl.org.service.HolidaymasterService;
import com.aspl.org.service.HouseRentService;
import com.aspl.org.service.IncomeTaxMasterService;
import com.aspl.org.service.LeaveMasterService;
import com.aspl.org.service.PfmasterService;
import com.aspl.org.service.ProfessionalTaxMasterService;
import com.aspl.org.service.SectionMasterService;
import com.aspl.org.service.ShiftMasterService;




@RestController
@RequestMapping(path = "/master")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MasterController {
	
	
@Autowired CompanymasterService companyMasterService;
@Autowired DesignationMasterService designationMasterService;
@Autowired SectionMasterService sectionMasterService;
@Autowired DepartmentMasterService departmentMasterService;
@Autowired ShiftMasterService shiftmasterservice;
@Autowired LeaveMasterService leaveMasterService;
@Autowired EmployeeMasterService employeeMasterService;
@Autowired EsimasterService esimasterService;
@Autowired PfmasterService pfmasterService; 
@Autowired IncomeTaxMasterService incomeTaxMasterService; 
@Autowired ProfessionalTaxMasterService professionalTaxMasterService;
@Autowired CanteenVouMasterService canteenVouMasterService; 
@Autowired AdvSalaryService advSalaryService;

@Autowired HouseRentService houseRentService; 

@Autowired AttendanceService attendanceService;

@Autowired HolidaymasterService holidaymasterService;

@Autowired ServletContext context;

	@PostMapping("/companymstsave")
	public CompanyMaster comapnymaster(@RequestBody CompanyMaster companyMaster)
	{
		System.out.println(companyMaster);
			return companyMasterService.companymastersave(companyMaster);
	}
	
	@GetMapping("/getByName/{companyname}")
	public CompanyMaster getByName(@PathVariable String companyname) {
		return companyMasterService.getByName(companyname);
	}

	@GetMapping(path="/getalllist", produces = "application/json")
	public List<CompanyMaster> getalllist() {
		return  companyMasterService.getalllist();
	}
	
	@PutMapping("/updatecompanymaster/{companyID}")
	public CompanyMaster updatecompanymaster(@PathVariable(value="companyID") Integer companyID, @RequestBody CompanyMaster companyMaster )
	{
		CompanyMaster companyMaster1 = companyMasterService.findbyidcompanymaster(companyID).get();
		
		return companyMasterService.companymasterupdate(companyMaster1);
	}
	
	@PutMapping("/softDeleteCompanyMaster/{companyID}")
	public ResponseDetails softDeletecompanymaster(@PathVariable(value="companyID") Integer companyID )
	{
		return companyMasterService.softDeleteCompany(companyID);
	}
	
	
	
	
	@PostMapping("/DesignationMaster")
	public DesignationMaster designationMaster(@RequestBody DesignationMaster designationMaster)
	{
		return designationMasterService.designationMastersave(designationMaster);
	}
	
	
	
	@GetMapping("/getByNamedesignation/{designation}")
	public DesignationMaster designationMaster(@PathVariable(value="designation") String designation)
	
	{
		return designationMasterService.getByName(designation);
		
	}
	
	@GetMapping("/getById/{designId}")
	public DesignationMaster designationMasterbydesignationId(@PathVariable(value="designId") Integer designId )
	{
		return designationMasterService.findbyiddesignationmaster(designId).get();
	}
	
	@PutMapping("/updatedesignationmaster/{designId}")
	public DesignationMaster updatedesignationMaster(@PathVariable(value = "designId") Integer designId, @RequestBody DesignationMaster designationMaster)
	{
		DesignationMaster getdesignationbyId= designationMasterService.findbyiddesignationmaster(designId).get();
		getdesignationbyId.setDescribedetails(designationMaster.getDescribedetails());
		getdesignationbyId.setDesignation(designationMaster.getDesignation());
		return designationMasterService.designationMastersave(designationMaster);
	}
	
	@GetMapping(path="/getalldesignation" , produces = "application/json" )
	public List<DesignationMaster> getalldesignmaster()
	{
		
		return designationMasterService.getalldesignationmaster();
	}
	
	
	/* ............ Start Section Master Controller  ........ */
	
	
	@PostMapping(path= "/sectionMastersave")
	public SectionMaster sectionMastersave(@RequestBody SectionMaster sectionMaster)
	{
		
		return sectionMasterService.sectionMastersave(sectionMaster);
	}
	
	
	
	@GetMapping("/getByNamesection/{sectionName}")
	public SectionMaster getbyNameSectionMaster(@PathVariable(value="sectionName") String sectionName)
	
	{
		return sectionMasterService.getByName(sectionName);
		
	}
	
	@GetMapping("/getByIdsection/{sectionId}")
	public SectionMaster getByIdsection(@PathVariable(value="sectionId") Integer sectionId )
	{
		return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
	@PutMapping("/updatesectionmaster/{sectionId}")
	public SectionMaster updatedesignationMaster(@PathVariable(value = "sectionId") Integer sectionId, @RequestBody SectionMaster sectionMaster)
	{
		SectionMaster getsectionbyId= sectionMasterService.findbyidsectionmaster(sectionId).get();
		getsectionbyId.setDetails(sectionMaster.getDetails());
		getsectionbyId.setSectionName(sectionMaster.getSectionName());
		return sectionMasterService.sectionMastersave(sectionMaster);
	}
	
	@GetMapping(path="/getallsectionmaster" , produces = "application/json" )
	public List<SectionMaster> getallsectionmaster()
	{
		
		return sectionMasterService.getallsectionMaster();
	}
	
	
	
	/* ............ End Section Master Controller  ........ */
	
	/* ............ Start Department Master Controller  ........ */
	
	@PostMapping("/departmentMastersave")
	public DepartmentMaster departmentMastersave(@RequestBody DepartmentMaster departmentMaster)
	{
		return departmentMasterService.departmentsave(departmentMaster);
	}
	
	
	@GetMapping(path="/getalldeptMaster" , produces = "application/json" )
	public List<DepartmentMaster> getalldepartmentaMaster()
	{
		
		return departmentMasterService.getallDeptMaster();
	}
	
	
	
	
	
	
	
	
	
	
	
	/* ............ End Department Master Controller  ........ */
	
	
	/* ............ Start Shift Master Controller  ........ */
	
	
	@PostMapping("/shiftmastersave")
	public ShiftMaster shiftMastersave(@RequestBody ShiftMaster shitMaster)
	{
		return shiftmasterservice.shiftMastersave(shitMaster);
	}
	
	
	
	@GetMapping("/getByNameshift/{shiftname}")
	public ShiftMaster getbyNameshiftMaster(@PathVariable(value="shiftname") String shiftname)
	
	{
		return shiftmasterservice.getByName(shiftname);
		
	}
	
	@GetMapping("/getByIdshift/{shiftID}")
	public ShiftMaster getByIdshift(@PathVariable(value="shiftID") Integer shiftID )
	
	{
		return shiftmasterservice.findbyidShiftMaster(shiftID).get();
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
	@PutMapping("/updateshiftmaster/{shiftID}")
	public ShiftMaster updatedeshiftmaster(@PathVariable(value = "shiftID") Integer shiftID, @RequestBody ShiftMaster shiftMaster)
	{
		ShiftMaster getbyidshiftmaster=shiftmasterservice.findbyidShiftMaster(shiftID).get();
		getbyidshiftmaster.setShiftName(shiftMaster.getShiftName());
		getbyidshiftmaster.setIntime(shiftMaster.getIntime());
		getbyidshiftmaster.setOuttime(shiftMaster.getOuttime());
		
		return shiftmasterservice.shiftMastersave(getbyidshiftmaster);
	}
	
	@GetMapping(path="/getallshiftmaster" , produces = "application/json" )
	public List<ShiftMaster> getallshiftmaster()
	{
		
		return shiftmasterservice.getallShiftMaster();
	}
	
	
	
	
	
	
	
	
	
	
	
	 
	/* ............ End Shift Master Controller  ........ */
	
	
	
	/* ............ Start Leave Master Controller  ........ */
	
	
	@PostMapping("/leavemastersave")
	public LeaveMaster leaveMastersave(@RequestBody LeaveMaster leaveMaster)
	{
		return leaveMasterService.leavemastersave(leaveMaster);
	}
	
	
	@GetMapping("/getByempCodeleavemaster/{empcode}")
	
	public List<LeaveMaster> findByempcodeleavemaster(@PathVariable(value="empcode") String empcode)
	
	{
		List<LeaveMaster> findByempcodeleavemaster= leaveMasterService.findByempcode(empcode);
		return findByempcodeleavemaster;
		
	}
	
	
	@GetMapping("/getByleaveType/{leavetype}")
	
	public List<LeaveMaster> getbyNameleavemaster(@PathVariable(value="leavetype") String leavetype)
	
	{
		List<LeaveMaster> leavemasterlistbytype= leaveMasterService.getByleavetypelist(leavetype);
		return leavemasterlistbytype;
		
	}
	
	@GetMapping("/getByIdleave/{leaveID}")
	
	public LeaveMaster getByIdleave(@PathVariable(value="leaveID") Integer leaveID )
	
	{
		return leaveMasterService.findbyidleaveMaster(leaveID).get();
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
	@PutMapping("/updateleavemaster/{leaveID}")
	
	public LeaveMaster updatedeshiftmaster(@PathVariable(value = "leaveID") Integer leaveID, @RequestBody LeaveMaster leaveMaster)
	{
		LeaveMaster getbyidleavemaster=leaveMasterService.findbyidleaveMaster(leaveID).get();
		
		getbyidleavemaster.setEmpcode(leaveMaster.getEmpcode());
		getbyidleavemaster.setLeavetype(leaveMaster.getLeavetype());
		getbyidleavemaster.setNoofleave(leaveMaster.getNoofleave());
		getbyidleavemaster.setEffectofdate(leaveMaster.getEffectofdate());
		getbyidleavemaster.setEffectenddate(leaveMaster.getEffectenddate());
		
		
		return leaveMasterService.leavemastersave(getbyidleavemaster);
	}
	
	@GetMapping(path="/getallleavemaster" , produces = "application/json" )
	
	public List<LeaveMaster> getallleavemaster()
	{
		
		return leaveMasterService.getallLeavemaster();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/* ............ End Leave Master Controller  ........ */
	
	
	
	/* ............Start Employee master Controller   ........ */
	
	
	/*
	 * @PostMapping("/employeeMastersave")
	 * 
	 *  public EmployeeMaster
	 * employeeMastersave(@RequestBody EmployeeMaster employeeMaster,
	 * 
	 * @RequestParam("dateofbirth") String dateofbirth
	 * , @RequestParam("dateofjoining") String dateofjoining ,
	 * 
	 * @RequestParam("dateoftermination") String dateoftermination ) { return
	 * employeeMasterService.EmployeeMastersave(employeeMaster, dateofbirth ,
	 * dateofjoining, dateoftermination); }
	 */
	
	@PostMapping("/employeeMastersave")
	public EmployeeMaster employeeMastersave(@RequestBody EmployeeMaster employeeMaster)
	{
		return employeeMasterService.EmployeeMastersavediff(employeeMaster);
	}
	
	
	@GetMapping("/getByempcode/{empcode}")
	public EmployeeMaster getbyempcodeEmployeeMaster(@PathVariable(value="empcode") String empcode)
	
	{
		EmployeeMaster empcodeEmployeeMaster= employeeMasterService.findbyidempcoder(empcode);
		return empcodeEmployeeMaster;
		
	}
	
	@GetMapping("/getByidcardno/{idcardno}")
	public EmployeeMaster getByidcardno(@PathVariable(value="idcardno") String idcardno )
	
	{
		return employeeMasterService.getByidcardno(idcardno);
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
	/*
	 * @PutMapping("/updateemployeemaster/{empcode}")
	 * 
	 *  public EmployeeMaster
	 * updateemployeemaster( @RequestBody EmployeeMaster employeeMaster) {
	 * 
	 * return employeeMasterService.EmployeeMastersave(employeeMaster); }
	 */
	
	@GetMapping(path="/getallemployeemaster" , produces = "application/json" )
	public List<EmployeeMaster> getallemployeemaster()
	{
		
		return employeeMasterService.getallEmployeemaster();
	}
	
	
	
	
	
	/* ............  End Employee Master Controller  ........ */
	
	
	
	
/* ............Start Esi master Controller   ........ */
	
	
	@PostMapping("/esiMastersave")
	public Esientry esiMastersave(@RequestBody Esientry esientry)
	
	{
		return esimasterService.esimastersave(esientry);
	}
	
	
	
	@GetMapping("/getEsiByempCode/{empCode}")
	public Esientry getesibyempCode(@PathVariable(value="empCode") String empCode)
	
	{
		Esientry esientrybyemcpcode= esimasterService.getByempCode(empCode);
		return esientrybyemcpcode;
		
	}
	
	@GetMapping("/getByesiNo/{esiNo}")
	public List<Esientry> getByesiNo(@PathVariable(value="esiNo") String esiNo )
	
	{
		return esimasterService.getByesiNo(esiNo);
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
	@PutMapping("/updateesimaster/{esiId}")
	public Esientry updateesimaster( @RequestBody Esientry esientry)
	{
		
		return esimasterService.esientryupdate(esientry);
	}
	
	@GetMapping(path="/getallesimaster" , produces = "application/json" )
	public List<Esientry> getallEsientry()
	{
		
		return esimasterService.getallEsientrylist();
	}
	
	
	
	
	
	/* ............  End Esi Master Controller  ........ */
	
	
	
/* ............Start Pf master Controller   ........ */
	
	
	@PostMapping("/pfMastersave")
	public PfvoucherEntry pfMastersave(@RequestBody PfvoucherEntry pfvoucherEntry)
	
	{
		return pfmasterService.pfmastersave(pfvoucherEntry);
	}
	
	
	
	@GetMapping("/getpfByempcode/{empcode}")
	public PfvoucherEntry getpfbyempCode(@PathVariable(value="empcode") String empcode)
	
	{
		PfvoucherEntry pfentrybyemcpcode= pfmasterService.getByempcode(empcode);
		return pfentrybyemcpcode;
		
	}
	
	@GetMapping("/getBypfNo/{pfNo}")
	public PfvoucherEntry getBypfNo(@PathVariable(value="pfNo") String pfNo )
	
	{
		return pfmasterService.findbypfNo(pfNo);
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
	@PutMapping("/updateesimaster/{pfvouID}")
	public PfvoucherEntry updatepfmaster( @RequestBody PfvoucherEntry pfvoucherEntry)
	{
		
		return pfmasterService.pfmastersave(pfvoucherEntry);
	}
	
	@GetMapping(path="/getallpfmaster" , produces = "application/json" )
	public List<PfvoucherEntry> getallpfentry()
	{
		
		return pfmasterService.getallPfvoucherEntrylist();
	}
	
	
	
	
	
	/* ............  End Pf Master Controller  ........ */
	
	
/* ............Start Income tax master Controller   ........ */
	
	
	@PostMapping("/incometaxMastersave")
	public IncomeTaxslabMst incometaxMastersave(@RequestBody IncomeTaxslabMst incomeTaxslabMst)
	
	{
		return incomeTaxMasterService.incomeTaxslabMstsave(incomeTaxslabMst);
	}
	
	
	
	@GetMapping("/getpfByincometaxID/{incometaxID}")
	public IncomeTaxslabMst getpfbyincometaxID(@PathVariable(value="incometaxID") Integer incometaxID)
	
	{
		
		IncomeTaxslabMst incomeTaxslabMst= incomeTaxMasterService.getByID(incometaxID);
		
		return incomeTaxslabMst;
		
	}
	


	
	@GetMapping(path="/getallincometax" , produces = "application/json" )
	public List<IncomeTaxslabMst> getallincomeTax()
	{
		
		return incomeTaxMasterService.getallIncomeTaxslabMst();
	}
	
	
	
	
	
	/* ............  End Income tax Master Controller  ........ */
	
	
/* ............Start Professional tax master Controller   ........ */
	
	
	@PostMapping("/proffesionaltaxMastersave")
	public ProffesionalTaxslabMst proffesionaltaxMastersave(@RequestBody ProffesionalTaxslabMst proffesionalTaxslabMst)
	
	{
		return professionalTaxMasterService.professionalTaxslabMstsave(proffesionalTaxslabMst);
	}
	
	
	
	@GetMapping("/getpfByprofessionaltaxID/{professionaltaxID}")
	public ProffesionalTaxslabMst getpfbyprofessionaltaxID(@PathVariable(value="professionaltaxID") Integer professionaltaxID)
	
	{
		ProffesionalTaxslabMst proffesionalTaxslabMst=professionalTaxMasterService.getByID(professionaltaxID); 
		
		return proffesionalTaxslabMst;
		
	}
	
	
	
	
	@GetMapping(path="/getallproffesionaltax" , produces = "application/json" )
	public List<ProffesionalTaxslabMst> getallproffesionalTax()
	{
		
		return professionalTaxMasterService.getallProffesionalTaxslabMst();
	}
	
	
		
	/* ............  End Professional tax Master Controller  ........ */
	
	
	
	
	
/* ............Start canteen Voucher master Controller   ........ */
	
	
	@PostMapping("/canteenVouMastersave")
	public CanteenVoucherEntry canteenVouMastersave(@RequestBody CanteenVoucherEntry canteenVoucherEntry)
	
	{
		return canteenVouMasterService.CanteenVoucherEntrysave(canteenVoucherEntry);
	}
	
	
	
	@GetMapping("/getcanteenbycanvouID/{canvouID}")
	public CanteenVoucherEntry getcanteenbycanvouID(@PathVariable(value="canvouID") Integer canvouID)
	
	{
		CanteenVoucherEntry canteenVoucherEntrybycanID= canteenVouMasterService.getBycanvouID(canvouID);
		return canteenVoucherEntrybycanID;
		
	}
	
	@GetMapping("/getByVoucherNo/{voucherNo}")
	public CanteenVoucherEntry getByvoucherNo(@PathVariable(value="voucherNo") String voucherNo )
	
	{
		return canteenVouMasterService.findbyvoucherNo(voucherNo).get();
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
	@PutMapping("/updateCanteenVoucherEntry/{canvouID}")
	public CanteenVoucherEntry updateCanteenVoucherEntry( @RequestBody CanteenVoucherEntry canteenVoucherEntry)
	{
		
		return canteenVouMasterService.CanteenVoucherEntrysave(canteenVoucherEntry);
	}
	
	@GetMapping(path="/getallCanteenVoucher" , produces = "application/json" )
	public List<CanteenVoucherEntry> getallCanteenVoucher()
	{
		
		return canteenVouMasterService.getallCanteenVoucherEntry();
	}
	
	
	
	
	
	/* ............  End Canteen Voucher Master Controller  ........ */
	
	
/* ............Start Advance Payment Voucher master Controller   ........ */
	
	
	@PostMapping("/advpayMastersave")
	public AdvancePaymentVoucher advancePayMastersave(@RequestBody AdvancePaymentVoucher advancePaymentVoucher)
	
	{
		return advSalaryService.AdvancePaymentVouchersave(advancePaymentVoucher);
	}
	
	
	
	@GetMapping("/getAdvancePaybyadpayId/{adpayId}")
	public AdvancePaymentVoucher getAdvancePaybyadpayId(@PathVariable(value="adpayId") Integer adpayId)
	
	{
		AdvancePaymentVoucher advancePaymentVoucherById= advSalaryService.getByadvVouID(adpayId);
		return advancePaymentVoucherById;
		
	}
	
	@GetMapping("/getAdvancePaybyempcode/{empcode}")
	public List<AdvancePaymentVoucher> getByEmpCode(@PathVariable(value="empcode") String empcode )
	{
		return advSalaryService.findByempcode(empcode);
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
		
	@GetMapping(path="/getalladvPay" , produces = "application/json" )
	public List<AdvancePaymentVoucher> getallAdvancePaymentVoucher()
	{
		
		return advSalaryService.getalladvAdvancePaymentVouchers();
	}
	
	
	
	
	
	/* ............  End Advance Payment Voucher Master Controller  ........ */
	
	
/* ............Start House Rent recovery master Controller   ........ */
	
	
	@PostMapping("/houseRentsave")
	
	public HouseRentRecoveryEntry houseRentsave(@RequestBody HouseRentRecoveryEntry houseRentRecoveryEntry)
	
	{
		return houseRentService.houserentsave(houseRentRecoveryEntry);
	}
	
	
	
	@GetMapping("/getHouseRentfindByempCode/{empCode}")
	
	public HouseRentRecoveryEntry getHouserentfindByempCode(@PathVariable(value="empCode") String empCode)
	
	{
			
		Optional<HouseRentRecoveryEntry> houserentbyempid= houseRentService.findByempCode(empCode);
		return houserentbyempid.get();
		
	}
	
	@GetMapping("/gethouserentbyempcodeandstatus/{empCode}/{houseRentstatus}")
	
	public HouseRentRecoveryEntry getHouserentfindByempCodeandstatus(@PathVariable(value="empCode") String empCode ,@PathVariable(value="houseRentstatus") String houseRentstatus )
	{
		return houseRentService.findByempCodeandhouseRentstatus(empCode, houseRentstatus);
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}
	
		
	@GetMapping(path="/getallhouserent" , produces = "application/json" )
	
	public List<HouseRentRecoveryEntry> getallhouserent()
	{
		
		return houseRentService.getallHouseRentRecoveryEntry();
	}
			
	/* ............  End House Rent Recovery Master Controller  ........ */
	
	
	/* ............  Attendace Master Controller  ........ */
	
	@GetMapping(path="/getallattendace" , produces = "application/json" )
	
	public List<Attendance> getallattendace()
	{	
		return attendanceService.attendaceList();
	}
	
	
	/* ............  End Attendace Master Controller  ........ */
	
	
	/* ............  Get payslip Controller  ........ */
	
	@GetMapping(path="/getPayslip" , produces = "application/json" )
	
	public String getpayslip()
	{	
		return "D:/crawley_ray_hr/erpcr/ERPBootApplication/pdf/crawley-staff-payslip-1982518440.pdf";
	}
	
	
	
	@RequestMapping(value = "/download/{filename:.+}")
	public String downloadreport( HttpServletRequest request, HttpServletResponse response, @PathVariable String filename) {
		
		String dataDirectory = request.getServletContext().getRealPath("/pdf/");
		
		RequestDispatcher dataDirectory1 = request.getServletContext().getRequestDispatcher("/pdf/");
		
		
		//logger.info("dataDirectory :::::::::: "+dataDirectory);
		
        Path file = Paths.get(dataDirectory, filename);
        if (Files.exists(file)) {
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "attachment; filename="+filename);
            try
            {
                Files.copy(file, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		return dataDirectory+"/"+filename;
		
	}
	
	
	

 
	@RequestMapping(value = "/pdf/{fileName:.+}", method = RequestMethod.GET, produces = "application/pdf")
 public ResponseEntity<InputStreamResource> download(@PathVariable("fileName") String fileName) throws IOException {
  
  ClassPathResource pdfFile = new ClassPathResource("/pdf/" + fileName);
  HttpHeaders headers = new HttpHeaders();
  headers.setContentType(MediaType.parseMediaType("application/pdf"));
  headers.add("Access-Control-Allow-Origin", "*");
  headers.add("Access-Control-Allow-Methods", "GET, POST, PUT");
  headers.add("Access-Control-Allow-Headers", "Content-Type");
  headers.add("Content-Disposition", "filename=" + fileName);
  headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
  headers.add("Pragma", "no-cache");
  headers.add("Expires", "0");
  
  headers.setContentLength(pdfFile.contentLength());
  ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(
    new InputStreamResource(pdfFile.getInputStream()), headers, HttpStatus.OK);
  return response;
 
 }
	
	
	/* ............  End Payslip Controller  ........ */
	
	
/* ............Start Holiday master Controller   ........ */
	
	
	@PostMapping("/holidayMastersave")
	
	public HolidayMaster holidayMastersave(@RequestBody HolidayMaster holidayMaster)
	
	{
		return holidaymasterService.holidaymastersave(holidayMaster);
	}
	
	@PutMapping("updateholidayMaster")
	
	public HolidayMaster updateholidayMaster(@RequestBody HolidayMaster holidayMaster) {
	return holidaymasterService.updateholidayMaster(holidayMaster);
	}
	
	@GetMapping("/getHolidaydeatilsbyId/{Holidayid}")
	
	public HolidayMaster findbyholidayId(@PathVariable(value="Holidayid") Integer holidayid){
	return holidaymasterService.findbyholidayId(holidayid);
		}
	
	@DeleteMapping("DeleteholidayMaster/{Holidayid}")
	
	public void permDeleteholidayMaster(@PathVariable("Holidayid") Integer holidayid) {
		holidaymasterService.permDeleteholidayMaster(holidayid);
	}
	
	/*@GetMapping("/getAdvancePaybyempcode/{empcode}")
	
	public List<AdvancePaymentVoucher> getByEmpCode(@PathVariable(value="empcode") Integer empcode )
	{
		return advSalaryService.findByempcode(empcode);
		//return sectionMasterService.findbyidsectionmaster(sectionId).get();
	}*/
	
		
	@GetMapping(path="/getallHolidayEntrylist" , produces = "application/json" )
	
	public List<HolidayMaster> getallHolidayEntrylist()
	{
	return holidaymasterService.getallHolidayEntrylist();
	}
	
	@GetMapping(path="/gettotalholidaymonthwise/{month}" , produces = "application/json" )
	
	public Map<String, Integer> gettotalholidaymonthwise(@PathVariable("month") String month)throws ParseException
	{
	return holidaymasterService.gettotalholidaymonthwise(month);
	}
	
	/* ............  End Holiday Master Controller  ........ */
	
	
}
