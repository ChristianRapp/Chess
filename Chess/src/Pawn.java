
public class Pawn extends Piece
{


	public Pawn(int xC, int yC, String c)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Pawn";
		abr = "P";
	}

	public boolean isValidMove(String iP, String fP)
	{
		
		/* Check to see if first move.
		 * If first move pawn can go 2 up if not blocked
		 */
		
		/*Check to see if pawn not blocked
		 * If not pawn can move 1 up
		 */
		
		/*Check to see if piece is directly diagonal 1 space
		 * If piece is pawn can move 1 diagonal to take
		 */
		
		
		return false;
		
	}
	
	
}
