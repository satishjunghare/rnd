class StripeGateway extends GatewayRules {

    public StripeGateway() {
        System.out.println("Stripe constructor called.");
    }

    public String[] customerGet() {
        String[] resp = { "Stripe customer get called." };
        return resp;
    }

    public String[] customerCreate() {
        String[] resp = { "Stripe customer create called." };
        return resp;
    }

    public String[] transactionGet() {
        String[] resp = { "Stripe transaction get called." };
        return resp;
    }

    public String[] transactionAuth() {
        String[] resp = { "Stripe transaction auth called." };
        return resp;
    }

    public String[] transactionSettle() {
        String[] resp = { "Stripe transaction settle called." };
        return resp;
    }

    public String[] transactionSale() {
        String[] resp = { "Stripe transaction sale called." };
        return resp;
    }

    public String[] transactionVoid() {
        String[] resp = { "Stripe transaction void called." };
        return resp;
    }

    public String[] transactionRefund() {
        String[] resp = { "Stripe transaction refund called." };
        return resp;
    }
}
