package vn.com.tma.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.web.context.annotation.SessionScope;

@Data
@NoArgsConstructor
@Document(collection = "contact")
public class Contact {
    @MongoId
    private ObjectId _id;
    private String phone;

    public Contact(String phone) {
        this.phone = phone;
    }
}
