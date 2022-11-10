import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JFrame = a GUI window to add components to
/*
    //Creates a frame
        JFrame frame = new JFrame();

    //Sets title of frame
        frame.setTitle("JFrame title goes here");

    //Exit out of application (default: HIDE_ON_CLOSE)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Prevent Frame from being resized
        frame.setResizable(false);

    //Sets the x and y dimensions
        frame.setSize(420,420);

    //Make frame visible
        frame.setVisible(true);

    //Create an ImageIcon
        ImageIcon image = new ImageIcon("logo.png");
    //Change icon of frame
        frame.setIconImage(image.getImage());

    //Change color of background
        frame.getContentPane().setBackground(Color.cyan);
    //RGB Values (Range: 0-255)
        frame.getContentPane().setBackground(new Color(255,255,255));
    //Using Hex Values (0x + hexValue)
        frame.getContentPane().setBackground(new Color(0x2B2B2B));
*/

    MyFrame frame = new MyFrame();

    }

}