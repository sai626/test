import java.util.ArrayList;
import java.util.List;

/**
 * Created by saisri on 7/14/17.
 */
public class CheckRates implements Subject {

    private List<Observer> listOfObservers;
    private double rate_USD, rate_GBP, rate_Euro;


    public CheckRates(double rate_USD, double rate_GBP, double rate_Euro) {
        listOfObservers=new ArrayList<>();
        this.rate_USD=rate_USD;
        this.rate_GBP=rate_GBP;
        this.rate_Euro=rate_Euro;
    }


    @Override
    public void addObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer:listOfObservers){
            observer.update(rate_USD,rate_GBP,rate_Euro);
        }
    }

    public void setRate_USD(double rate_USD) {
        this.rate_USD = roundToTwoDecimalPlace(rate_USD);
        notifyAllObservers();
    }

    public void setRate_GBP(double rate_GBP) {
        this.rate_GBP =roundToTwoDecimalPlace(rate_GBP);
        notifyAllObservers();
    }

    public void setRate_Euro(double rate_Euro) {
        this.rate_Euro = roundToTwoDecimalPlace(rate_Euro);
        notifyAllObservers();
    }

    public double roundToTwoDecimalPlace(double val){
        long temp=Math.round(val*100);
        return (double)temp/100;
    }

}
