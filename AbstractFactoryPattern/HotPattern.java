package AbstractFactoryPattern;

public class HotPattern extends AbstractLiqued {

    @Override
    public Hot hotDrink(String drink) {
       switch (drink){
           case "Tea":
               return new Tea();

           case "Coffe":
               return new Coffe();

       }

       return  null;
    }

    @Override
    public Cold coldDrink(String drink) {
        return null;
    }
}
