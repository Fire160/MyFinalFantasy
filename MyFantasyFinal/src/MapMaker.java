import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class MapMaker extends Canvas
	{
	private String path;
	private boolean append = true;
	public MapMaker(String g)
		{
		path = g;
		}
	public void writeToFile(String textLine) throws IOException 
		{
		FileWriter write = new FileWriter(path, append);
		PrintWriter printLine = new PrintWriter( write );
		printLine.print(textLine);
		printLine.close();
		}
	public MapMaker(String g, boolean n)
		{
		path = g;
		append = n;
		}
	public static void main(String [] args)
		{
		MapMaker f = new MapMaker("C:/users/michael.young/Desktop/text.png");
		try
			{
			f.writeToFile("Yo Hommie");
			} catch (IOException e)
			{
			e.printStackTrace();
			}
		}
	public void paint(Graphics g)
		{
		g.setColor(Color.BLUE);
	    g.fillRect(30, 30, 30, 30);
		}
	public String getPath()
		{
		return path;
		}
	public void setPath(String path)
		{
		this.path = path;
		}
	}
