/**
 * Created by saisri on 7/14/17.
 */
public interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();
}
