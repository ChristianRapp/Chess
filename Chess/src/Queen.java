
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
	
	public boolean isValidMove(String iP, String fP)
	{
		
		return false;
		
	}
	
}
