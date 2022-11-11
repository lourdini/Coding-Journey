import javax.swing.*;
import javax.swing.border.Border;
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

        // JLabel = a GUI display area for a string of text, an image, or both
/*
    //Create a label
        JLabel label = new JLabel();

    //Set text of label
        label.setText("Bro, do you even code?");

        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);


    //Set text LEFT, CENTER, RIGHT of ImageIcon
        label.setHorizontalTextPosition(JLabel.CENTER);

    //Set text TOP, CENTER, BOTTOM of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP);

    //Set font color of text
        label.setForeground(new Color(255,255,255));
    //Set font of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
    //Set gap of text to image
        label.setIconTextGap(-35);
    //Set background color
        label.setBackground(new Color(0x2B2B2B));
    //Display background color
        label.setOpaque(true);
    //Set Border
        label.setBorder(border);
    //Set vertical position of icon+text within label
        label.setVerticalAlignment(JLabel.CENTER);
    //Set horizontal position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);
    //Set x,y position within frame as well as dimensions
        label.setBounds(100,100,250,250);

        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

    //Turn on Bounds
        frame.setLayout(null);

        frame.setVisible(true);
        frame.add(label);
        frame.getContentPane().setBackground(new Color(0x3C3F41));
        //frame.pack();
*/

        // JPanel = a GUI component that functions as a container to hold other components
/*
        ImageIcon icon = new ImageIcon("like.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);

    //Use when using border layout manager
    //Not needed is using null layout manager
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);

        label.setForeground(Color.WHITE);
        label.setBounds(100,100,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);

    //Set to default layout
        //redPanel.setLayout(new BorderLayout());
    //Set to null layout
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);

    //Set to default layout
        //bluePanel.setLayout(new BorderLayout());
    //Set to null layout
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);

    //Set to default layout
        //greenPanel.setLayout(new BorderLayout());
    //Set to null layout
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);

    //Adding labels to panels
        bluePanel.add(label);

        frame.getContentPane().setBackground(new Color(0x3C3F41));
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
*/

        //JButton = a button that performs an action when clicked on
/*
        new MyFrame();
*/

        //Layout Manager - Defines the natural layout for components within a container

    //3 common managers

    //BorderLayout = A BorderLayout places components in five areas: NORTH,SOUTH,WEST,EAST,CENTER.
    //               All extra space is placed in the center area.
/*
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100,50));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,50));
        panel5.setPreferredSize(new Dimension(100,100));

        //----------------------subpanels----------------------------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.SOUTH);
        panel5.add(panel10,BorderLayout.CENTER);


        //--------------------subpanels----------------------------

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
*/

    //FlowLayout   = Places components in a row, sized at their preferred size.
    //               If the horizontal space in the container is too small,
    //               the FlowLayout class uses the next available row.
/*
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        //JButton button1 = new JButton();

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
*/


    }

}