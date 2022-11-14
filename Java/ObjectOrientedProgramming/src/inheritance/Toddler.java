package inheritance;

public class Toddler extends Person {

    String favoriteGame;


//OVERRIDING Constructors
        //You are required to call the constructor of the superclass

//SUPER Keyword
        //SUPER keyword can only be used by a subclass and it is used
        //to call their superclass, so we can access their constructors,
        //attributes and methods.

        //This method is used to be able to add attributes that are not
        //in the superclass     Ex. favoriteGame

    Toddler(String name, String sex, int age, String favoriteGame){
        super(name,sex,age);
        this.favoriteGame = favoriteGame;
    }

    void drink(){
        System.out.println(name+ " Is Drinking Milk");
    }


//OVERRIDING Methods
        //To retain the Functionality from the Super Class use
        //the Super Keyword w/ the Method Name

        //In this case by adding the favoriteGame to checkStatus
    void checkStatus(){
        super.checkStatus();
        System.out.println("Favorite Game: "+favoriteGame);
    }

}
