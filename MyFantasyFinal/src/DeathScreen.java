import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DeathScreen extends JFrame implements ActionListener
	{
	public static final Dimension WindowSize = new Dimension(450, 300);
	public DeathScreen(String name)
		{
		super(name);
		JButton button = new JButton("So sad :(");
		JTextArea stuff = new JTextArea();
		button.addActionListener(this);
		stuff.setEditable(false);
		stuff.append("You died");
		getContentPane().add(button, BorderLayout.PAGE_END);
		getContentPane().add(stuff, BorderLayout.NORTH);
		Dimension screensize = new Dimension(1920, 1080);
		int x = screensize.width/2 - WindowSize.width/2;
     	int y = screensize.height/2 - WindowSize.height/2;
        setBounds(x, y, 48, 35);
	    setVisible(true);
		}
	public void actionPerformed(ActionEvent e)
		{
		System.exit(0);
		}
	}
