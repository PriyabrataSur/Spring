package in.basics;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn(value = {"userDao"})
public class UserService {
    public UserService(){
        System.out.println("Getting data from redis");
    }
}
