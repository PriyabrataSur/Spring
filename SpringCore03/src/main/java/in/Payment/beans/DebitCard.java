package in.Payment.beans;

public class DebitCard implements IPayment{
    @Override
    public boolean processPayment(double amount) {

        System.out.println("Payment through Debit Card...");
        return true;
    }
}
