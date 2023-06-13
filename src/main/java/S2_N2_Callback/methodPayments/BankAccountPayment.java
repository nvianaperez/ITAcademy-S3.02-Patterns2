package S2_N2_Callback.methodPayments;

import S2_N2_Callback.PasarelaCallback;
import S2_N2_Callback.Payment;

public class BankAccountPayment implements Payment {

    String account;
    double accountBalance;

    public BankAccountPayment(String account, double accountBalance) {
        this.account = account;
        this.accountBalance = accountBalance;
    }

    @Override
    public void processPayment(double amount, PasarelaCallback pasarela) {

        boolean paymentSuccess = (!account.isEmpty() && accountBalance>amount) ? true : false;

        if(paymentSuccess) {
            pasarela.onPaymentSuccess(generateTransactionId());
            accountBalance -= amount;
        } else {
            pasarela.onPaymentFailure("Error when paying with bank account. Try again");
        }

        System.out.println("The account balance for the account: "+account+" is: "+accountBalance);

    }

    private String generateTransactionId() {
        return "TRX - "+System.currentTimeMillis();
    }
}
