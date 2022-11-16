import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DinerOrderPanel extends JFrame {
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
    private JTable table1;
    private JTextArea textArea1;
    private JButton btnDelete;
    private JTextField textField1;
    private JButton btnPay;
    private JButton btnPrint;
    private JPanel jpFunctions;
    private JPanel jpMenuFunctions;
    private JButton logoutButton;
    private JButton exitButton;

    DinerOrderPanel(){
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Diner");
        this.setContentPane(dinerOrderPanel);
        this.setMinimumSize(new Dimension(1045,548));
        setLocationRelativeTo(null);

        //this.setUndecorated(true);

        jpSteakEggs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jpSteakEggs.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakEggs.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jpSteakEggs.setBackground(Color.WHITE);
            }
        });

        jpSteakSandwich.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jpSteakSandwich.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakSandwich.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jpSteakSandwich.setBackground(Color.WHITE);
            }
        });

        jpSteakDinner.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jpSteakDinner.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpSteakDinner.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jpSteakDinner.setBackground(Color.WHITE);
            }
        });

        jpVeggieSkillet.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jpVeggieSkillet.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpVeggieSkillet.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jpVeggieSkillet.setBackground(Color.WHITE);
            }
        });

        jpFishTacos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jpFishTacos.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpFishTacos.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jpFishTacos.setBackground(Color.WHITE);
            }
        });

        jpFishChips.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jpFishChips.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jpFishChips.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jpFishChips.setBackground(Color.WHITE);
            }
        });

        jp2x2x.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jp2x2x.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jp2x2x.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jp2x2x.setBackground(Color.WHITE);
            }
        });

        jp4PFChicken.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jp4PFChicken.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jp4PFChicken.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jp4PFChicken.setBackground(Color.WHITE);
            }
        });

        jp4PFChiVeggies.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jp4PFChiVeggies.setBackground(Color.gray);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                jp4PFChiVeggies.setBackground(new Color(0xe5e5e5));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jp4PFChiVeggies.setBackground(Color.WHITE);
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

        setVisible(true);
    }


}
