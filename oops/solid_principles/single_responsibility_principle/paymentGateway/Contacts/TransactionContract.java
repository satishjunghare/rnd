package paymentGateway.Contacts;

/**
 * TransactionContract
 */
public interface TransactionContract {

    String[] transactionGet();

    String[] transactionAuth();

    String[] transactionSettle();

    String[] transactionSale();

    String[] transactionVoid();

    String[] transactionRefund();
}
