package com.aspl.org.service;

import java.util.List;

import com.aspl.org.dto.AdvancePayDTO;
import com.aspl.org.entity.AdvancePaymentVoucher;



public interface AdvSalaryService {

	
	
	AdvancePaymentVoucher getByadvVouID(Integer advSalaryvouID);
	List<AdvancePaymentVoucher> getalladvAdvancePaymentVouchers();
	List<AdvancePaymentVoucher> findByempcode(String empcode);
	AdvancePaymentVoucher AdvancePaymentVouchersave(AdvancePaymentVoucher advancePaymentVoucher);
	//List<AdvancePayDTO> findByVoucherDateBetween(Date fromDate, Date toDate);
	List<AdvancePayDTO> findByVoucherDateBetween(String fromDate, String toDate);
	//List<AdvancePaymentVoucher> findByempcode(String empcode);

	
}
