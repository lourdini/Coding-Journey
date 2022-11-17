import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginPanel extends JFrame{
    private JPanel mainLoginPanel;
    private JButton btnLogin;
    private JButton btnRegister;
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JCheckBox showPass;

    LoginPanel(){
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Login");
        this.setContentPane(mainLoginPanel);
        this.setMinimumSize(new Dimension(400,400));
        setLocationRelativeTo(null);
        //this.setUndecorated(true);

        setVisible(true);
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RegisterPanel registerPanel = new RegisterPanel();
            }
        });

        showPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showPass.isSelected()){
                    pfPassword.setEchoChar((char)0);
                }else{
                    pfPassword.setEchoChar('•');
                }
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydiner","root","root");

                    String username = tfUsername.getText();
                    String password = pfPassword.getText();

                    Statement statement = connection.createStatement();
                    String sql = "Select * from users where username='"+username+"' and password='"+password+"'";

                    ResultSet resultSet = statement.executeQuery(sql);

                    if(resultSet.next()){
                        dispose();
                        DinerOrderPanel dinerOrderPanel = new DinerOrderPanel();
                    }else{
                        JOptionPane.showMessageDialog(null,"Username and Password do not match");
                    }

                }catch(Exception i){
                    System.out.println(i.getMessage());
                }
            }
        });

    }

}
