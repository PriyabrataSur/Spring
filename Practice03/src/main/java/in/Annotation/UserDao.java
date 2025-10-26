package in.Annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    @PostConstruct
    public void init(){
        System.out.println("init...");
    }
    public void getData(){
        System.out.println("Getting Data...");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy...");
    }
}