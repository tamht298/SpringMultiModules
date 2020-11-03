package vn.com.tma.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.com.tma.models.Contact;

@Repository
public interface ContactRepo extends MongoRepository<Contact, ObjectId> {
}
