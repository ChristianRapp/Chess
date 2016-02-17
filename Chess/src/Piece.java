
public abstract class Piece
	{

		protected String name;
		protected int xCoord;
		protected int yCoord;
		protected String abr;
		protected boolean isFirstMove;
		protected String color;
		static Piece[][] psuedoboard = new Piece[8][8];
		static Piece[][] checkPsuedoboard = new Piece[8][8];
		
		public abstract boolean isValidMove(int ixP, int iyP, int fxP, int fyP, Piece[][] larry);
		
		public void makeMove(int ix1, int iy1, int ix2, int iy2)
		{
			
			 
			if(isValidMove(ix1, iy1, ix2, iy2) == true)
				 {
				clearBoard();
				if(isCheck() == true)
				{
					
//					if(isCheckMate())
//						{
//						switch(color)
//							{
//							
//							case "White":
//								{
//								System.out.println("White has been checkmated");
//								}
//								
//							case "Black":
//								{
//								System.out.println("Black has been checkmated");
//								}
//							System.out.println("The game is now over");
//							System.exit(0);
//							
//							}
//					
//						}
//					
//					else
						//{
							clearBoard();
							psuedoboard[ix2][iy2] = psuedoboard[ix1][iy1];	
							psuedoboard[ix1][iy1] = new Empty(ix1, iy1);
							
							System.out.println(psuedoboard[ix2][iy2]);
						
							
							
							if(psuedoboard[ix2][iy2].isCheck()){
							System.out.println(color + " is still in check!");
							ChessMain.takeMove();}
							else
							{
							ChessMain.board[ix2][iy2] = ChessMain.board[ix1][iy1];	
							ChessMain.board[ix1][iy1] = new Empty(ix1, iy1);	
							}
							
						//}
					
				
				}
				
				
				
				
				else{
					ChessMain.board[ix2][iy2] = ChessMain.board[ix1][iy1];	
					ChessMain.board[ix1][iy1] = new Empty(ix1, iy1);
					setxCoord(ix2);
					setyCoord(iy2);
					setFirstMove(false);
					clearBoard();
				 
					if(color.equals("Black"))
				 		{
						int xCoord = findWhiteKing().xCoord;
						int yCoord = findWhiteKing().yCoord;
						
						if(ChessMain.board[xCoord][yCoord].isCheck())
						{
						System.out.println("White is now in check!"); 
						}
						
//						else if(ChessMain.board[xCoord][yCoord].isCheckMate())
//							{
//							ChessMain.printBoard();
//							System.out.println("White is now in checkmate!");
//							System.exit(0);
//							}
						
						
				 		}
				 
					if(color.equals("White"))
						{
						int xCoord = findBlackKing().xCoord;
						int yCoord = findBlackKing().yCoord;
//						if(ChessMain.board[xCoord][yCoord].isCheckMate())
//							{
//							ChessMain.printBoard();
//							System.out.println("Black is now in checkmate!"); 
//							System.exit(0);
//							}
						
						if(ChessMain.board[xCoord][yCoord].isCheck())
							{
							System.out.println("Black is now in check!"); 
							}
						}
				 
				 	}
				 }

			
			
			
			else
				{
				System.err.println("Please enter a valid move");
				ChessMain.takeMove();
				}
			 
			 
			 
		}
		
		public void clearBoard()
			{
			for(int a =0; a<8; a++)
				for(int b =0; b<8;b++)
					{
					psuedoboard[a][b] = ChessMain.board[a][b];	
					}
			}
 
		public boolean isCheck()
		{
			int kingPosX = 0;
			int kingPosY = 0;
			
			if(color.equals("White"))
				{
				
				for(int row =0; row < 8; row++)
					{
						
					for(int col =0; col <8; col++)
						{
							int x = findWhite(psuedoboard).xCoord;
							int y = findWhite(psuedoboard).yCoord;
							System.out.println(x +" "+ y + " in the isCheck method");
							if(psuedoboard[row][col].isValidMove(row, col, x, y) && psuedoboard[x][y] instanceof WhiteKing)
								{
								return true;	
								}
						
	
						}	
					}
				
				}
			
			else if(color.equals("Black"))
				{
				for(int row =0; row < 8; row++)
					{
						
					for(int col =0; col <8; col++)
						{
							int x = findBlack(psuedoboard).xCoord;
							int y = findBlack(psuedoboard).yCoord;
							if(psuedoboard[row][col].isValidMove(row, col, x, y)&& psuedoboard[x][y] instanceof BlackKing)
								{
								return true;	
								}			
						}	
					}
				}
					
			
			return false;
		}

		public King findWhite(Piece[][] larry)
		{
			for(int row =0; row<8; row++)
				{
				for(int col=0; col<8; col++)
					{
					if(larry[row][col] instanceof WhiteKing)
						{
						return (King) larry[row][col];
						}
					}
				
				}
			return null;
		}
		
		
		public King findBlack(Piece[][] larry)
		{
			for(int row =0; row<8; row++)
			{
			for(int col=0; col<8; col++)
			{
			if(larry[row][col] instanceof BlackKing)
			{
			return (King) larry[row][col];
			}
			}
				
			}
			return null;
		}
		

		public boolean isCheckMate()
		{
			for(int row=0; row<8; row++)
				{
				for(int col =0; col<8; col++)
					{
						
					if(color.equals(ChessMain.board[row][col].getColor()))
						{
						for(int row2 = 0; row2<8;row2++)
							{
							for(int col2 =0; col2<8; col2++)
								{
								
								clearBoard();
								
								if(psuedoboard[row][col].isValidMove(row, col, row2, col2))
									{
									clearBoard();
									
									psuedoboard[row2][col2] = psuedoboard[row][col];
									psuedoboard[row][col] = new Empty(row, col);
									
									if(psuedoboard[row2][col2].isCheck())
									{
									System.out.println(psuedoboard[row][col].name +" " + row + " "+col+" to " + row2 + " " + col2);
									System.out.println();
									}
									else{
									return false;}
									}
								}
							}
						
						}
					
					}
					
				}
			
			
			return true;
			
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
