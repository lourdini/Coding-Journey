package main;

import mathematics.*;

public class Main {

    public static void main(String[] args){

/*
        Arithmetic a = new Arithmetic();
        Constants c = new Constants();

        int sum = a.add(5,2);
        System.out.println(sum);

        System.out.println(c.Pi);
*/
//------------------static-----------------

        int sum = Arithmetic.add(5,2);

        System.out.println(Constants.Pi);

        System.out.println(sum);

    }

}
