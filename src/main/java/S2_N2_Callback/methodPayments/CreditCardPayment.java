package S2_N2_Callback.methodPayments;

import S2_N2_Callback.PasarelaCallback;
import S2_N2_Callback.Payment;

public class CreditCardPayment implements Payment {
    double limitCredit;
    double borrowedCredit;

    public CreditCardPayment(double limitCredit, double borrowedCredit) {
        this.limitCredit = limitCredit;
        this.borrowedCredit = borrowedCredit;
    }

    @Override
    public void processPayment(double amount, PasarelaCallback pasarela) {

        boolean paymentSuccess = (borrowedCredit + amount) < limitCredit ? true : false;

        if(paymentSuccess) {
            pasarela.onPaymentSuccess(generateTransactionId());
            borrowedCredit += amount;
            System.out.println("The limit credit is: "+limitCredit+" and the updated borrowed credit is: "+borrowedCredit);

        } else {
            pasarela.onPaymentFailure("Error when paying with credit card. Try again");
            System.out.println("The amount requested exceed the limit: "+(limitCredit-borrowedCredit));

        }

    }

    private String generateTransactionId() {
        return "TRX - "+ System.currentTimeMillis();
    }
}
