package AbstractFactoryPattern;

public class Tea implements Hot {

    @Override
    public int sugarLevel() {
        return 8;
    }

    @Override
    public int MilkLevel() {
        return 6;
    }

    @Override
    public int boiled() {
        return 7;
    }
}
