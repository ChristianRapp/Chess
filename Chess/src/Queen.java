
public class Queen extends Piece {


	public Queen(int xC, int yC, String c)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Queen";
		abr = "Q";
	}
	
	public Queen(int xC, int yC, String c, String a)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Queen";
		abr = a;
	}
	
	public Queen()
	{
		
	}
	
	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		
		return false;
		
	}
	
}
