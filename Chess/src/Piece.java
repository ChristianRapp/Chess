
public abstract class Piece
	{

		protected String name;
		protected int xCoord;
		protected int yCoord;
		protected String abr;
		protected boolean isFirstMove;
		protected String color;
		
		
		public abstract boolean isValidMove(int ixP, int iyP, int fxP, int fyP);
		
		public void makeMove(int ix1, int iy1, int ix2, int iy2)
		{
			
			 
			 
			if(this.isValidMove(ix1, iy1, ix2, iy2) == true && this.isCheck() == false)
				 {
				 ChessMain.board[ix2][iy2] = ChessMain.board[ix1][iy1];	
				 ChessMain.board[ix1][iy1] = new Empty(ix1, iy1);
				 this.setxCoord(ix2);
				 this.setyCoord(iy2);
				 }
			else
				{
				System.out.println("Please enter a valid move");
				ChessMain.takeMove();
				}
			 
			 
			 
		}
 
		public boolean isCheck()
		{
			boolean isCheck = false;
			int kingPosX = 0;
			int kingPosY = 0;
			if(this.color.equals("White"))
				{
				kingPosX = findWhiteKing().xCoord;
				kingPosY = findWhiteKing().yCoord;
				}
			
			else if(this.color.equals("Black"))
				{
				kingPosX = findBlackKing().xCoord;
				kingPosY = findBlackKing().yCoord;
				}
					
			for(int row =0; row < 8; row++)
				{
					
				for(int col =0; col <8; col++)
					{
					
						if(!(ChessMain.board[row][col].color == this.color) && !(ChessMain.board[row][col] instanceof Empty))
							{
							
							if(ChessMain.board[row][col].isValidMove(row, col, kingPosX, kingPosY))
								{
								isCheck = true;	
								}
							else
								{
								
								}
								
							}
						
						
					}
			
					
					
				}
			return isCheck;
		}

		
		public boolean isCheckMate()
		{
			
			for(int row=0; row<8; row++)
				{
				for(int col =0; col<8; col++)
					{
						
					}
					
					
				}
			
			
			return false;
			
		}
		
		
		
		public King findWhiteKing()
		{
			
			return ChessMain.kingsRow[0];
				
		}
		
		
		public King findBlackKing()
			{
				
			return ChessMain.kingsRow[1];
					
			}
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getxCoord() {
			return xCoord;
		}


		public void setxCoord(int xCoord) {
			this.xCoord = xCoord;
		}


		public int getyCoord() {
			return yCoord;
		}


		public void setyCoord(int yCoord) {
			this.yCoord = yCoord;
		}


		public String getAbr() {
			return abr;
		}


		public void setAbr(String abr) {
			this.abr = abr;
		}


		public boolean isFirstMove() {
			return isFirstMove;
		}


		public void setFirstMove(boolean isFirstMove) {
			this.isFirstMove = isFirstMove;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}
		
		
		
	}
