package zen.behaviour.observer;

/**
 * Created by yepengfan on 31/12/14.
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);
}
