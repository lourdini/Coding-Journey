import java.util.Scanner;

public class Blind {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean loopChoice = true;
        int quantity[] = new int[3];
        int amount = 0;
        int quanInt = 0;
        int subtotal = 0;
        char orderAgain;
        int total = 0;

        while(true) {

            System.out.println("Welcome to Coffee Shop\n");
            System.out.print("Enter Username: ");
            String name = s.next();

            System.out.println();
            System.out.println("Welcome, " + name + "\n");

            System.out.println("Coffee Menu:");
            System.out.println("A. P25.00 Americano\n" + "B. P30.00 Irish\n" + "C. P35.00 Mocha\n");

            do {
                do {
                    System.out.print("Select your Order: ");
                    String choice = s.next();

                    switch (choice) {

                        case "A":
                        case "a":
                            System.out.println("You ordered Americano");
                            loopChoice = false;
                            amount = 25;
                            quanInt = 0;
                            break;
                        case "B":
                        case "b":
                            System.out.println("You ordered Irish");
                            loopChoice = false;
                            amount = 30;
                            quanInt = 1;
                            break;
                        case "C":
                        case "c":
                            System.out.println("You ordered Mocha");
                            loopChoice = false;
                            amount = 35;
                            quanInt = 2;
                            break;
                        default:
                            System.out.println("Invalid Order");
                            System.out.println();

                    }

                } while (loopChoice);

                System.out.print("Enter Quantity: ");
                quantity[quanInt] = s.nextInt();

                subtotal = amount * quantity[quanInt];
                total += subtotal;

                System.out.println("Subtotal: P" +total);

                System.out.println("Order again? : ");
                orderAgain = s.next().charAt(0);

            }while(orderAgain != 'n');




        }

    }

}
