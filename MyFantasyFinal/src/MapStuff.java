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
					temp.add(new Square("imagesS.jpeg", x,y,true));
					}
				else if((x == 0) || (x == 15))
					{
					temp.add(new Square("images-2.jpeg", x,y,true));
					}
				else
					{
					temp.add(new Square("images.jpeg", x,y,false));
					}
				}
			}
//		temp.get(0).setFileNam("");
//		temp.get(0).setFileNam("");
//		temp.get(0).setFileNam("");
//		temp.get(temp.size()).setFileNam("");
		changeSquare(temp, 18, true, "Thingy.png");
		changeSquare(temp, 15, true, "Thingy.png");
		changeSquare(temp, 47, true, "Thingy.png");
		changeSquare(temp, 147, true, "Thingy.png");
		changeSquare(temp, 25, true, "Thingy.png");
		changeSquare(temp, 35, true, "Thingy.png");
		changeSquare(temp, 38, true, "Thingy.png");
		System.out.println(temp.size());
		return temp;
		}
	public static int findPos(int x, int y)
		{
		int temp = 0;
		temp = (x * 11) + y - 1;
		return temp;
		}
	public static void changeSquare(ArrayList<Square> temp, int change, boolean whoa, String charge)
		{
		temp.get(change).setWalkable(whoa); temp.get(change).setFileNam(charge);
		}
	}
