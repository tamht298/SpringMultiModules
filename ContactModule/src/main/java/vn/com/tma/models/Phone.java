package vn.com.tma.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.BeanPostProcessor;

@Data
@NoArgsConstructor
public class Phone {

    private Logger logger = Logger.getLogger(Phone.class);
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public Phone(int number) {
        this.number = number;
    }
}
