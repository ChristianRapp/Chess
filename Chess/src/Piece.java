
public abstract class Piece
	{

		protected String name;
		protected int xCoord;
		protected int yCoord;
		protected String abr;
		protected boolean isFirstMove;
		protected String color;
		
		
		public abstract boolean isValidMove(String iP, String fP);
		
		public void makeMove(String iP, String fP)
		{
			
			int y1 = Integer.parseInt(iP,1)-1;
			 int x1;
			 
			 switch(iP.substring(0,1))
			 {
			 case "A":
				 x1 = 0;
				 break;
			 case "B":
				 x1 = 1;
				 break;
			 case "C":
				 x1 = 2;
				 break;
			 case "D":
				 x1 = 3;
				 break;
			 case "E":
				 x1 = 4;
				 break;
			 case "F":
				 x1 = 5;
				 break;
			 case "G":
				 x1 = 6;
				 break;
			 case "H":
				 x1 = 7;
				 break;
			 }
			 
			 
			 
			 int y2 = Integer.parseInt(fP,1) -1;
			 int x2;
			 
			 switch(fP.substring(0,1))
			 {
			 case "A":
				 x1 = 0;
				 break;
			 case "B":
				 x1 = 1;
				 break;
			 case "C":
				 x1 = 2;
				 break;
			 case "D":
				 x1 = 3;
				 break;
			 case "E":
				 x1 = 4;
				 break;
			 case "F":
				 x1 = 5;
				 break;
			 case "G":
				 x1 = 6;
				 break;
			 case "H":
				 x1 = 7;
				 break;
			 }
			 
			 isValidMove()
			 
			 
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
