package org.example.beans;

public class CreditCard implements IPayment{

    public CreditCard(){
        System.out.println("CreditCard :: Constructor");
    }

    @Override
    public boolean processPayment(double billAmount) {
        //some logic
        System.out.println("Payment from CreditCard is Successful...");
        return true;
    }
}
