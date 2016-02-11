
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
		
		if(  ((ixP +1 == fxP)&& (iyP + 1 == fyP || iyP - 1 == fyP || iyP == fyP))  || ((ixP - 1 == fxP) &&(iyP + 1 == fyP || iyP - 1 == fyP || iyP == fyP)) || ((ixP == fxP)&& (iyP + 1 == fyP || iyP - 1 == fyP)) )
			{
			if(ChessMain.board[fxP][fyP] instanceof Empty || !(this.color == ChessMain.board[fxP][fyP].getColor()) )
				{
				if(this.color.equals("White")){
					ChessMain.kingsRow[0].setxCoord(fxP);
					ChessMain.kingsRow[0].setyCoord(fyP);}
				
				if(this.color.equals("Black"))
					{ChessMain.kingsRow[1].setxCoord(fxP);
					ChessMain.kingsRow[1].setyCoord(fyP);}
				
				return true;	
				}
			}
		
		
		return false;
		
	}

}
