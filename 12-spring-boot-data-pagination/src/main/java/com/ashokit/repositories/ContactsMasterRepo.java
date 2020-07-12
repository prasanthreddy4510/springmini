package com.ashokit.repositories;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ContactsMasterRepo extends JpaRepository<ContactsManager, Serializable>{
    //will return data based on the name given
	public ContactsManager findByContactName(String name);
	
	//will return data based on name and id
	public ContactsManager findByContactNameAndContactId(String name,Integer id);
	
	//customized quries
	
	@Query("select contactName from ContactsManager")
	public List<String> findAllContactNames();
	
	@Query("from ContactsManager where contactName=:name ")
	public List<ContactsManager> findByContactNameAndContactNumber(String name);
	
	
}
