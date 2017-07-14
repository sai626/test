/**
 * Created by saisri on 7/14/17.
 */
public class TestObserver implements Observer{

    private Subject subject;
    public static int Observer_Count=0;
    public int currentObserver;

    public TestObserver(Subject subject) {
        this.subject=subject;
        subject.addObserver(this);
        currentObserver=++Observer_Count;
    }

    @Override
    public void update(double USD, double GBP, double Euro) {

        System.out.println("Observer "+currentObserver);
        System.out.println("1 USD = "+USD+" INR");
        System.out.println("1 GBP = "+GBP+" INR");
        System.out.println("1 Euro = "+Euro+" INR");
        System.out.println();
    }
}
