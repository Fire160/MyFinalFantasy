import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FinalFrame extends JFrame implements KeyListener, ActionListener
	{
	private static final long serialVersionUID = 1L;
	private static final Dimension WindowSize = new Dimension(700, 600);
	JTextArea displayArea;
    JTextField typingArea;
    private static int x = WindowSize.width / 2;
   	private static int y = WindowSize.height / 2;
	public FinalFrame(String string)
		{
		super(string);
		}
	public static void main(String[] args)
		{
		FinalFrame finalFrame = new FinalFrame("Final Frame");
		finalFrame.createWind();
		finalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int x = screensize.width/2 - WindowSize.width/2;
        int y = screensize.height/2 - WindowSize.height/2;
        finalFrame.setBounds(x, y, WindowSize.width, WindowSize.height);
	    finalFrame.setVisible(true);
		}
	private void createWind()
		{
		JButton button = new JButton("Inventory");
		JButton stuff = new JButton("Hello");
		button.addActionListener(this);
		button.addActionListener(this);
		typingArea = new JTextField(20);
		typingArea.addKeyListener(this);
		button.setToolTipText("Fuck her right in the pussy");
//		displayArea = new JTextArea();
//		displayArea.setEditable(false);
//		JScrollPane scrollPane = new JScrollPane(displayArea);
//		scrollPane.setSize(new Dimension(375, 125));
		getContentPane().add(typingArea, BorderLayout.PAGE_END);
//		getContentPane().add(scrollPane, BorderLayout.CENTER);
		getContentPane().add(button, BorderLayout.AFTER_LINE_ENDS);
		getContentPane().add(stuff, BorderLayout.WEST);
		}
	public void actionPerformed(ActionEvent e)
		{
		System.out.println("Shiet!");
		}
	public void keyPressed(KeyEvent e)
		{
		if(e.getKeyCode() == 87)
			{
			y -= 1;
			}
		else if(e.getKeyCode() == 65)
			{
			x -= 1;
			}
		else if(e.getKeyCode() == 83)
			{
			y += 1;
			}
		else if(e.getKeyCode() == 68)
			{
			x += 1;
			}
		else if(e.getKeyCode() == 69)
			{}
		else{}
		//if()
			{
			}
		repaint();
		typingArea.setText("");
		}
	public void keyReleased(KeyEvent e)
		{}
	public void keyTyped(KeyEvent e)
		{}
	public void paint(Graphics g)
		{
	    g.setColor(Color.BLACK);
	    g.fillRect(0, 0, WindowSize.width, WindowSize.height);
	    int size = 50;
	    int R = (int) (Math.random() * 256);
	    int G = (int) (Math.random() * 256);        
	    int B = (int) (Math.random() * 256);
	    Color c = new Color(R, G, B);
	    g.setColor(c);
	    g.fillRect(x, y, size, size);
		}
	}
