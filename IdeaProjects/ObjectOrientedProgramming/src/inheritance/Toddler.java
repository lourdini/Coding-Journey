package inheritance;

public class Toddler extends Person {

    String favoriteGame;



    Toddler(String name, String sex, int age, String favoriteGame){
        super(name,sex,age);
        this.favoriteGame = favoriteGame;
    }

    void drink(){
        System.out.println(name+ " Is Drinking Milk");
    }

    void checkStatus(){
        super.checkStatus();
        System.out.println("Favorite Game: "+favoriteGame);
    }

}
