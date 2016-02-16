import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Square
	{
	private String fileNam;
	private BufferedImage image;
	private int xPos;
	private int yPos;
	private boolean isWalkable;
	private boolean willKill;
	public Square()
		{
		
		}
	public Square(String f, int x, int y, boolean n)
		{
		try
			{
			image = ImageIO.read(new File(f));
			} catch (IOException e)
			{e.printStackTrace();}
		f = fileNam;
		xPos = x;
		yPos = y;
		isWalkable = n;
		}
	public void paint(Graphics g)
		{
		g.drawImage(image, xPos*30, yPos*30, null);
//		g.setColor(Color.CYAN);
//		g.fillRect(xPos*30, yPos*30, 30, 30);
		}
	public int getXPos() 
		{
		return xPos;
		}
	public void setXPos(int fileNam)
		{
		xPos = fileNam;
		}
	public int getYPos() 
		{
		return yPos;
		}
	public void setYPos(int fileNam)
		{
		yPos = fileNam;
		}
	public String getFileNam() 
		{
		return fileNam;
		}
	public void setFileNam(String fileN)
		{
		try
			{
			image = ImageIO.read(new File(fileN));
			} catch (IOException e)
			{e.printStackTrace();}
		fileNam = fileN;
		}
	public BufferedImage getImage()
		{
		return image;
		}
	public void setImage(BufferedImage imag) 
		{
		image = imag;
		}
	public boolean isWalkable()
		{
		return isWalkable;
		}
	public void setWalkable(boolean isWalkabl)
		{
		isWalkable = isWalkabl;
		}
	public boolean isWillKill()
		{
			return willKill;
		}
	public void setWillKill(boolean willKill)
		{
			this.willKill = willKill;
		} 
	}
