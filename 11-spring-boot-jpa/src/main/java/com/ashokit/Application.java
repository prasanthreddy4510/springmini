package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.repositories.ContactsManager;
import com.ashokit.repositories.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	  
		ContactsMasterRepo cmr=context.getBean(ContactsMasterRepo.class);
	//	ContactsManager entity=new ContactsManager();
	/*	ContactsManager entity1=cmr.findByContactName("abraham");
		System.out.println(entity1);
		ContactsManager entity2=cmr.findByContactNameAndContactId("sheldon", 223);
		System.out.println(entity2);
		List<String> entity3=cmr.findAllContactNames();
		entity3.forEach(names->{
			if(!names.equals("sheldon")) {
				System.out.println(names);
			}
		});*/
		
	Iterable<ContactsManager> entity=cmr.findByContactNameAndContactNumber("sheldon");
	entity.forEach(manager->{
         System.out.println(manager);
	});
		context.close();
	
	}

}
