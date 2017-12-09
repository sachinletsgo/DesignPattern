package Builder;


import java.io.IOException;


public class MainShowRoom {
    public static void main(String args[]) throws IOException {


       Car builderCar = new Car.CarBuild()
               .setBrand("Ford")
               .viewCar();
        System.out.println(builderCar);


    }
}
