package vn.com.tma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.tma.models.Contact;
import vn.com.tma.services.ContactService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ContactController {
    private ContactService contactService;

//    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping(value = "/contacts")
    public List<Contact> getAllContacts(){
        List<Contact> contacts = contactService.findAll();
        return contacts;

    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
