package AbstractFactoryPattern;

public class AbstractCreator {
    public static AbstractLiquid getFactory(String choice){

        switch (choice){
            case "Hot":
               return new HotPattern();

            case "Cold":
              return new ColdPattern();


        }
        return null;
    }

}
