package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dto.Contact;
import com.ashokit.entity.ContactEnitity;
import com.ashokit.repo.ContactDtlsRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactDtlsRepository contactRepo;

	@Override
	public boolean saveContact(Contact c) {
		
		 
		ContactEnitity entity=new ContactEnitity();
		BeanUtils.copyProperties(c, entity);
		ContactEnitity saveEnitity=contactRepo.save(entity);
		return saveEnitity.getContactId()!=null;		
			
	}	
		
	

	@Override
	public List<Contact> getAllContact() {
		List<ContactEnitity> entity=contactRepo.findAll();
		List<Contact> list=new ArrayList<>();
		for(ContactEnitity ele:entity)
		{
			Contact contact=new Contact();
			BeanUtils.copyProperties(ele, contact);
			list.add(contact);
		}
		return list;
	}

	@Override
	public Contact getContactById(Integer cid) {
		
		Contact c=new Contact();
		ContactEnitity entity=contactRepo.findById(cid).orElse(new ContactEnitity());
		
		BeanUtils.copyProperties(entity, c);
		
		
		return c;		
	}

	@Override
	public Contact updateContact(Integer id) {
		
		
		
		Contact c=new Contact();
		ContactEnitity entity=contactRepo.findById(id).orElse(new ContactEnitity());
		
		BeanUtils.copyProperties(entity, c);
		System.out.println(c.getContactId()+" id");
		
		return c;
		
		
		
		
		
		
		
	}

	@Override
	public boolean deleteContact(Integer id) {
		contactRepo.deleteById(id);
		if(contactRepo.getById(id).getContactId()!=null)
		  return false;
		else
			return true;
	}

}
