
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
			int [] arr = new int[2];
			int kingPosX = 0;
			int kingPosY = 0;
			if(this.color.equals("White"))
						{
						arr = findWhiteKing();
						kingPosX = arr[0];
						kingPosY = arr[1];
						}
			
			else if(this.color.equals("Black"))
				{
				arr = findBlackKing();
				kingPosX = arr[0];
				kingPosY = arr[1];
				}
					
			for(int row =0; row < 8; row++)
				{
					
				for(int col =0; col <8; col++)
					{
					
						if(!(ChessMain.board[row][col].color == this.color))
							{
							
							if(ChessMain.board[row][col].isValidMove(row, col, kingPosX, kingPosY))
								{
									
								}
							else
								{
								isCheck = false;
								}
								
							}
						
						
					}
			
					
					
				}
			return isCheck;
		}
		
		public int[] findWhiteKing()
		{
			
			int[] kingPos = new int[2];
			
			for(int row=0; row<8;row++)
				{
					for(int col = 0; col<8; col++)
						{
						if(ChessMain.board[row][col].getColor().equals("White") && ChessMain.board[row][col].name.equals("King"))
							{
							kingPos[0] = row;
							kingPos[1] = col;
							}
						}
				}
			
			
			return kingPos;
				
		}
		
		
		public int[] findBlackKing()
			{
				
				int[] kingPos = new int[2];
				
				for(int row=0; row<8;row++)
					{
						for(int col = 0; col<8; col++)
							{
							if(ChessMain.board[row][col].getColor().equals("Black") && ChessMain.board[row][col].name.equals("King"))
								{
								kingPos[0] = row;
								kingPos[1] = col;
								}
							}
					}
				
				return kingPos;
					
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
