package paymentGateway.stripe;

public class Stripe implements {
    public String[] customerGet() {
        String[] resp = { "Stripe customer get called." };
        return resp;
    }

    public String[] customerCreate() {
        String[] resp = { "Stripe customer create called." };
        return resp;
    }
}
