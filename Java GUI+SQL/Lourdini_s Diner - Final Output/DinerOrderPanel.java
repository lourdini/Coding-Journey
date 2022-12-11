import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DinerOrderPanel extends JFrame{
    private JPanel dinerOrderPanel;
    private JPanel jpSteakEggs;
    private JPanel jpSteakSandwich;
    private JPanel jpSteakDinner;
    private JPanel jpVeggieSkillet;
    private JPanel jpFishTacos;
    private JPanel jpFishChips;
    private JPanel jp2x2x;
    private JPanel jp4PFChicken;
    private JPanel jp4PFChiVeggies;
    private JPanel jpMenu;
    private JTextArea taPrint;
    private JButton btnDelete;
    private JTextField tfpayment;
    private JButton btnPay;
    private JPanel jpFunctions;
    private JPanel jpMenuFunctions;
    private JButton logoutButton;
    private JButton exitButton;
    private JTable jtItems;
    private JSpinner spinQuantity;
    private JButton addButton;
    private JRadioButton rbSteakEggs;
    private JRadioButton rbSteakSandwich;
    private JRadioButton rbSteakDinner;
    private JRadioButton rbVeggieSkillet;
    private JRadioButton rbFishTacos;
    private JRadioButton rbFishChips;
    private JRadioButton rb2x2x;
    private JRadioButton rb4PChick;
    private JRadioButton rb4PChickVeg;
    private JLabel jltotal;
    private JLabel jlBalance;
    private JButton orderAgainButton;
    private JLabel stock1;
    private JLabel stock2;
    private JLabel stock3;
    private JLabel stock4;
    private JLabel stock5;
    private JLabel stock6;
    private JLabel stock7;
    private JLabel stock8;
    private JLabel stock9;

    DefaultTableModel model;

    Connection connection;
    int stock[] = new int[9];
    int deleteStock[] = new int[9];

    String itemName = "";
    double price = 0;
    static int receiptNum = 1;

    ButtonGroup buttonGroup = new ButtonGroup();

    DinerOrderPanel(){

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

            //*****************************************************************************************************************
/*
            try {
                ResultSet resultSet1 = statement1.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Eggs\"");
                if(resultSet1.next()){
                    deleteStock[0] = resultSet1.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet2 = statement2.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Sandw\"");
                if(resultSet2.next()){
                    deleteStock[1] = resultSet2.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet3 = statement3.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Dinner\"");
                if(resultSet3.next()){
                    deleteStock[2] = resultSet3.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet4 = statement4.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Veggie Sklt\"");
                if(resultSet4.next()){
                    deleteStock[3] = resultSet4.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet5 = statement5.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish Tacos\"");
                if(resultSet5.next()){
                    deleteStock[4] = resultSet5.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet6 = statement6.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish & Chips\"");
                if(resultSet6.next()){
                    deleteStock[5] = resultSet6.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet7 = statement7.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"2 x 2 x 2\"");
                if(resultSet7.next()){
                    deleteStock[6] = resultSet7.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet8 = statement8.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn\"");
                if(resultSet8.next()){
                    deleteStock[7] = resultSet8.getInt("stock");
                }
            }catch(Exception e){}

            try {
                ResultSet resultSet9 = statement9.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn Veg\"");
                if(resultSet9.next()){
                    deleteStock[8] = resultSet9.getInt("stock");
                }
            }catch(Exception e){}
*/

        }catch(Exception i){
            System.out.println(i.getMessage());
        }

        stock1.setText("Stock: "+stock[0]);
        stock2.setText("Stock: "+stock[1]);
        stock3.setText("Stock: "+stock[2]);
        stock4.setText("Stock: "+stock[3]);
        stock5.setText("Stock: "+stock[4]);
        stock6.setText("Stock: "+stock[5]);
        stock7.setText("Stock: "+stock[6]);
        stock8.setText("Stock: "+stock[7]);
        stock9.setText("Stock: "+stock[8]);

        if(stock[0] == 0){
            rbSteakEggs.setEnabled(false);
        }else{
            rbSteakEggs.setEnabled(true);
        }
        if(stock[1] == 0){
            rbSteakSandwich.setEnabled(false);
        }else{
            rbSteakSandwich.setEnabled(true);
        }
        if(stock[2] == 0){
            rbSteakDinner.setEnabled(false);
        }else{
            rbSteakDinner.setEnabled(true);
        }
        if(stock[3] == 0){
            rbVeggieSkillet.setEnabled(false);
        }else{
            rbVeggieSkillet.setEnabled(true);
        }
        if(stock[4] == 0){
            rbFishTacos.setEnabled(false);
        }else{
            rbFishTacos.setEnabled(true);
        }
        if(stock[5] == 0){
            rbFishChips.setEnabled(false);
        }else{
            rbFishChips.setEnabled(true);
        }
        if(stock[6] == 0){
            rb2x2x.setEnabled(false);
        }else{
            rb2x2x.setEnabled(true);
        }
        if(stock[7] == 0){
            rb4PChick.setEnabled(false);
        }else{
            rb4PChick.setEnabled(true);
        }
        if(stock[8] == 0){
            rb4PChickVeg.setEnabled(false);
        }else{
            rb4PChickVeg.setEnabled(true);
        }

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Diner");
        this.setContentPane(dinerOrderPanel);
        this.setMinimumSize(new Dimension(1280,760));
        //this.setMinimumSize(new Dimension(1045,548));
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        //setUndecorated(true);

        jtItems.setModel(new DefaultTableModel(
                null,
                new String[]{"Items","Price","Quantity","Total"}
        ));

        buttonGroup.add(rbSteakEggs);
        buttonGroup.add(rbVeggieSkillet);
        buttonGroup.add(rb2x2x);
        buttonGroup.add(rbSteakSandwich);
        buttonGroup.add(rbFishTacos);
        buttonGroup.add(rb4PChick);
        buttonGroup.add(rbSteakDinner);
        buttonGroup.add(rbFishChips);
        buttonGroup.add(rb4PChickVeg);

        jltotal.setText(Integer.toString(0));
        jlBalance.setText(Integer.toString(0));

        btnPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double totalBal = Integer.parseInt(jltotal.getText());
                    double paymentBal = Integer.parseInt(tfpayment.getText());

                    double balanceBal = paymentBal - totalBal;

                    if (paymentBal < totalBal) {

                        JOptionPane.showMessageDialog(null,
                                "Insufficient funds",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);

                        tfpayment.setText("");

                    } else if (totalBal == 0 || paymentBal == 0) {

                        JOptionPane.showMessageDialog(null,
                                "No Order",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);

                    } else if (paymentBal == 0) {

                        JOptionPane.showMessageDialog(null,
                                "No Order",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);

                        tfpayment.setText(Integer.toString(0));

                    } else if (totalBal == 0) {

                        JOptionPane.showMessageDialog(null,
                                "No Order",
                                "Try again",
                                JOptionPane.ERROR_MESSAGE);

                        tfpayment.setText(Integer.toString(0));

                    } else {

                        jlBalance.setText(String.valueOf(balanceBal));

                        int lastid = 0;
                        double studentDiscount = .10;
                        double seniorDiscount = .15;

                        String responses[] = {"Senior","Student","Regular"};
                        int discount = JOptionPane.showOptionDialog(null,
                                "Avail Discount",
                                "Discount",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                responses,
                                0);

                        try {
                            model = (DefaultTableModel) jtItems.getModel();

                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydiner", "root", "root");
                            PreparedStatement preparedStatement;
                            PreparedStatement preparedStatement1 = null;

                            String total = jltotal.getText();
                            String balance = jlBalance.getText();
                            String payment = tfpayment.getText();

                            String sql = "INSERT INTO `sales`(`subtotal`, `payment`, `balance`) VALUES (?,?,?)";
                            preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                            preparedStatement.setString(1, total);
                            preparedStatement.setString(2, payment);
                            preparedStatement.setString(3, balance);
                            preparedStatement.executeUpdate();

                            ResultSet resultSet = preparedStatement.getGeneratedKeys();

                            if (resultSet.next()) {
                                lastid = resultSet.getInt(1);
                            }
                            int row = jtItems.getRowCount();

                            String sql1 = "INSERT INTO `sales_product`(`sales_id`, `productname`, `price`, `quantity`, `total`) VALUES (?,?,?,?,?)";
                            preparedStatement1 = connection.prepareStatement(sql1);

                            String productName = "";
                            double price;
                            int quantity;
                            int totalDB;

                            for (int i = 0; i < jtItems.getRowCount(); i++) {
                                productName = (String) jtItems.getValueAt(i, 0);
                                price = (double) jtItems.getValueAt(i, 1);
                                quantity = (int) jtItems.getValueAt(i, 2);
                                totalDB = (int) jtItems.getValueAt(i, 3);

                                preparedStatement1.setInt(1, lastid);
                                preparedStatement1.setString(2, productName);
                                preparedStatement1.setInt(3, (int) price);
                                preparedStatement1.setInt(4, quantity);
                                preparedStatement1.setInt(5, totalDB);
                                preparedStatement1.executeUpdate();

                            }

                            taPrint.setText(taPrint.getText() + "                                        Receipt# " + receiptNum + "\n");
                            taPrint.setText(taPrint.getText() + "_______________________________________\n");
                            taPrint.setText(taPrint.getText() + "Date: (to be added)\n");
                            taPrint.setText(taPrint.getText() + "Served By: James\n");
                            taPrint.setText(taPrint.getText() + "Lourdini's Diner\n");
                            taPrint.setText(taPrint.getText() + "_______________________________________\n");

                            taPrint.setText(taPrint.getText() + "\n");
                            taPrint.setText(taPrint.getText() + "Item" + "\t" + "Qty" + "\t" + "Price\n");

                            for (int i = 0; i < jtItems.getRowCount(); i++) {

                                String name = model.getValueAt(i, 0).toString();
                                String priceR = model.getValueAt(i, 1).toString();
                                String quantityR = model.getValueAt(i, 2).toString();

                                taPrint.setText(taPrint.getText() + name + "\t" + quantityR + "\t" + priceR + "\n");

                            }
                            taPrint.setText(taPrint.getText() + "Total\t\t" + totalBal + "\n");
                            taPrint.setText(taPrint.getText() + "_______________________________________\n");

                            if(discount == 0) {
                                double seniorReceipt = totalBal * seniorDiscount;
                                double remainTotal = totalBal - seniorReceipt;
                                double seniorChange = paymentBal - remainTotal;
                                taPrint.setText(taPrint.getText() + "Senior\n");
                                taPrint.setText(taPrint.getText() + "Cash\t\t" + paymentBal + "\n");
                                taPrint.setText(taPrint.getText() + "Discount\t\t" + seniorReceipt + "\n");
                                taPrint.setText(taPrint.getText() + "Total\t\t" + remainTotal + "\n");
                                taPrint.setText(taPrint.getText() + "Change\t\t" + seniorChange + "\n");
                            }else if(discount == 1){
                                double studentReceipt = totalBal * studentDiscount;
                                double remainTotalS = totalBal - studentReceipt;
                                double seniorChangeS = paymentBal - remainTotalS;
                                taPrint.setText(taPrint.getText() + "Student\n");
                                taPrint.setText(taPrint.getText() + "Cash\t\t" + paymentBal + "\n");
                                taPrint.setText(taPrint.getText() + "Discount\t\t" + studentReceipt + "\n");
                                taPrint.setText(taPrint.getText() + "Total\t\t" + remainTotalS + "\n");
                                taPrint.setText(taPrint.getText() + "Change\t\t" + seniorChangeS + "\n");
                            }else{
                                taPrint.setText(taPrint.getText() + "Cash\t\t" + paymentBal + "\n");
                                taPrint.setText(taPrint.getText() + "Total\t\t" + totalBal + "\n");
                                taPrint.setText(taPrint.getText() + "Change\t\t" + balanceBal + "\n");
                            }

                            receiptNum++;

                            model.setRowCount(0);
                            jltotal.setText(Integer.toString(0));
                            jlBalance.setText(Integer.toString(0));
                            tfpayment.setText("");

                            JOptionPane.showMessageDialog(null, "Sales Completed");

                        } catch (Exception i) {
                            JOptionPane.showMessageDialog(null, i);
                        }

                    }

                }catch(NumberFormatException ei){
                    JOptionPane.showMessageDialog(null,
                            "No Payment",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydiner", "root", "root");
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
                    }catch(Exception e2){}

                    try {
                        ResultSet resultSet3 = statement3.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Dinner\"");
                        if(resultSet3.next()){
                            stock[2] = resultSet3.getInt("stock");
                        }
                    }catch(Exception e3){}

                    try {
                        ResultSet resultSet4 = statement4.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Veggie Sklt\"");
                        if(resultSet4.next()){
                            stock[3] = resultSet4.getInt("stock");
                        }
                    }catch(Exception e4){}

                    try {
                        ResultSet resultSet5 = statement5.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish Tacos\"");
                        if(resultSet5.next()){
                            stock[4] = resultSet5.getInt("stock");
                        }
                    }catch(Exception e5){}

                    try {
                        ResultSet resultSet6 = statement6.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish & Chips\"");
                        if(resultSet6.next()){
                            stock[5] = resultSet6.getInt("stock");
                        }
                    }catch(Exception e6){}

                    try {
                        ResultSet resultSet7 = statement7.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"2 x 2 x 2\"");
                        if(resultSet7.next()){
                            stock[6] = resultSet7.getInt("stock");
                        }
                    }catch(Exception e7){}

                    try {
                        ResultSet resultSet8 = statement8.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn\"");
                        if(resultSet8.next()){
                            stock[7] = resultSet8.getInt("stock");
                        }
                    }catch(Exception e8){}

                    try {
                        ResultSet resultSet9 = statement9.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn Veg\"");
                        if(resultSet9.next()){
                            stock[8] = resultSet9.getInt("stock");
                        }
                    }catch(Exception e9){}

                }catch (Exception e2){

                }

                int quantity = Integer.parseInt(spinQuantity.getValue().toString());

                if (rbSteakEggs.isSelected() == false && rbVeggieSkillet.isSelected() == false && rb2x2x.isSelected() == false && rbSteakSandwich.isSelected() == false &&
                        rbFishTacos.isSelected() == false && rb4PChick.isSelected() == false && rbSteakDinner.isSelected() == false && rbFishChips.isSelected() == false && rb4PChickVeg.isSelected() == false) {

                    JOptionPane.showMessageDialog(null,
                            "Please select as least one",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);

                }else if(quantity < 1) {
                    JOptionPane.showMessageDialog(null,
                            "Please select quantity",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rbSteakEggs.isSelected() == true && quantity > stock[0]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[0],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rbSteakSandwich.isSelected() == true && quantity > stock[1]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[1],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rbSteakDinner.isSelected() == true && quantity > stock[2]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[2],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rbVeggieSkillet.isSelected() == true && quantity > stock[3]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[3],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rbFishTacos.isSelected() == true && quantity > stock[4]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[4],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rbFishChips.isSelected() == true && quantity > stock[5]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[5],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rb2x2x.isSelected() == true && quantity > stock[6]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[6],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rb4PChick.isSelected() == true && quantity > stock[7]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[7],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else if(rb4PChickVeg.isSelected() == true && quantity > stock[8]){
                    JOptionPane.showMessageDialog(null,
                            "Remaining Stock: "+stock[8],
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    spinQuantity.setValue(0);
                }else{
                    if (rbSteakEggs.isSelected() == true) {
                        itemName = "Steak & Eggs";
                        price = 100;
                    } else if (rbVeggieSkillet.isSelected() == true) {
                        itemName = "Veggie Sklt";
                        price = 100;
                    } else if (rb2x2x.isSelected() == true) {
                        itemName = "2 x 2 x 2";
                        price = 100;
                    } else if (rbSteakSandwich.isSelected() == true) {
                        itemName = "Steak Sandw";
                        price = 150;
                    } else if (rbFishTacos.isSelected() == true) {
                        itemName = "Fish Tacos";
                        price = 150;
                    } else if (rb4PChick.isSelected() == true) {
                        itemName = "4P Chkn";
                        price = 150;
                    } else if (rbSteakDinner.isSelected() == true) {
                        itemName = "Steak Dinner";
                        price = 200;
                    } else if (rbFishChips.isSelected() == true) {
                        itemName = "Fish & Chips";
                        price = 200;
                    } else if (rb4PChickVeg.isSelected() == true) {
                        itemName = "4P Chkn Veg";
                        price = 200;
                    }

                    try{
                        if(rbSteakEggs.isSelected() == true){
                            stock[0] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[0] + " WHERE item_name = \"Steak Eggs\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }else if(rbSteakSandwich.isSelected() == true){
                            stock[1] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[1] + " WHERE item_name = \"Steak Sandw\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }else if(rbSteakDinner.isSelected() == true){
                            stock[2] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[2] + " WHERE item_name = \"Steak Dinner\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }else if(rbVeggieSkillet.isSelected() == true){
                            stock[3] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[3] + " WHERE item_name = \"Veggie Sklt\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }else if(rbFishTacos.isSelected() == true){
                            stock[4] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[4] + " WHERE item_name = \"Fish Tacos\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }else if(rbFishChips.isSelected() == true){
                            stock[5] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[5] + " WHERE item_name = \"Fish & Chips\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }else if(rb2x2x.isSelected() == true){
                            stock[6] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[6] + " WHERE item_name = \"2 x 2 x 2\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }else if(rb4PChick.isSelected() == true){
                            stock[7] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[7] + " WHERE item_name = \"4P Chkn\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }else if(rb4PChickVeg.isSelected() == true) {
                            stock[8] -= quantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + stock[8] + " WHERE item_name = \"4P Chkn Veg\"");
                            p.execute();
                            p.close();
                            spinQuantity.setValue(0);
                        }

                        stock1.setText("Stock: "+stock[0]);
                        stock2.setText("Stock: "+stock[1]);
                        stock3.setText("Stock: "+stock[2]);
                        stock4.setText("Stock: "+stock[3]);
                        stock5.setText("Stock: "+stock[4]);
                        stock6.setText("Stock: "+stock[5]);
                        stock7.setText("Stock: "+stock[6]);
                        stock8.setText("Stock: "+stock[7]);
                        stock9.setText("Stock: "+stock[8]);

                    }catch(Exception e4){}

                    if(stock[0] == 0){
                        rbSteakEggs.setEnabled(false);
                    }else{
                        rbSteakEggs.setEnabled(true);
                    }
                    if(stock[1] == 0){
                        rbSteakSandwich.setEnabled(false);
                    }else{
                        rbSteakSandwich.setEnabled(true);
                    }
                    if(stock[2] == 0){
                        rbSteakDinner.setEnabled(false);
                    }else{
                        rbSteakDinner.setEnabled(true);
                    }
                    if(stock[3] == 0){
                        rbVeggieSkillet.setEnabled(false);
                    }else{
                        rbVeggieSkillet.setEnabled(true);
                    }
                    if(stock[4] == 0){
                        rbFishTacos.setEnabled(false);
                    }else{
                        rbFishTacos.setEnabled(true);
                    }
                    if(stock[5] == 0){
                        rbFishChips.setEnabled(false);
                    }else{
                        rbFishChips.setEnabled(true);
                    }
                    if(stock[6] == 0){
                        rb2x2x.setEnabled(false);
                    }else{
                        rb2x2x.setEnabled(true);
                    }
                    if(stock[7] == 0){
                        rb4PChick.setEnabled(false);
                    }else{
                        rb4PChick.setEnabled(true);
                    }
                    if(stock[8] == 0){
                        rb4PChickVeg.setEnabled(false);
                    }else{
                        rb4PChickVeg.setEnabled(true);
                    }

                    int total = (int) (quantity * price);

                    model = (DefaultTableModel)jtItems.getModel();

                    model.addRow(new Object[]{
                            itemName,
                            price,
                            quantity,
                            total,
                    });

                    buttonGroup.clearSelection();
                    spinQuantity.setValue(0);

                    int sum = 0;

                    for(int a=0 ; a<jtItems.getRowCount() ; a++){
                        sum = sum + Integer.parseInt(jtItems.getValueAt(a,3).toString());
                    }

                    jltotal.setText(Integer.toString(sum));

                }


            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int columnName = 0;
                    int columnQuantity = 2;
                    int row = jtItems.getSelectedRow();
                    String valueName = model.getValueAt(row, columnName).toString();
                    int valueQuantity = Integer.parseInt(model.getValueAt(row, columnQuantity).toString());

                    try {
                        int sum = 0;
                        model.removeRow(jtItems.getSelectedRow());

                        for (int a = 0; a < jtItems.getRowCount(); a++) {
                            sum = sum + Integer.parseInt(jtItems.getValueAt(a, 3).toString());
                        }

                        jltotal.setText(Integer.toString(sum));


                        if (valueName.equals("Steak & Eggs")) {
                            int resultQuantity = stock[0] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"Steak Eggs\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        } else if (valueName.equals("Steak Sandw")) {
                            int resultQuantity = stock[1] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"Steak Sandw\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        } else if (valueName.equals("Steak Dinner")) {
                            int resultQuantity = stock[2] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"Steak Dinner\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        } else if (valueName.equals("Veggie Sklt")) {
                            int resultQuantity = stock[3] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"Veggie Sklt\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        } else if (valueName.equals("Fish Tacos")) {
                            int resultQuantity = stock[4] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"Fish Tacos\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        } else if (valueName.equals("Fish & Chips")) {
                            int resultQuantity = stock[5] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"Fish & Chips\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        } else if (valueName.equals("2 x 2 x 2")) {
                            int resultQuantity = stock[6] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"2 x 2 x 2\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        } else if (valueName.equals("4P Chkn")) {
                            int resultQuantity = stock[7] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"4P Chkn\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        } else if (valueName.equals("4P Chkn Veg")) {
                            int resultQuantity = stock[8] + valueQuantity;
                            PreparedStatement p = connection.prepareStatement("UPDATE `stocks` SET `stock`=" + resultQuantity + " WHERE item_name = \"4P Chkn Veg\"");
                            p.execute();
                            p.close();
                            resultQuantity = 0;
                        }

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
                        }catch(Exception e2){}

                        try {
                            ResultSet resultSet3 = statement3.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Steak Dinner\"");
                            if(resultSet3.next()){
                                stock[2] = resultSet3.getInt("stock");
                            }
                        }catch(Exception e3){}

                        try {
                            ResultSet resultSet4 = statement4.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Veggie Sklt\"");
                            if(resultSet4.next()){
                                stock[3] = resultSet4.getInt("stock");
                            }
                        }catch(Exception e4){}

                        try {
                            ResultSet resultSet5 = statement5.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish Tacos\"");
                            if(resultSet5.next()){
                                stock[4] = resultSet5.getInt("stock");
                            }
                        }catch(Exception e5){}

                        try {
                            ResultSet resultSet6 = statement6.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"Fish & Chips\"");
                            if(resultSet6.next()){
                                stock[5] = resultSet6.getInt("stock");
                            }
                        }catch(Exception e6){}

                        try {
                            ResultSet resultSet7 = statement7.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"2 x 2 x 2\"");
                            if(resultSet7.next()){
                                stock[6] = resultSet7.getInt("stock");
                            }
                        }catch(Exception e7){}

                        try {
                            ResultSet resultSet8 = statement8.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn\"");
                            if(resultSet8.next()){
                                stock[7] = resultSet8.getInt("stock");
                            }
                        }catch(Exception e8){}

                        try {
                            ResultSet resultSet9 = statement9.executeQuery("SELECT * FROM `stocks` WHERE item_name =  \"4P Chkn Veg\"");
                            if(resultSet9.next()){
                                stock[8] = resultSet9.getInt("stock");
                            }
                        }catch(Exception e9){}

                        stock1.setText("Stock: "+stock[0]);
                        stock2.setText("Stock: "+stock[1]);
                        stock3.setText("Stock: "+stock[2]);
                        stock4.setText("Stock: "+stock[3]);
                        stock5.setText("Stock: "+stock[4]);
                        stock6.setText("Stock: "+stock[5]);
                        stock7.setText("Stock: "+stock[6]);
                        stock8.setText("Stock: "+stock[7]);
                        stock9.setText("Stock: "+stock[8]);

                        if(stock[0] == 0){
                            rbSteakEggs.setEnabled(false);
                        }else{
                            rbSteakEggs.setEnabled(true);
                        }
                        if(stock[1] == 0){
                            rbSteakSandwich.setEnabled(false);
                        }else{
                            rbSteakSandwich.setEnabled(true);
                        }
                        if(stock[2] == 0){
                            rbSteakDinner.setEnabled(false);
                        }else{
                            rbSteakDinner.setEnabled(true);
                        }
                        if(stock[3] == 0){
                            rbVeggieSkillet.setEnabled(false);
                        }else{
                            rbVeggieSkillet.setEnabled(true);
                        }
                        if(stock[4] == 0){
                            rbFishTacos.setEnabled(false);
                        }else{
                            rbFishTacos.setEnabled(true);
                        }
                        if(stock[5] == 0){
                            rbFishChips.setEnabled(false);
                        }else{
                            rbFishChips.setEnabled(true);
                        }
                        if(stock[6] == 0){
                            rb2x2x.setEnabled(false);
                        }else{
                            rb2x2x.setEnabled(true);
                        }
                        if(stock[7] == 0){
                            rb4PChick.setEnabled(false);
                        }else{
                            rb4PChick.setEnabled(true);
                        }
                        if(stock[8] == 0){
                            rb4PChickVeg.setEnabled(false);
                        }else{
                            rb4PChickVeg.setEnabled(true);
                        }


                    } catch (Exception e1) {

                    }

                }catch (Exception e2){

                }
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to logout?","Logout",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
                if(answer == 0){
                    dispose();
                    LoginPanel loginPanel = new LoginPanel();
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
                if(answer == 0){
                    dispose();
                }
            }
        });


        orderAgainButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                spinQuantity.setValue(0);
                    try {
                        taPrint.setText("");
                        jltotal.setText(Integer.toString(0));
                        jlBalance.setText(Integer.toString(0));
                        model.setRowCount(0);
                        spinQuantity.setValue(0);
                    }catch (Exception e2){

                    }

            }
        });


        jpSteakEggs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rbSteakEggs.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakEggs.setBackground(Color.lightGray);
                rbSteakEggs.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakEggs.setBackground(Color.white);
                rbSteakEggs.setBackground(Color.white);
            }
        });
        jpSteakSandwich.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rbSteakSandwich.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakSandwich.setBackground(Color.lightGray);
                rbSteakSandwich.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakSandwich.setBackground(Color.white);
                rbSteakSandwich.setBackground(Color.white);
            }
        });
        jpSteakDinner.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rbSteakDinner.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakDinner.setBackground(Color.lightGray);
                rbSteakDinner.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakDinner.setBackground(Color.white);
                rbSteakDinner.setBackground(Color.white);
            }
        });
        jpFishTacos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rbFishTacos.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpFishTacos.setBackground(Color.lightGray);
                rbFishTacos.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jpFishTacos.setBackground(Color.white);
                rbFishTacos.setBackground(Color.white);
            }
        });
        jpFishChips.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rbFishChips.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpFishChips.setBackground(Color.lightGray);
                rbFishChips.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jpFishChips.setBackground(Color.white);
                rbFishChips.setBackground(Color.white);
            }
        });
        jpVeggieSkillet.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rbVeggieSkillet.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpVeggieSkillet.setBackground(Color.lightGray);
                rbVeggieSkillet.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jpVeggieSkillet.setBackground(Color.white);
                rbVeggieSkillet.setBackground(Color.white);
            }
        });
        jp4PFChiVeggies.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rb4PChickVeg.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jp4PFChiVeggies.setBackground(Color.lightGray);
                rb4PChickVeg.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jp4PFChiVeggies.setBackground(Color.white);
                rb4PChickVeg.setBackground(Color.white);
            }
        });
        jp4PFChicken.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rb4PChick.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jp4PFChicken.setBackground(Color.lightGray);
                rb4PChick.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jp4PFChicken.setBackground(Color.white);
                rb4PChick.setBackground(Color.white);
            }
        });
        jp2x2x.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rb2x2x.doClick();
            }
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jp2x2x.setBackground(Color.lightGray);
                rb2x2x.setBackground(Color.lightGray);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                jp2x2x.setBackground(Color.white);
                rb2x2x.setBackground(Color.white);
            }
        });



        setVisible(true);

    }



}
