import java.time.LocalDate;


public class ZooAnimal {
	/**
	 * The last date on which this animal was fed.
	 */
	private LocalDate lastFeed;
	
	/**
	 * The name of the animal.
	 */
	private String name;

	private boolean isFed;
	
	public ZooAnimal(String name) {
		this.name = name;
		this.isFed = false;
	}
	
	public LocalDate getLastFeed() {
		return lastFeed;
	}
	
	
	/**
	 * Returns true iff the animal was fed already today.
	 * @return true if the animal was fed today
	 */
	public boolean isFedAlready() {

		if (isFed == false) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void feed() {
		isFed = true;
		System.out.println("Feeding the " + name);
	}
	
	public String getName() {
		return name;
	}
}
