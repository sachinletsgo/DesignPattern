package DecoratorPattern;

public class HondaBike implements twoWheeler {



    @Override
    public String wheel() {
        return "\nHonda ";
    }

    @Override
    public double cost() {
        return 25000;
    }
}
