import java.awt.Color;
import java.awt.Graphics;

public class Character
	{
	public void paint(Graphics g)
		{
	    g.setColor(Color.BLACK);
	    g.fillRect(0, 0, FinalFrame.WindowSize.width, FinalFrame.WindowSize.height);
	    int size = 50;
//	    int R = (int) (Math.random() * 256);
//	    int G = (int) (Math.random() * 256);        
//	    int B = (int) (Math.random() * 256);
//	    Color c = new Color(R, G, B);
	    g.setColor(Color.WHITE);
	    g.fillRect(FinalFrame.x, FinalFrame.y, size, size);
		}
	}
