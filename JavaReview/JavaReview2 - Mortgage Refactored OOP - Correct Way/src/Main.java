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

//Refactored MortgageCalculator Calculator

public class Main {
    public static void main(String[] args){

        int principal = (int) Console.readNumber("Principal: ");
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ");
        short years = (short) Console.readNumber("Period (Years): ");

        var calculator = new MortgageCalculator(principal,annualInterest, (byte) years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }
}