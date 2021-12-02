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
    private JPanel C_InfoInput;
    private JTextField C_Design;
    private JTextField Length;
    private JTextField Width;
    private JButton [] C_Sizes;
    //sign in
    private JTextField LBL_Username;
    private JTextField LBL_Password;
    private JButton BTN_login;
    private JPanel Welcome_m;
    private JPanel ViewCart;
    private JButton Cart;
    //review and finalize order
    private JButton Review;
    private JPanel Review_Panel;
    private JButton C_Review;
    private JPanel C_ReviewPanel;
    private JButton Final;
    private JPanel FinalPanel;
    private JButton C_Final;
    private JPanel C_FinalPanel;
    private JPanel DisplayPanel;
    private  JPanel C_DisplayPanel;

    private JDialog InfoFrame;


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
       // add(topPanel, BorderLayout.PAGE_START);

        //welcome message
        JPanel Welcome_m = new JPanel();
        Welcome_m.add(new JLabel("Welcome to Zen's Designs! Sign in to shop with rewards or select an item from" +
                " the menu to continue."));
       // add(Welcome_m, BorderLayout.CENTER);

        //view cart
        JPanel ViewCart = new JPanel();
        JButton Cart = new JButton("View cart");
        ViewCart.add(Cart);
        add(ViewCart, BorderLayout.PAGE_END);

        //info input panel layout
        JDialog InfoFrame = new JDialog();
        InfoFrame.setLocation(239, 40);
        InfoFrame.setSize(800, 600);
        InfoFrame.setTitle("Information Input");

        // menu set up
        Menu_bar = new JMenuBar();
        Crochet = new JMenu("Crochet");
        Customized_design = new JMenu("Custom design");

        //crochet menu set up
        JMenuItem top = new JMenuItem("Top");
        Crochet.add(top);
        top.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoFrame.setVisible(true);
            }
        });
        JMenuItem bottom = new JMenuItem("Bottom");
        Crochet.add(bottom);
        bottom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoFrame.setVisible(true);
            }
        });
        JMenuItem swimsuit = new JMenuItem("Swimsuit");
        Crochet.add(swimsuit);
        swimsuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoFrame.setVisible(true);
            }
        });
        Menu_bar.add(Crochet);

        //Custom menu set up
        JMenuItem C_top = new JMenuItem("Top");
        Customized_design.add(C_top);
        C_top.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                InfoFrame.setVisible(true);
            }
        });
        JMenuItem C_bottom = new JMenuItem("Bottom");
        Customized_design.add(C_bottom);
        C_bottom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoFrame.setVisible(true);
            }
        });
        JMenuItem C_swimsuit = new JMenuItem("Swimsuit");
        Customized_design.add(C_swimsuit);
        C_swimsuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoFrame.setVisible(true);
            }
        });
        JMenuItem dress = new JMenuItem("Dress");
        Customized_design.add(dress);
        dress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoFrame.setVisible(true);
            }
        });
        JMenuItem other = new JMenuItem("Other");
        Customized_design.add(other);
        other.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoFrame.setVisible(true);
            }
        });
        Menu_bar.add(Customized_design);

        //info input GUI for crochet
        JPanel InfoInput = new JPanel();
        //clothing description
        Design = new JTextField(1);
        InfoInput.add(new JLabel("Please enter a detailed description of your desired design"));
        InfoInput.add(Design);
        //measurements
        Bust = new JTextField(1);
        InfoInput.add(new JLabel("Please enter your bust measurement (inches)"));
        InfoInput.add(Bust);
        Hips = new JTextField(1);
        InfoInput.add(new JLabel("Please enter your hip measurement (inches)"));
        InfoInput.add(Hips);
        Waist = new JTextField(1);
        InfoInput.add(new JLabel("Please enter your waist measurement (inches)"));
        InfoInput.add(Waist);
        //sizes
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
        Review = new JButton("Proceed to cart");
        Review_Panel.add(Review);
        InfoInput.add(Review_Panel);

        //        InfoFrame.add(InfoInput);

        //review crochet order
        Review.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Crochet order = new Crochet();
                order.setPrice(30);
                order.setDesign(Design.getText());
                order.setBustMeasure(Bust.getText());
                order.setHipsMeasure(Hips.getText());
                order.setWaistMeasure(Waist.getText());
                String Order = "Your order: \nYour Design:\n" + String.valueOf(order.getDesign()) +
                        " \nBust: " + order.getBustMeasure() + "\nHips: " + order.getHipsMeasure() +
                        "\nWaist: " + order.getWaistMeasure() + "\nPrice: $" + order.getPrice();
                JOptionPane pane = new JOptionPane();
                JOptionPane.showMessageDialog(null,Order,"Review your order",
                        JOptionPane.INFORMATION_MESSAGE);
                Object value =  pane.getInputValue();
                System.out.println(pane.getInputValue().toString());
                if(value == JOptionPane.UNINITIALIZED_VALUE)
                {
                    String ThankYou = "Thank you for shopping with Zen's designs. " +
                            "Look out for an email with your tracking information.";
                    JOptionPane.showMessageDialog(null, ThankYou, "Thank You!!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        //info input GUI for customized clothes
        JPanel C_InfoInput = new JPanel();
        //clothing description
        C_Design = new JTextField(1);
        C_InfoInput.add(new JLabel("Please enter a detailed description of your desired design"));
        C_InfoInput.add(C_Design);
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
        C_Review = new JButton("Proceed to cart");
        C_ReviewPanel.add(C_Review);
        C_InfoInput.add(C_ReviewPanel);
        //review customized order
        C_Review.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Customize c_order = new Customize();
                c_order.setPrice(40);
                c_order.setDesign(C_Design.getText());
                c_order.setLength(Length.getText());
                c_order.setWidth(Width.getText());
                String Order = "Your order: \nYour Design:\n" + String.valueOf(c_order.getDesign()) +
                        " \nLength of your design: " + c_order.getLength() + "\nWidth of your design: "
                        + c_order.getWidth() + "\nPrice: $" + c_order.getPrice();
                JOptionPane pane = new JOptionPane();
                JOptionPane.showMessageDialog(null,Order,"Review your order",
                        JOptionPane.INFORMATION_MESSAGE);
                Object value =  pane.getInputValue();
                System.out.println(pane.getInputValue().toString());
                if(value == JOptionPane.UNINITIALIZED_VALUE)
                {
                    String ThankYou = "Thank you for shopping with Zen's designs. " +
                        "Look out for an email with your tracking information.";
                    JOptionPane.showMessageDialog(null, ThankYou, "Thank You!!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                }
        });


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
                //error handling
                String username = "";
                username = LBL_Username.getText();
                String password = "";
                password = LBL_Password.getText();
                if (username == null || username.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "You did not enter a username.",
                            "Please enter your username", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else if (password == null || password.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "You did not enter a password.",
                            "Please enter your password", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                //welcome
                else
                {
                    String welcome = "Welcome to Zen's Designs! Please select your clothing choice " +
                            "from the menu above.";
                    JOptionPane.showMessageDialog(null, welcome);
                }
            }

            
//            else if (button == Cart)
//            {
////                  display previous order
//            }

//        }

        //show info input panels
//        else if (source instanceof JMenuItem)
//        {
//            JMenuItem item = (JMenuItem)source;
//
//           if (e.getSource() == top)
//           {
//            setVisible(false);
//              InfoInput.setLayout(new BoxLayout(InfoInput, BoxLayout.PAGE_AXIS));
//              add(Review_Panel, BorderLayout.PAGE_END);
//               System.out.println("hi");
//           }
//         if (item == bottom)
//         {
//            C_InfoInput.setLayout(new BoxLayout(C_InfoInput, BoxLayout.PAGE_AXIS));
//            add(C_InfoInput, BorderLayout.NORTH);
//            add(C_ReviewPanel, BorderLayout.PAGE_END);
//         }

        }

    }

}

