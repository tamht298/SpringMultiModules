package vn.com.tma.controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.tma.models.Contact;
import vn.com.tma.services.ContactService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ContactController {
    Logger logger = Logger.getLogger(ContactController.class);
    private ContactService contactService;
    private Contact contact;

    public ContactController(ContactService contactService, Contact contact) {
        this.contactService = contactService;

        this.contact = contact;
    }

    @GetMapping(value = "/contacts")
    public List<Contact> getAllContacts() {
        List<Contact> contacts = contactService.findAll();
        return contacts;

    }

    @GetMapping(value = "/hello")
    public void hello(){
        logger.info(contact.getPhone());
        this.contact.setPhone("123");

    }

    @GetMapping(value = "/hello2")
    public void hello2(){

        logger.info(contact.getPhone());

    }

}
