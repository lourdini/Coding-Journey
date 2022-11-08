import java.util.Scanner;

public class ForEachLoops {

    public static void main(String[] args){
        //For-Each Loop is only used to iterate true arrays

/*
        String[] names = {"David","Alenere","Jasfer","Ace","Patrick"};

        for(String name:names){
            System.out.println(name);
        }
*/
//------------------------------------------------------------------------
/*
        //Break

        int[] numbers = {1,2,3,4,5};

        for(int number:numbers){
            System.out.println(number);
            break;
        }
*/
//------------------------------------------------------------------------
/*
        //Conditions in For-Each Loop
        //One array for every For-Each Loop

        String[] names = {"David","Alenere","Jasfer","Ace","Patrick"};

        for(String name:names){
            if(name.equalsIgnoreCase("Jasfer")){
                System.out.println("We Found, "+name);
                break;
            }else{
                System.out.println(name);
            }
        }
*/
/*
        //User input

        Scanner s = new Scanner(System.in);

        String[] names = {"David","Alenere","Jasfer","Ace","Patrick"};

        System.out.print("Search Name: ");
        String search = s.nextLine();

        for(String name:names){
            if(name.equalsIgnoreCase(search)){
                System.out.println("We Found, "+name);
                break;
            }else{
                System.out.println(name);
            }
        }
*/
/*
        //Challenge: Array of Integers SUMMATION

        int[] numbers = {5,10,15,20};
        int sum = 0;

        for(int number:numbers){
            sum = sum + number;
        }

        System.out.println("Sum: "+sum);
*/
        //With user input
/*
        Scanner s = new Scanner(System.in);

        int numbers[] = new int[5] ;
        int sum = 0;

        System.out.println("Enter 5 Numbers to Add: ");
        numbers[0] = s.nextInt();
        numbers[1] = s.nextInt();
        numbers[2] = s.nextInt();
        numbers[3] = s.nextInt();
        numbers[4] = s.nextInt();

        for(int number:numbers){
            sum = sum + number;
        }

        System.out.println("Sum: "+sum);
*/
    }


}
