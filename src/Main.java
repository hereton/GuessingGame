/**
 * Create a main class to launch the program.
 * @author hereton
 *
 */
public class Main {

	public static void main(String[]args){
		GuessingGame game = new GuessingGame(100);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
