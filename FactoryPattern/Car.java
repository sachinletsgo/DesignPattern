package FactoryPattern;

abstract public  class Car {
    abstract int price();
    abstract float onRoadPrice( float rate);
    abstract int bag();
    abstract String car();

    public int tyre() {

        return 4;
    }


}
