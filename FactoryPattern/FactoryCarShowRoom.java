package FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryCarShowRoom {


    public static void main(String args[]) throws IOException {
        CarFactory carFactory = new CarFactory();

        System.out.print("Brand name for which you want to get information : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String brandName = br.readLine();
        Car car = carFactory.getCar(brandName);
        if (car != null)
            System.out.print("Information for " + brandName + " is :\nPrice " + car.price() +
                    "\nOn-Road Price " + car.onRoadPrice(1.28f) +
                    "\nBag " + car.bag() +
                    "\nCar Name " + car.car() + " with " + car.tyre() + " Tyre" );
        else
            System.out.print("No information found about the brand "+ brandName);

    }
}
