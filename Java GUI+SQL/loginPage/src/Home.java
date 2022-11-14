import javax.swing.*;
import java.awt.*;

public class Home extends JFrame{

    private JPanel homePane;

    Home() {
        setTitle("Home");
        setContentPane(homePane);
        //this.setUndecorated(true);
        setMinimumSize(new Dimension(800, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);
    }

}
