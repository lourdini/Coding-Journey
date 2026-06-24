
public class Main {

    public static void main(String[] args){

        //Programming Paradigms
        //-------------------------------------------
        //Procedural, Functional, Object-oriented, Event-driven, Logic, Aspect-oriented.
        //Functional and Object-oriented are most used.

        //Classes
        //-------------------------------------------
        //Class - a blueprint for creating objects
        //Object - an instance of class
        /*
        var textbox1 = new TextBox();
        var textbox2 = textbox1;

        textbox2.setText("hello world");
        System.out.println(textbox1.text);

        //    Stack            Heap
        //var textbook1 = new Textbook();
        //    Stack      No Heap object involved for Primitives
        //int number = 1;
        */

        //Procedural Paradigm - For comparison purposes
        //-------------------------------------------
        /*
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary,extraHours,hourlyRate);
        System.out.println(wage);
        */

        //Encapsulation - bundle data and methods that operate on the data in a single unit.
        //-------------------------------------------
        /*
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
        */

        //Abstraction - reduce complexity by hiding unnecessary details
        //-------------------------------------------
        //Coupling - the level of dependency between classes
        //           the goal is to reduce coupling

        //Constructor - used to initialize objects
        //method overloading and constructor overloading
        //-------------------------------------------
        var employee = new Employee(
                50_000,
                20);
        var employee2 = new Employee(10_000);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        //static
        Employee.printNumberOfEmployees();

        //Instance members and Static members
        //instance - methods when behavior depends on an object’s state/data
        //static - methods when behavior does NOT depend on object state

        //* my own understanding: if i dont need to access class variables to use function, use static
        //* static can only see other static
        //* "main" method is static to enable the java runtime directly call method without creating new object


    }

    /*
    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ){
        return baseSalary + (extraHours * hourlyRate);
    }
    */


}