package in.Payment.beans;

public class AmexCard implements IPayment{
    @Override
    public boolean processPayment(double amount) {

        System.out.println("Payment through Amex Card...");
        return false;
    }
}
