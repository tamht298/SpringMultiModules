package vn.com.tma.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "user")
@Data
public class User {

    @MongoId
    private ObjectId _id;
    private String username;
    private String location;
    private String position;

}
