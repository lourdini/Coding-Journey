import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StocksPanel extends JFrame{
    private JPanel stocksPanel;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JSpinner spinner4;
    private JSpinner spinner5;
    private JSpinner spinner6;
    private JSpinner spinner7;
    private JSpinner spinner8;
    private JSpinner spinner9;
    private JButton removeButton;
    private JButton addButton;
    private JButton loginButton;
    private JLabel steakEggsStock;
    private JLabel steakSandStock;
    private JLabel steakDinnerStock;
    private JLabel veggieStock;
    private JLabel fishTacosStock;
    private JLabel fishChipsStock;
    private JLabel x2x2Stocks;
    private JLabel ChknStocks;
    private JLabel ChknVegStocks;
    private JButton refreshButton;
    private JButton setButton;

    Connection connection;
    int stock[] = new int[9];

    StocksPanel(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydiner","root","root");
            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            Statement statement3 = connection.createStatement();
            Statement statement4 = connection.createStatement();
            Statement statement5 = connection.createStatement();
            Statement statement6 = connection.createStatement();
            Statement statement7 = connection.createStatement();
            Statement statement8 = connection.createStatement();
            Statement statement9 = connection.createStatement();


            try {
                ResultSet resultSet1 = statement1.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Eggs\"");
                if(resultSet1.next()){
                    stock[0] = resultSet1.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet2 = statement2.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Sandw\"");
                if(resultSet2.next()){
                    stock[1] = resultSet2.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet3 = statement3.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Dinner\"");
                if(resultSet3.next()){
                    stock[2] = resultSet3.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet4 = statement4.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Veggie Sklt\"");
                if(resultSet4.next()){
                    stock[3] = resultSet4.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet5 = statement5.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish Tacos\"");
                if(resultSet5.next()){
                    stock[4] = resultSet5.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet6 = statement6.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish & Chips\"");
                if(resultSet6.next()){
                    stock[5] = resultSet6.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet7 = statement7.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"2 x 2 x 2\"");
                if(resultSet7.next()){
                    stock[6] = resultSet7.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet8 = statement8.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn\"");
                if(resultSet8.next()){
                    stock[7] = resultSet8.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet9 = statement9.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn Veg\"");
                if(resultSet9.next()){
                    stock[8] = resultSet9.getInt("stock");
                }
            }catch(Exception e){}

            steakEggsStock.setText(String.valueOf(stock[0]));
            steakSandStock.setText(String.valueOf(stock[1]));
            steakDinnerStock.setText(String.valueOf(stock[2]));
            veggieStock.setText(String.valueOf(stock[3]));
            fishTacosStock.setText(String.valueOf(stock[4]));
            fishChipsStock.setText(String.valueOf(stock[5]));
            x2x2Stocks.setText(String.valueOf(stock[6]));
            ChknStocks.setText(String.valueOf(stock[7]));
            ChknVegStocks.setText(String.valueOf(stock[8]));


        }catch(Exception i){
            System.out.println(i.getMessage());
        }

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Stocks");
        this.setContentPane(stocksPanel);
        this.setMinimumSize(new Dimension(500,500));
        //this.setMinimumSize(new Dimension(1045,548));
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer = JOptionPane.showConfirmDialog(null,"Go back to Login?","Registered Successfully!",JOptionPane.YES_NO_OPTION);
                if(answer == 0){
                    dispose();
                    LoginPanel loginPanel = new LoginPanel();
                }else{
                    dispose();
                }
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydiner","root","root");
                    Statement statement1 = connection.createStatement();
                    Statement statement2 = connection.createStatement();
                    Statement statement3 = connection.createStatement();
                    Statement statement4 = connection.createStatement();
                    Statement statement5 = connection.createStatement();
                    Statement statement6 = connection.createStatement();
                    Statement statement7 = connection.createStatement();
                    Statement statement8 = connection.createStatement();
                    Statement statement9 = connection.createStatement();


                    try {
                        ResultSet resultSet1 = statement1.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Eggs\"");
                        if(resultSet1.next()){
                            stock[0] = resultSet1.getInt("stock");
                        }
                    }catch(Exception e1){}

                    try {
                        ResultSet resultSet2 = statement2.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Sandw\"");
                        if(resultSet2.next()){
                            stock[1] = resultSet2.getInt("stock");
                        }
                    }catch(Exception e1){}

                    try {
                        ResultSet resultSet3 = statement3.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Dinner\"");
                        if(resultSet3.next()){
                            stock[2] = resultSet3.getInt("stock");
                        }
                    }catch(Exception e1){}

                    try {
                        ResultSet resultSet4 = statement4.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Veggie Sklt\"");
                        if(resultSet4.next()){
                            stock[3] = resultSet4.getInt("stock");
                        }
                    }catch(Exception e1){}

                    try {
                        ResultSet resultSet5 = statement5.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish Tacos\"");
                        if(resultSet5.next()){
                            stock[4] = resultSet5.getInt("stock");
                        }
                    }catch(Exception e1){}

                    try {
                        ResultSet resultSet6 = statement6.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish & Chips\"");
                        if(resultSet6.next()){
                            stock[5] = resultSet6.getInt("stock");
                        }
                    }catch(Exception e1){}

                    try {
                        ResultSet resultSet7 = statement7.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"2 x 2 x 2\"");
                        if(resultSet7.next()){
                            stock[6] = resultSet7.getInt("stock");
                        }
                    }catch(Exception e1){}

                    try {
                        ResultSet resultSet8 = statement8.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn\"");
                        if(resultSet8.next()){
                            stock[7] = resultSet8.getInt("stock");
                        }
                    }catch(Exception e1){}

                    try {
                        ResultSet resultSet9 = statement9.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn Veg\"");
                        if(resultSet9.next()){
                            stock[8] = resultSet9.getInt("stock");
                        }
                    }catch(Exception e1){}

                    steakEggsStock.setText(String.valueOf(stock[0]));
                    steakSandStock.setText(String.valueOf(stock[1]));
                    steakDinnerStock.setText(String.valueOf(stock[2]));
                    veggieStock.setText(String.valueOf(stock[3]));
                    fishTacosStock.setText(String.valueOf(stock[4]));
                    fishChipsStock.setText(String.valueOf(stock[5]));
                    x2x2Stocks.setText(String.valueOf(stock[6]));
                    ChknStocks.setText(String.valueOf(stock[7]));
                    ChknVegStocks.setText(String.valueOf(stock[8]));

                }catch(Exception i){
                    System.out.println(i.getMessage());
                }
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int spinner1Stock = (int) spinner1.getValue();

                    if(spinner1Stock < 1){

                        spinner1.setValue(0);
                    }else {
                        stock[0] += spinner1Stock;
                        steakEggsStock.setText(String.valueOf(stock[0]));
                        spinner1.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[0] + " WHERE item_name = \"Steak Eggs\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner2Stock = (int) spinner2.getValue();

                    if(spinner2Stock < 1){
                        
                        spinner2.setValue(0);
                    }else {
                        stock[1] += spinner2Stock;
                        steakSandStock.setText(String.valueOf(stock[1]));
                        spinner2.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[1] + " WHERE item_name = \"Steak Sandw\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner3Stock = (int) spinner3.getValue();

                    if(spinner3Stock < 1){
                        
                        spinner3.setValue(0);
                    }else {
                        stock[2] += spinner3Stock;
                        steakDinnerStock.setText(String.valueOf(stock[2]));
                        spinner3.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[2] + " WHERE item_name = \"Steak Dinner\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner4Stock = (int) spinner4.getValue();

                    if(spinner4Stock < 1){
                        
                        spinner4.setValue(0);
                    }else {
                        stock[3] += spinner4Stock;
                        veggieStock.setText(String.valueOf(stock[3]));
                        spinner4.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[3] + " WHERE item_name = \"Veggie Sklt\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner5Stock = (int) spinner5.getValue();

                    if(spinner5Stock < 1){
                        
                        spinner5.setValue(0);
                    }else {
                        stock[4] += spinner5Stock;
                        fishTacosStock.setText(String.valueOf(stock[4]));
                        spinner5.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[4] + " WHERE item_name = \"Fish Tacos\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner6Stock = (int) spinner6.getValue();

                    if(spinner6Stock < 1){
                        
                        spinner6.setValue(0);
                    }else {
                        stock[5] += spinner6Stock;
                        fishChipsStock.setText(String.valueOf(stock[5]));
                        spinner6.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[5] + " WHERE item_name = \"Fish & Chips\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner7Stock = (int) spinner7.getValue();

                    if(spinner7Stock < 1){
                        
                        spinner7.setValue(0);
                    }else {
                        stock[6] += spinner7Stock;
                        x2x2Stocks.setText(String.valueOf(stock[6]));
                        spinner7.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[6] + " WHERE item_name = \"2 x 2 x 2\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner8Stock = (int) spinner8.getValue();

                    if(spinner8Stock < 1){
                        
                        spinner8.setValue(0);
                    }else {
                        stock[7] += spinner8Stock;
                        ChknStocks.setText(String.valueOf(stock[7]));
                        spinner8.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[7] + " WHERE item_name = \"4P Chkn\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner9Stock = (int) spinner9.getValue();

                    if(spinner9Stock < 1){
                        
                        spinner9.setValue(0);
                    }else {
                        stock[8] += spinner9Stock;
                        ChknVegStocks.setText(String.valueOf(stock[8]));
                        spinner9.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[8] + " WHERE item_name = \"4P Chkn Veg\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){
                    JOptionPane.showMessageDialog(null,
                            "Enter Values",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                };

            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int spinner1Stock = (int) spinner1.getValue();

                    if(spinner1Stock < 1){

                        spinner1.setValue(0);
                    }else if(stock[0] < spinner1Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner1.setValue(0);
                    }else {
                        stock[0] -= spinner1Stock;
                        steakEggsStock.setText(String.valueOf(stock[0]));
                        spinner1.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[0] + " WHERE item_name = \"Steak Eggs\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner2Stock = (int) spinner2.getValue();

                    if(spinner2Stock < 1){

                        spinner2.setValue(0);
                    }else if(stock[1] < spinner2Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner2.setValue(0);
                    }else {
                        stock[1] -= spinner2Stock;
                        steakSandStock.setText(String.valueOf(stock[1]));
                        spinner2.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[1] + " WHERE item_name = \"Steak Sandw\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner3Stock = (int) spinner3.getValue();

                    if(spinner3Stock < 1){

                        spinner3.setValue(0);
                    }else if(stock[2] < spinner3Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner3.setValue(0);
                    }else {
                        stock[2] -= spinner3Stock;
                        steakDinnerStock.setText(String.valueOf(stock[2]));
                        spinner3.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[2] + " WHERE item_name = \"Steak Dinner\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner4Stock = (int) spinner4.getValue();

                    if(spinner4Stock < 1){

                        spinner4.setValue(0);
                    }else if(stock[3] < spinner4Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner4.setValue(0);
                    }else {
                        stock[3] -= spinner4Stock;
                        veggieStock.setText(String.valueOf(stock[3]));
                        spinner4.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[3] + " WHERE item_name = \"Veggie Sklt\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner5Stock = (int) spinner5.getValue();

                    if(spinner5Stock < 1){

                        spinner5.setValue(0);
                    }else if(stock[4] < spinner5Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner5.setValue(0);
                    }else {
                        stock[4] -= spinner5Stock;
                        fishTacosStock.setText(String.valueOf(stock[4]));
                        spinner5.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[4] + " WHERE item_name = \"Fish Tacos\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner6Stock = (int) spinner6.getValue();

                    if(spinner6Stock < 1){

                        spinner6.setValue(0);
                    }else if(stock[5] < spinner6Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner6.setValue(0);
                    }else {
                        stock[5] -= spinner6Stock;
                        fishChipsStock.setText(String.valueOf(stock[5]));
                        spinner6.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[5] + " WHERE item_name = \"Fish & Chips\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner7Stock = (int) spinner7.getValue();

                    if(spinner7Stock < 1){

                        spinner7.setValue(0);
                    }else if(stock[6] < spinner7Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner7.setValue(0);
                    }else {
                        stock[6] -= spinner7Stock;
                        x2x2Stocks.setText(String.valueOf(stock[6]));
                        spinner7.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[6] + " WHERE item_name = \"2 x 2 x 2\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner8Stock = (int) spinner8.getValue();

                    if(spinner8Stock < 1){

                        spinner8.setValue(0);
                    }else if(stock[7] < spinner8Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner8.setValue(0);
                    }else {
                        stock[7] -= spinner8Stock;
                        ChknStocks.setText(String.valueOf(stock[7]));
                        spinner8.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[7] + " WHERE item_name = \"4P Chkn\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner9Stock = (int) spinner9.getValue();

                    if(spinner9Stock < 1){

                        spinner9.setValue(0);
                    }else if(stock[8] < spinner9Stock){
                        JOptionPane.showMessageDialog(null,
                                "Invalid Operation",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);
                        spinner9.setValue(0);
                    }else {
                        stock[8] -= spinner9Stock;
                        ChknVegStocks.setText(String.valueOf(stock[8]));
                        spinner9.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[8] + " WHERE item_name = \"4P Chkn Veg\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){
                    JOptionPane.showMessageDialog(null,
                            "Enter Values",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                };
            }
        });

        setButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int spinner1Stock = (int) spinner1.getValue();

                    if(spinner1Stock < 1){

                        spinner1.setValue(0);
                    }else {
                        steakEggsStock.setText(String.valueOf(spinner1Stock));
                        spinner1.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner1Stock + " WHERE item_name = \"Steak Eggs\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner2Stock = (int) spinner2.getValue();

                    if(spinner2Stock < 1){

                        spinner2.setValue(0);
                    }else {
                        steakSandStock.setText(String.valueOf(spinner2Stock));
                        spinner2.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner2Stock + " WHERE item_name = \"Steak Sandw\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner3Stock = (int) spinner3.getValue();

                    if(spinner3Stock < 1){

                        spinner3.setValue(0);
                    }else {
                       steakDinnerStock.setText(String.valueOf(spinner3Stock));
                        spinner3.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner3Stock + " WHERE item_name = \"Steak Dinner\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner4Stock = (int) spinner4.getValue();

                    if(spinner4Stock < 1){

                        spinner4.setValue(0);
                    }else {
                        veggieStock.setText(String.valueOf(spinner4Stock));
                        spinner4.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner4Stock + " WHERE item_name = \"Veggie Sklt\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner5Stock = (int) spinner5.getValue();

                    if(spinner5Stock < 1){

                        spinner5.setValue(0);
                    }else {
                        fishTacosStock.setText(String.valueOf(spinner5Stock));
                        spinner5.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner5Stock + " WHERE item_name = \"Fish Tacos\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner6Stock = (int) spinner6.getValue();

                    if(spinner6Stock < 1){

                        spinner6.setValue(0);
                    }else {
                        fishChipsStock.setText(String.valueOf(spinner6Stock));
                        spinner6.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner6Stock + " WHERE item_name = \"Fish & Chips\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner7Stock = (int) spinner7.getValue();

                    if(spinner7Stock < 1){

                        spinner7.setValue(0);
                    }else {
                        x2x2Stocks.setText(String.valueOf(spinner7Stock));
                        spinner7.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner7Stock + " WHERE item_name = \"2 x 2 x 2\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner8Stock = (int) spinner8.getValue();

                    if(spinner8Stock < 1){

                        spinner8.setValue(0);
                    }else {
                        ChknStocks.setText(String.valueOf(spinner8Stock));
                        spinner8.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner8Stock + " WHERE item_name = \"4P Chkn\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){};

                try {
                    int spinner9Stock = (int) spinner9.getValue();

                    if(spinner9Stock < 1){

                        spinner9.setValue(0);
                    }else {
                        ChknVegStocks.setText(String.valueOf(spinner9Stock));
                        spinner9.setValue(0);

                        PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + spinner9Stock + " WHERE item_name = \"4P Chkn Veg\"");
                        p.execute();
                        p.close();
                    }
                }catch(Exception e3){
                    JOptionPane.showMessageDialog(null,
                            "Enter Values",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                };

            }

        });
    }

}
