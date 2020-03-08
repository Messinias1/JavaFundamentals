class Car {
    public String make;
    public String model;
    private String vin;

    public Car(String aMake, String aModel) {
        this.make = aMake;
        this.model = aModel;
    }

    public void setVin(String vin) {
        if(vin.length() == 17) {
            this.vin = vin;
        }
        else {
            System.out.println("Not a valid VIN");
        }
    }

    public String getVin()
    {
        return vin;
    }
}

public class App {
    public static void main(String[] args) {

        Car car1 = new Car("Saab", "9-3");
        car1.setVin("aaaaaaaaaaaaaaaaa");
        System.out.println(car1.getVin());
        System.out.println(car1.make);
        sayHi("Carl", 25);
    }

    public static void sayHi(String name, int age) {
        System.out.println("Hello " + name + " you are " + age);
    }
}
