
public class Fish {

	private String typeOfFish;
	private int friendliness;
	private String fishName;

	public Fish() {

		typeOfFish = "Unknown";
		friendliness = 3;
		fishName = "Unknown";
	}

	public Fish(String t, int f, String name) {

		fishName = name;
		typeOfFish = t;
		friendliness = f;
	}

	public int getFriendliness() {

		return friendliness;
	}

	public String getTypeOfFish() {
		return typeOfFish;
	}

	public String getFishName() {
		return fishName;
	}
	
	public void ShowInfo() {
		
		System.out.println("Name = "+fishName+" Friendliness = "+friendliness+" Type = "+typeOfFish);
	}
}
