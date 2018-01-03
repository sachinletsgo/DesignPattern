package StrategyPattern;

public class IOSApp  implements DoCode  {

    String language;
    String country;

    IOSApp(String language, String country ){
        this.country= country;
        this.language= language;

    }

    @Override
    public void codeFor(String name) {
        System.out.print("Lets Start code for " + name + " in " + language + " for "+ country);
    }
}
