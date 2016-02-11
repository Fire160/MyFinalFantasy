import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter
	{
	public void keyPressed(KeyEvent e)
		{
		if(e.getKeyCode() == 87)
			{
			if(FinalFrame.hitBoxes[FinalFrame.y-1][FinalFrame.x] == false)
				{
				FinalFrame.y -= 1;
				}
			}
		else if(e.getKeyCode() == 65)
			{
			if(FinalFrame.hitBoxes[FinalFrame.y][FinalFrame.x-1] == false)
				{
				FinalFrame.x -= 1;
				}
			}
		else if(e.getKeyCode() == 83)
			{
			if(FinalFrame.hitBoxes[FinalFrame.y+1][FinalFrame.x] == false)
				{
				FinalFrame.y += 1;
				}
			}
		else if(e.getKeyCode() == 68)
			{
			if(FinalFrame.hitBoxes[FinalFrame.y][FinalFrame.x+1] == false)
				{
				FinalFrame.x += 1;
				}
			}
		else if(e.getKeyCode() == 69)
			{
			if(FinalFrame.openInv == true)
				{
				FinalFrame.openInv = false;
				}
			else
				{
				FinalFrame.openInv = true;
				}
			}
		else{}
		if(FinalFrame.x < -350)
			{
			FinalFrame.x = -350;
			}
		if(FinalFrame.y < -400)
			{
			FinalFrame.y = -400;
			}
//		if(openInv == true)
//			{
//			paintInv();
//			}
//		else
//			{
//			repaint();
//			}
		}
	}
