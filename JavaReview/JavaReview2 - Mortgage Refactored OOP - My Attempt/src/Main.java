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

        var person1 = new MortgageCalculator(180000, 4F, (byte) 10);
        double person1Mortgage = person1.calculateMortgage();
        person1.printMortgage();
        person1.printPaymentSchedule();

        var person2 = new MortgageCalculator();
        person2.setPrincipal(100_000);
        person2.setAnnualInterest(4F);
        person2.setYears((byte) 10);
        person2.printMortgage();
        person2.printPaymentSchedule();

    }
}