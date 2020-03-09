public class App {
    public static void main(String[] args) {
            boolean isMale = true;
            boolean isTall = true;

            if(isMale && isTall) {
                System.out.println("You are male and tall");
            } else if(isMale && !isTall) {
                System.out.println("you are male but not tall");
            }
            else {
                System.out.println("You are not male");
            }
    }
}
