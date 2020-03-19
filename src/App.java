import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Person {
    public String name;
    public String surName;
    public int age;

    public Person(String aName, String aSurName, int aAge) {
        this.name = aName;
        this.surName = aSurName;
        this.age = aAge;
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Carl", "Kakisis", 25);
        System.out.println(person1.name);
    }
}
