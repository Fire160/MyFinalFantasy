import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Square
	{
	private static String fileNam;
	private static BufferedImage image;
	private static int xPos;
	private static int yPos;
	private static boolean isWalkable;
	public Square()
		{
		
		}
	public Square(String f, int x, int y, boolean n)
		{
		try
			{
			image = ImageIO.read(new File("Thingy.png"));
			} catch (IOException e)
			{e.printStackTrace();}
		xPos = x;
		yPos = y;
		isWalkable = n;
		}
	public void paint(Graphics g)
		{
		g.drawImage(image, xPos*30, yPos*30, null);
		g.setColor(Color.CYAN);
		g.fillRect(xPos*30, yPos*30, 30, 30);
		}
	public static int getXPos() 
		{
		return xPos;
		}
	public static void setXPos(int fileNam)
		{
		Square.xPos = fileNam;
		}
	public static int getYPos() 
		{
		return yPos;
		}
	public static void setYPos(int fileNam)
		{
		Square.yPos = fileNam;
		}
	public static String getFileNam() 
		{
		return fileNam;
		}
	public static void setFileNam(String fileN)
		{
		fileNam = fileN;
		}
	public static BufferedImage getImage()
		{
		return image;
		}
	public static void setImage(BufferedImage imag) 
		{
		image = imag;
		}
	public static boolean isWalkable()
		{
		return isWalkable;
		}
	public static void setWalkable(boolean isWalkable)
		{
		Square.isWalkable = isWalkable;
		} 
	}
