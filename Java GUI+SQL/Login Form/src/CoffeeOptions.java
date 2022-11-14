import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeOptions extends JFrame{

    private JPanel header;
    private JPanel coffeePOS;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton button1;

    CoffeeOptions(){

        this.setTitle("Coffee POS");
        this.setContentPane(coffeePOS);
        this.setMinimumSize(new Dimension(830,570));
        setLocationRelativeTo(null);
        this.setUndecorated(true);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        CoffeeOptions coffee = new CoffeeOptions();
    }

}



