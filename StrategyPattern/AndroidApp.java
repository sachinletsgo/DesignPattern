package StrategyPattern;

public class AndroidApp implements DoCode {


    int amount;
    int deliveryTime;


    AndroidApp(int amount, int deliveryTime) {
        this.amount = amount;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void codeFor(String name) {
        System.out.print("Lets Start code for " + name + " delivery in "+ deliveryTime + " days  spending on "+ amount);
    }
}
