package S2_N1_Observer;

public class MadBrokerObserver extends Observer{
    public MadBrokerObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObservers(this);
    }
    @Override
    public void update() {
        System.out.println("Updated price information for MAD broker: "+ subject.getIbex35() +"$");
    }
}
