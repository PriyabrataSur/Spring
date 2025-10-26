package in.Basics.beans;

public class AmexCard implements IPayment{
    @Override
    public int doPayment() {
        System.out.println("Payment Through Amex Card");
        return 1;
    }
}
