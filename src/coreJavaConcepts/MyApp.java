package coreJavaConcepts;

interface Human{
    default void show(){
        System.out.println("Human is selfish");
    }


}

interface God{
    default void show(){
        System.out.println("God is always with me.");
    }
}


public class MyApp implements Human, God{
    public static void main(String[] args) {

    }

    @Override
    public void show() {
        God.super.show();
    }
}
