package fundamentals;

public class Product {
//Constructor
        //Constructors are used to initialize attributes.

//THIS Keyword
        //The (this) keyword refers to the class itself.

        //The (this) keyword enables you to access global variables
        //inside the class if you have the same variable names in
        //a parameter.

    String name;
    float price;
//       ^      Global Variable

    Product(String name, float price){
            //   ^  Arguments  ^  Local Variable
        this.name = name;
        this.price = price;

        System.out.println(name+ " Created " + "SRP :"+price);

    }

}
