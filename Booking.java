
package GroupProject1;
import java.util.*;
// Class Definition File (CDF)


//Description: A class which defines Booking objects. A booking is instantiated with several details about each specific booking,
//as well as an object from the room class assigning a specific Room object to each booking object.
//Contributed by Brendan Boyle and Andrew Taylor
public class Booking 
{
    // Data Fields
    public Room bookedRoom;
    public Guest bookingGuest;
    public int bookingYear;
    public int checkInDay;
    public int checkOutDay;
    public ArrayList<RoomService> roomServices = new ArrayList<RoomService>();
    
    public static int nextID = 0;

    // Constructors
    public Booking(Guest bookingGuest, Room bookedRoom, int year, int checkIn, 
            int checkOut)
    {
        this.bookedRoom = bookedRoom;
        this.bookingGuest = bookingGuest;
        this.bookingYear = year;
        this.checkInDay = checkIn;
        this.checkOutDay = checkOut;
        this.bookedRoom.bookRoom();
    }

    // Methods
    public void addRoomService(RoomService r)
    {
        this.roomServices.add(r);
    }
    //Returns a string with a description of a specific booking
    public String describeBooking()
    {
        String answer = "";
        answer += ("Booking Guest: " + this.bookingGuest.describeGuest() + "\nBooked Room: " 
                + this.bookedRoom.roomDescription() + "\nBooking Year: " 
                + this.bookingYear + "\nCheck in: " + this.checkInDay 
                + "\nCheck Out: " + this.checkOutDay);
        return answer;
    }
    //ends booking - which frees the room associated with the booking
    public void endBooking()
    {
        this.bookedRoom.freeThisRoom();
    }
}
