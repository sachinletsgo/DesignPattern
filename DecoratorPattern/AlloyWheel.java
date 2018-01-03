package DecoratorPattern;

public class AlloyWheel  extends  DecoratorWheeler{


    AlloyWheel(twoWheeler twoWheeler) {
        super(twoWheeler);
    }

    @Override
    public String wheel() {
        return twoWheeler.wheel() + "\nAlloy Wheel";
    }

    @Override
    public double cost() {
        return twoWheeler.cost()+5000;
    }
}
