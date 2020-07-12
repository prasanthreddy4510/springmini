package com.ashokit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ashokit.repositories.ContactsManager;
import com.ashokit.repositories.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		                  ContactsMasterRepo bean = context.getBean(ContactsMasterRepo.class);
		         /*    ContactsManager entity1=new ContactsManager();
		             entity1.setContactId(102);
		             entity1.setContactName("prasanth1");
		             entity1.setContactNumber(7278773);
		            
		             ContactsManager entity2=new ContactsManager();
		             entity2.setContactId(103);
		             entity2.setContactName("prasanth2");
		             entity2.setContactNumber(7278773);
		             ContactsManager entity3=new ContactsManager();
		             entity3.setContactId(104);
		             entity3.setContactName("prasanth3");
		             entity3.setContactNumber(7278773);
		             ContactsManager entity4=new ContactsManager();
		             entity4.setContactId(105);
		             entity4.setContactName("prasanth4");
		             entity4.setContactNumber(7278773);
		             List<ContactsManager> entities=new ArrayList<ContactsManager>();
		             entities.add(entity1);
		             entities.add(entity2);
		             entities.add(entity3);
		             entities.add(entity4);
		             bean.saveAll(entities); */
		    
		    int pageSize=4;
		    int pageNum=0;
		    
		    PageRequest pageReq=PageRequest.of(pageNum, pageSize);
		      Page<ContactsManager> pagedata = bean.findAll(pageReq);
		      int totalPages = pagedata.getTotalPages();
		      System.out.println("total pages required"+totalPages);
		       List<ContactsManager> content = pagedata.getContent();
		       content.forEach(action->{
		    	   System.out.println(action);
		       });
		             
		             context.close();
	}

}
