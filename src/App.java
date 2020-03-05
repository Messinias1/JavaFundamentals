import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter in First Number: ");
        double num1 = keyboardInput.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = keyboardInput.nextDouble();
        System.out.println(num1 + num2);
    }
}
