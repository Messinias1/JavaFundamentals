import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Person {
    public String name;
    public Person(String aName) {
        this.name = aName;
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Carl");
        System.out.println(person1.name);
    }
}
