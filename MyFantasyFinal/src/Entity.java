import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Entity
	{
	protected static String fileNam;
	protected static BufferedImage image;
	protected static int xPos;
	protected static int yPos;
	public Entity()
		{
		
		}
	public Entity(String f, int x, int y)
		{
		try
			{
			image = ImageIO.read(new File(fileNam));
			} catch (IOException e)
			{e.printStackTrace();}
		}
	public static void paint(Graphics g)
		{
		g.drawImage(image, xPos*30, yPos*30, null);
		}
	public static int getXPos() 
		{
		return xPos;
		}
	public static void setXPos(int fileNam)
		{
		Entity.xPos = fileNam;
		}
	public static int getYPos() 
		{
		return yPos;
		}
	public static void setYPos(int fileNam)
		{
		Entity.yPos = fileNam;
		}
	public static String getFileNam() 
		{
		return fileNam;
		}
	public static void setFileNam(String fileNam)
		{
		Entity.fileNam = fileNam;
		}
	public static BufferedImage getImage()
		{
		return image;
		}
	public static void setImage(BufferedImage image) 
		{
		Entity.image = image;
		}
	}
