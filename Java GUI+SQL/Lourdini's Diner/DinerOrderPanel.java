import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

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
    private JTextArea textArea1;
    private JButton btnDelete;
    private JTextField textField1;
    private JButton btnPay;
    private JButton btnPrint;
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

    DefaultTableModel model;

    String itemName = "";
    double price = 0;

    DinerOrderPanel(){

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Diner");
        this.setContentPane(dinerOrderPanel);
        //this.setMinimumSize(new Dimension(1280,720));
        //this.setMinimumSize(new Dimension(1045,548));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);

        jtItems.setModel(new DefaultTableModel(
                null,
                new String[]{"Items","Price","Quantity","Total"}
        ));

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rbSteakEggs);
        buttonGroup.add(rbVeggieSkillet);
        buttonGroup.add(rb2x2x);
        buttonGroup.add(rbSteakSandwich);
        buttonGroup.add(rbFishTacos);
        buttonGroup.add(rb4PChick);
        buttonGroup.add(rbSteakDinner);
        buttonGroup.add(rbFishChips);
        buttonGroup.add(rb4PChickVeg);
        

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

                }else if(quantity == 0){
                    JOptionPane.showMessageDialog(null,
                            "Please select quantity",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                }else{
                    if (rbSteakEggs.isSelected() == true) {
                        itemName = "Steak and Eggs";
                        price = 100;
                    } else if (rbVeggieSkillet.isSelected() == true) {
                        itemName = "Veggie Skillet";
                        price = 100;
                    } else if (rb2x2x.isSelected() == true) {
                        itemName = "2 x 2 x 2";
                        price = 100;
                    } else if (rbSteakSandwich.isSelected() == true) {
                        itemName = "Steak Sandwich";
                        price = 150;
                    } else if (rbFishTacos.isSelected() == true) {
                        itemName = "Fish Tacos";
                        price = 150;
                    } else if (rb4PChick.isSelected() == true) {
                        itemName = "4P Chicken";
                        price = 150;
                    } else if (rbSteakDinner.isSelected() == true) {
                        itemName = "Steak Dinner";
                        price = 200;
                    } else if (rbFishChips.isSelected() == true) {
                        itemName = "Fish and Chips";
                        price = 200;
                    } else if (rb4PChickVeg.isSelected() == true) {
                        itemName = "4P Chicken Veggies";
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

                    jltotal.setText("₱ "+Integer.toString(sum));

                }


            }
        });

        setVisible(true);
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                model.removeRow(jtItems.getSelectedRow());

                for(int a=0 ; a<jtItems.getRowCount() ; a++){
                    sum = sum + Integer.parseInt(jtItems.getValueAt(a,3).toString());
                }

                jltotal.setText("₱ "+Integer.toString(sum));

            }
        });
    }



}
