package BusinessRequirement;
abstract class Vehicle{

    void startEngine(){
        System.out.println("The engine is started.");
    }
    abstract void accelerate();
}

class Car extends Vehicle{
    @Override
    void accelerate() {
        System.out.println("The car is accelerating.");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.accelerate();
    }

}
