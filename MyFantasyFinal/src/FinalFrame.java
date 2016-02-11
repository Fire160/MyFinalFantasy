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
	private static BufferedImage piMage;
	private static BufferedImage image;
	JTextArea displayArea;
    JTextField typingArea;
    public static int x = 7;
    public static int y = 6;
    public static boolean[][] hitBoxes = MapStuff.makingAMap();
    public static boolean openInv = false;
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
        finalFrame.setBounds(x, y, 481, 355);
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
//		typingArea.addKeyListener(this);
		this.addKeyListener(((KeyListener) new Controller()));
//		displayArea = new JTextArea();
//		displayArea.setEditable(false);
//		JScrollPane scrollPane = new JScrollPane(displayArea);
//		scrollPane.setSize(new Dimension(375, 125));
//		getContentPane().add(typingArea, BorderLayout.PAGE_END);
//		getContentPane().add(scrollPane, BorderLayout.CENTER);
//		getContentPane().add(button, BorderLayout.AFTER_LINE_ENDS);
//		getContentPane().add(stuff, BorderLayout.SOUTH);
		}
	public void actionPerformed(ActionEvent e)
		{
		System.out.println("Shiet!");
		}
	public void keyPressed(KeyEvent e)
		{
		if(e.getKeyCode() == 87)
			{
			if(hitBoxes[y-1][x] == false)
				{
				y -= 1;
				}
			}
		else if(e.getKeyCode() == 65)
			{
			if(hitBoxes[y][x-1] == false)
				{
				x -= 1;
				}
			}
		else if(e.getKeyCode() == 83)
			{
			if(hitBoxes[y+1][x] == false)
				{
				y += 1;
				}
			}
		else if(e.getKeyCode() == 68)
			{
			if(hitBoxes[y][x+1] == false)
				{
				x += 1;
				}
			}
		else if(e.getKeyCode() == 69)
			{
			if(openInv == true)
				{
				openInv = false;
				}
			else
				{
				openInv = true;
				}
			}
		else{}
		if(x < -350)
			{
			x = -350;
			}
		if(y < -400)
			{
			y = -400;
			}
		if(openInv == true)
			{
			paintInv();
			}
		else
			{
			repaint();
			}
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
			image = ImageIO.read(new File("HappyFace.gif"));
			piMage = ImageIO.read(new File("Thingy.png"));
			} catch (IOException e)
			{e.printStackTrace();}
		g.setColor(Color.BLACK);
	    g.fillRect(0, 0, 1000, 1000);
	    g.setColor(Color.CYAN);
	    for(int i = 0; i < 11; i++)
			{
		    g.fillRect(0, i*30, 30, 30);
		    g.fillRect(15*30, i*30, 30, 30);
			}
		for(int i = 0; i < 16; i++)
			{
		    g.fillRect(i*30, 30, 30, 30);
		    g.fillRect(i*30, 10*30, 30, 30);
			}
//	    int R = (int) (Math.random() * 256);
//	    int G = (int) (Math.random() * 256);        
//	    int B = (int) (Math.random() * 256);
//	    Color c = new Color(R, G, B);
	    g.drawImage(piMage, 2*30, 2*30, null);
	    g.drawImage(piMage, 4*30, 5*30, null);
	    g.drawImage(piMage, 2*30, 7*30, null);
	    g.drawImage(piMage, 6*30, 2*30, null);
	    g.drawImage(piMage, 7*30, 5*30, null);
	    g.drawImage(piMage, 6*30, 6*30, null);
//	    g.setColor(Color.BLUE);
//	    g.fillRect(x * 30, y * 30, 30, 30);
	    g.drawImage(image, x*30, y*30, null);
		}
	public void paintInv()
		{
		
		}
	public static boolean isOpenInv()
		{
		return openInv;
		}
	public static void setOpenInv(boolean openInv)
		{
		FinalFrame.openInv = openInv;
		}
	}
