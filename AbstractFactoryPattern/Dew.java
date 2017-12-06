package AbstractFactoryPattern;

public class Dew implements Cold {

    @Override
    public float Rate() {
        return 10;
    }

    @Override
    public int chilled() {
        return 6;
    }

    @Override
    public int caffeine() {
        return 5;
    }
}
