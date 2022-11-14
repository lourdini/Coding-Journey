package fundamentals;

public class Character {
//Object Methods
    String name, dialog;
    int hp, mp, lvl;

    //Constructors are considered as Object Methods
    Character(String name, String dialog, int hp, int mp, int lvl){

        this.name = name;
        this.dialog = dialog;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;

    }

    void introduce(){
        System.out.println("I am "+name);
    }

    void sayDialog(){
        System.out.println(name+ " : "+dialog);
    }

    void talkTo(String firstName){
        System.out.println(name+ " : Hello, "+firstName);
    }

    void talkToMe(Character x){
        System.out.println(name+ " : Hello, "+x.name);
    }

}
