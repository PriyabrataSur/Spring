package in.Payment.beans;

public class PaymentService {
    public IPayment payment;

    public PaymentService(IPayment payment) {
        this.payment = payment ;
    }

    public void doPayment(double amount){
        boolean status = payment.processPayment(amount);
        if (status){
            System.out.println("Payment Done..."+amount);
        }else {
            System.out.println("...Payment Declined...");
        }
    }
}
