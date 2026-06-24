import java.text.NumberFormat;

public class MortgageCalculator {

    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal,
                              float annualInterest,
                              byte years){
        setPrincipal(principal);
        setAnnualInterest(annualInterest);
        setYears(years);
    }

    public MortgageCalculator(){

    }

    public void printMortgage() {
        double mortgage = calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
        System.out.println("--------");
    }

    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------");
        for (int month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance((short)month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public double calculateMortgage(){
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        double monthlyInterestRate = (annualInterest / PERCENT) / MONTHS_IN_YEAR;

        return principal
                * (monthlyInterestRate * Math.pow( 1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow( 1 + monthlyInterestRate, numberOfPayments) -1);
    }

    public double calculateBalance(short numberOfPaymentsMade){
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        double monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public void setPrincipal(int principal){
        if(principal < 1_000 || principal > 1_000_000)
            throw new IllegalArgumentException("Enter value from 1,000 to 1000,000");
        this.principal = principal;
    }

    public void setAnnualInterest(float annualInterest){
        if(annualInterest < 0 || annualInterest > 30)
            throw new IllegalArgumentException("Enter value from 0 to 30");
        this.annualInterest = annualInterest;
    }

    public void setYears(byte years){
        if(years < 1 || years > 30)
            throw new IllegalArgumentException("Enter value from 1 to 30");
        this.years = years;
    }

}
