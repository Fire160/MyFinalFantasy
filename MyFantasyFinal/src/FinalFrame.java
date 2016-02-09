import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FinalFrame extends JFrame implements KeyListener, ActionListener
	{
	private static final long serialVersionUID = 1L;
	public static final Dimension WindowSize = new Dimension(450, 300);
	private static BufferedImage image;
	JTextArea displayArea;
    JTextField typingArea;
    private static int x = -26;
   	private static int y = -70;
	public FinalFrame(String string)
		{
		super(string);
		}
	public static void main(String[] args)
		{
		FinalFrame finalFrame = new FinalFrame("Final Frame");
		finalFrame.createWind();
		finalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screensize = new Dimension(1920, 1080);
        int x = screensize.width/2 - WindowSize.width/2;
        int y = screensize.height/2 - WindowSize.height/2;
        finalFrame.setBounds(x, y, WindowSize.width, WindowSize.height);
        finalFrame.setMaximumSize(WindowSize);
	    finalFrame.setVisible(true);
		}
	private void createWind()
		{
		JButton button = new JButton("Inventory");
		JButton stuff = new JButton("Hello");
		button.addActionListener(this);
		button.addActionListener(this);
		//this.addKeyListener(this);
		typingArea = new JTextField(20);
		typingArea.addKeyListener(this);
//		displayArea = new JTextArea();
//		displayArea.setEditable(false);
//		JScrollPane scrollPane = new JScrollPane(displayArea);
//		scrollPane.setSize(new Dimension(375, 125));
		getContentPane().add(typingArea, BorderLayout.PAGE_END);
//		getContentPane().add(scrollPane, BorderLayout.CENTER);
//		getContentPane().add(button, BorderLayout.AFTER_LINE_ENDS);
		getContentPane().add(stuff, BorderLayout.SOUTH);
		}
	public void actionPerformed(ActionEvent e)
		{
		System.out.println("Shiet!");
		}
	public void keyPressed(KeyEvent e)
		{
		if(e.getKeyCode() == 87)
			{
			y += 2;
			}
		else if(e.getKeyCode() == 65)
			{
			x += 2;
			}
		else if(e.getKeyCode() == 83)
			{
			y -= 2;
			}
		else if(e.getKeyCode() == 68)
			{
			x -= 2;
			}
		else if(e.getKeyCode() == 69)
			{}
		else{}
		if(x < -350)
			{
			x = -350;
			}
		if(y < -400)
			{
			y = -400;
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
		try
			{
			image = ImageIO.read(new File("PalletTown.png"));
			} catch (IOException e)
			{e.printStackTrace();}
	    getContentPane().setBackground(Color.BLACK);
//	    int R = (int) (Math.random() * 256);
//	    int G = (int) (Math.random() * 256);        
//	    int B = (int) (Math.random() * 256);
//	    Color c = new Color(R, G, B);
	    g.drawImage(image, x, y, null);
	    g.setColor(Color.BLUE);
	    g.fillRect(WindowSize.width/2, WindowSize.height/2, 30, 30);
		}
	}
