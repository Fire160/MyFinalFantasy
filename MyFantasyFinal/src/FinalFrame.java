import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FinalFrame extends JFrame implements KeyListener, ActionListener
	{
	private static final long serialVersionUID = 1L;
	public static final Dimension WindowSize = new Dimension(450, 300);
	private static Image piMag;
//	private static BufferedImage piMage;
	JTextArea displayArea;
    JTextField typingArea;
    public static int x = 7;
    public static int y = 6;
    public static ArrayList<Square> hitBoxes = MapStuff.makingAMap();
    public static Character player = new Character("HappyFace.gif", 7,6);
// 	public static Enemy enemy = new Enemy("fire.png",4,4,true);
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
//	    while(player.isAlive() == true)
//	    	{
//	    	if(player.getXPos() == enemy.getXPos() && player.getYPos() == enemy.getYPos())
//	    		{
//	    		player.setAlive(false);
//	    		}
//	    	else
//	    		{
//	    		finalFrame.doStuff(enemy);
//	    		}
//	    	}
		}
//	private void doStuff(Enemy enemy)
//		{
//		enemy.partrolX();
//		repaint();
//		try{Thread.sleep(100);} catch (InterruptedException e){e.printStackTrace();}
//		}
	private void createWind()
		{
//		JButton button = new JButton("Inventory");
//		JButton stuff = new JButton("Hello");
//		button.addActionListener(this);
//		stuff.addActionListener(this);
//		this.addKeyListener(this);
		typingArea = new JTextField(20);
		typingArea.addKeyListener(this);
		try
			{
			piMag = ImageIO.read(new File("fire.png"));
			} catch (IOException e)
			{e.printStackTrace();}
		this.setIconImage(piMag);
//		this.addKeyListener(((KeyListener) new Controller()));
//		displayArea = new JTextArea();
//		displayArea.setEditable(false);
//		JScrollPane scrollPane = new JScrollPane(displayArea);
//		scrollPane.setSize(new Dimension(375, 125));
		getContentPane().add(typingArea, BorderLayout.PAGE_END);
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
//		int direc = 0;
		if(e.getKeyCode() == 87)
			{
//			direc = 1;
			if(hitBoxes.get(MapStuff.findPos(player.getXPos(), player.getYPos()-1)).isWalkable() == false)
				{
				player.setYPos(player.getYPos() - 1);
				try{Thread.sleep(100);}catch(InterruptedException e1){e1.printStackTrace();}
				}
			}
		else if(e.getKeyCode() == 65)
			{
			if(hitBoxes.get(MapStuff.findPos(player.getXPos()-1, player.getYPos())).isWalkable() == false)
				{
				player.setXPos(player.getXPos() - 1);
				try{Thread.sleep(100);}catch(InterruptedException e1){e1.printStackTrace();}
				}
			}
		else if(e.getKeyCode() == 83)
			{
			if(hitBoxes.get(MapStuff.findPos(player.getXPos(), player.getYPos()+1)).isWalkable() == false)
				{
				player.setYPos(player.getYPos() + 1);
				try{Thread.sleep(100);}catch(InterruptedException e1){e1.printStackTrace();}
				}
			}
		else if(e.getKeyCode() == 68)
			{
			if(hitBoxes.get(MapStuff.findPos(player.getXPos()+1, player.getYPos())).isWalkable() == false)
				{
				player.setXPos(player.getXPos() + 1);
				try{Thread.sleep(100);}catch(InterruptedException e1){e1.printStackTrace();}
				}
			}
//		else if(e.getKeyCode() == 69)
//			{
//			if(openInv == true)
//				{
//				openInv = false;
//				}
//			else
//				{
//				openInv = true;
//				}
//			}
		else{}
		if(hitBoxes.get(MapStuff.findPos(player.getXPos(), player.getYPos())).isWillKill() == true)
			{
			player.setAlive(false);
			}
		else
			{
			repaint();
			}
		if(player.isAlive() == false)
			{
			DeathScreen over = new DeathScreen("Game Over");
			}
		typingArea.setText("");
		}
	public void keyReleased(KeyEvent e)
		{}
	public void keyTyped(KeyEvent e)
		{}
	public void paint(Graphics g)
		{
		g.setColor(Color.BLACK);
	    g.fillRect(0, 0, 1000, 1000);
	    for(int i = 0; i < hitBoxes.size(); i++)
	    	{
	    	hitBoxes.get(i).paint(g);
	    	}
	    player.paint(g,1);
//	    enemy.paint(g);
		}
	public void paintInv(Graphics g)
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
