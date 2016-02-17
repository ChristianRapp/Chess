import java.util.*;

public class ChessMain
	{
	static Piece[][] board = new Piece[8][8];
	static King[] kingsRow = new King[2];
	static boolean playing = true;
	static String currentColor = "White";
	static ArrayList<Piece> black = new ArrayList<Piece>();
	static ArrayList<Piece> white = new ArrayList<Piece>();

		public static void main(String[] args)
			{
				
				
				/*Chess move format is as follows
				*You state the position of the piece you wish to move.
				*Followed by the position you would like to move it too.
				*If piece cannot be moved there possibly give a reason why?
				Take the move again without printing the board*/
//				addBlackPieces();
//				addWhitePieces();
				addWhiteUniCode();
				addBlackUniCode();
				addEmptySpaces();
				
				
				
				
				while(playing)
					{
					currentColor = "White";
					printBoard();
					takeMove();
					currentColor = "Black";
					printBoard();
					takeMove();
					}
				

			}
		
		public static void bugDiagonalQueenBishop()
		{
			for(int row =0; row<8;row++)
				{
				for(int col =0; col<8; col++)
					{
					board[row][col] = new Empty(row,col);
					}
				}
		
				board[7][5] = new WhiteQueen(7,5);
			
			
			for(int row =0; row<8;row++)
				{
				for(int col =0; col<8; col++)
					{
					if(board[7][5].isValidMove(7, 5, row, col))
						{
							System.out.println(row + " " + col);
						}
					}
				}
			
		}
		
		
		public static void takeMove()
			{
			 Scanner userMove = new Scanner(System.in);
			 String[] move = userMove.nextLine().split(" ");
			 
			 String iP = move[0];
			 String fP = move[1];
			 
			 String t1 = iP.substring(1,2);
			 
			 int ix1 = Integer.parseInt(t1);
			 int iy1 = 0;
			 
			 switch(ix1)
			 	{
			 	case 1:
			 		ix1 = 7;
			 		break;
			 	case 2:
			 		ix1 = 6;
			 		break;
			 	case 3:
			 		ix1 = 5;
			 		break;
			 	case 4:
			 		ix1 = 4;
			 		break;
			 	case 5:
			 		ix1 = 3;
				 	break;
			 	case 6:
			 		ix1 = 2;
			 		break;
			 	case 7:
			 		ix1 = 1;
				 	break;
			 	case 8:
			 		ix1 = 0;
			 		break;
			 	}
	
			 switch(iP.substring(0,1))
			 	{
			 	case "A":
			 	case "a":
			 		iy1 = 0;
			 		break;
			 	case "B":
			 	case "b":
			 		iy1 = 1;
			 		break;
			 	case "C":
			 	case "c":
			 		iy1 = 2;
			 		break;
			 	case "D":
			 	case "d":
			 		iy1 = 3;
			 		break;
			 	case "E":
			 	case "e":
			 		iy1 = 4;
			 		break;
			 	case "F":
			 case "f":
				 iy1 = 5;
				 break;
			 case "G":
			 case "g":
				 iy1 = 6;
				 break;
			 case "H":
			 case "h":
				 iy1 = 7;
				 break;
			 }

			 
			 String t2 = fP.substring(1,2);
			 int ix2 = Integer.parseInt(t2);
			 int iy2 = 0;
			 
			 switch(ix2)
			 {
			 case 1:
				 ix2 = 7;
				 break;
			 case 2:
				 ix2 = 6;
				 break;
			 case 3:
				 ix2 = 5;
				 break;
			 case 4:
				 ix2 = 4;
				 break;
			 case 5:
				 ix2 = 3;
				 break;
			 case 6:
				 ix2 = 2;
				 break;
			 case 7:
				 ix2 = 1;
				 break;
			 case 8:
				 ix2 = 0;
				 break;
			 }
			 
			 switch(fP.substring(0,1))
			 {
			 case "A":
			 case "a":
				 iy2 = 0;
				 break;
			 case "B":
			 case "b":
				 iy2 = 1;
				 break;
			 case "C":
			 case "c":
				 iy2 = 2;
				 break;
			 case "D":
			 case "d":
				 iy2 = 3;
				 break;
			 case "E":
			 case "e":
				 iy2 = 4;
				 break;
			 case "F":
			 case "f":
				 iy2 = 5;
				 break;
			 case "G":
			 case "g":
				 iy2 = 6;
				 break;
			 case "H":
			 case "h":
				 iy2 = 7;
				 break;
			 }
		if(board[ix1][iy1].getColor().equals(currentColor))
			{	
	
			board[ix1][iy1].makeMove(ix1, iy1, ix2, iy2);
			
			}
		else
			{
			System.out.println("It is not your turn to move");
			takeMove();
			}
			
		}
		
		public static void printBoard()
		{
			
			for(int xCoord =0; xCoord<8; xCoord++)
			{
				System.out.println("    _______________________________________________________________");
				System.out.print("   ");
				for(int i=0; i<9; i++)
					{
					System.out.print("|       ");
					}
				System.out.println();
				
				switch(xCoord)
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
				for(int yCoord = 0; yCoord<8; yCoord++)
				{
					
				if(!board[xCoord][yCoord].getAbr().equals(" ")){
					
				System.out.print("   " + board[xCoord][yCoord].getAbr() +"\u2009"+"\u2009"+"\u2009" +"\u2009" +"\u2009"+"  |");	
				}else
					System.out.print("   " + board[xCoord][yCoord].getAbr() + "   |");
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

		public static void addBlackUniCode()
		{
			
		board[0][0] = new BlackRook(0,0);
		board[0][1] = new BlackKnight(0,1);
		board[0][2] = new BlackBishop(0,2);
		board[0][3] = new BlackQueen(0,3);
		board[0][4] = new BlackKing(0,4);
		kingsRow[1] = new BlackKing(0,4);
		board[0][5] = new BlackBishop(0,5);
		board[0][6] = new BlackKnight(0,6);
		board[0][7] = new BlackRook(0,7);
		
		board[1][0] = new BlackPawn(1,0);
		board[1][1] = new BlackPawn(1,1);
		board[1][2] = new BlackPawn(1,2);
		board[1][3] = new BlackPawn(1,3);
		board[1][4] = new BlackPawn(1,4);
		board[1][5] = new BlackPawn(1,5);
		board[1][6] = new BlackPawn(1,6);
		board[1][7] = new BlackPawn(1,7);
		
		
		black.add(board[0][0]);
		black.add(board[0][1]);
		black.add(board[0][2]);
		black.add(board[0][3]);
		black.add(board[0][4]);
		black.add(board[0][5]);
		black.add(board[0][6]);
		black.add(board[0][7]);
		black.add(board[1][0]);
		black.add(board[1][1]);
		black.add(board[1][2]);
		black.add(board[1][3]);
		black.add(board[1][4]);
		black.add(board[1][5]);
		black.add(board[1][6]);
		black.add(board[1][7]);

		}
		
		
		public static void addWhiteUniCode()
		{
			board[7][0] = new WhiteRook(7,0);
			board[7][1] = new WhiteKnight(7,1);
			board[7][2] = new WhiteBishop(7,2);
			board[7][3] = new WhiteQueen(7,3);
			board[7][4] = new WhiteKing(7,4);
			kingsRow[0] = new WhiteKing(7,4);
			board[7][5] = new WhiteBishop(7,5);
			board[7][6] = new WhiteKnight(7,6);
			board[7][7] = new WhiteRook(7,7);
			
			
			
			board[6][0] = new WhitePawn(6,0);
			board[6][1] = new WhitePawn(6,1);
			board[6][2] = new WhitePawn(6,2);
			board[6][3] = new WhitePawn(6,3);
			board[6][4] = new WhitePawn(6,4);
			board[6][5] = new WhitePawn(6,5);
			board[6][6] = new WhitePawn(6,6);
			board[6][7] = new WhitePawn(6,7);	
			
			
			white.add(board[0][0]);
			white.add(board[0][1]);
			white.add(board[0][2]);
			white.add(board[0][3]);
			white.add(board[0][4]);
			white.add(board[0][5]);
			white.add(board[0][6]);
			white.add(board[0][7]);
			
			white.add(board[1][0]);
			white.add(board[1][1]);
			white.add(board[1][2]);
			white.add(board[1][3]);
			white.add(board[1][4]);
			white.add(board[1][5]);
			white.add(board[1][6]);
			white.add(board[1][7]);
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
