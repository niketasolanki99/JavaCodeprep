package DesignPatterns;

public class Singleton {

    private static Singleton instance;

     private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        return new Singleton();
    }
}


//