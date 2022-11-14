package inheritance;

public class Main {

    public static void main(String[] args) {
//Inheritance
        //Is an OOP technique used to inherit attributes
        //and methods from one class to another.

//SUPERCLASS / Parent
        //The class where we will inherit the attributes and methods.

//SUBCLASS   / Children
        //The class who will inherit the attributes and methods
        //from a superclass .

        //Can have more functions than SUPERCLASS

//EXTENDS Keyword
        //Used after the class name and it indicates that the certain
        //class will inherit from another class.

        //Extends keyword after subclass name

//SUPER Keyword
        //SUPER keyword can only be used by a subclass and it is used
        //to call their superclass so we can access their constructors,
        //attributes and methods.

/*
        Person p = new Person();
        Toddler t = new Toddler();

        p.name = "David";
        p.sex = "Male";
        p.age = 18;

        t.name = "Alenere";
        t.sex = "Female";
        t.age = 1;

        p.checkStatus();
        System.out.println();
        t.checkStatus();

        t.drink();
*/
//OVERRIDING Constructors
        //You are required to call the constructor of the superclass
/*
        Person p = new Person("David","Male",0);
        Toddler t = new Toddler("Alenere","Female",1,"KaonTae");

        p.checkStatus();
        System.out.println();
        t.checkStatus();

        System.out.println();
        t.drink();
*/
//OVERRIDING Methods
        //To retain the Functionality from the Super Class use
        //the Super Keyword w/ the Method Name

        //In this case by adding the favoriteGame to checkStatus
/*
        Person p = new Person("David","Male",0);
        Toddler t = new Toddler("Alenere","Female",1,"KaonTae");

        p.checkStatus();
        System.out.println();
        t.checkStatus();

        System.out.println();
        t.drink();

//Kid is like nested inheritance
        //Kid can do what Person and Toddler can
        Kid k = new Kid("Jaymar","Male",7,"Valorant",4);
*/
//You can use the SUPERCLASS to instantiate the SUBCLASSES
        Person p = new Person("David,Male,18");
        Person t = new Toddler("Alenere","Female",1,"Peek-a-Boo");
        Person k = new Kid("Jaymar","Male",7,"Tumbang Preso",4);

    }

}
