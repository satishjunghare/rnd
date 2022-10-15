package paymentGateway;

public class TestGateway {
    public static void main() {
        GatewayRules gateway = new StripeGateway();

        System.out.print(gateway.customerCreate());
    }
}
