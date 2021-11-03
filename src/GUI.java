import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.ArrayList;

public class GUI extends JFrame implements ListSelectionListener
{
    private ArrayList<Clothes> L_Clothes;
    private DefaultListModel<String> M_Clothes;

    private JList<String> ListClothes;
    private JLabel LBL_article;
    private JLabel LBL_type;

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
    //loadClothes();

    //set up GUI
    GUISetUp();

}

private void GUISetUp()
{
    setTitle("Welcome to CreationZ");
    setSize(800,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

    }
}

