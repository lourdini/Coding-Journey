import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JFrame
//public class MyFrame extends JFrame{

//JButton
public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    JLabel label;

    MyFrame(){

        //Other way to create JFrame
/*
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500,500);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x2B2B2B));
*/

        //JButton
/*
        ImageIcon icon = new ImageIcon("like.png");
        ImageIcon shock = new ImageIcon("shocked.png");

        label = new JLabel();
        label.setIcon(shock);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("Press");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(0);
        button.setForeground(Color.YELLOW);
        button.setBackground(new Color(0x374752));

    //Disable button
        //button.setEnabled(false);

    //Border Presets
        button.setBorder(BorderFactory.createEtchedBorder());

    //Get rid of annoying box on buttons
        button.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
*/

        //JTextField

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);

    //Set color to cursor
        textField.setCaretColor(Color.WHITE);

        textField.setText("Username");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        if(e.getSource() == button){
            //System.out.println("Clicked");
        //Can only be clicked once
            //button.setEnabled(false);

            label.setVisible(true);
        }
         */
        if(e.getSource()==button){
            System.out.println("Welcome "+textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }

    }
}
