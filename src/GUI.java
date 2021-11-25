import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private JMenuBar Menu_bar;
    private JMenu Crochet;
    private JMenu Customized_design;
    private JMenu Up_cycle;
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

private void GUISetUp()
{
    //frame set up
    setTitle("Zen's Designs");
    setSize(800,600);
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
    add(Welcome_m,BorderLayout.CENTER);


//    //Crochet menu
//    CrochetOptions = new JPopupMenu("Select");
//    JMenuItem top = new JMenuItem("C Top");
//    top.addActionListener(this);
//    JMenuItem bottom = new JMenuItem("C Bottom");
//    bottom.addActionListener(this);
//    JMenuItem swimsuit = new JMenuItem("Swimsuit");
//
//    CrochetOptions.add(top);
//    CrochetOptions.add(bottom);
//    CrochetOptions.add(swimsuit);


//    //customizable menu
//    JPopupMenu CustomOptions = new JPopupMenu("Select");
//    JMenuItem dress = new JMenuItem("Dress");
//    JMenuItem other = new JMenuItem("Other");
//    CustomOptions.add(top);
//    CustomOptions.add(bottom);
//    CustomOptions.add(swimsuit);
//    CustomOptions.add(dress);
//    CustomOptions.add(other);
//
//    ListClothes.addMouseListener(new MouseAdapter() {
//        @Override
//            public void mouseClicked(MouseEvent e) {
//
//                CustomOptions.setVisible(true);
//                CustomOptions.setSize(400,400);
//                CustomOptions.setLocation(407,107);
//                CustomOptions.setBorder(null);}
//
//        });
//
//    //up-cycle menu
//    JPopupMenu UpcycleOptions = new JPopupMenu("Select");
//    CustomOptions.add(top);
//    CustomOptions.add(bottom);
//    CustomOptions.add(swimsuit);
//    CustomOptions.add(dress);
//    CustomOptions.add(other);
//
//    ListClothes.addMouseListener(new MouseAdapter() {
//        @Override
//        public void mouseClicked(MouseEvent e) {
//
//                UpcycleOptions.setVisible(true);
//                UpcycleOptions.setSize(400,400);
//                UpcycleOptions.setLocation(407,107);
//                UpcycleOptions.setBorder(null);}
//
//    });

}


    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();

        if (source instanceof JButton)
        {
            JButton button = (JButton)source;
            String welcome = "Welcome to Zen's Designs! Please select your " +
                    "clothing choice from the menu on the left.";
            JOptionPane.showMessageDialog(null, welcome);
        }

        //exception handle here

    }

}

