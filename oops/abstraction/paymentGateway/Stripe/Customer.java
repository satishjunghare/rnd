package Stripe;

public class Customer {
    public String[] get() {
        String[] resp = { "Stripe customer get called." };
        return resp;
    }

    public String[] create() {
        String[] resp = { "Stripe customer create called." };
        return resp;
    }
}
