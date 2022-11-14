package fundamentals;

import java.util.Scanner;

public class Person {

    //Attributes  
    String firstName;
    String lastName;
    char sex;
    int age;

    Person(String firstName, String lastName, char sex, int age){

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;

        System.out.println();

        System.out.println("First Name : "+firstName);
        System.out.println("Last Name  : "+lastName);
        System.out.println("Sex        : "+sex);
        System.out.println("Age        : "+age);

        System.out.println();

    }

}
