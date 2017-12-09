package Builder;

public class Car {


    String brand;
    String name;
    String color;
    float price;
    int power;

    /*
     By making the constructor private we need inner class CarBuild.
     Con of this approach is this that we need build class to maker the object of Car class.

     if You want to give the liberty to developer than make constructor public
     and use the CarBuilder class
    */
    private Car(String brand, String name, String color, float price, int power) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.price = price;
        this.power = power;


    }


    static public class CarBuild {


        public CarBuild setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuild setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuild setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuild setPrice(float price) {
            this.price = price;
            return this;
        }

        public CarBuild setPower(int power) {
            this.power = power;
            return this;
        }


        String brand = "Maruti";
        String name = "800";
        String color = "White";
        float price = 6.0f;
        int power = 1100;

        public Car viewCar() {

            return new Car(brand, name, color, price, power);
        }

    }


    @Override
    public String toString() {
        return "Brand " + brand + " Name " + name + " Color " + color + " Price  " + price + " Power " + power;
    }


}
