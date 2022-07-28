/*
 * package com.greatlearning.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.greatlearning.model.Contact; import
 * com.greatlearning.service.ContactService;
 * 
 * @RestController
 * 
 * @RequestMapping(path = "/contact") public class ContactController {
 * 
 * @Autowired private ContactService contactService;
 * 
 * @GetMapping(path = "/details") public List<Contact> getContactList(){
 * 
 * return contactService.getAllContacts();
 * 
 * }
 * 
 * @PostMapping(path = "/addcontact") public List<Contact>
 * addContact(@RequestBody Contact contact){
 * 
 * contactService.addContact(contact);
 * 
 * return contactService.getAllContacts(); }
 * 
 * 
 * 
 * }
 */