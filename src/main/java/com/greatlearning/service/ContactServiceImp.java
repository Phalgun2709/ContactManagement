package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.ContactDao;
import com.greatlearning.entity.ContactEntity;
import com.greatlearning.model.Contact;
import com.greatlearning.repository.ContactRepository;

@Service
public class ContactServiceImp implements ContactService{

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public void saveContact(ContactEntity c) {
		
		contactRepository.save(c);
		
	}

	@Override
	public List<ContactEntity> getContactList() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public Optional<ContactEntity> getContactById(Integer id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id);
	}

	@Override
	public void deleteContactById(Integer id) {
		 
		contactRepository.deleteById(id);
		
	}



	
	
	
	/*
	 * @Autowired private ContactDao contactDao;
	 * 
	 * @Override public List<Contact> getAllContacts() {
	 * 
	 * return contactDao.getAllContacts(); }
	 * 
	 * @Override public void addContact(Contact contact) {
	 * 
	 * contactDao.addContact(contact);
	 * 
	 * }
	 */

	
	
}
