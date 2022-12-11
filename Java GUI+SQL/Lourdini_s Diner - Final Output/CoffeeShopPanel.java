import javax.swing.*;
import java.awt.*;

public class CoffeeShopPanel extends JFrame{
    private JPanel mainCoffeePanel;
    private JButton submitButton;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;

    CoffeeShopPanel(){

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Coffee POS");
        this.setContentPane(mainCoffeePanel);

        //1080p
        this.setMinimumSize(new Dimension(640,760));

        //768p
        //this.setMinimumSize(new Dimension(540,660));

        setLocationRelativeTo(null);
        //this.setUndecorated(true);

        setVisible(true);

    }

}
