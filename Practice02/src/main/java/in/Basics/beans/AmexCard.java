package in.Basics.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("amexCard")
//@Primary
public class AmexCard implements IPayment{
    @Override
    public void doPayment() {
        System.out.println("Payment Through Amex Card");
    }
}
