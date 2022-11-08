package polymorphism;

public class StrongEnemy extends Enemy{
    StrongEnemy(){
        name = "Strong Enemy";
        hp = 150;
    }

    void dialog() {
        System.out.println(name+" I'm Strong");
    }
}
