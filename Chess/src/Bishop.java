
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
	
	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		
		return false;
		
	}

}
