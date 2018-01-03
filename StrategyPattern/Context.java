package StrategyPattern;

public class Context {

    private  DoCode doCode;
    private  String name;

    Context( DoCode doCode, String name){
        this.doCode=doCode;
        this.name= name;
    }

    public void information(){
        doCode.codeFor(name);
    }

}
