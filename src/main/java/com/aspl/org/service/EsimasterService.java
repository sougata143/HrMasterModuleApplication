package com.aspl.org.service;

import java.util.List;
import java.util.Optional;
import com.aspl.org.entity.Esientry;

public interface EsimasterService {

	
	Esientry esimastersave(Esientry esientry);

	

	void esimasterdelete(Esientry esientry);

	

	List<Esientry> getallEsientrylist();

	
	Optional<Esientry> findbyidesiId(Integer esiId);



	Esientry esientryupdate(Esientry esientry);



	Esientry getByempCode(String empCode);
	




	List<Esientry> getByesiNo(String esiNo);



	//Esientry getByempCode(String empCode);

	
	
	
}
