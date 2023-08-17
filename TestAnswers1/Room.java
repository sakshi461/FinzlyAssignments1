package com.javabysakshi.TestAnswers1;
import java.util.Date;
public class Room {
		private int roomNumber;
		private int capacity;
		private double pricePerNight;
		 public int getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public double getPricePerNight() {
			return pricePerNight;
		}
		public void setPricePerNight(double pricePerNight) {
			this.pricePerNight = pricePerNight;
		}
		public Room(int roomNumber, int capacity, double pricePerNight) {
			super();
			this.roomNumber = roomNumber;
			this.capacity = capacity;
			this.pricePerNight = pricePerNight;
		}
		/////////////////////////////////////////////////
				public boolean isAvailable()
				{
					if(capacity>0)
					{
						return true;
						
					}
					else
					{
						return false;
					}
				}
				    public void reservation()
				{
				 if(isAvailable())
				 {
					 System.out.println("Room "+roomNumber+"   reserved!!!");
					 capacity--;
				 }
				 else
				 {
					System.out.println("No empty room "); 
				 }
				}

				public void reservation (int  checkin,int  checkout)
				{
					if(isAvailable())
					{
						System.out.println("Room booked !!! for "+checkin+"to day "+checkout);
					}
					//System.out.println("Successfully reserved room from  "+checkin+"to "+checkout);
					else
					{
						System.out.println("No room Avialable!!!!!!!!!!");
					}
				
				}
@Override
public String toString() {
	return "Room [roomNumber= "  + roomNumber +", pricePerNight= " + pricePerNight + " ";
}

}
