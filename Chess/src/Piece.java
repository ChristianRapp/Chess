
public abstract class Piece
	{

		protected String name;
		protected int xCoord;
		protected int yCoord;
		protected String abr;
		protected boolean isFirstMove;
		protected String color;
		
		
		public abstract boolean isValidMove(int ixP, int iyP, int fxP, int fyP);
		
		public void makeMove(String iP, String fP)
		{
			
			 int iy1 = Integer.parseInt(iP,1)-1;
			 int ix1 = 0;
			 
			 switch(iP.substring(0,1))
			 {
			 case "A":
				 ix1 = 7;
				 break;
			 case "B":
				 ix1 = 6;
				 break;
			 case "C":
				 ix1 = 5;
				 break;
			 case "D":
				 ix1 = 4;
				 break;
			 case "E":
				 ix1 = 3;
				 break;
			 case "F":
				 ix1 = 2;
				 break;
			 case "G":
				 ix1 = 1;
				 break;
			 case "H":
				 ix1 = 0;
				 break;
			 }
			 
			 
			 
			 int iy2 = Integer.parseInt(fP,1) -1;
			 int ix2 = 0;
			 
			 switch(fP.substring(0,1))
			 {
			 case "A":
				 ix2 = 7;
				 break;
			 case "B":
				 ix2 = 6;
				 break;
			 case "C":
				 ix2 = 5;
				 break;
			 case "D":
				 ix2 = 4;
				 break;
			 case "E":
				 ix2 = 3;
				 break;
			 case "F":
				 ix2 = 2;
				 break;
			 case "G":
				 ix2 = 1;
				 break;
			 case "H":
				 ix2 = 0;
				 break;
			 }
			 
			 this.isValidMove(ix1, iy1, ix2, iy2);
			 
			 
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
