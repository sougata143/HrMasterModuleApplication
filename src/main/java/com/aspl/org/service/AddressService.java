package com.aspl.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aspl.org.entity.Address;

@Service
public interface AddressService {
	
	Address addressSave(Address address);
	
	public Address addressUpdate(Address currentAddress);
    //void itemMasterUpdate(ItemMaster currentItem);

	Address addressupdate(Optional<Address> address1);
	Address addressupdate(Address address);
	
	List<Address> getalladdresslist();

	
	//Optional<ItemMaster> findByItemCode(String itemCode);
	Address findByAddressCode(String addressCode);
	
	Address findByShipTo(String shipTo);
	
	Address findByBillTo(String billTo);
	



}
