package AbstractFactoryPattern;

public class HotPattern extends AbstractLiquid {

    @Override
    public Hot hotDrink(String drink) {
       switch (drink){
           case "Tea":
               return new Tea();

           case "Coffee":
               return new Coffee();

       }

       return  null;
    }

    @Override
    public Cold coldDrink(String drink) {
        return null;
    }
}
