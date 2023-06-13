package S2_N2_Callback;

public class ShoeStore {

    private String model;
    private double price;
    private double size;

    public ShoeStore(String model, double price, double size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    PasarelaCallback callback = new PasarelaCallback() {
        @Override
        public void onPaymentSuccess(String transactionId) {
            System.out.println("Succeed payment. ID transaction: "+transactionId);

        }
        @Override
        public void onPaymentFailure(String errorMessage) {
            System.out.println("Error in the payment process: "+errorMessage);
        }
    };

    public void sell (Payment payment) {
        System.out.println("Make the payment of: "+model+" with price: "+price);
        payment.processPayment(price, callback);
    }

    @Override
    public String toString() {
        return " You are going to buy {" +
                " the model='" + model + '\'' +
                ", with size=" + size +
                ", and price=" + price +
                '}';
    }
}
