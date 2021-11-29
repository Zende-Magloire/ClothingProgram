import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    //menu
    private JMenuBar Menu_bar;
    private JMenu Crochet;
    private JMenu Customized_design;
    //user input info
    private JPanel InfoInput;
    private JTextField Design;
    private JTextField Bust;
    private JTextField Hips;
    private JTextField Waist;
    private JButton [] Sizes;
    private JButton Review;
    private JPanel C_InfoInput;
    private JTextField Length;
    private JTextField Width;
    private JButton [] C_Sizes;
    private JButton C_Review;
    //sign in
    private JTextField LBL_Username;
    private JTextField LBL_Password;
    private JButton BTN_login;

    public  static void main (String [] args)
{
    EventQueue.invokeLater(
            new Runnable()
            {
                @Override
                public void run()
                {
                    new GUI();
                }
            }
    );
}

public GUI()
{
    //set up GUI
    GUISetUp();
}

private void GUISetUp() {
    //frame set up
    setTitle("Zen's Designs");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);

    //log in panel
    JPanel topPanel = new JPanel();
    LBL_Username = new JTextField(15);
    LBL_Password = new JTextField(15);
    BTN_login = new JButton("Sign in");
    BTN_login.addActionListener(this);
    topPanel.add(new JLabel("Username: "));
    topPanel.add(LBL_Username);
    topPanel.add(new JLabel("Password: "));
    topPanel.add(LBL_Password);
    topPanel.add(BTN_login);
    add(topPanel, BorderLayout.PAGE_START);

    //welcome message
    JPanel Welcome_m = new JPanel();
    Welcome_m.add(new JLabel("Welcome to Zen's Designs! Sign in to shop with rewards or select an item from" +
            " the menu to continue."));
    add(Welcome_m, BorderLayout.CENTER);

    // menu set up
    Menu_bar = new JMenuBar();
    Crochet = new JMenu("Crochet");
    Customized_design = new JMenu("Custom design");

    //crochet menu set up
    JMenuItem top = new JMenuItem("Top");
    top.addActionListener(this);
    Crochet.add(top);
    JMenuItem bottom = new JMenuItem("Bottom");
    bottom.addActionListener(this);
    Crochet.add(bottom);
    JMenuItem swimsuit = new JMenuItem("Swimsuit");
    swimsuit.addActionListener(this);
    Crochet.add(swimsuit);
    Menu_bar.add(Crochet);

    //Custom menu set up
    JMenuItem C_top = new JMenuItem("Top");
    C_top.addActionListener(this);
    Customized_design.add(C_top);
    JMenuItem C_bottom = new JMenuItem("Bottom");
    C_bottom.addActionListener(this);
    Customized_design.add(C_bottom);
    JMenuItem C_swimsuit = new JMenuItem("Swimsuit");
    C_swimsuit.addActionListener(this);
    Customized_design.add(C_swimsuit);
    JMenuItem dress = new JMenuItem("Dress");
    dress.addActionListener(this);
    Customized_design.add(dress);
    JMenuItem other = new JMenuItem("Other");
    other.addActionListener(this);
    Customized_design.add(other);
    Menu_bar.add(Customized_design);

    //info input GUI for crochet
    JPanel InfoInput = new JPanel();
    Design = new JTextField(85);
    //clothing description
    InfoInput.add(new JLabel("Please enter a detailed description of your desired design"));
    InfoInput.add(Design);
    //measurements
    Bust = new JTextField(5);
    InfoInput.add(new JLabel("Please enter your bust measurement (inches)"));
    InfoInput.add(Bust);
    Hips = new JTextField(5);
    InfoInput.add(new JLabel("Please enter your hip measurement (inches)"));
    InfoInput.add(Hips);
    Waist = new JTextField(5);
    InfoInput.add(new JLabel("Please enter your waist measurement (inches)"));
    InfoInput.add(Waist);
    //size
    InfoInput.add(new JLabel("Please select your clothing size:"));
    Sizes = new JButton[4];
    Sizes[0] = new JButton("Small");
    Sizes[0].addActionListener(this);
    Sizes[1] = new JButton("Medium");
    Sizes[1].addActionListener(this);
    Sizes[2] = new JButton("Large");
    Sizes[2].addActionListener(this);
    Sizes[3] = new JButton("Extra Large");
    Sizes[3].addActionListener(this);
    InfoInput.add(Sizes[0]);
    InfoInput.add(Sizes[1]);
    InfoInput.add(Sizes[2]);
    InfoInput.add(Sizes[3]);
    //review order
    Review = new JButton("Review your order.");
    InfoInput.add(Review);

    //info input GUI for customized clothes
    JPanel C_InfoInput = new JPanel();
    Design = new JTextField(85);
    //clothing description
    C_InfoInput.add(new JLabel("Please enter a detailed description of your desired design"));
    C_InfoInput.add(Design);
    //measurements
    Length = new JTextField(5);
    C_InfoInput.add(new JLabel("Please enter how long you want your design to be (inches)"));
    C_InfoInput.add(Length);
    Width = new JTextField(5);
    C_InfoInput.add(new JLabel("Please enter how wide you want your design to be (inches)"));
    C_InfoInput.add(Width);
    //size
    C_InfoInput.add(new JLabel("Please select your clothing size:"));
    C_Sizes = new JButton[4];
    C_Sizes[0] = new JButton("Small");
    C_Sizes[0].addActionListener(this);
    C_Sizes[1] = new JButton("Medium");
    C_Sizes[1].addActionListener(this);
    C_Sizes[2] = new JButton("Large");
    C_Sizes[2].addActionListener(this);
    C_Sizes[3] = new JButton("Extra Large");
    C_Sizes[3].addActionListener(this);
    C_InfoInput.add(C_Sizes[0]);
    C_InfoInput.add(C_Sizes[1]);
    C_InfoInput.add(C_Sizes[2]);
    C_InfoInput.add(C_Sizes[3]);
    C_Review = new JButton("Review your order.");
    C_InfoInput.add(C_Review);

    add(C_InfoInput, BorderLayout.CENTER);
    setJMenuBar(Menu_bar);

}

    @Override
    public void actionPerformed(ActionEvent e)
    {

        Object source = e.getSource();

        if (source instanceof JButton)
        {
            JButton button = (JButton)source;

            if (button == C_Sizes[0]){
                String price = "Small";
                JOptionPane.showMessageDialog(null, price);
            }
            else if (button == C_Sizes[1]){
                String price = "Medium";
                JOptionPane.showMessageDialog(null, price);
            }
        }
        else if (source instanceof JMenuItem){
            JMenuItem item = (JMenuItem) source;

        }

        //exception handle here

    }

}

