package S2_N1_Observer;


import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;
    private double ibex35;

    public Subject() {
        this.observers = new ArrayList<Observer>();
    }

    public double getIbex35() {
        return ibex35;
    }

    public void setIbex35(double ibex35) {
        this.ibex35 = ibex35;
        notifyAllObservers();
    }


    public void addObservers (Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }

}

