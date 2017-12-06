package AbstractFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainRestaurant {
    public static void main(String args[]) throws IOException {

        System.out.println(" Do you want Hot or Cold?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hotColdChoice = br.readLine();
        AbstractLiquid abstractLiqued = AbstractCreator.getFactory(hotColdChoice);
        switch (hotColdChoice){
            case "Hot":
                System.out.println("What do you want in hot?");
                String hotChoice = br.readLine();
                System.out.println("Your description option " + hotChoice);
                Hot hot = abstractLiqued.hotDrink(hotChoice);
                System.out.println("Milked level "+ hot.MilkLevel()+
                        "\nSugar level "+ hot.sugarLevel()+
                        "\nBoiled level "+ hot.boiled());
                break;

            case "Cold":
                System.out.println("What do you want in Cold?");
                String coldChoice = br.readLine();
                System.out.println("Your description option " + coldChoice);
                Cold cold = abstractLiqued.coldDrink(coldChoice);
                System.out.println("Caffeine level "+ cold.caffeine()+
                        "\nChilled level "+ cold.chilled()+
                        "\nRate level "+ cold.Rate());
                break;

        }

    }
}
