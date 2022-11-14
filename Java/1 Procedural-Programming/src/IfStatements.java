import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {

/*
        boolean isTall = false;

        if(isTall){
        System.out.println("You Are Tall");
        }
        if(false){
        System.out.println("You Are Tall");
        }

        int age = 13;

        if(age >= 18){
            System.out.println("You Have Permission");
        }
*/
//-------------------------------------------------------------------------------------------------------------
/*
        //else if Statement

        Scanner s = new Scanner(System.in);
        int age;

        System.out.print("Enter Age: ");
        age = s.nextInt();

        if(age >= 18){
        System.out.println("You Have Access");
        }else {
        System.out.println("You Do Not Have Access");
        }
*/
//--------------------------------------------------------------------------------------------------------
/*
        //else if else if Statement

        Scanner s = new Scanner(System.in);
        int age;

        System.out.print("Enter Age: ");
        age = s.nextInt();

        if(age >= 40){
            //System.out.println("Access Denied");
        }else if(age >= 18){
            //System.out.println("You Have Access");
        }else if(age >= 13) {
            //System.out.println("You Need Parental Consent");
        }else if(age == 12) {
            //System.out.println("Uli inyo ligo tubig");
        }else{
            //System.out.println("Access Denied");
        }
*/
//----------------------------------------------------------------------------------------------------------------
/*
        //Nested Conditional Statement

        Scanner s = new Scanner(System.in);
        int age;

        System.out.print("Enter Age: ");
        age = s.nextInt();
        boolean isVerified = false;


        if(age >= 18){
            System.out.println("Access Granted");
            if(isVerified){
                //System.out.println("Qualified");
            }else{
                //System.out.println("Not Qualified");
            }

        }else {
            System.out.println("Access Denied");
        }
*/
//---------------------------------------------------------------------------------------------------------------
/*
        //Equals Function

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Greetings: ");
        String greet = s.nextLine();

        if(greet.equals("Hello")){
            //System.out.println("Hi");
        }

        if(greet.equalsIgnoreCase("Hello")){
            //System.out.println("Hi");
        }
*/
//----------------------------------------------------------------------------------------------------------
/*
        //Logical Operators

        Scanner s = new Scanner(System.in);

        boolean hasRuler = false;
        boolean hasPen = true;

        if(hasRuler && hasPen){
            //System.out.println("You can come in");
        }else {
            //System.out.println("Go home");
        }

        if(hasRuler || hasPen){
            //System.out.println("You can come in");
        }else {
            //System.out.println("Go home");
        }

        if(!hasPen){
            //System.out.println("You can come in");
        }else {
            //System.out.println("Go home");
        }
*/
//----------------------------------------------------------------------------------------------------------
/*
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = s.nextInt();
        boolean isVerified = false;

        if(age >= 18 && isVerified) {
            //System.out.println("You have access and is Qualified");
        }else if(age >= 18 && !isVerified){
            //System.out.println("You have access but not Qualified");
        }else {
            //System.out.println("Go home");
        }
*/
//-------------------------------------------------------------------------------------------------------------
        //Challenge

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Grade in English :");
        float english = scan.nextFloat();

        System.out.print("Enter Grade in Math :");
        float math = scan.nextFloat();

        System.out.print("Enter Grade in Science :");
        float science = scan.nextFloat();

        System.out.print("Enter Grade in Computer :");
        float computer = scan.nextFloat();

        System.out.println("English  :"+english);
        System.out.println("Math     :"+math);
        System.out.println("Science  :"+science);
        System.out.println("Computer :"+computer);

        System.out.println("");

        float average = ((english+math+science+computer)/4);

        System.out.println("Average  :"+average);

        if(average > 100){
            System.out.println("Invalid Grade");
        }else if(average >= 98){
            System.out.println("With Highest Honors");
        }else if(average >= 95){
            System.out.println("With High Honors");
        }else if(average >= 90){
            System.out.println("With Honors");
        }else if (average >= 75) {
            System.out.println("Passed");
        }else if (average < 75){
            System.out.println("Failed");
        }

    }
}
