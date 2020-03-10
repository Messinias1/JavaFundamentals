import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String secretWord = "giraffe";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;

        while(!guess.equals(secretWord) && !outOfGuesses) {
            if(guessCount < guessLimit) {
                System.out.println("Enter a guess: ");
                guess = input.nextLine();
                guessCount++;
            }
            else {
                outOfGuesses = true;
            }
        }
        if(outOfGuesses) {
            System.out.println("You lose");
        }
        else {
            System.out.println("You win");
        }
    }
}
