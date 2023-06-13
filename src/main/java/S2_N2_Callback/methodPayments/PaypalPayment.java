package S2_N2_Callback.methodPayments;

import S2_N2_Callback.PasarelaCallback;
import S2_N2_Callback.Payment;

public class PaypalPayment implements Payment {
    String user;
    boolean accepted;

    public PaypalPayment(String user, boolean accepted) {
        this.user = user;
        this.accepted = accepted;
    }

    @Override
    public void processPayment(double amount, PasarelaCallback pasarela) {

        boolean paymentSuccess = (!user.isEmpty() && accepted) ? true : false;

        if(paymentSuccess) {
            pasarela.onPaymentSuccess(generateTransactionId());
        } else {
            pasarela.onPaymentFailure("Error when paying with paypal. Try again");
        }
    }

    private String generateTransactionId() {
        return "TRX - "+System.currentTimeMillis();
    }
}
