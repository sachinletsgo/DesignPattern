package DecoratorPattern;

public class LegGuard  extends  DecoratorWheeler{


    LegGuard(twoWheeler twoWheeler) {
        super(twoWheeler);
    }

    @Override
    public String wheel() {
        return twoWheeler.wheel() + "\nLeg Guard";
    }

    @Override
    public double cost() {
        return twoWheeler.cost() + 3000;
    }
}
