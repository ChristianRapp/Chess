
public abstract class Piece
	{

		protected String name;
		protected int xCoord;
		protected int yCoord;
		protected String abr;
		protected boolean isFirstMove;
		protected String color;
		
		
		public abstract boolean isValidMove(String iP, String fP);


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
