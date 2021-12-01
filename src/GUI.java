import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener
{
    //menu
    private JMenuBar Menu_bar;
    private JMenu Crochet;
    private JMenu Customized_design;
    private JMenuItem top;
    private JMenuItem bottom;
    private JMenuItem swimsuit;
    private JMenuItem C_top;
    private JMenuItem C_bottom;
    private JMenuItem C_swimsuit;
    private JMenuItem dress;
    private JMenuItem other;
    //user input info
    private JPanel InfoInput;
    private JTextField Design;
    private JTextField Bust;
    private JTextField Hips;
    private JTextField Waist;
    private JButton [] Sizes;
    private JButton Review;
    private JPanel C_ReviewPanel;
    private JPanel C_InfoInput;
    private JTextField Length;
    private JTextField Width;
    private JButton [] C_Sizes;
    private JButton C_Review;
    private JPanel Review_Panel;
    //sign in
    private JTextField LBL_Username;
    private JTextField LBL_Password;
    private JButton BTN_login;
    private JPanel Welcome_m;
    private JPanel ViewCart;
    private JButton Cart;

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

    private void GUISetUp()
    {
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

        //view cart
        JPanel ViewCart = new JPanel();
        JButton Cart = new JButton("View cart");
        ViewCart.add(Cart);
        add(ViewCart, BorderLayout.PAGE_END);

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
        //place order
        Review_Panel = new JPanel();
        Review = new JButton("Place order");
        Review_Panel.add(Review);

        //info input GUI for customized clothes
        JPanel C_InfoInput = new JPanel();
        Design = new JTextField(1);
        //clothing description
        C_InfoInput.add(new JLabel("Please enter a detailed description of your desired design"));
        C_InfoInput.add(Design);
        //measurements
        Length = new JTextField(1);
        C_InfoInput.add(new JLabel("Please enter how long you want your design to be (inches)"));
        C_InfoInput.add(Length);
        Width = new JTextField(1);
        C_InfoInput.add(new JLabel("Please enter how wide you want your design to be (inches)"));
        C_InfoInput.add(Width);
        //sizes
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
        //place order
        C_ReviewPanel = new JPanel();
        C_Review = new JButton("Place order");
        C_ReviewPanel.add(C_Review);

        //show menu bar
        setJMenuBar(Menu_bar);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        Object source = e.getSource();

        if (source instanceof JButton)
        {
            JButton button = (JButton)source;

            if (button == BTN_login)
            {
                String welcome = "Welcome to Zen's Designs! Please select your clothing choice " +
                        "from the menu above.";
                JOptionPane.showMessageDialog(null, welcome);
                //if a text field is empty, display error message
            }
//          set prices for crochet
            if (button == Sizes[0])
            {
                Crochet items = new Crochet();
                items.setPrice(10);
            }
            if (button == Sizes[1])
            {
                Crochet items = new Crochet();
                items.setPrice(15);
            }
            if (button == Sizes[2])
            {
                Crochet items = new Crochet();
                items.setPrice(20);
            }
            if (button == Sizes[3])
            {
                Crochet items = new Crochet();
                items.setPrice(25);
            }
//          set prices for custom
            if (button == C_Sizes[0])
            {
                Customize c_items = new Customize();
                c_items.setPrice(15);
            }
            if (button == C_Sizes[1])
            {
                Customize c_items = new Customize();
                c_items.setPrice(20);
            }
            if (button == C_Sizes[2])
            {
                Customize c_items = new Customize();
                c_items.setPrice(25);
            }
            if (button == C_Sizes[3])
            {
                Customize c_items = new Customize();
                c_items.setPrice(30);
            }

            if (button == Review)
            {
                //display order
                //create new button to finalize order
            }
            // if button to finalize order clicked, display thank you for shopping etc

            if (button == Cart)
            {
                //display previous order
            }

        }
        else if (source instanceof JMenu)
        {
            JMenu item = (JMenu) source;

//           if (item == top)
//           {
//              InfoInput.setLayout(new BoxLayout(InfoInput, BoxLayout.PAGE_AXIS));
//              add(InfoInput, BorderLayout.NORTH);
//              add(Review_Panel, BorderLayout.PAGE_END);
//           }
//         if (item == bottom)
//         {
//            C_InfoInput.setLayout(new BoxLayout(InfoInput, BoxLayout.PAGE_AXIS));
//            add(C_InfoInput, BorderLayout.NORTH);
//            add(C_ReviewPanel, BorderLayout.PAGE_END)
//         }
        }

    }

}

