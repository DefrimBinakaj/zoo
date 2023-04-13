public class ZooShow {
	
	public static void main(String[] args) throws AlreadyFedException, NotPlayingException {
		// create the artist
		Artist artistPerson = new Artist();

		// create the zoo
		Zoo zooAnimal = new Zoo();

		artistPerson.startPlaying();

		// while there are animals that still need feeding,
		// randomly select an animal from the zoo
		// feed it
		while (zooAnimal.allAnimalsFed() == false) {
			
			try {
			artistPerson.feed(zooAnimal.getRandomAnimalToComeToStage());
			}
			catch(NotPlayingException e) {
				artistPerson.startPlaying();
			}
			catch(AlreadyFedException e) {
				// nothing
			}
		}

		artistPerson.stopPlaying();

	}
}
