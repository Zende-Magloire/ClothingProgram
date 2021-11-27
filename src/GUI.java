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
    add(topPanel, BorderLayout.SOUTH);

    //welcome message
    JPanel Welcome_m = new JPanel();
    Welcome_m.add(new JLabel("Welcome to Zen's Designs! Sign in to shop with rewards or select an item from" +
            " the menu to continue."));
    add(Welcome_m, BorderLayout.CENTER);

    //crochet menu set up
    Menu_bar = new JMenuBar();
    Crochet = new JMenu("Crochet");
    JMenuItem top = new JMenuItem("Top");
    Crochet.add(top);
    JMenuItem bottom = new JMenuItem("Bottom");
    Crochet.add(bottom);
    JMenuItem swimsuit = new JMenuItem("Swimsuit");
    Crochet.add(swimsuit);
    Menu_bar.add(Crochet);

    //Custom menu set up
    Customized_design = new JMenu("Custom design");
    Customized_design.add(top);
    Customized_design.add(bottom);
    Customized_design.add(swimsuit);
    JMenuItem dress = new JMenuItem("Dress");
    Customized_design.add(dress);
    JMenuItem other = new JMenuItem("Other");
    Customized_design.add(other);
    Menu_bar.add(Customized_design);

    //Up-cycle menu set up
    Up_cycle = new JMenu("Up-cycle");
    Up_cycle.add(top);
    Up_cycle.add(bottom);
    Up_cycle.add(swimsuit);
    Up_cycle.add(dress);
    Up_cycle.add(other);
    Menu_bar.add(Up_cycle);

    setJMenuBar(Menu_bar);
    Menu_bar.setVisible(true);
    add(Menu_bar, BorderLayout.PAGE_START);

}

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();

        if (source instanceof JButton)
        {
            JButton button = (JButton)source;
            String welcome = "Welcome to Zen's Designs! Please select your " +
                    "clothing choice from the menu above.";
            JOptionPane.showMessageDialog(null, welcome);
        }

        //exception handle here

    }

}

