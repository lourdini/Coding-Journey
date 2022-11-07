import java.util.Scanner;

public class D2ArraysNestedLoops {

    public static void main(String[] args){

/*
        String users[][] = {
                {"David","david123"},
                {"Alenere","alenere123"},
                {"Hazel","hazel123"},
                {"Jaymar","jaymar123"},
        };
*/
//---------------------------------------------------------
/*
        //Declaring 2D Arrays without value
        //Column Vertical : Row Horizontal
        //datatype [rows][cols]

        int numbers[][] = new int[4][3];

        numbers[0][0] = 12;

        System.out.println(numbers[0][0]);
*/
//-----------------------------------------------------------
        //Nested For-Loop
/*

        for(int i = 0 ; i < 1 ; i++){

            for(int x = 0 ; x < 5 ; x++){
                System.out.println(i + " " + x);
            }

            System.out.println();

        }
*/
/*
        //Iterating 2D Arrays

        String users[][] = {
                {"David","david123","mars"},
                {"Alenere","alenere123"},
                {"Hazel","hazel123"},
                {"Jaymar","jaymar123"},
        };

        System.out.println(users.length);
        System.out.println(users[0].length);
        System.out.println(users[1].length);
*/
/*
        String users[][] = {
                {"David","david123"},
                {"Alenere","alenere123"},
                {"Hazel","hazel123","mars"},
                {"Jaymar","jaymar123","jupiter","21"},
        };

        for(int row = 0 ; row < users.length ; row++){

            System.out.println(users[row].length);

        }
*/
/*
        String users[][] = {
                {"David","david123"},
                {"Alenere","alenere123"},
                {"Hazel","hazel123","mars"},
                {"Jaymar","jaymar123","jupiter","21"},
        };

        for(int row = 0 ; row < users.length ; row++){

            for(int col = 0 ; col < users[row].length ; col++){

                //System.out.println(row + " " + col);

                System.out.println(users[row][col]);
            }
            System.out.println();
        }
*/
//---------------------------------------------------------------------
        //Nested For-Each Loop

        String users[][] = {
                {"David","david123","mars"},
                {"Alenere","alenere123"},
                {"Hazel","hazel123"},
                {"Jaymar","jaymar123"},
        };

        for(String user[]:users){

            for(String info:user){
                System.out.println(info);
            }

            System.out.println();

        }


    }

}
