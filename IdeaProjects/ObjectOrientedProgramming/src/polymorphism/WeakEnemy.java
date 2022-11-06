package polymorphism;

public class WeakEnemy extends Enemy{
    WeakEnemy(){
        name = "Weak Enemy";
        hp = 80;
    }

    void dialog() {
        System.out.println(name+" I'm Weak");
    }
}
