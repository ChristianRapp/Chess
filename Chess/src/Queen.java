
public class Queen extends Piece {


	public Queen(int xC, int yC, String c)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Queen";
		abr = "Q";
	}
	
	public Queen(int xC, int yC, String c, String a)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Queen";
		abr = a;
	}
	
	public Queen()
	{
		
	}
	
	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		
		if(rookValidMove(ixP,iyP,fxP,fyP) || bishopValidMove(ixP,iyP,fxP,fyP))
		return true;
		
		return false;
		
	}
	
	
	public boolean rookValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		Boolean isNotBlocked = false;
		
		if(ixP == fxP && iyP < fyP)
			{
			isNotBlocked = true;
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
				isNotBlocked = true;
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
			isNotBlocked = true;
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
			isNotBlocked = true;
		for(int i=ixP -1; i>fxP; i--)
		{
		if(ChessMain.board[i][iyP] instanceof Empty)
		{
			
		}
		
		
		else{
			isNotBlocked = false;}
		}
		
		}
		
		if(ChessMain.board[fxP][fyP] instanceof Empty || !(ChessMain.board[fxP][fyP].color == this.color))
			{
				
			}
		else
			{
				isNotBlocked = false;
			}
		return isNotBlocked;
		
	}
	
	public boolean bishopValidMove(int ixP, int iyP,int fxP, int fyP)
	{
		boolean isNotBlocked = false;
		
		double ratioX;
		
		if(fxP > ixP)
			ratioX= fxP - ixP;
		
		else if(ixP > fxP)
			ratioX = ixP -fxP;
		
		else
			ratioX = -1;
		
		
		double ratioY;
		
		if(fyP > iyP)
			ratioY= fyP - iyP;
		
		else if(iyP > fyP)
			ratioY = iyP -fyP;
		
		else
			ratioY = -2;
		
		if(ratioX / ratioY == 1)
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
