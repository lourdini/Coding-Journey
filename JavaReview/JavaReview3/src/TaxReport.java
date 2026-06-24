public class TaxReport {
    private TaxCalculator calculator;

    //Constructor Injection
    //----------------------------------------
    // - giving an Actor a component during spawn/setup
    // - Dependency provided during object creation.
    //----------------------------------------
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }

    //Setter Injection
    //----------------------------------------
    // - setting references after BeginPlay
    // - Dependency provided later through a setter.
    //----------------------------------------
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    //Method Injection
    //----------------------------------------
    // - passing an Actor into a function temporarily
    // - Dependency passed only for a specific method call.
    //----------------------------------------
    //public void calculate(TaxCalculator taxCalculator){
    //    taxCalculator.calculateTax();
    //}

    //Method Injection show()
    //----------------------------------------
    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
