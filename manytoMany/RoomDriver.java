package manytoMany;

public class RoomDriver {
	public static void main(String[] args) {
		Room room = new Room(600);
		House house = new House("blue",room);
		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());
		System.out.println(room.getArea());
	}
}
