package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.dto.Contact;
import com.ashokit.service.ContactService;

@Controller
public class ContactInfoController {

	@Autowired
	ContactService contactService;
	@GetMapping(value = {"/","/addContact"})
	public String loadForm(Model model) {

		Contact c=new Contact();		
		model.addAttribute("contact",c);
		return "contactInfo";
	}
	@PostMapping("/saveContact")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact contact,Model model) {


		boolean b=contactService.saveContact(contact);
		if(b) {
			model.addAttribute("succmsg","Contact Saved");	
		}

		else
		{
			model.addAttribute("errmsg","Failed To Save Contact");	
		}

		return "contactInfo";

	}



	@GetMapping("/viewcontact")
	public String handleViewContactLink(Model model)
	{
		List<Contact> contactsList=contactService.getAllContact();
		model.addAttribute("contacts",contactsList);
		return "viewContacts";


	}

	@GetMapping("/update")
	public String handleEditBtn(Model model,@RequestParam("cid") Integer id) {
		Contact c=contactService.updateContact(id);
		
		System.out.println(c.getContactId()+"controoler");
		if(c.getContactId()!=null)
			model.addAttribute("contact",c);
		    
		return "contactInfo";
	}

    @GetMapping("/delete")
    
    public String delete(@RequestParam("cid") Integer id)
    {
    	contactService.deleteContact(id);
    	
    	 return "viewContacts";
    }









}
