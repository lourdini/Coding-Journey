import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

//jdbc      - Java™ database connectivity
//mysql     - Serves like https
//3306      - Default port number
//VARCHAR   - Serves like String for database

//Name of database is always lowercase

        String url = "jdbc:mysql://localhost:3306/jdbcdemo";

        //These Strings are for database authentication
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
            }

            connection.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}