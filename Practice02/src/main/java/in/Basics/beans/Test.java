package in.Basics.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext apctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentService service = apctx.getBean(PaymentService.class);
        service.processPayment();
    }
}
