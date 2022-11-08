package main;

import mathematics.*;

public class Main {

    public static void main(String[] args){

//Packages
        //A folder in our project where we can throw all our
        //related codes in the same directory.

        //We can create multiple packages inside our java
        //project, we can also reuse it in other projects
        //if we choose to do so.

        //We can create classes inside a package and import
        //it in our main class so that we can use that class
        //in our program.

//Class Instantiation
        //The process of creating an Instance of a class so
        //we can use it on our program.
        //Can also be called objects

        //ClassName identifier = new ClassName();

//ACCESS Modifiers
        //Used to modify where classes, variables and methods
        //are accessible.

            //ACCESS Modifiers - Classes

                    //default - The class can only be accessed by classes
                    //          in the same package.

                    //public  - The class can be accessed anywhere as long
                    //          as it is imported.

            //ACCESS Modifiers - Methods and Variables
                    //default   - It can only be accessed by classes in the
                    //            same package.

                    //public    - It can be accessed anywhere as long as it
                    //            is imported.

                    //private   - It can only be accessed inside its own class.

                    //protected - It can only be accessed by classes in the
                    //            same package and subclasses.

//NON - ACCESS Modifiers
        //Used to add other functionalities for classes, variables
        //and methods, it is basically used for specific situations.

            //NON - ACCESS Modifiers - Classes
                    //final    - The class cannot be inherited by other classes.

                    //abstract - The class cannot be used to instantiate objects.
                    //           We can only access an abstract class, by
                    //           inheriting it from another class.

            //NON - ACCESS Modifiers - Classes
                    //final    - Variables cannot be reassigned.
                    //         - Methods cannot be overridden.

                    //static   - The variables / methods belongs to the class
                    //         - itself rather than its instance.

                    //abstract - It can only be used in an abstract class methods.
                    //           These methods do not have a body.


/*
        Arithmetic a = new Arithmetic();
        Constants c = new Constants();

        int sum = a.add(5,2);
        System.out.println(sum);

        System.out.println(c.Pi);
*/
//------------------static-----------------

        int sum = Arithmetic.add(5,2);

        System.out.println(Constants.Pi);

        System.out.println(sum);


    }

}
