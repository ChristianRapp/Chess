
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
		
		Boolean isNotBlocked = true;
		
		if(ixP == fxP && iyP < fyP)
			{
			
			for(int i=iyP +1; i<fyP; i++)
			{
			if(ChessMain.board[ixP][i] instanceof Empty)
			{	
			}
			else{
				isNotBlocked = false;}
			}
			
			}
			
		
		if(iyP == fyP && ixP < fxP)
			{
			
			for(int i=ixP +1; i<fxP; i++)
			{
			if(ChessMain.board[i][iyP] instanceof Empty)
			{
				
			}
			else
				isNotBlocked = false;
			}
			
			}
		
		if(ixP == fxP && iyP > fyP)
		{
		
		for(int i=iyP -1; i>fyP; i--)
		{
		if(ChessMain.board[ixP][i] instanceof Empty)
		{
			
		}
		else
			isNotBlocked = false;
		}
		
		}
		
		
		
		
		if(iyP == fyP && ixP > fxP)
		{
		
		for(int i=ixP -1; i>fxP; i--)
		{
		if(ChessMain.board[i][iyP] instanceof Empty)
		{	
		}
		else{
			isNotBlocked = false;}
		}
		
		}
		
		return isNotBlocked;
		
		}
	
}
