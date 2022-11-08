import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args){

/*
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(i);
        }
*/
//-------------------------------------------------------------------------------
    //Iterating Arrays
/*
        String[] names = {"David","Alenere","Jasfer","Ace","Patrick","Anthony"};
        for(int i = 0 ; i < names.length ; i++){
            System.out.println("I am "+names[i]);
        }
 */
//------------------------------------------------------------------------------------
    //Conditions in For Loop

/*
        for(int i = 0 ; i < names.length ; i++){

            if (names[i].equalsIgnoreCase("Ace")){
                System.out.println("We found "+names[i]);
                break;
            }else{
                System.out.println(names[i]);
            }

        }
*/
//-------------------------------------------------------------------------------------

/*
        Scanner s = new Scanner(System.in);

        String[] names = {"David","Alenere","Jasfer","Ace","Patrick","Anthony"};

        System.out.print("Search Name: ");
        String search = s.nextLine();

        for(int i = 0 ; i < names.length ; i++){

            if (names[i].equalsIgnoreCase(search)){
                System.out.println("We found "+names[i]);
                break;
            }else{
                System.out.println(names[i]);
            }

        }
*/
        //Challenge
        Scanner s = new Scanner(System.in);

        String[] usernames = {"David","Alenere","Anthony"};
        String[] passwords = {"David123","Alenere123","Anthony123"};

        System.out.print("Username : " );
        String username = s.nextLine();

        System.out.print("Password : " );
        String password = s.nextLine();

/*
        for(int i = 0 ; i < usernames.length ; i++){

            System.out.println("INDEX : "+i);
            System.out.println(usernames[i]);
            System.out.println(passwords[i]);
            System.out.println();

        }
*/
//---------------------------------------------------------------------------------------------
/*
        for(int i = 0 ; i < usernames.length ; i++){

            if(username.equals(usernames[i]) && password.equals(passwords[i])){
                System.out.println("Welcome, "+usernames[i]);
                break;
            }else{
                System.out.println("Account not found");
            }

        }
*/
        boolean isExist = false;

        for(int i = 0 ; i < usernames.length ; i++){

            if(username.equalsIgnoreCase(usernames[i]) && password.equals(passwords[i])){
                isExist = true;
                break;
            }

        }

        if(isExist) {
            System.out.println("Welcome, "+username);
        }else {
            System.out.println("Account Not Found");
        }

    }

}


