import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Entity
	{
	protected static String fileNam;
	protected boolean willKill;
	protected static BufferedImage image;
	protected static int xPos;
	protected static int yPos;
	public Entity()
		{
		
		}
	public Entity(String f, int x, int y, boolean will)
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
		}
	public void paint(Graphics g)
		{
		g.drawImage(image, xPos*30, yPos*30, null);
		}
	public int getXPos() 
		{
		return xPos;
		}
	public void setXPos(int fileNam)
		{
		Entity.xPos = fileNam;
		}
	public int getYPos() 
		{
		return yPos;
		}
	public void setYPos(int fileNam)
		{
		Entity.yPos = fileNam;
		}
	public String getFileNam() 
		{
		return fileNam;
		}
	public static void setFileNam(String fileNam)
		{
		Entity.fileNam = fileNam;
		}
	public BufferedImage getImage()
		{
		return image;
		}
	public static void setImage(BufferedImage image) 
		{
		Entity.image = image;
		}
	}
