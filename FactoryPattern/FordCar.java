package FactoryPattern;

public class FordCar extends  Car {

    @Override
    float onRoadPrice(float rate) {
        return price()*rate;
    }

    @Override
    int price() {
        return 10;
    }

    @Override
    int bag() {
        return 4;
    }

    @Override
    String car() {
        return "Figgo";
    }
}
