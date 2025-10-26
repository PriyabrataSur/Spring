package in.Basics.beans;

public class CreditCard implements IPayment{
    @Override
    public int doPayment() {
        System.out.println("Payment Through Credit Card");
        return 0;
    }
}
