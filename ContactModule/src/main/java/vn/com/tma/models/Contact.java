package vn.com.tma.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "contact")
public class Contact {
    @MongoId
    private ObjectId _id;
    private String phone;

}
