
public class Pieces
	{
	private static String type;
	private static int team;
	private static boolean captured;
	public Pieces(String i, int o, boolean p)
		{
		setType(i);
		setTeam(o);
		setCaptured(p);
		}
	public static void pawn()
		{
		
		}
	public static void rook()
		{
		
		}
	public static void knight()
		{
		
		}
	public static void bishop()
		{
		
		}
	public static void king()
		{
		
		}
	public static void queen()
		{
		
		}
	public static String getType()
		{
		return type;
		}
	public static void setType(String type)
		{
		Pieces.type = type;
		}
	public static int getTeam()
		{
		return team;
		}
	public static void setTeam(int team)
		{
		Pieces.team = team;
		}
	public static boolean isCaptured()
		{
		return captured;
		}
	public static void setCaptured(boolean captured)
		{
		Pieces.captured = captured;
		} 
	}
