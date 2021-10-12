package ie.itcarlow.lab2;

public class HotelRoom {
	
	private int roomNumber;
	private String roomType;
	private int occupied;
	private double rate;
	
	public HotelRoom() {
		roomNumber = 0;
		roomType = "Single";
	}
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int newRoomNumber) {
		roomNumber = newRoomNumber;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public int getOccupied() {
		return occupied;
	}
	
	public void setOccupied(int newOccupied) {
		occupied = newOccupied;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double newRate) {
		rate = newRate;
	}
}
