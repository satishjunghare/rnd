import java.util.Arrays;

public class TestGateway {
    public static void main(String[] args) {
        StripeClient stripe = new StripeClient();

        // String[] getCustomer = gateway.customerGet();
        System.out.println("getCustomer");
        System.out.println(Arrays.toString(stripe.customerGet()));
        System.out.println(Arrays.toString(stripe.customerCreate()));
    }
}
