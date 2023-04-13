/**
 * Unchecked exception since it represents an error which the program controls
 */

public class NotPlayingException extends Exception{
	
	public NotPlayingException(String outputMsg) {
		System.err.println(outputMsg);
	}

}