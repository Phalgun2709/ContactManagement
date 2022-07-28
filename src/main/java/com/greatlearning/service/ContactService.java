package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.entity.ContactEntity;
import com.greatlearning.model.Contact;

public interface ContactService {
	
	/*
	 * public List<Contact> getAllContacts();
	 * 
	 * public void addContact(Contact contact);
	 */

	public void saveContact(ContactEntity c);
	
	public List<ContactEntity> getContactList();
	
	public Optional<ContactEntity> getContactById(Integer id);
	
	public void deleteContactById(Integer id);
	
	
}
