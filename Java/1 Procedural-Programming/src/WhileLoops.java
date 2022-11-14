import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args){

        //While Loops

/*
        int i = 0;
        while(i <= 5){
            System.out.println(i);
            i++;
        }
*/
/*
        while(true){
            System.out.println(i);
            i++;
        }
*/
/*
        while(i < 5){
            System.out.println("Hello World");
            i++;
        }
*/
//----------------------------------------------------------------------------------------------
        //Iterating Arrays
        //Array Length

/*
        String[] names = {"David","Alenere","Ace","Jasfer","Patrick","Jaymar"};
        int i = 0;

        while(i < 5){
            System.out.println(names[i]);
            i++;
        }
*/
/*
        String[] names = {"David","Alenere","Ace","Jasfer","Patrick","Jaymar","Anthony"};
        int i = 0;

        while(i < names.length){
            System.out.println(names[i]);
            i++;
        }
*/
//--------------------------------------------------------------------------------------------
        //Do - While Loop
        //Reverse Checkpoint
/*
        int i = 5;

        do{
            System.out.println(i);
            i++;
        }while(i < 5);
*/
//--------------------------------------------------------------------------------------------
        //Break Keyword

/*
        int i = 0;

        while(i < 5){
            System.out.println(i);
            i++;
            break;
        }
        System.out.println("FINISH");
*/
//----------------------------------------------------------------------------------------------
        //Conditions in While Loop

/*
        String[] names = {"David","Alenere","Ace","Jasfer","Patrick","Jaymar","Anthony"};

        int i = 0;

        while(i < names.length){

            if(names[i].equalsIgnoreCase("patrick")){
                System.out.println("We Found "+names[i]);
                break;
            }else {
                System.out.println(names[i]);
            }
            i++;
        }
*/
//--------------------------------------------------------------------------------------------

/*
        Scanner s = new Scanner(System.in);

        String[] names = {"David","Alenere","Ace","Jasfer","Patrick","Jaymar","Anthony"};

        System.out.print("Search for name :");
        String search = s.nextLine();
        int i = 0;

        while(i < names.length){

            if(names[i].equalsIgnoreCase(search)){
                System.out.println("We Found "+names[i]);
                break;
            }else {
                System.out.println(names[i]);
            }
            i++;

        }
*/
//----------------------------------------------------------------------------------------------

        Scanner s = new Scanner(System.in);

        String answer;
        int life = 5;


        while(life > 0) {
            System.out.println("Remaining life: " + life);
            System.out.println();
            System.out.print("What is the name of the planet closest to earth? ");
            answer = s.nextLine();

            if (answer.equalsIgnoreCase("mercury")) {
                System.out.println();
                System.out.println("You are Correct");
                break;
            }else{
                --life;

            }
        }

        if(life == 0){
            System.out.println();
            System.out.println(";)");
        }





    }

}
