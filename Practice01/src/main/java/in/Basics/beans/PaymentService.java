package in.Basics.beans;

public class PaymentService {
    private IPayment payment;

    public PaymentService(){
        this.payment = payment;
    }

    public PaymentService(IPayment payment){
        System.out.println("Constructor");
        this.payment = payment ;
    }

//    public void setPayment(IPayment payment){
//        System.out.println("Setter");
//        this.payment = payment;
//    }

    public void paymentSuccess(){
        int status = payment.doPayment();
        if(status == 1){
            System.out.println("Payment is Successful");
        }else{
            System.out.println("Payment Declined");
        }
    }
}
