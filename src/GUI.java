import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame implements ListSelectionListener, ActionListener {
    private ArrayList<Clothes> L_Clothes;
    private DefaultListModel<String> M_Clothes;

    private JList<String> ListClothes;
    private JLabel LBL_article;
    private JLabel LBL_type;
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
    //set up member fields
    L_Clothes = new ArrayList<>();
    M_Clothes = new DefaultListModel<>();

    //load clothes data
    loadClothes();

    //set up GUI
    GUISetUp();

}

private void GUISetUp()
{
    setTitle("Zen's Designs");
    setSize(800,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

    //list set up
    ListClothes = new JList<String>(M_Clothes);
    ListClothes.addListSelectionListener(this);
    JScrollPane Options = new JScrollPane();
    Options.setLayout(new ScrollPaneLayout());
    Options.setViewportView(ListClothes);

    JPanel clothesPanel = new JPanel();

    JSplitPane Pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, Options, clothesPanel);
    Pane.setDividerLocation(150);
    add(Pane, BorderLayout.CENTER);

    setLocationRelativeTo(null);
    setVisible(true);
}

    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        //ignore false alarms
int idx = ListClothes.getSelectedIndex();

if(e.getValueIsAdjusting())
    return;
if (idx < 0 || idx >= L_Clothes.size())
    return;

if (M_Clothes.equals("Crochet"));
    JPopupMenu CrochetOptions = new JPopupMenu("options");
    JMenuItem top = new JMenuItem("Top");
    JMenuItem bottom = new JMenuItem("Bottom");
    JMenuItem swimsuit = new JMenuItem("Swimsuit");
    CrochetOptions.add(top);
    CrochetOptions.add(bottom);
    CrochetOptions.add(swimsuit);

        // add to somewhere
    setVisible(true);
    }


    private void loadClothes()
    {
        M_Clothes.addElement("Crochet");
        M_Clothes.addElement("Customized Clothing");
        M_Clothes.addElement("Up-cycle clothing");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //exception handle here

        String welcome = "Welcome to Zen's Designs! Please select your " +
                "clothing choice from the menu on the left.";
        JOptionPane.showMessageDialog(null, welcome);


    }
}

