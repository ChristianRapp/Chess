import java.util.*;

public class ChessMain
	{
	static Piece[][] board = new Piece[8][8];
		public static void main(String[] args)
			{
			
			
			
				/*Chess move format is as follows
				*You state the position of the piece you wish to move.
				*Followed by the position you would like to move it too.
				*If piece cannot be moved there possibly give a reason why?
				Take the move again without printing the board*/
				addBlackPieces();
				addWhitePieces();
				addEmptySpaces();
				printBoard();
				
				

			}
		public static void takeMove(Piece p)
		{
			 Scanner userMove = new Scanner(System.in);
			 String[] move = userMove.nextLine().split(" ");
			 
			 String iP = move[0];
			 String fP = move[1];
			 
			p.makeMove(iP, fP);
			
		}
		
		public static void printBoard()
		{
			
			for(int yCoord =0; yCoord<8; yCoord++)
			{
				System.out.println("    _______________________________________________________________");
				System.out.print("   ");
				for(int i=0; i<9; i++)
					{
					System.out.print("|       ");
					}
				System.out.println();
				
				switch(yCoord)
				{
				case 0:
					System.out.print("8");
					break;
				case 1:
					System.out.print("7");
					break;
				case 2:
					System.out.print("6");
					break;
				case 3:
					System.out.print("5");
					break;
				case 4:
					System.out.print("4");
					break;
				case 5:
					System.out.print("3");
					break;
				case 6:
					System.out.print("2");
					break;
				case 7:
					System.out.print("1");
					break;
						
					
				}
				
				System.out.print("  |");
				for(int xCoord = 0; xCoord<8; xCoord++)
				{
				
				System.out.print("   " + board[yCoord][xCoord].getAbr() + "   |");	
			
				}
				System.out.println();
				System.out.print("   ");
				for(int i=0; i<9; i++)
				{
				System.out.print("|       ");
				}
				System.out.println();
				
			}
			
			System.out.println("    _______________________________________________________________");			
			System.out.println();
			System.out.print("       ");
			for(int x =0; x<8; x++)
			{
				switch(x)
				{
				case 0:
					System.out.print("A");
					break;
				case 1:
					System.out.print("B");
					break;
				case 2:
					System.out.print("C");
					break;
				case 3:
					System.out.print("D");
					break;
				case 4:
					System.out.print("E");
					break;
				case 5:
					System.out.print("F");
					break;
				case 6:
					System.out.print("G");
					break;
				case 7:
					System.out.print("H");
					break;
				}
				System.out.print("       ");
			}
			System.out.println();
			System.out.println();
		}

		
		
		public static void addWhitePieces()
		{
			
		board[0][0] = new Rook(0,0, "Black");
		board[0][1] = new Knight(0,1,"Black");
		board[0][2] = new Bishop(0,2,"Black");
		board[0][3] = new Queen(0,3,"Black");
		board[0][4] = new King(0,4,"Black");
		board[0][5] = new Bishop(0,5,"Black");
		board[0][6] = new Knight(0,6,"Black");
		board[0][7] = new Rook(0,7,"Black");
		
		board[1][0] = new Pawn(1,0,"Black");
		board[1][1] = new Pawn(1,0,"Black");
		board[1][2] = new Pawn(1,0,"Black");
		board[1][3] = new Pawn(1,0,"Black");
		board[1][4] = new Pawn(1,0,"Black");
		board[1][5] = new Pawn(1,0,"Black");
		board[1][6] = new Pawn(1,0,"Black");
		board[1][7] = new Pawn(1,0,"Black");
				
		}
		
		public static void addBlackPieces()
		{
		board[7][0] = new Rook(7,0,"White");
		board[7][1] = new Knight(7,1,"White");
		board[7][2] = new Bishop(7,2,"White");
		board[7][3] = new Queen(7,3,"White");
		board[7][4] = new King(7,4,"White");
		board[7][5] = new Bishop(7,5,"White");
		board[7][6] = new Knight(7,6,"White");
		board[7][7] = new Rook(7,7,"White");
		
		board[6][0] = new Pawn(6,0,"White");
		board[6][1] = new Pawn(6,1,"White");
		board[6][2] = new Pawn(6,2,"White");
		board[6][3] = new Pawn(6,3,"White");
		board[6][4] = new Pawn(6,4,"White");
		board[6][5] = new Pawn(6,5,"White");
		board[6][6] = new Pawn(6,6,"White");
		board[6][7] = new Pawn(6,7,"White");
			
		}
		
		public static void addEmptySpaces()
		{
			
			board[2][0] = new Empty(2,0);
			board[2][1] = new Empty(2,1);
			board[2][2] = new Empty(2,2);
			board[2][3] = new Empty(2,3);
			board[2][4] = new Empty(2,4);
			board[2][5] = new Empty(2,5);
			board[2][6] = new Empty(2,6);
			board[2][7] = new Empty(2,7);
			
			board[3][0] = new Empty(3,0);
			board[3][1] = new Empty(3,1);
			board[3][2] = new Empty(3,2);
			board[3][3] = new Empty(3,3);
			board[3][4] = new Empty(3,4);
			board[3][5] = new Empty(3,5);
			board[3][6] = new Empty(3,6);
			board[3][7] = new Empty(3,7);
			
			board[4][0] = new Empty(4,0);
			board[4][1] = new Empty(4,1);
			board[4][2] = new Empty(4,2);
			board[4][3] = new Empty(4,3);
			board[4][4] = new Empty(4,4);
			board[4][5] = new Empty(4,5);
			board[4][6] = new Empty(4,6);
			board[4][7] = new Empty(4,7);
			
			board[5][0] = new Empty(5,0);
			board[5][1] = new Empty(5,1);
			board[5][2] = new Empty(5,2);
			board[5][3] = new Empty(5,3);
			board[5][4] = new Empty(5,4);
			board[5][5] = new Empty(5,5);
			board[5][6] = new Empty(5,6);
			board[5][7] = new Empty(5,7);
			
			
			
		}
	}
