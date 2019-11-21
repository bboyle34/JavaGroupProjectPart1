
package GroupProject1;
// Class Definition File (CDF)

public class Booking 
{
    // Data Fields
    public Room bookedRoom;
    public Guest bookingGuest;
    public int bookingYear;
    public int checkInDay;
    public int checkOutDay;
    
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
    public String describeBooking()
    {
        String answer = "";
        answer += ("Booking Guest: " + this.bookingGuest.describeGuest() + "\nBooked Room: " 
                + this.bookedRoom.roomDescription() + "\nBooking Year: " 
                + this.bookingYear + "\nCheck in: " + this.checkInDay 
                + "\nCheck Out: " + this.checkOutDay);
        return answer;
    }
    public void endBooking()
    {
        this.bookedRoom.freeThisRoom();
    }
}
