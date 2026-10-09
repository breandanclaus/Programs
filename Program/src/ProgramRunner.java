import java.util.ArrayList;
public class ProgramRunner
	{

		public static void main(String[] args)
			{
				ArrayList<Show> tvShows = initializeList();
				printList(tvShows);
				Grid.display();
				changeFirst(tvShows);
				printList(tvShows);
				deleteLongest(tvShows);
				printList(tvShows);

			}

		

		private static ArrayList<Show> initializeList()
			{
				Show showOne = new Show("IT", "Horror", 1, "1990");
				Show showTwo = new Show("Seinfeld", "Comedy", 9, "1989");
				Show showThree = new Show("Arcane", "Science Fiction", 2, "2019");
				Show showFour = new Show("Fargo", "Crime", 5, "2016");
				Show showFive = new Show("Severance", "Drama", 2, "2022");
				ArrayList<Show> tvShows = new ArrayList<Show>();
				tvShows.add(showOne);
				tvShows.add(showTwo);
				tvShows.add(showThree);
				tvShows.add(showFour);
				tvShows.add(showFive);
				
				return tvShows;
			}



		private static void printList(ArrayList<Show> tvShows)
			{
				for (int i = 0; i < tvShows.size(); i++)
					{
						Grid.grid[i][0] = "Title: " + tvShows.get(i).getTitle() + ", ";
						Grid.grid[i][1] = "Genre: " + tvShows.get(i).getGenre() + ",";
						Grid.grid[i][2] = " Number of Seasons: " + tvShows.get(i).getNumberOfSeasonsAired() + ",";
						Grid.grid[i][3] = " Years Aired: " + tvShows.get(i).getYearsAired();
					}
			}
		
		private static void changeFirst(ArrayList<Show> tvShows)
			{
				String newTitle = "IT:";
				tvShows.get(0).setTitle(newTitle);
				tvShows.set(0, tvShows.get(0));
			}
		
		private static void deleteLongest(ArrayList<Show> tvShows)
			{
				int longest = tvShows.get(0).getTitle().length();
				int longestShow = 0;
				
				for (int i = 0; i < 5; i++)
					{
						if (tvShows.get(i).getTitle().length() > longest)
							{
								longestShow = i;
								longest = tvShows.get(i).getTitle().length();
							}
						else
							{
								continue;
							}
					}
				tvShows.remove(longestShow);
			}
	}
