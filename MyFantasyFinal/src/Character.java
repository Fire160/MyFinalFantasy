import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Character extends Entity
	{
	public void paint(Graphics g, int dir)
		{
		g.drawImage(image, xPos*30, yPos*30, null);
		}
	public Character(String f, int x, int y)
		{
		try
			{
			image = ImageIO.read(new File("HappyFace.gif"));
			} catch (IOException e)
			{e.printStackTrace();}
		xPos = x;
		yPos =y;
		}
	}
