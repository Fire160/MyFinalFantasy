import java.util.ArrayList;

public class MapStuff
	{
	public static ArrayList<Square> makingAMap()
		{
		ArrayList<Square> temp = new ArrayList<Square>();
		for(int x = 0; x < 16; x++)
			{
			for(int y = 0; y < 11; y++)
				{
				if(y == 1 || y == 10)
					{
					temp.add(new Square("imagesS.jpeg", x,y,true,false));
					}
				else if((x == 0) || (x == 15))
					{
					temp.add(new Square("images-2.jpeg", x,y,true,false));
					}
				else
					{
					temp.add(new Square("images.jpeg", x,y,false,false));
					}
				}
			}
//		temp.get(0).setFileNam("");
//		temp.get(0).setFileNam("");
//		temp.get(0).setFileNam("");
//		temp.get(temp.size()).setFileNam("");
		changeSquare(temp, 18, true,false, "Thingy.png");
		changeSquare(temp, 15, true,false, "Thingy.png");
		changeSquare(temp, 47, true,false, "Thingy.png");
		changeSquare(temp, 147, true,false, "Thingy.png");
		changeSquare(temp, 25, true,false, "Thingy.png");
		changeSquare(temp, 35, true,false, "Thingy.png");
		changeSquare(temp, 38, false,true, "fire.png");
		System.out.println(temp.size());
		return temp;
		}
	public static int findPos(int x, int y)
		{
		int temp = 0;
		temp = (x * 11) + y;
		return temp;
		}
	public static void changeSquare(ArrayList<Square> temp, int change, boolean whoa, boolean holdUp, String charge)
		{
		temp.get(change).setWalkable(whoa); temp.get(change).setFileNam(charge); temp.get(change).setWillKill(holdUp);
		}
	}
