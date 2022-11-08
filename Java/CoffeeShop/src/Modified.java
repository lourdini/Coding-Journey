import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modified {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String choice = "";
        String re = "[A|a|B|b|C|c]";
        int amount = 0;

        int quantity[] = new int[3];
        int choiceInt = -1;
        boolean quantityNumbers = true;

        int subtotal = 0;
        int payment = 0;
        int change = 0;
        char orderAgain;
        int total = 0;
        int a = 1;

        int coffeeReceipt[] =new int[3] ;
        int coffeeOnePrice = 25;
        int coffeeTwoPrice = 30;
        int coffeeThreePrice = 35;


        String coffee[] = new String[4];

        coffee[0] = "";
        coffee[1] = "Americano";
        coffee[2] = "Irish";
        coffee[3] = "Mocha";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(choice);

        while(true){

            System.out.println("Welcome to Lourdini's Coffee Shop");
            System.out.println();
            System.out.print("Enter Username: ");
            String userName = s.next();

            System.out.println();
            System.out.println("Welcome, "+userName);
            System.out.println();

            System.out.println("Coffee Menu:");
            System.out.println("A. P25.00 Americano\nB. P30.00 Irish \nC. P35.00 Mocha");
            System.out.println();


            do {
                for(int i = 0;i<1;i++) {
                    System.out.print("Select your choice: ");
                    if (s.hasNext(re)) {
                        choice = s.next();
                        i = 1;
                    } else {
                        System.out.println("Choice not recognized");
                        System.out.println();
                        s.next();
                        i--;
                    }
                }

                switch (choice) {
                    case "A":
                    case "a":
                        System.out.println();
                        System.out.println("You ordered Americano");
                        amount = 25;
                        coffeeReceipt[0] = 1;
                        choiceInt = 0;
                        break;
                    case "B":
                    case "b":
                        System.out.println();
                        System.out.println("You ordered Irish");
                        amount = 30;
                        coffeeReceipt[1] = 2;
                        choiceInt = 1;
                        break;
                    case "C":
                    case "c":
                        System.out.println();
                        System.out.println("You ordered Mocha");
                        amount = 35;
                        coffeeReceipt[2] = 3;
                        choiceInt = 2;
                        break;
                    default:
                        System.out.println();

                }

                do{
                    do {
                        System.out.println();
                        System.out.print("Enter Quantity: ");
                        if (s.hasNextInt()) {
                            quantity[choiceInt] = s.nextInt();
                        } else {
                            System.out.println("Invalid Input");
                            s.next();
                        }
                    }while(quantity[choiceInt] == 0);

                    subtotal = amount * quantity[choiceInt];
                    total += subtotal;

                    if(choiceInt > -1){
                        quantityNumbers = false;
                    }

                }while(quantityNumbers);

                System.out.println();
                System.out.println("Subtotal: " + total);

                do {
                    System.out.print("Do you want to order again?: ");
                    orderAgain = s.next().charAt(0);

                    if (orderAgain == 'y' || orderAgain == 'Y') {
                        break;
                    } else if (orderAgain == 'n' || orderAgain == 'N') {
                        break;
                    }
                } while (orderAgain != 'n' || orderAgain != 'N');
                System.out.println();

            }while(orderAgain == 'y' || orderAgain == 'Y');
            do  {
                do {
                    System.out.println();
                    System.out.print("Enter Amount of Payment: ");
                    if (s.hasNextInt()) {
                        payment = s.nextInt();
                    } else {
                        System.out.println("Invalid Input");
                        s.next();
                    }
                }while(payment == 0);

                if (payment < total) {
                    System.out.println("Not enough money");
                } else {
                    change = payment - total;
                }
            }while (payment < total);

            System.out.println();
            System.out.println("******************Receipt#"+a+"*********************");

            System.out.println("Item          Price          Qty          Total");
            System.out.println();
            if(coffeeReceipt[0] == 1) {
                System.out.print(coffee[coffeeReceipt[0]]);
                System.out.println("     P25.00"+"          "+quantity[0]+"            "+"P"+coffeeOnePrice*quantity[0]);
            }

            if(coffeeReceipt[1] == 2){
                System.out.print(coffee[coffeeReceipt[1]]);
                System.out.println("         P30.00"+"          "+quantity[1]+"            "+"P"+coffeeTwoPrice*quantity[1]);
            }

            if(coffeeReceipt[2] == 3){
                System.out.print(coffee[coffeeReceipt[2]]);
                System.out.println("         P35.00"+"          "+quantity[2]+"            "+"P"+coffeeThreePrice*quantity[2]);
            }
            System.out.println("********************Total***********************");
            System.out.println("                                    Total: P"+total);
            System.out.println("                                   Amount: P"+payment);
            System.out.println("                                   Change: P"+change);

            coffeeReceipt[0]= 0;
            coffeeReceipt[1]= 0;
            coffeeReceipt[2]= 0;
            a++;

            System.out.println();
            System.out.println();
            System.out.println();
        }

    }

}