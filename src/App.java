public class App {
    public static void main(String[] args) {

        String phrase = "Giraffe Academy";

        System.out.println(phrase.length());
        System.out.println(phrase.contains("dog"));
        System.out.println(phrase.charAt(1));
        System.out.println(phrase.lastIndexOf("e"));
        System.out.println(phrase.substring(0,
                phrase.indexOf(" ")));
    }
}
