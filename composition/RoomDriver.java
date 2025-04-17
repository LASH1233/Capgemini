package composition;

public class RoomDriver {
	public static void main(String[] args) {
		House house = new House("blue",600);
//		house = null;
		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());
	}
}
