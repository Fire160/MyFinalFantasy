
public class MapStuff
	{
	public static boolean[][] makingAMap()
		{
		boolean[][] temp = new boolean[11][16];
		for(boolean[] bob:temp)
			{
			for(boolean dog:bob)
				{
				dog = false;
				}
			}
		for(int i = 0; i < 11; i++)
			{
			temp[i][0] = true;
			temp[i][15] = true;
			}
		for(int i = 0; i < 16; i++)
			{
			temp[1][i] = true;
			temp[10][i] = true;
			}
//		for(boolean[] bob:temp)
//			{
//			for(boolean dog:bob)
//				{
//				System.out.print(dog);
//				}
//			System.out.println("");
//			}
		temp[2][2] = true;
		temp[2][6] = true;
		temp[5][4] = true;
		temp[5][7] = true;
		temp[6][6] = true;
		temp[7][2] = true;
//		temp[1][2] = true;
		return temp;
		}
	}
