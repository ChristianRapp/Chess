
public class Rook extends Piece{


	public Rook(int xC, int yC, String c)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Rook";
		abr = "R";
	}
	public Rook()
	{
		
	}
	
	public Rook(int xC, int yC, String c, String a)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Rook";
		abr = a;
	}
	
	
	
	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		
		return false;
		
	}
	
}
