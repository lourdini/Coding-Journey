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
    private JButton adminButton;

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

                    String[] shopSelector = {"Coffee Shop","Diner"};
                    if(resultSet.next()) {
                        int answer = JOptionPane.showOptionDialog(null,
                                "Select Shop",
                                "Shop Selection",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                shopSelector,
                                0);

                        if (answer == 0) {
                            CoffeeShopPanel coffeeShop = new CoffeeShopPanel();
                            dispose();
                        } else if (answer == 1) {
                            DinerOrderPanel dinerOrderPanel = new DinerOrderPanel();
                            dispose();
                        } else {
                            dispose();
                        }
                    }

                }catch(Exception i){
                    System.out.println(i.getMessage());
                }
            }
        });

        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                String name = JOptionPane.showInputDialog("Enter Password");
                try {
                    if (name.equals("admin123")) {
                        StocksPanel stocksPanel = new StocksPanel();
                    } else {
                        JOptionPane.showConfirmDialog(null, "Wrong password", "Admin Prompt", JOptionPane.OK_CANCEL_OPTION);
                        dispose();
                        LoginPanel loginPanel = new LoginPanel();
                    }
                }catch (Exception e2){
                    dispose();
                    LoginPanel loginPanel = new LoginPanel();
                }

            }
        });
    }

}
