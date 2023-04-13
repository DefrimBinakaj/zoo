
/**
 * Unchecked exception since it represents an error which the program controls
 */

public class AlreadyFedException extends Exception{

	public AlreadyFedException(String outputMsg) {
		System.err.println(outputMsg);
	}

}