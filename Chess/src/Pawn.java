import java.util.*;

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
	
	public Pawn(int xC, int yC, String c, String a)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Pawn";
		abr = a;
	}

	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		
		//if(((ixP+1 ==fxP||ixP-1 ==fxP)&& iyP+1 ==fyP)/*If diagonal and up 1*/|| (ixP+1 ==fxP&& iyP ==fyP)/*Checks to see if goes up one*/ ||(ixP+2 ==fxP&& iyP ==fyP)/*Checks to see if goes up two*/)
			{
		
			if(this.color.equals("White"))
				{
				if(ixP-1 == fxP && iyP == fyP)/* x + 1 same y*/
					{
					
					if(ChessMain.board[fxP][fyP] instanceof Empty)
						{
						
						return true;
			
						}
						
					}
			
				else if(ixP-1 == fxP && iyP+1 == fyP)/* x + 1 right 1*/
					{
					
					if(!(ChessMain.board[fxP][fyP] instanceof Empty) && !ChessMain.board[fxP][fyP].getColor().equals(this.color))
						{
						
						return true;
			
						}
						
					}
			
				else if(ixP-1 == fxP && iyP-1 == fyP)/* x + 1  left 1*/
					{
					if(!(ChessMain.board[fxP][fyP] instanceof Empty) && !ChessMain.board[fxP][fyP].getColor().equals(this.color))
						{
						
						return true;
			
						}
						
					}
				
				else if(ixP-2 == fxP && iyP == fyP)/* x + 2 same y*/
					{
					
					if(ChessMain.board[fxP][fyP] instanceof Empty && ChessMain.board[fxP - 1][fyP] instanceof Empty)
						{
				
						return true;
			
						}
						
					}
			
				}
			
			if(this.color.equals("Black"))
				{
				if(ixP+1 == fxP && iyP == fyP)/* x + 1 same y*/
					{
					if(ChessMain.board[fxP][fyP] instanceof Empty)
						{
					
						return true;
		
						}
					
					}
		
				if(ixP+1 == fxP && iyP+1 == fyP)/* x + 1 right 1*/
					{
				
					if(!(ChessMain.board[fxP][fyP] instanceof Empty) && !ChessMain.board[fxP][fyP].getColor().equals(this.color))
						{
						
						return true;
		
						}
					
					}
		
				if(ixP+1 == fxP && iyP-1 == fyP)/* x + 1  left 1*/
					{
				
					if(!(ChessMain.board[fxP][fyP] instanceof Empty) && !ChessMain.board[fxP][fyP].getColor().equals(this.color))
						{
					
						return true;
		
						}
					
					}
		
				if(ixP+2 == fxP && iyP == fyP)/* x + 2 same y*/
					{
					
					if(ChessMain.board[fxP][fyP] instanceof Empty && ChessMain.board[ixP + 1][fyP] instanceof Empty)
						{
					
						return true;
		
						}
					
					}
		
				}
			
			}
		
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
