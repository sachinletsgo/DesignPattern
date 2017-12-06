package FactoryPattern;

public class HondaCar extends  Car {

    @Override
    float onRoadPrice(float rate) {
        return price()*rate;
    }

    @Override
    int price() {
        return 7;
    }

    @Override
    String car() {
        return "i20";
    }

    @Override
    int bag() {
        return 2;
    }
}
