import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = keyboardInput.nextLine();
        System.out.print("Enter Your Age: ");
        int age = keyboardInput.nextInt();
        System.out.println("Hey " + name + " you are " +
                age + " years old.");
    }
}
