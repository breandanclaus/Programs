import java.util.ArrayList;
public class ProgramRunner
	{

		public static void main(String[] args)
			{
				ArrayList<Show> tvShows = new ArrayList<Show>();
				tvShows.add(new Show("IT", "Horror", 1));
				tvShows.add(new Show("Seinfeld", "Comedy", 9));
				tvShows.add(new Show("Arcane", "Science Fiction", 2));
				tvShows.add(new Show("Fargo", "Crime", 5));
				tvShows.add(new Show("Severance", "Drama", 2));
				printList(tvShows);
				addYear(tvShows);
				printList(tvShows);

			}

		

		private static void printList(ArrayList<Show> tvShows)
			{
				for (int i = 0; i < tvShows.size(); i++)
					{
						System.out.print("Title: " + tvShows.get(i).getTitle() + ", ");
						System.out.print("Genre: " + tvShows.get(i).getGenre() + ",");
						System.out.println(" Number of Seasons: " + tvShows.get(i).getNumberOfSeasonsAired());
					}
			}
		
		private static void addYear(ArrayList<Show> tvShows)
			{
				
				
			}

	}
