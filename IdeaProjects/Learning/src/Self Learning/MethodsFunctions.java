package School;

import java.lang.reflect.Array;

public class MethodsFunctions {

/*
    public static void main(String[] args){

        sayHello();
        sayHi();

    }

    static void sayHi(){
        System.out.println("Hi");
    }

    static void sayHello(){
        System.out.println("Hello");
    }
*/
//---------------------------------------------------------
    //Variable Scoping

    //Global Variables
/*
    static String section = "A";
    static int num = 100;

   public static void main(String[] args){

       //Local Variables
       saySection();
       sayNum();

   }

   static void saySection(){
       System.out.println(section);
   }

   static void sayNum(){
        System.out.println(num);
   }
*/
    //Arguments/Parameters
/*
    public static void main(String[] args){

        String x = "David";

        print("Hello World");
        print("Hi There");
        print("Hello, "+x);

        add(5,10,20);

        System.out.println();

        greet("Lourd",19);

    }

    static void greet(String name, int age){
        System.out.println("Hello, "+name);
        System.out.println("You are "+age+" Years Old.");
        print("Extra Stuff");
    }

    static void add(int num1, int num2, int num3){
        System.out.println(num1 + num2 + num3);
    }

    static void print(String word){
        System.out.println(word);
    }
*/
    //Return Keyword
/*
    public static void main(String[] args){

        int product = multiply(5,2);
        System.out.println(product);

        System.out.println(isLegalAge(18));

    }

    static int add(int num1, int num2){
        return num1+num2;
    }

    static int subtract(int num1, int num2){
        return num1-num2;
    }

    static int multiply(int num1, int num2){
        return num1*num2;
    }

    static int division(int num1, int num2){
        return num1/num2;
    }

    static boolean isLegalAge(int age){

        if(age >= 18) return true;
        else return false;
    }
*/
    //Overloading Methods
/*
    public static void main(String[] args){

        System.out.println(add(5,2));
        System.out.println(add(5,2,10));
        System.out.println(add(2.3,5.5));

    }

    static double add(double num1, double num2){
        return num1+num2;
    }

    static int add(int num1, int num2){
        return num1+num2;
    }

    static int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
*/
    //Summation

    public static void main(String[] args){

        int numbers[] = {1,2,3,4,5};

        int result = summation(numbers);

        System.out.println(result);

    }

    static int summation(int numbers[]){
        int sum = 0;

        for(int number:numbers){
            sum = sum + number;
        }

        return sum;
    }

}

