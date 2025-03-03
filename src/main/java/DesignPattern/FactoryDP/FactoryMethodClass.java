package DesignPattern.FactoryDP;

public class FactoryMethodClass {

    public OS getInstance(String str){
        if(str.equals("IOS")) return new IOS();
        if(str.equals("WindowsOS")) return new WindowsOS();
        else return new AndroidOS();
    }
}
