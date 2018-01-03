package DecoratorPattern;

public class DecoratorWheeler implements  twoWheeler {


    twoWheeler twoWheeler;

    DecoratorWheeler(twoWheeler twoWheeler) {
        this.twoWheeler = twoWheeler;
    }

    @Override
    public String wheel() {
        return  twoWheeler.wheel()+ "\n2 wheeler";
    }

    @Override
    public double cost() {
        return twoWheeler.cost()+ 20000;
    }
}
