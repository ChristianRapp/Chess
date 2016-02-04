
public class Knight extends Piece {


	public Knight(int xC, int yC, String c)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Knight";
		abr = "H";
	}
	
	public Knight(int xC, int yC, String c, String a)
	{
		isFirstMove = true;
		xCoord =xC;
		yCoord = yC;
		color = c;
		name = "Knight";
		abr = a;
	}
	
	public boolean isValidMove(int ixP, int iyP, int fxP, int fyP)
	{
		
		if((ixP + 2 == fxP && iyP + 1 == fyP) && (ChessMain.board[fxP][fyP] instanceof Empty || !this.color.equals(ChessMain.board[fxP][fyP].getColor())))
			{
			return true;	
			}
		
		if((ixP + 2 == fxP && iyP - 1 == fyP) && (ChessMain.board[fxP][fyP] instanceof Empty || !this.color.equals(ChessMain.board[fxP][fyP].getColor())))
			{
			return true;	
			}
		
		if((ixP + 1 == fxP && iyP + 2 == fyP) && (ChessMain.board[fxP][fyP] instanceof Empty || !this.color.equals(ChessMain.board[fxP][fyP].getColor())))
			{
			return true;	
			}
		
		if((ixP + 1 == fxP && iyP - 2 == fyP) && (ChessMain.board[fxP][fyP] instanceof Empty || !this.color.equals(ChessMain.board[fxP][fyP].getColor())))
			{
			return true;	
			}
		
		
		if((ixP - 2 == fxP && iyP + 1 == fyP) && (ChessMain.board[fxP][fyP] instanceof Empty || !this.color.equals(ChessMain.board[fxP][fyP].getColor())))
			{
			return true;	
			}
		
		if((ixP - 2 == fxP && iyP - 1 == fyP) && (ChessMain.board[fxP][fyP] instanceof Empty || !this.color.equals(ChessMain.board[fxP][fyP].getColor())))
			{
			return true;	
			}
		
		if((ixP - 1 == fxP && iyP + 2 == fyP) && (ChessMain.board[fxP][fyP] instanceof Empty || !this.color.equals(ChessMain.board[fxP][fyP].getColor())))
			{
			return true;	
			}
		
		if((ixP - 1 == fxP && iyP - 2 == fyP) && (ChessMain.board[fxP][fyP] instanceof Empty || !this.color.equals(ChessMain.board[fxP][fyP].getColor())))
			{
			return true;	
			}
		
		
		return false;
		
	}
	
}
