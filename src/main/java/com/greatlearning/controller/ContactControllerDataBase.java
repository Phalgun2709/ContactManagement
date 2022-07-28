package com.greatlearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.ContactEntity;
import com.greatlearning.service.ContactService;

@RestController
public class ContactControllerDataBase {
	
	@Autowired
	private ContactService contactservice;
	
	@PostMapping(path = "/savecontact")
	public void save(@RequestBody ContactEntity e) {
		
		contactservice.saveContact(e);
		
		
	}
	
	@GetMapping("/")
	public List<ContactEntity> getAllContacts(){
		
		return contactservice.getContactList();
		
	}
	
	@GetMapping("getcontact/{id}")
	public Optional<ContactEntity> getContact(@PathVariable("id") Integer id){
		
		return contactservice.getContactById(id);
		
	}
	
	@GetMapping("deletecontact/{id}")
	public void deleteContact(@PathVariable("id") Integer id) {
		
		contactservice.deleteContactById(id);
	}

}
