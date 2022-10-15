import Contracts.CustomerContract;

abstract class GatewayRules implements CustomerContract{
    public String[] jsonResponse(String[] arr) {
        String[] resp = { "Stripe customer create called." };
        return resp;
    }
}
