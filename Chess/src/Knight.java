
public class Knight extends Piece {


	public Knight(int xC, int yC, String c)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Knight";
		abr = "H";
	}
	
	public boolean isValidMove(String iP, String fP)
	{
		
		return false;
		
	}
	
}
