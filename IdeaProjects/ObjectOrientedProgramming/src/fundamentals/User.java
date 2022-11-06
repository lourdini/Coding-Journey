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
