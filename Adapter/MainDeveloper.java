package Adapter;

import Builder.Car;

import java.io.IOException;

public class MainDeveloper {

    public static void main(String args[]) throws IOException {


        JavaDeveloper j = new DeveloperAdapter();
        AndroidDeveloper androidDeveloper = new AndroidDeveloper();

        androidDeveloper.setJ(j);
        androidDeveloper.androidProgrammer("Login Screen");


    }
}
