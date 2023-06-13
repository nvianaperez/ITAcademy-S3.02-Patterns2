package S2_N1_Observer;

public class BcnBrokerObserver extends Observer {

    public BcnBrokerObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObservers(this);
    }
    @Override
    public void update() {
        System.out.println("Updated price information for BCN broker: "+ subject.getIbex35() +"$");
    }
}
