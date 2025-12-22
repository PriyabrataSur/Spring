package org.example.beans;

public class DebitCard implements IPayment{

    public DebitCard(){
        System.out.println("DebitCard :: Constructor");
    }

    @Override
    public boolean processPayment(double billAmount) {
        //some logic
        System.out.println("DebitCard Payment Successful...");
        return true;
    }
}
