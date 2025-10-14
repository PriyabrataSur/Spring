package in.Basics.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

//    @Autowired
//    @Qualifier("amexCard")
    private IPayment payment;

//    public PaymentService(){
//        System.out.println("Default Constructor");
//        this.payment = payment;
//    }

//    @Autowired
//    public PaymentService(IPayment payment){
//        System.out.println("Constructor Injection");
//        this.payment = payment ;
//    }

    @Autowired
    @Qualifier("amexCard")
    public void setPayment(IPayment payment){
        System.out.println("Setter Injection");
        this.payment = payment;
    }

    public void processPayment(){
        payment.doPayment();
        System.out.println("Payment Started...");
    }
}
