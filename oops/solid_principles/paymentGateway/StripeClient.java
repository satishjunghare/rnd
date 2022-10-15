import Stripe.Customer;

public class StripeClient extends GatewayRules {
    public StripeClient() {
        System.out.println("Stripe client constructor called.");
    }

    public String[] customerGet() {
        String[] resp = { "Stripe client customer get called." };
        return resp;
    }

    public String[] customerCreate() {
        Customer customer = new Customer();
        return customer.create();
    }
}
