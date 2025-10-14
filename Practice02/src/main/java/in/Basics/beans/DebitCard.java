package in.Basics.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("debitCard")
//@Primary
public class DebitCard implements IPayment{
    @Override
    public void doPayment() {
        System.out.println("Payment Through Debit Card");

    }
}
