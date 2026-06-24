import java.text.NumberFormat;

public class MortgageCalculator {

    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private short years;

    public MortgageCalculator(int principal,
                              float annualInterest,
                              short years){
        setPrincipal(principal);
        setAnnualInterest(annualInterest);
        setYears(years);
    }

    public double calculateMortgage(){
        float numberOfPayments = getNumberOfPayments();
        float monthlyInterestRate = getMonthlyInterestRate();

        return principal
                * (monthlyInterestRate * Math.pow( 1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow( 1 + monthlyInterestRate, numberOfPayments) -1);
    }

    public double calculateBalance(short numberOfPaymentsMade){
        float numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterestRate();

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances(){
        var balances = new double[getNumberOfPayments()];
        for (int month = 1; month <= balances.length; month++)
            balances[month-1] = calculateBalance((short) month);
        return balances;
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

    public void setYears(short years){
        if(years < 1 || years > 30)
            throw new IllegalArgumentException("Enter value from 1 to 30");
        this.years = years;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterestRate() {
        return (annualInterest / PERCENT) / MONTHS_IN_YEAR;
    }
}
