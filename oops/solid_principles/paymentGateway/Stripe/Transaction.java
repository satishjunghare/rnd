package Stripe;

public class Transaction {
    public String[] get() {
        String[] resp = { "Stripe client transaction get called." };
        return resp;
    }

    public String[] auth() {
        String[] resp = { "Stripe client transaction auth called." };
        return resp;
    }

    public String[] settle() {
        String[] resp = { "Stripe client transaction settle called." };
        return resp;
    }

    public String[] sale() {
        String[] resp = { "Stripe client transaction sale called." };
        return resp;
    }

    public String[] voidAuth() {
        String[] resp = { "Stripe client transaction void called." };
        return resp;
    }

    public String[] refund() {
        String[] resp = { "Stripe client transaction refund called." };
        return resp;
    }
}
