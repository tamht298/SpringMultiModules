package vn.com.tma.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.XmlWebApplicationContext;
import vn.com.tma.models.Contact;
import vn.com.tma.repositories.ContactRepo;
import vn.com.tma.services.ContactService;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    //    private ContactRepo contactRepo;
//
//
//    @Autowired
//    public ContactServiceImpl(ContactRepo contactRepo) {
//        this.contactRepo = contactRepo;
//    }

    private MongoTemplate mongoTemplate;

//Config for Setter based DI
//    public void setMongoTemplate(MongoTemplate mongoTemplate) {
//        this.mongoTemplate = mongoTemplate;
//    }

//Config for Constructor based DI
    public ContactServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Contact> findAll() {
        System.out.println(mongoTemplate.toString());
        return mongoTemplate.findAll(Contact.class);
    }
}
