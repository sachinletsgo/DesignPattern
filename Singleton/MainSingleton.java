package Singleton;

import java.io.IOException;

public class MainSingleton {
    public static void main(String args[]) throws IOException {
        EarlySingleton.getInstance().getClassDescription();
        LateSingleton.getInstance().getClassDescription();
        SynchronizedSingleton.getInstance().getClassDescription();


    }
}
