import java.util.Random; //for random numbers

/**
 * game of guessing a secret number
 * 
 * @author totsapon menkul
 *
 */
public class GuessingGame {
	private int upperBound;
	private int secretNumber;
	private String hint;
	private int count = 0;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperBound
	 *            is the upper bound for the secret number. Must be greater than
	 *            1.
	 */
	public GuessingGame(int upperBound) {
		// this is constructor
		this.upperBound = upperBound;
		secretNumber = getRandomNumber(upperBound);
		this.hint = "I am thinking about number 1 to " + upperBound;
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number.
	 * @return a random number between 1 and limit.
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		return random.nextInt(limit) + 1;
	}

	/**
	 * 
	 * @param guessNumber
	 *            is a number of user input.
	 *
	 * @return return true if user input number is correct with secret number.
	 *         // return false if user input number is not the same as secret
	 *         number.
	 */
	public boolean guess(int guessNumber) {
		// test user input number
		if (guessNumber == secretNumber) 
		{
			this.hint = "Correct.  The secret number is " + secretNumber;
			return true;
		} 
		else if (guessNumber > secretNumber) 
		{
			this.hint = "Sorry, your guess is too big";
			return false;
		} 
		else 
		{
			this.hint = "Sorry, your guess is too small";
			return false;

		}
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess.
	 */
	public String getHint() {
		return this.hint;
	}

	/**
	 * Return a secret number.
	 * 
	 * @return a secret number
	 */
	public int getsecretNumber() {
		return this.secretNumber;
	}

	/**
	 * Return a user guessed number
	 * 
	 * @return a user guessed number
	 */
	public int getCount() {
		return this.count;
	}

}
