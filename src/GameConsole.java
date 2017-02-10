import java.util.Scanner;

/**
 * 
 * @author Totsapon menkul
 * @version 1/26/2017
 */
public class GameConsole {

	/** initialize count to count guessed times. */

	/**
	 * the play method play a game using input from a user.
	 * 
	 * @param game
	 *            is variable to run GuessingGame class.
	 * @return return a collect answer.
	 */
	public int play(GuessingGame game) {
		Scanner scanner = new Scanner(System.in);
		String title = "Guessing Game";
		String promptString = "Your guess?";
		System.out.println(title);
		boolean start = true;
		int input = 0;
		System.out.println(game.getHint());
		while (start) {
			System.out.println(promptString);
			input = scanner.nextInt();
			if (game.guess(input) == false) {
				System.out.println(game.getHint());
			} else {
				start = false;
			}
		}
		System.out.println(game.getHint());
		System.out.println("Number of your guessed = " +game.getCount());
		return input;

	}
}
