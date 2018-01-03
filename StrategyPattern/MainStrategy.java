package StrategyPattern;

import AbstractFactoryPattern.AbstractCreator;
import AbstractFactoryPattern.AbstractLiquid;
import AbstractFactoryPattern.Cold;
import AbstractFactoryPattern.Hot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStrategy {

    public static void main(String args[]) throws IOException {

        System.out.println(" What is the name of your project?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        Context context = new Context(new AndroidApp(50, 50), name);
        context.information();

//        System.out.println(" \n");
//        Context context1 = new Context( new IOSApp("Swift","India"),name);
//        context1.information();


    }
}
