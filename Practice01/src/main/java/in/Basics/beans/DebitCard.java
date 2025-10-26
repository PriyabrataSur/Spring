package in.Basics.beans;

public class DebitCard implements IPayment{
    @Override
    public int doPayment() {
        System.out.println("Payment Through Debit Card");
        return 1;
    }
}
