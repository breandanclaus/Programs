
public class Grid
	{
		static String[][] grid = new String[5][4];
		
		public static void display()
			{
				System.out.println("----------------------------------------------------------------------");
				System.out.println("|" + grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2] + "|" + grid[0][3] + "|");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("|" + grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2] + "|" + grid[1][3] + "|");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("|" + grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2] + "|" + grid[2][3] + "|");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("|" + grid[3][0] + "|" + grid[3][1] + "|" + grid[3][2] + "|" + grid[3][3] + "|");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("|" + grid[4][0] + "|" + grid[4][1] + "|" + grid[4][2] + "|" + grid[4][3] + "|");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Obvious Change");
			}
	}
