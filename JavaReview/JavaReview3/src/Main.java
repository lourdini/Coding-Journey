import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        //Inheritance and Object Class
        //----------------------------------------
        /*
        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());

        var box1 = new TextBox();
        var box2 = box1;
        //.equals actually compares the hashcode
        //System.out.println(box1.equals(box2));
        System.out.println(box2.toString());
        */

        //Constructors and Inheritance
        //----------------------------------------
        /*
        var textBox = new TextBox();

        //Access Modifiers
        //stick to private and public to avoid confusion

        //Overriding Methods

        textBox.setText("hi");
        System.out.println(textBox.toString());
        //by default .toString() is called so it can be omitted
        System.out.println(textBox);

        //Upcasting and Downcasting
        // upcasting - casting an object to one of its super types
        //           - “Forget some details and treat it more generally.”
        // downcasting - casting an object to one of its sub types
        //             - “I think this general thing is actually a specific thing.”
        //----------------------------------------
        //var control = new UIControl(true);
        //var textBox = new TextBox();
        //show(control);

        //Upcasting - casting TextBox to UIControl
        //treating a child object as its parent type
        // UIControl
        //     ^
        //  TextBox
        //show(textBox);
        */

        //Comparing Objects
        //has auto generate override for .equals and .hashcode
        //----------------------------------------
        /*
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1 == point2);
        //overriden method
        System.out.println(point1.equals(point2));
        //added downcasting
        System.out.println(point1.equals(new TextBox()));
        //comparing to itself
        System.out.println(point1.equals(point2));
        //overriding hashcode
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        */

        //Polymorphism
        //many form
        //----------------------------------------
        /*
        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var control : controls)
            control.render();
        */

        //Abstract Classes and Methods ("abstract" keyword)
        //----------------------------------------
        //Abstract Class: A restricted class that cannot be instantiated directly.
        //Abstract Method: A method declared without a body (no implementation).

        //Final Classes and Methods ("final" keyword)
        //----------------------------------------
        //Final Classes: Prevents a class from being subclassed
        //Final Methods: Prevents a method from being overridden or modified in any child class
        // NOT USED OFTEN

        //Deep Inheritance Hierarchies
        //----------------------------------------
        //DO NOT CREATE deep inheritance hierarchies
        // up to 1 or 2 levels is ideal

        //Multiple Inheritance
        //----------------------------------------
        //YAGNI - You aren't gonna need it
        //not supported in JAVA

        //Interfaces
        // - used to build loosely-coupled, extensible, testable applications
        // - a strict contract or blueprint in programming that defines what an object can do, without specifying how it does it.
        // - one example is type-c port in phones. you can replace a faulty charger with a new one that still fits
        //----------------------------------------

        //Dependency Injection
        // - our classes should not instantiate their dependencies
        //----------------------------------------

        //Side hashmap study
        //----------------------------------------
        /*
        HashMap<String, Double> map = new HashMap<>();
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        //map.remove("apple");
        System.out.println(map.get("coconut"));
        System.out.println(map.containsKey("coconut"));
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        */

        //Constructor Injection
        // - inside TaxReport.java

        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2019());
        report.show();

        report.show(calculator);
        //or
        report.show(new TaxCalculator2019());

        //Interface Segregation Principle
        // - divide big interfaces into smaller ones
        // - the point is to separate interfaces with different capabilities not necessary everytime
        // - in JAVA a class cannot have multiple parents but an Interface can
        //----------------------------------------
        //UIWidget.java, Draggable.java, Dragger.java



    }

    //Accessing TextBox methods by casting
    /*
    public static void show(UIControl control) {
        //Downcasting - treating a parent reference as a more specific child type
        if(control instanceof TextBox){
            var control1 = (TextBox) control;
            control1.setText("Hi");
        }
        System.out.println(control);
    }
    */

}
