package AbstractFactoryPattern;

public class ColdPattern extends AbstractLiquid {

    @Override
    public Hot hotDrink(String drink) {
        return null;
    }

    @Override
    public Cold coldDrink(String drink) {
        switch (drink){
            case "Cock":
                return new Cock();
            case "Pepsi":
                return new Pepsi();
            case "Dew":
                return new Dew();

        }

        return  null;
    }
}
