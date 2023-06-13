package S2_N2_Callback;

public interface PasarelaCallback {
    void onPaymentSuccess(String transactionId);
    void onPaymentFailure(String errorMessage);
}
