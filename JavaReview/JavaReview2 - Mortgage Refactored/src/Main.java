//Creating Methods
//--------------------------------------------
/*public class Main {

    public static void main(String[] args){
        //greetUser("Mosh","Anu");

        String message = greetUser("Mosh", "Hamedani");
        System.out.println(message);
    }

//    public static void greetUser(String firstName, String lastName){
//        System.out.println("Hello, " + firstName + " " + lastName);
//    }

    public static String greetUser(String firstName, String lastName){
        return "Hello, " + firstName + " " + lastName;
    }

}*/

//Refactored Mortgage Calculator
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;
    static final double MIN_PRINCIPAL = 1_000;
    static final double MAX_PRINCIPAL = 1_000_000;
    static final double MIN_ANNUAL_RATE = 1;
    static final double MAX_ANNUAL_RATE = 30;
    static final byte MAX_PERIOD_YEAR = 30;

    public static void main(String[] args){
        int principal = (int)(readNumber("Principal: ",MIN_PRINCIPAL,MAX_PRINCIPAL));
        float annualInterest = (float)(readNumber("Annual Interest Rate: ",MIN_ANNUAL_RATE,MAX_ANNUAL_RATE));
        byte years = (byte)(readNumber("Period (Years): ",0,MAX_PERIOD_YEAR));

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(
            int principal,
            float annualInterest,
            byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------");
        for (int month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, (short) month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true){
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateBalance(
            double principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade){

        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        double monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years){

        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        double monthlyInterestRate = (annualInterest / PERCENT) / MONTHS_IN_YEAR;

        return principal
                * (monthlyInterestRate * Math.pow( 1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow( 1 + monthlyInterestRate, numberOfPayments) -1);
    }
}