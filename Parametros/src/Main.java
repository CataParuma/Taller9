
public class Main {

	public static void main(String[] args) {

		Fish fish1 = new Fish("AngelFish", 5, "Amber");
		Fish fish2 = new Fish("Guppy", 3, "James");
		
		Fish n=nicestFish(fish1, fish2);
		System.out.println("Nicest Fish: ");
		n.ShowInfo();
	}
	
	public static Fish nicestFish(Fish fish1, Fish fish2) {


		if (fish1.getFriendliness() > fish2.getFriendliness()) {
			return fish1;
		} else
			return fish2;
	}

	public static Fish nicestFish(Fish[] fishes) {
		
		int temp = 0;

		for (int i = 0; i < fishes.length; i++) {

			if (fishes[i].getFriendliness() > fishes[temp].getFriendliness()) {
				temp = i;
			}
		}
		return fishes[temp];
	}
}
