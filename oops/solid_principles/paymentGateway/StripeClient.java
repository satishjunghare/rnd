import Stripe.Customer;

public class StripeClient extends GatewayRules {
    public StripeClient() {
        System.out.println("Stripe client constructor called.");
    }

    public String[] customerGet() {
        Customer customer = new Customer();
        return customer.get();
    }

    public String[] customerCreate() {
        Customer customer = new Customer();
        return customer.create();
    }
}
