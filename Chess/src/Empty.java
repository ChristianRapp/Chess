
public class Empty extends Piece 
{

	public Empty(int xC, int yC)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = null;
		name = "Empty";
		abr = " ";
	}
		

	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP) {
		
		return false;
	}

}
