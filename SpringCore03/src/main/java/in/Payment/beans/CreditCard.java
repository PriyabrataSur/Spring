package in.Payment.beans;

public class CreditCard implements IPayment{
    @Override
    public boolean processPayment(double amount) {

        System.out.println("Payment through Credit Card...");
        return true;
    }
}
