package S2_N1_Observer;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        new BcnBrokerObserver(subject);
        new MadBrokerObserver(subject);

        System.out.println("First update: ");
        subject.setIbex35(22.35);
        System.out.println("Second update: ");
        subject.setIbex35(24.35);

    }
}