package fundamentals;

import fundamentals.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
//Classes and Objects
        //Classes act as a blueprint of an object that you want to
        //implement in your program. They contain all the attributes
        //and methods that your desired object should have.

        //Objects are created by instantiating/express a Class.
        //It is anything that has an attribute and a purpose.
        //Example: Person, Furniture and Food

        //Attributes are the global variables declared inside the
        //class of our object. It is used to create variations of an
        //object using only one class.
/*
        Person p = new Person();
        p.firstName = "David";
        p.lastName = "Sdpt";
        p.sex = 'M';
        p.age = 19;

        Person p1 = new Person();
        p1.firstName = "Alenere";
        p1.lastName = "Sdpt";
        p1.sex = 'F';
        p1.age = 19;

        RiceCooker eureka = new RiceCooker();
        eureka.brand = "Eureka";
        eureka.isCooking = false;
*/
/*
        Product p = new Product();
        Person pr = new Person();
*/
//Constructors
/*
        Product p = new Product("Hotdog", 12.0f);
        Product p1 = new Product("Noodles", 10.0f);
        Product p2 = new Product("Coke", 15.0f);
*/
/*
        Person p1 = new Person("Lourd Anthony","Virtudazo",'M', 19 );
        Person p2 = new Person("Joshua","Tabura",'M',19);
*/
//UserInput Constructor
/*
        Scanner s = new Scanner(System.in);

        System.out.print("Enter First Name : ");
        String firstName = s.nextLine();
        System.out.print("Enter Last Name  : ");
        String lastName = s.nextLine();
        System.out.print("Enter Sex        : ");
        char sex = s.next().charAt(0);
        System.out.print("Enter Age        : ");
        int age = s.nextInt();

        Person p = new Person(firstName,lastName,sex,age);
*/
//Object Methods
/*
        Character c = new Character("David","Hello There",
                100,50,5);
        Character c1 = new Character("Alenere","Feel the Force",
                150,800,10);

        //System.out.println(c.dialog);
        c.introduce();
        c.sayDialog();

        System.out.println();
        c1.introduce();
        c1.sayDialog();

        System.out.println();
        c.talkTo("Mark");
        c1.talkTo("Jeane");

        System.out.println();
        c1.talkToMe(c);
*/
/*
        Student s1 = new Student("Lourd","Virtudazo",1,
                "BSIT",'A',96,97);
        Student s2 = new Student("Joshua","Tabura",1,
                "BSIT",'B',97,99);

        s1.introduceSelf();
        s1.evaluateGrade();

        s2.introduceSelf();
        s2.evaluateGrade();
*/
//Encapsulation
        //Get is Read-Only
        //Set is Write
/*
        User u = new User(202210307,"Lourdini","Lourd","Virtudazo");

        int id = u.getUserID();
        System.out.println(id);

        u.setUserName("Joshua");
        String u1 = u.getUserName();
        System.out.println(u1);

        System.out.println();
        u.introduceSelf();
*/
//Overloading Constructors
/*
        Employee e = new Employee("David","Sdpt","Programmer","Mars",
                "Male",21);

        Employee e1 = new Employee("Alenere","Sdpt","Programmer");

        Employee e2 = new Employee();

        System.out.println(e1.getFirstName()+" "+e.getLastName()+" "+e2.getTitle());
*/
//Inheritance



    }

}
