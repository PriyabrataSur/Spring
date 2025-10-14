package in.Basics.beans;

import org.springframework.stereotype.Repository;

@Repository("creditCard")
public class CreditCard implements IPayment{

    @Override
    public void doPayment() {
        System.out.println("Payment Through Credit Card");
    }
}
