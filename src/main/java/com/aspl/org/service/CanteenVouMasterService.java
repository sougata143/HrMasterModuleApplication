package com.aspl.org.service;

import java.util.List;
import java.util.Optional;

import com.aspl.org.entity.CanteenVoucherEntry;

public interface CanteenVouMasterService {

	CanteenVoucherEntry getBycanvouID(Integer canvouID);
	List<CanteenVoucherEntry> getallCanteenVoucherEntry();
	Optional<CanteenVoucherEntry> findbyvoucherNo(String voucherNo);
	CanteenVoucherEntry CanteenVoucherEntrysave(CanteenVoucherEntry canteenVoucherEntry);
	Optional<CanteenVoucherEntry> findByempCode(String empCode);
	CanteenVoucherEntry findByempCodeandmonth(String empCode, Integer month);
	//CanteenVoucherEntry findByempCodeandmonth(String empCode, Integer month);
}
