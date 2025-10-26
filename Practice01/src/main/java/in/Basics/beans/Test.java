package in.Basics.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext apctx = new ClassPathXmlApplicationContext("Beans.xml");
        apctx.getBean(PaymentService.class);
        PaymentService service = apctx.getBean(PaymentService.class);
        service.paymentSuccess();
    }
}
