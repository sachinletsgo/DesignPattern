package AbstractFactoryPattern;

public class Pepsi implements Cold {

    @Override
    public float Rate() {
        return 14;
    }

    @Override
    public int chilled() {
        return 10;
    }

    @Override
    public int caffeine() {
        return 10;
    }
}
