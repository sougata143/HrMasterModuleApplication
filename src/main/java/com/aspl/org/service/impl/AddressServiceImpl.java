package com.aspl.org.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aspl.org.entity.Address;
import com.aspl.org.repository.AddressDao;
import com.aspl.org.service.AddressService;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressDao addressDao;

	@Override
	public Address addressSave(Address address) {
		return addressDao.save(address);
	}

	@Override
	public Address addressUpdate(Address currentAddress) {
		
		return addressSave(currentAddress);
	}

	@Override
	public Address addressupdate(Optional<Address> address1) {
		return addressDao.save(address1);
	}

	@Override
	public Address addressupdate(Address address) {
		return addressDao.save(address);
	}

	@Override
	public List<Address> getalladdresslist() {
		return addressDao.findAll();
	}

	@Override
	public Address findByAddressCode(String addressCode) {
		;
		Address address=addressDao.findByAddressCode(addressCode);
		return address;
	}

	@Override
	public Address findByShipTo(String shipTo) {
		
		Address address=addressDao.findByShipTo(shipTo);
		return address;
	}

	@Override
	public Address findByBillTo(String billTo) {
		
		Address address=addressDao.findByBillTo(billTo);
		return address;
	}

}
