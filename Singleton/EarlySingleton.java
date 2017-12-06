package Singleton;

public class EarlySingleton {

    private static EarlySingleton instance = new EarlySingleton();

    private EarlySingleton() {
    }

    public static EarlySingleton getInstance() {

        return instance;
    }

    public void getClassDescription() {

        System.out.println("It`s Early Singleton");
    }

}
