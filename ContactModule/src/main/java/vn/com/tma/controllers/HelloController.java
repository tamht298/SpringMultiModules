package vn.com.tma.controllers;

import lombok.Data;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.tma.models.Contact;
import vn.com.tma.models.Phone;



@RestController
@RequestMapping(value = "/api")
public class HelloController {
    private Logger logger = Logger.getLogger(HelloController.class);

    private Phone phone;

    public void setPhone(Phone phone) {
        this.phone = phone;
    }


    @GetMapping(value = "/hello4")
    public void hello2() {
        logger.info("hello :" + phone.getNumber());

        phone.setNumber(123);

    }
}
