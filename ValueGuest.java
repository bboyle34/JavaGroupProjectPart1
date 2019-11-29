
//Description: A class which defines ValueGuest objects which extends class Guest.
//value guests are returning guests and have some special characteristics like number
//of bookings and total spent with the hotel
//contributed by Dylan Vetter
package GroupProject1;
// Class Definition File (CDF)

public class ValueGuest extends Guest
{
    // Data Fields
    private int valueClubID;
    private int numberOfBookings;
    private double amountSpentWithHotel;

    // Constructors
    public ValueGuest(String username, String password, String guestName)
    {
        super(username, password, guestName);
    }

    // Methods
   //getter for total amount spent with hotel
   public double getAmountSpentWithHotel()
    {
        return this.amountSpentWithHotel;
    }
    
    //getter for number of bookings
    public int getNumberOfBookings()
    {
        return this.numberOfBookings;
    }
    
    //getter for savings number
    public int valueClubID()
    {
        return this.valueClubID;
    }
}
