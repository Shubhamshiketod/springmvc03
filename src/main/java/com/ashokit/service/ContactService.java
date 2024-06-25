package com.ashokit.service;

import java.util.List;

import com.ashokit.dto.Contact;

public interface ContactService {

	
	boolean saveContact(Contact c);
	
	List<Contact> getAllContact();	
	
	Contact getContactById(Integer cid);	
	
	Contact updateContact(Integer id);	
	
	boolean deleteContact(Integer id); 
	
	
	
	
	
	
	
	
}
