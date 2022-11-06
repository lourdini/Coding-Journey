package polymorphism;

public class Main {

    public static void main(String[] args) {
/*
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();

        Animal a = new Dog();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound();
*/

        Enemy we = new WeakEnemy();
        Enemy st = new StrongEnemy();

        we.dialog();
        st.dialog();

        we.showStats();
        st.showStats();

    }

}
