package AbstractFactoryPattern;

public class Coffee implements Hot {

    @Override
    public int sugarLevel() {
        return 5;
    }

    @Override
    public int MilkLevel() {
        return 10;
    }

    @Override
    public int boiled() {
        return 9;
    }
}
