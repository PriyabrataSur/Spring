package in.Payment.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bill {
    public static void main(String[] args) {
        ApplicationContext apctx = new ClassPathXmlApplicationContext("Bean.xml");
        apctx.getBean(PaymentService.class);

        PaymentService service = apctx.getBean(PaymentService.class);
        service.doPayment(120.36);
    }
}
