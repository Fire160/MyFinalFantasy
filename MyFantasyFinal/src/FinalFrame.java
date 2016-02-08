import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class FinalFrame extends JFrame implements KeyListener, ActionListener
	{
	private static final long serialVersionUID = 1L;
	public static final Dimension WindowSize = new Dimension(700, 600);
    public static int x = WindowSize.width / 2;
   	public static int y = WindowSize.height / 2;
	public static void main(String[] args)
		{
		
		}
	public void actionPerformed(ActionEvent arg0)
		{
		
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
			{
			
			}
		else{}
		//if()
			{
			
			}
			
		repaint();
		typingArea.setText("");
		}
	public void keyReleased(KeyEvent e)
		{
		
		}
	public void keyTyped(KeyEvent e)
		{
		
		}
	public void paint(Graphics g)
		{
	    g.setColor(Color.BLACK);
	    g.fillRect(0, 0, WindowSize.width, WindowSize.height);
	    int size = 50;
//	    int R = (int) (Math.random() * 256);
//	    int G = (int) (Math.random() * 256);        
//	    int B = (int) (Math.random() * 256);
//	    Color c = new Color(R, G, B);
	    g.setColor(Color.WHITE);
	    g.fillRect(x, y, size, size);
		}
	}
