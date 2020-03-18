import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Person {
    public String name;
    public String surName;
    public Person(String aName, String aSurName) {
        this.name = aName;
        this.surName = aSurName;
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Carl", "Kakisis");
        System.out.println(person1.name);
    }
}
