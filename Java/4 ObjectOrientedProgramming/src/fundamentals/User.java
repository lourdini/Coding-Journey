package fundamentals;

public class User {

    private int userID;
    private String userName;
    String firstName, lastName;

    User(int userID, String userName, String firstName, String lastName){

        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //SETTER        - Is a method used to set encapsulated variables
    //GETTER        - Is a method used to get encapsulated variables

    //Conventional that it starts with get/set

    //Use "get" only if you want read-only
    //Use "set" only if you want to write
/*
    int getUserID(){
        return userID;
    }

    String getUserName(){
        return userName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }
*/

    int getUserID(){
        return userID;
    }

    void setUserName(String userName){
        this.userName = userName;
    }

    String getUserName(){
        return userName;

    }

    void introduceSelf(){
        System.out.println("I am "+firstName+" "+lastName);
    }

}
