package StringMethods;

public class Car implements Cloneable{
    int speed = 100;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car obj = new Car();
        Car obj1 = (Car) obj.clone();
    }
}
