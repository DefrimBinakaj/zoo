
/**
 * The artist/band that is performing. You must finish this class.
 * @author corpaul
 *
 */
public class Artist implements ZooPerformer {
	/** 
	 * Indicates whether the artist is currently playing (= performing). 
	 */
	private boolean isPlaying;
	
	public Artist() {
		isPlaying = false;
	}
	
	/** 
	 * Feed the animal. Make sure to check whether we are allowed to feed this animal,
	 * and make sure to handle things correctly if we are not allowed to feed it. You are allowed
	 * to change this method's signature, if necessary.
	 * 
	 */
	public void feed(ZooAnimal animal) throws AlreadyFedException, NotPlayingException  {
		//
		// did we already feed this animal today?
		
		if (animal.isFedAlready() == false && isPlaying == true) {
			animal.feed();
		}
		else if (animal.isFedAlready() == true) {
			throw new AlreadyFedException("The " + animal.getName() + " was already fed today!");
		}
		else {
			throw new NotPlayingException("Artist isn't playing!");
		}
	}
	
	
	
	

	/**
	 * Sometimes, artists get distracted, so there is a 50% chance that they start
	 * playing when you call this method. 
	 * 
	 */
	public void startPlaying() {
		// if we are already playing, don't risk getting distracted again
		int indEl = (int) (Math.random() * 2);

		if (indEl == 1) {
			isPlaying = true;
			System.out.println("Artist started playing!");
		}
		else {
			isPlaying = false;
		}
	}

	public void stopPlaying() {
		isPlaying = false;
		System.out.println("Artist stopped playing!");
	}
	
}
