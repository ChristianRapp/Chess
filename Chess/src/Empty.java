
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
		
	public boolean isValidMove(String iP, String fP) {
		// TODO Auto-generated method stub
		return false;
	}

}
