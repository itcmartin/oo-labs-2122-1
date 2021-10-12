package ie.itcarlow.lab2;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Welcome to the Hotel System");
		
		HotelRoom roomA = new HotelRoom();
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setOccupied(1);
		roomA.setRate(100.00);
		
		HotelRoom roomB = new HotelRoom();
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setOccupied(0);
		roomB.setRate(80.00);
		
		System.out.println("Information about Room A:");
		System.out.println("Room Number: " + roomA.getRoomNumber());
		System.out.println("Room Type: " + roomA.getRoomType());
		System.out.println("Occupied (0=occupied, 1=vacant): " + roomA.getOccupied());
		System.out.println("Rate: " + roomA.getRate());
		
		System.out.println("Information about Room B:");
		System.out.println("Room Number: " + roomB.getRoomNumber());
		System.out.println("Room Type: " + roomB.getRoomType());
		System.out.println("Occupied (0=occupied, 1=vacant): " + roomB.getOccupied());
		System.out.println("Rate: " + roomB.getRate());

	}

}
