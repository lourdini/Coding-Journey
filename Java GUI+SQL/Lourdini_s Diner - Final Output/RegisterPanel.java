import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RegisterPanel extends JFrame{

    private JTextField tfNameReg;
    private JTextField tfEmailReg;
    private JButton btnRegister;
    private JPanel mainRegisterPanel;
    private JButton btnCancel;
    private JTextField tfUsernameReg;
    private JPasswordField pfPasswordReg;
    private JPasswordField pfConPassReg;

    RegisterPanel(){
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Register");
        this.setContentPane(mainRegisterPanel);
        this.setMinimumSize(new Dimension(400,400));
        setLocationRelativeTo(null);
        //this.setUndecorated(true);

        setVisible(true);
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginPanel loginPanel = new LoginPanel();
            }
        });
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydiner","root","root");
                    PreparedStatement preparedStatement = null;



                    String name = tfNameReg.getText();
                    String username = tfUsernameReg.getText();
                    String password = pfPasswordReg.getText();
                    String email = tfEmailReg.getText();
                    String confirmPassword = pfConPassReg.getText();

                    if(name.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty() || confirmPassword.isEmpty()){

                        JOptionPane.showMessageDialog(null,
                                 "Please enter all fields",
                                 "Try again",
                                 JOptionPane.ERROR_MESSAGE);
                    }else if(!password.equals(confirmPassword)){
                        JOptionPane.showMessageDialog(null,
                                "Confirm Password does not match",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                                pfPasswordReg.setText("");
                                pfConPassReg.setText("");
                    }else{
                        Statement statement = connection.createStatement();
                        String sql = "INSERT INTO `users`(`name`, `username`, `password`, `email`) VALUES (?,?,?,?)";
                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, name);
                        preparedStatement.setString(2, username);
                        preparedStatement.setString(3, password);
                        preparedStatement.setString(4, email);

                        preparedStatement.executeUpdate();

                        int answer = JOptionPane.showConfirmDialog(null,"Go back to Login?","Registered Successfully!",JOptionPane.YES_NO_OPTION);
                        if(answer == 0){
                            dispose();
                            LoginPanel loginPanel = new LoginPanel();
                        }else{
                            dispose();
                        }

                    }


                }catch(Exception i){
                    JOptionPane.showMessageDialog(null,i);
                }
            }
        });
    }
}
