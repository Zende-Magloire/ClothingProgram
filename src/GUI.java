import javax.swing.*;

public class GUI extends JFrame
{
private JTextField Welcome;

public  static void main (String [] args)
{
new GUI();
}
public GUI()
{
setTitle("Welcome to Z Creations");
setSize(800,600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel topPanel = new JPanel();

Welcome = new JTextField(10);
}

}

