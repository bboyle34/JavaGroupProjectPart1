
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
    public static Booking[] bookings = new Booking[1000];
    public static int nextBooking = 0;

    // Constructors
    public Booking(Guest bookingGuest, Room bookedRoom, int year, int checkIn, 
            int checkOut)
    {
        this.bookedRoom = bookedRoom;
        this.bookingGuest = bookingGuest;
        this.bookingYear = year;
        this.checkInDay = checkIn;
        this.checkOutDay = checkOut;
        bookings[nextBooking++] = this;
    }

    // Methods
    public void endBooking()
    {
        System.out.println("end");
    }
    public static int nextSpot()
    {
        int position = 0;
        while (bookings[position + 1] != null)
        {
            position++;
        }
        return position;
    }
}