package in.basics.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Store data in db...");
        System.out.println("Get data from db...");
        System.out.println("Store data i redis...");
    }
}
