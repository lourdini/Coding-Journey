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

    DefaultTableModel model;

    String itemName = "";
    double price = 0;
    static int receiptNum = 1;

    ButtonGroup buttonGroup = new ButtonGroup();

    DinerOrderPanel(){

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Diner");
        this.setContentPane(dinerOrderPanel);
        //this.setMinimumSize(new Dimension(1280,760));
        this.setMinimumSize(new Dimension(1045,548));
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setUndecorated(true);

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
                    int totalBal = Integer.parseInt(jltotal.getText());
                    int paymentBal = Integer.parseInt(tfpayment.getText());

                    int balanceBal = paymentBal - totalBal;

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
                            taPrint.setText(taPrint.getText() + "_______________________________________\n");
                            taPrint.setText(taPrint.getText() + "Total\t\t" + totalBal + "\n");
                            taPrint.setText(taPrint.getText() + "Change\t\t" + balanceBal + "\n");

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

                int quantity = Integer.parseInt(spinQuantity.getValue().toString());

                if (rbSteakEggs.isSelected() == false && rbVeggieSkillet.isSelected() == false && rb2x2x.isSelected() == false && rbSteakSandwich.isSelected() == false &&
                        rbFishTacos.isSelected() == false && rb4PChick.isSelected() == false && rbSteakDinner.isSelected() == false && rbFishChips.isSelected() == false && rb4PChickVeg.isSelected() == false) {

                    JOptionPane.showMessageDialog(null,
                            "Please select as least one",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);

                }else if(quantity < 1){
                    JOptionPane.showMessageDialog(null,
                            "Please select quantity",
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
                    int sum = 0;
                    model.removeRow(jtItems.getSelectedRow());

                    for (int a = 0; a < jtItems.getRowCount(); a++) {
                        sum = sum + Integer.parseInt(jtItems.getValueAt(a, 3).toString());
                    }

                    jltotal.setText(Integer.toString(sum));
                }catch(Exception e1){

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


                    taPrint.setText("");
                    jltotal.setText(Integer.toString(0));
                    jlBalance.setText(Integer.toString(0));
                    model.setRowCount(0);

            }
        });

        setVisible(true);

    }



}
