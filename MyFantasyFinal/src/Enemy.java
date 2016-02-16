import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy extends Entity
	{
	private static int startX;
	private static int startY;
	private static boolean gB;
	public Enemy(String f, int x, int y, boolean will)
		{
		try
			{
			image = ImageIO.read(new File(f));
			} catch (IOException e)
			{e.printStackTrace();}
		willKill = will;
		f = fileNam;
		x = xPos;
		y = yPos;
		startX = x;
		startY = y;
		}
	public void partrolX()
		{
		if(xPos == startX - 3)
			{
			gB = true;
			}
		if(xPos == startX)
			{
			gB = false;
			}
		if(gB == false)
			{
			xPos -= 1;
			}
		else
			{
			xPos += 1;
			}
		}
	public void paint(Graphics g)
		{
		g.drawImage(image, xPos*30, yPos*30, null);
		}
	public static void partrolY()
		{
		if(yPos == startY - 3)
			{
			gB = true;
			}
		if(yPos == startY)
			{
			gB = false;
			}
		if(gB == false)
			{
			yPos -= 1;
			}
		else
			{
			yPos += 1;
			}
		}
	public int getStartX()
		{
		return startX;
		}
	public void setStartX(int startX)
		{
		this.startX = startX;
		}
	public int getStartY()
		{
		return startY;
		}
	public void setStartY(int startY)
		{
		this.startY = startY;
		}
	}
