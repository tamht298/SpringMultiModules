package vn.com.tma.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.tma.models.Contact;
import vn.com.tma.repositories.ContactRepo;
import vn.com.tma.services.ContactService;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    private ContactRepo contactRepo;

    @Autowired
    public ContactServiceImpl(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    @Override
    public List<Contact> findAll() {
        return contactRepo.findAll();
    }
}
