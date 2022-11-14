import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Experiments {

    public static void main(String[] args) {
/*
        Scanner s = new Scanner(System.in);

        String[] usernames = {"David","Alenere","Anthony"};
        String[] passwords = {"David123","Alenere123","Anthony123"};

        System.out.print("Username : " );
        String username = s.nextLine();

        System.out.print("Password : " );
        String password = s.nextLine();

        int i = 1;

        if(username.equalsIgnoreCase(usernames[i]) && password.equals(passwords[i])){
            System.out.println("Welcome User");
        } else{
            System.out.println("User not found");
        }
*/
/*
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        for(int number:numbers){

            System.out.println(number);

        };
*/
/*
        Scanner s = new Scanner(System.in);

        System.out.print("Do you want to proceed? (y/n) ");
        String response = s.nextLine();

        if(response.equalsIgnoreCase("y")){
            System.out.println("You are Dead");
        }else{
            System.out.println("You'll live");
        }
*/
        /*
        Scanner s = new Scanner(System.in);
        String name = "";
        boolean loop = true;

        Pattern pat = Pattern.compile("[A-Z][a-z]+");

        do {
            System.out.print("Enter Name: ");
            name = s.next();
            Matcher mat = pat.matcher(name);

            if (mat.matches()) {
                break;
            }else{
                System.out.println("Not a Name");
                System.out.println();
                continue;
            }
        }while(loop);

        System.out.println("Your Name is: "+name);

        */
/*
* Scanner s = new Scanner(System.in);

        int quantity[] = new int[3];
        String choice = "";
        int choice = -1;

        String names[] = {"0 Michael","1 Joshua","2 Lourd","3 Kyle","4 Mark","5 Noah","6 Kian","7 Stephen"};

        System.out.println("Choice: ");
        choice = s.next();

        switch(choice){

            case "a":
                choice = 0;
                break;
            case "b":
                choice = 1;
                break;
            case "c":
                choice = 2;
                break;
        }

        for(int i = 0 ; i < 3 ; i++){

            quantity[i] = s.nextInt();
            i++;
            quantity[i] = s.nextInt();
            i++;
            quantity[i] = s.nextInt();
        }

        System.out.println(names[quantity[0]]);
        System.out.println(names[quantity[1]]);
        System.out.println(names[quantity[2]]);
* */
        Scanner s = new Scanner(System.in);

        int quantity[] = new int[3];
        String choice = "";
        int choiceInt = -1;
        boolean quantityNumbers = true;
        int choiceIntTotal = 0;

        String names[] = {"0 Michael","1 Joshua","2 Lourd","3 Kyle","4 Mark","5 Noah","6 Kian","7 Stephen"};

        do{
            System.out.println("Choice: ");
            choice = s.next();

            switch (choice) {

                case "a":
                    choiceInt = 0;
                    break;
                case "b":
                    choiceInt = 1;
                    break;
                case "c":
                    choiceInt = 2;
                    break;
            }



            System.out.println("Enter Quantity: ");
            quantity[choiceInt] = s.nextInt();
            choiceInt++;

            choiceIntTotal += choiceInt;

            if(choiceInt == 3){
                quantityNumbers = false;
            }





        }while(quantityNumbers);

        System.out.println(quantity[0]);
        System.out.println(quantity[1]);
        System.out.println(quantity[2]);
    }


}
