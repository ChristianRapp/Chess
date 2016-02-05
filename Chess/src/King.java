
public class King extends Piece{

	public King(int xC, int yC, String c)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "King";
		abr = "K";
	}
	
	public King(int xC, int yC, String c, String a)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "King";
		abr = a;
	}
	
	public King()
	{
		
	}
	
	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		
		return false;
		
	}

}
