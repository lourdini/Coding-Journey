package inheritance;

public class Main {

    public static void main(String[] args) {
//Inheritance
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
//Overriding Constructors
/*
        Person p = new Person("David","Male",0);
        Toddler t = new Toddler("Alenere","Female",1,"KaonTae");

        p.checkStatus();
        System.out.println();
        t.checkStatus();

        System.out.println();
        t.drink();
*/
//Overriding Methods

        Person p = new Person("David","Male",0);
        Toddler t = new Toddler("Alenere","Female",1,"KaonTae");

        p.checkStatus();
        System.out.println();
        t.checkStatus();

        System.out.println();
        t.drink();

        Kid k = new Kid("Jaymar","Male",7,"Valorant",4);

    }

}
