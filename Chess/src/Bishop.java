
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
	
	public Bishop()
	{
		
	}
	
	public Bishop(int xC, int yC, String c, String a)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Bishop";
		abr = a;
	}
	
	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		
		boolean isNotBlocked = false;
		
		double ratioX;
		
		if(fxP > ixP)
			ratioX= fxP - ixP;
		
		else if(ixP > fxP)
			ratioX = ixP -fxP;
		
		else
			ratioX = 0;
		
		
		double ratioY;
		
		if(fyP >= iyP)
			ratioY= fyP - iyP;
		
		else if(iyP > fyP)
			ratioY = iyP -fyP;
		
		else
			ratioY = 0;
		
		if(ratioX / ratioY == 0)
			{
			isNotBlocked = true;
			int ix;
			int iy;
			
			
			if(fxP > ixP && fyP > iyP)
				{
				ix = ixP+1;
				iy = iyP+1;
			
				while(iy < fyP && ix < fxP)
					{
					if(ChessMain.board[ix][iy] instanceof Empty)
						{
						
						}
					else
						{
							
						isNotBlocked = false;
						}
					iy++;
					ix++;
					}
				
				}
			
			
			else if(fxP > ixP && fyP < iyP)
				{
				ix = ixP+1;
				iy = iyP-1;
				
				while(iy > fyP && ix < fxP)
					{
					if(ChessMain.board[ix][iy] instanceof Empty)
						{
							
						}
					else
						{
						isNotBlocked = false;
						}
					iy--;
					ix++;
					}
				
				}
			
			
			else if(fxP < ixP && fyP > iyP)
				{
				ix = ixP-1;
				iy = iyP+1;
				
				/* DO STUFF HERE */
				
				while(iy < fyP && ix > fxP)
					{
					
					if(ChessMain.board[ix][iy] instanceof Empty)
						{
						
							
						}
					else
						{
					
						isNotBlocked = false;
						}
						iy++;
						ix--;
					}
				
				}
			
			
			else if(fxP < ixP && fyP < iyP)
				{
	
				ix = ixP-1;
				iy = iyP-1;

				while(iy > fyP && ix > fxP)
					{
					if(ChessMain.board[ix][iy] instanceof Empty)
						{
						
						}
					else
						{
						isNotBlocked = false;
						}
					iy--;
					ix--;
					}
				
				}
				
				
			if(ChessMain.board[fxP][fyP] instanceof Empty || !(ChessMain.board[fxP][fyP].color == this.color))
				{
					
				}
			
			else
				{
				isNotBlocked = false;
				}
			
				
			}
		
		
		
		
		
		return isNotBlocked;
		
	}

}
