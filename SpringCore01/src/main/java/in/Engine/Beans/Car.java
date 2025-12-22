package in.Engine.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.getBean(EngineService.class);
        EngineService service = context.getBean(EngineService.class);
        service.working();
    }
}
