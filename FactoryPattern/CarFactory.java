package FactoryPattern;

public class CarFactory {


    public Car getCar(String brand) {

        switch (brand) {
            case "Honda":
                return new HondaCar();
            case "Ford":
                return new FordCar();
        }

        return null;
    }
}
