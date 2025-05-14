// import scanner
import java.util.Scanner;

public class Main

{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		// instantiate scanner
		NetflixOriginal test = Main.instantiateFromInput(keyboard);

		System.out.println("TEST show = " + test);

		// close scanner
		keyboard.close();

	}

	public static NetflixOriginal instantiateFromInput (Scanner keyboard) {
		String name, genre;
		double starRating;
		boolean isValid;

		NetflixOriginal result = new NetflixOriginal();

		// prompt user for input name
		System.out.print("please enter the name of the show: ");
		name = keyboard.nextLine();
		result.setName(name);

		// prompt user for input starRating(loop)
		do{ 
			System.out.print("Please enter the star rating: ");
			starRating = Double.parseDouble(keyboard.nextLine());
			isValid = result.setStarRating(starRating);

			if(!isValid) {
				System.out.println("ERROR: rating must be between 0.0 and 5.0, inclusive\n");
			}
		} while(!isValid);

		// prompt user for input genre (loop)
		do {
			System.out.print("Please enter the genre: ");
			genre = keyboard.nextLine();
			isValid = result.setGenre(genre);

			if(!isValid) {
				System.out.println("ERROR: genre must be one of the allowed/recognized genres: " + 
				NetflixOriginal.VALID_GENRES_STRING + "\n");
			}

		} while(!isValid);
	

		return result;
	}

}