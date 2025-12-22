package org.example.beans;

public class AmexCard implements IPayment{

    public AmexCard(){
        System.out.println("AmexCard :: Constructor");
    }

    @Override
    public boolean processPayment(double billAmount) {
        //some logic
        System.out.println("Payment with AmexCard...");
        return true;
    }
}
