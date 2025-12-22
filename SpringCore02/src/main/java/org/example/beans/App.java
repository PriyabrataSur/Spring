package org.example.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.getBean(PaymentService.class);
        PaymentService service = context.getBean(PaymentService.class);
        service.doPayment(200.00);
    }
}
