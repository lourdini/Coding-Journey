import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends JFrame{
    private JPanel mainPane;
    private JTextField editUsername;
    private JPasswordField editPassword;
    private JButton resetButton;
    private JButton loginButton;

    Login(){
        setTitle("Login Form");
        setContentPane(mainPane);
        //this.setUndecorated(true);
        setMinimumSize(new Dimension(300,300));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setVisible(true);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editUsername.setText("");
                editPassword.setText("");
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myattempt","root","root");

                    String username = editUsername.getText();
                    String password = editPassword.getText();

                    Statement statement = connection.createStatement();
                    String sql = "Select * from users where username='"+username+"' and password='"+password+"'";

                    ResultSet resultSet = statement.executeQuery(sql);

                    if(resultSet.next()){
                        dispose();
                        Home hpage = new Home();
                        hpage.show();
                    }else{
                        JOptionPane.showMessageDialog(null,"Username and Password do not match");
                        editUsername.setText("");
                        editPassword.setText("");
                    }

                    connection.close();

                }catch(Exception i){
                    System.out.println(i.getMessage());
                }
            }
        });
    }
}




