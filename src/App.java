import java.util.Scanner;
class Person {
    public String aName;
    public String aSurname;
    public int aAge;

    public Person(String name, String surname, int age){
        this.aName = name;
        this.aSurname = surname;
        this.aAge = age;
    }
}

public class App {
    public static void main(String[] args) {

        Person Carl = new Person("Carl",
                "Kakisis", 25);
        System.out.println(Carl.aName);

//        String [] friends = {"Zach", "Chris", "Bob"};
//
//        System.out.println(friends[0]);
    }
}
