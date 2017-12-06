package AbstractFactoryPattern;

public class Cock implements Cold {

    @Override
    public float Rate() {
        return 14;
    }

    @Override
    public int chilled() {
        return 9;
    }

    @Override
    public int caffeine() {
        return 9;
    }
}
