package com.ashokit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.repositories.ContactsManager;
import com.ashokit.repositories.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		ContactsMasterRepo contact=context.getBean(ContactsMasterRepo.class);
		ContactsManager master1=new ContactsManager();
	master1.setContactId(227);
		master1.setContactName("sheldooon");
		master1.setContactNumber(35728);
		contact.save(master1);
		
	/*	Optional<ContactsManager> opt=contact.findById(18);
		if(opt.isPresent()) {
			ContactsManager manager=opt.get();
			System.out.println(manager);
		}
		else {
			System.out.println("no record found");
		}*/
		
	/* Iterable<ContactsManager> entities=contact.findAllById(Arrays.asList(10,12));
	entities.forEach(entity->{
		System.out.println(entity);
	});
	
	Iterable<ContactsManager> list=contact.findAll();
	list.forEach(entity->{
		System.out.println(entity);
	});*/
		
	
	//contact.deleteAll();
	
			
		context.close();
	}

}
