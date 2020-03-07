class Car {
    public String make;
    public String model;

    public Car(String aMake, String aModel) {
        this.make = aMake;
        this.model = aModel;
    }
}

public class App {
    public static void main(String[] args) {

        Car car1 = new Car("Saab", "9-3");
        System.out.println(car1.make);
        sayHi("Carl", 25);
    }

    public static void sayHi(String name, int age) {
        System.out.println("Hello " + name + " you are " + age);
    }
}
