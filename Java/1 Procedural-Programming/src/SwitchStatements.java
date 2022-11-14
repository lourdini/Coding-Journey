import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args){
/*
        char grade = 'D';

        switch(grade){

            case 'A':
                System.out.println("Outstanding");
                System.out.println("Outstanding");
                break;
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            default:
                System.out.println("Invalid Grade");

            }

*/

//----------------------------------------------------------------------

/*
        String status = "option1";

        switch(status) {

            case "option1":
                System.out.println("Married");
                break;
            case "option2":
                System.out.println("Single");
                break;
            case "option3":
                System.out.println("Prefer not to say");
                break;
            default:
                System.out.println("Invalid Status");

        }

*/
//-----------------------------------------------------------------
    //Challenge

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Month : ");
        int month = s.nextInt();

        System.out.print("Enter Date  : ");
        int date = s.nextInt();

        System.out.print("Enter Year  : ");
        int year = s.nextInt();

        System.out.println("Month :"+month);
        System.out.println("Date  :"+date);
        System.out.println("Year  :"+year);

        System.out.println();

        String monthWord = "";

        switch(month) {

            case 1:
                monthWord = "January";
                break;
            case 2:
                monthWord = "February";
                break;
            case 3:
                monthWord = "March";
                break;
            case 4:
                monthWord = "April";
                break;
            case 5:
                monthWord = "May";
                break;
            case 6:
                monthWord = "June";
                break;
            case 7:
                monthWord = "July";
                break;
            case 8:
                monthWord = "August";
                break;
            case 9:
                monthWord = "September";
                break;
            case 10:
                monthWord = "October";
                break;
            case 11:
                monthWord = "November";
                break;
            case 12:
                monthWord = "December";
                break;
            default:

        }

        if(month > 12 || month <= 0){
            System.out.println("Invalid Month");
        }else if(date > 31 || date <= 0){
            System.out.println("Invalid Date");
        }else
            System.out.println(monthWord+" "+date+","+year);


    }

}
