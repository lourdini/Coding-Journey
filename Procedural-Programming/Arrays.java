import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        String studentNames[] = {"David","Alenere","Jaymar","Ace","Jasfer"};

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        //Index is a number that represents a position in a collection
        //Index starts with zero
/*
        studentNames[4] = "Alerene";
        System.out.println(studentNames[4]);
        System.out.println(numbers[4] + numbers[9]);

        Scanner arrayScan = new Scanner(System.in);
        String employeeNames[] = new String[20];
        int evenNumbers[] = new int[10];

        System.out.print("Enter Employee Names: ");
        employeeNames[0] = arrayScan.nextLine();

        System.out.print(employeeNames[0]);
*/
        String emails[] = {"ace@gmail.com","hex@gmail.com","star@gmail.com"};
        String usernames[] = {"ace","hex","star"};
        String passwords[] = {"acer","hexer","starer"};

        //int index[] = {0,1,2,3};

        int index;

        Scanner account = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        index = account.nextInt();


        System.out.println("Index    : "+ index);
        System.out.println("Emails   : "+ emails[index]);
        System.out.println("Username : "+ usernames[index]);
        System.out.println("Password : "+ passwords[index]);


    }
}
