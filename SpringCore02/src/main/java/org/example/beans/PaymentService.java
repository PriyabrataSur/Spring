package org.example.beans;

public class PaymentService {
    private  IPayment payment;

    public PaymentService(){
        System.out.println("PaymentService :: Constructor");
    }

    public PaymentService(IPayment payment){
        System.out.println("Constructor injection Called");
        this.payment = payment;                               // polymorphism the
    }

    public void setPayment(IPayment payment) {
        System.out.println("Setter injection called...");
        this.payment = payment;
    }

    public void doPayment(double billAmount){
        boolean status = payment.processPayment(billAmount);
        if(status){
            System.out.println("Payment Done... Visit Again ");
        }else{
            System.out.println("Card Declined... ");
        }
    }
}
