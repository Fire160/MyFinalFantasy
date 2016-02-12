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
				if((x == 0) || (x == 15) || (y == 1) || (y == 10))
					{
					temp.add(new Square("Thingy.png", x,y,true));
					}
				else
					{
					temp.add(new Square("dogHead.png", x,y,false));
					}
				}

			}
//		for(int i =0; i < temp.size(); i++)
//	    	{
//	    	System.out.println(temp.get(i).getXPos() + " " + temp.get(i).getYPos());
//	    	}
//		for(boolean[] bob:temp)
//			{
//			for(boolean dog:bob)
//				{
//				System.out.print(dog);
//				}
//			System.out.println("");
//			}
//		temp[2][2] = true;
//		temp[2][6] = true;
//		temp[5][4] = true;
//		temp[5][7] = true;
//		temp[6][6] = true;
//		temp[7][2] = true;
//		temp[1][2] = true;
		return temp;
		}
	public static int findPos(int x, int y)
		{
		int temp = 0;
		temp = (x * 11) + y - 1;
		return temp;
		}
	}
