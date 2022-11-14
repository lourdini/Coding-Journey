import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner sum = new Scanner(System.in);
        System.out.print("Num1 :");
        x = sum.nextInt();

        System.out.print("Num2 :");
        y = sum.nextInt();

        System.out.println("Result: "+(x+y));

    }
}
