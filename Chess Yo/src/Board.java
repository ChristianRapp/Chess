public class Board
	{
	public static void makeBoard(String[][] boardN)
		{
		for(int row = 1; row < 11; row++)
			{
			for(int col = 1; col < 11; col++)
				{
				boardN[row][col] = " ";
				}
			}
		}
	public static void boardPrint(String[][] boardN)
		{
		System.out.println("     A   B   C   D   E   F   G   H   I   J");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+");
		for(int row = 1; row < 11; row++)
			{
			if(row == 10)
				{
				System.out.print(row);
				}
			else
				{
				System.out.print(row + " ");
				}
			for(int col = 1; col < 11; col++)
				{
				System.out.print(" | " + boardN[row][col]);
				}
			System.out.println(" |");
			System.out.println("   +---+---+---+---+---+---+---+---+---+---+");
			}
		}
	}
