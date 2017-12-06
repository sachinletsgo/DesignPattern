package Singleton;

public class LateSingleton {
    private  static  LateSingleton instance;

    private  LateSingleton(){}

    public  static  LateSingleton getInstance(){

        if(instance==null){
            instance = new LateSingleton();

        }
        return  instance;
    }

    public void getClassDescription() {

        System.out.println("It`s Late Singleton");
    }

}
