package com.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface ContactsMasterRepo extends CrudRepository<ContactsManager, Serializable>{

}
