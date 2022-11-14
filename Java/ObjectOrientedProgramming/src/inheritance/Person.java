package inheritance;

public class Person {

    String name, sex;
    int age;

    //Explicit Constructor  - no arguments
        //Used to not having to add "super" to subclass
    Person(){

    }

    //Implicit Constructor  - has arguments
    Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void checkStatus(){
        System.out.println("Name :"+name);
        System.out.println("Sex  :"+sex);
        System.out.println("Age  :"+age);
    }

}
