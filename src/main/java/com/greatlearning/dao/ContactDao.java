package com.greatlearning.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.greatlearning.model.Contact;

 
@Repository
public class ContactDao {
	
	private static List<Contact> list = new ArrayList<Contact>();
	
	static{
		
		list.add(new Contact(1,"Phalgun",9381362013L));
		
		list.add(new Contact(2,"Srujan",9866852085L));
		
		list.add(new Contact(3,"Pavan",9963099552L));
		
	}
	
	public List<Contact> getAllContacts(){
		
		return list;
		
	}
	
	public void addContact(Contact contact) {
		
		list.add(contact);
		
	}
	
	
}
