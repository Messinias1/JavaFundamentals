import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Car car1 = new Car("Saab", "9-3", 12000);
        car1.setOwner("Carl");
        System.out.println(car1.getOwner());
    }
}
