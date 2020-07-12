package com.ashokit.repositories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="contacts_master")

public class ContactsManager {
	@Id
	@Column(name="contact_id")
	private Integer contactId;
	@Column(name="contact_name")
	private String contactName;
	@Column(name="contact_number")
	private Integer contactNumber;
	
	public ContactsManager() {
		super();
	}
	public ContactsManager(Integer contactId, String contactName, Integer contactNumber) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	@Override
	public String toString() {
		return "ContactsManager [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber="
				+ contactNumber + "]";
	}
	public Integer getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	

}
