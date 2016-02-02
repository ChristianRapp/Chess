
public class Bishop extends Piece {
	
	
	public Bishop(int xC, int yC, String c)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Bishop";
		abr = "B";
	}
	
	public boolean isValidMove(String iP, String fP)
	{
		
		return false;
		
	}

}
