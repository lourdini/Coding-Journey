import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modified {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String coffee[] = new String[4];
        coffee[0] = "";
        coffee[1] = "Americano";
        coffee[2] = "Irish";
        coffee[3] = "Mocha";

        String choice = "";
        String re = "[A|a|B|b|C|c]";

        char seniorChoice;
        char orderAgain = 0;
        boolean quantityNumbers = true;
        boolean outStock = true;

        int amount = 0;
        int quantity[] = new int[3];
        int quantityTotal[] = new int[3];
        int choiceInt = -1;
        int subtotal = 0;
        int payment = 0;
        int change = 0;
        int total = 0;
        int a = 1;
        double discount = 0;

        int coffeeReceipt[] = new int[3] ;
        int coffeeOnePrice = 25;
        int coffeeTwoPrice = 30;
        int coffeeThreePrice = 35;

        int terminate = 0;
        int stock[] = new int[3];
        stock[0] = 15;
        stock[1] = 20;
        stock[2] = 10;

        int stockLeft[] = new int[3];
        stockLeft[0] = 0;
        stockLeft[1] = 0;
        stockLeft[2] = 0;

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(choice);

        do{
            System.out.println();
            System.out.println("Welcome to Lourdini's Coffee Shop");
            System.out.println();
            System.out.print("Enter Username: ");
            String userName = s.next();

            System.out.println();
            System.out.println("Welcome, "+userName);
            System.out.println();

            System.out.println("Coffee Menu:");
            System.out.println("A. P25.00 Americano    Stock :"+stock[0]);
            System.out.println("B. P30.00 Irish        Stock :"+stock[1]);
            System.out.println("C. P35.00 Mocha        Stock :"+stock[2]);

            System.out.println();


            do {
                do {
                    for (int i = 0; i < 1; i++) {
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
                            if (stock[0] > 0) {
                                System.out.println("You ordered Americano");
                                amount = 25;
                                coffeeReceipt[0] = 1;
                                choiceInt = 0;
                                outStock = false;
                            } else {
                                System.out.println("Out of Stock");
                                System.out.println();
                                outStock = true;
                            }
                            break;
                        case "B":
                        case "b":
                            if (stock[1] > 0) {
                                System.out.println("You ordered Irish");
                                amount = 30;
                                coffeeReceipt[1] = 2;
                                choiceInt = 1;
                                outStock = false;
                            } else {
                                System.out.println("Out of Stock");
                                System.out.println();
                                outStock = true;
                            }
                            break;
                        case "C":
                        case "c":
                            if (stock[2] > 0) {
                                System.out.println("You ordered Mocha");
                                amount = 35;
                                coffeeReceipt[2] = 3;
                                choiceInt = 2;
                                outStock = false;
                            } else {
                                System.out.println("Out of Stock");
                                System.out.println();
                                outStock = true;
                            }
                            break;
                        default:
                            System.out.println();

                    }
                }while(outStock);

                do{

                    for(int h =0;h<1;h++){

                        quantity[choiceInt] = 0;
                        System.out.println();
                        System.out.print("Enter Quantity: ");

                        if (s.hasNextInt()) {
                            quantity[choiceInt] = s.nextInt();
                            if(quantity[choiceInt] < 1 ){
                                h--;
                            }else if(quantity[choiceInt] > stock[choiceInt]){
                                System.out.println("Insufficient Stock");
                                h--;
                            }else {
                                quantityTotal[choiceInt] += quantity[choiceInt];
                                stockLeft[choiceInt] = stock[choiceInt] - quantityTotal[choiceInt];
                            }
                        } else {
                            System.out.println("Invalid Input");
                            h--;
                            s.next();
                        }

                    }

                    subtotal = amount * quantity[choiceInt];
                    total += subtotal;

                    if(choiceInt > -1){
                        quantityNumbers = false;
                    }

                }while(quantityNumbers);



                if(choiceInt == 0) {
                    stock[0] = stock[0] - quantity[0];
                }

                if(choiceInt == 1){
                    stock[1] = stock[1] - quantity[1];
                }

                if(choiceInt == 2){
                    stock[2] = stock[2] - quantity[2];
                }

                System.out.println("Coffee Menu:");
                System.out.println("A. P25.00 Americano    Stock :"+stock[0]);
                System.out.println("B. P30.00 Irish        Stock :"+stock[1]);
                System.out.println("C. P35.00 Mocha        Stock :"+stock[2]);
                System.out.println();
                System.out.println("Subtotal: " + total);


                if(stock[0] == 0 && stock[1] == 0 && stock[2] == 0) {
                    System.out.println("All out of everything. Proceed to check-out.");
                    orderAgain = 'n';
                }else{
                    do {
                        System.out.print("Do you want to order again? (Y/N): ");
                        orderAgain = s.next().charAt(0);
                        System.out.println();

                        if (orderAgain == 'y' || orderAgain == 'Y') {
                            break;
                        } else if (orderAgain == 'n' || orderAgain == 'N') {
                            break;
                        }
                    } while (orderAgain != 'n' || orderAgain != 'N');
                }

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

            System.out.print("");

            do {
                System.out.println();
                System.out.print("Are you a Senior Citizen? (Y/N): ");
                seniorChoice = s.next().charAt(0);

                if (seniorChoice == 'y' || seniorChoice == 'Y') {
                    break;
                } else if (seniorChoice == 'n' || seniorChoice == 'N') {
                    break;
                }
            } while (seniorChoice != 'n' || seniorChoice != 'N');

            System.out.println();

            System.out.println();
            System.out.println("*****************(Receipt#"+a+")********************");

            System.out.println("Item          Price          Qty          Total");
            System.out.println();
            if(coffeeReceipt[0] == 1) {
                System.out.print(coffee[coffeeReceipt[0]]);
                System.out.println("     P25.00"+"          "+quantityTotal[0]+"            "+"P"+coffeeOnePrice*quantityTotal[0]);
            }

            if(coffeeReceipt[1] == 2){
                System.out.print(coffee[coffeeReceipt[1]]);
                System.out.println("         P30.00"+"          "+quantityTotal[1]+"            "+"P"+coffeeTwoPrice*quantityTotal[1]);
            }

            if(coffeeReceipt[2] == 3){
                System.out.print(coffee[coffeeReceipt[2]]);
                System.out.println("         P35.00"+"          "+quantityTotal[2]+"            "+"P"+coffeeThreePrice*quantityTotal[2]);
            }

            discount = total * .15;



            System.out.println("*******************(Total)**********************");
            System.out.println("                                    Total: P"+total);
            if(seniorChoice == 'y' || seniorChoice == 'Y'){
                System.out.println("                        Senior's Discount: P"+discount);
            }
            System.out.println("                                   Amount: P"+payment);

            if(seniorChoice == 'y' || seniorChoice == 'Y') {
                System.out.println("                                   Change: P" + (change + discount));
            }else{
                System.out.println("                                   Change: P"+change);
            }


            terminate = stock[0] + stock[1] + stock[2];

            total = 0;
            quantityTotal[0] = 0;
            quantityTotal[1] = 0;
            quantityTotal[2] = 0;


            coffeeReceipt[0]= 0;
            coffeeReceipt[1]= 0;
            coffeeReceipt[2]= 0;
            a++;

            System.out.println();
            System.out.println();
            System.out.println();

        }while(terminate != 0);


    }

}