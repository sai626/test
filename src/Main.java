/**
 * Created by saisri on 7/14/17.
 */
public class Main {

    public static void main(String args[]){

        CheckRates checkRates=new CheckRates(65,80,69);

        Observer observer1=new TestObserver(checkRates);
        checkRates.setRate_Euro(80);

        Observer observer2=new TestObserver(checkRates);

        checkRates.setRate_USD(72);
        checkRates.setRate_Euro(80);


        checkRates.removeObserver(observer1);

        Observer observer3=new TestObserver(checkRates);
        checkRates.setRate_GBP(75.26598);

    }
}
