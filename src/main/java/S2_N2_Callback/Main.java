package S2_N2_Callback;

import S2_N2_Callback.methodPayments.BankAccountPayment;
import S2_N2_Callback.methodPayments.CreditCardPayment;
import S2_N2_Callback.methodPayments.PaypalPayment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ShoeStore store = new ShoeStore("Munich", 200, 38);

        Payment creditCardPayment = new CreditCardPayment(1000,900);
        Payment paypalPayment = new PaypalPayment("nviana", true);
        Payment bankAccountPayment = new BankAccountPayment("my account", 500);

        System.out.println(store.toString());

        boolean exit = false;
        do {
            System.out.println("Choose a method of payment: \n \t1-Credit Card \n \t2-Paypal \n \t3-Bank account \n \t4-Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    store.sell(creditCardPayment);
                    break;
                case 2:
                    store.sell(paypalPayment);
                    break;
                case 3:
                    store.sell(bankAccountPayment);
                    break;
                case 4:
                    System.out.println("Exit the application");
                    exit = true;
                    break;
                default:
                    System.out.println("Option does not exist. Error when typing option");
            }
        } while (!exit);

    }
}
