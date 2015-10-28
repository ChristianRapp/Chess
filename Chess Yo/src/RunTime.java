
public class RunTime
	{

	public static void main(String[] args)
		{
		String[][] boardN = new String[11][11];
		Board.makeBoard(boardN);
		Board.boardPrint(boardN);
		}
	public static String ben(String s, int x)
		{
		if(x > s.length())
			{
			System.out.println(s.substring(0,s.length()/2));
			return s.substring(0,s.length()/2);
			}
		else
			{
			return s + ben(s.substring(x),x + 1);
			}
		}
	}
