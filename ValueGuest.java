
package GroupProject1;
// Class Definition File (CDF)

public class ValueGuest extends Guest
{
    // Data Fields
    private String savingsNumber;
    private int numberOfBookings;
    private double amountSpentWithHotel;
    
    public static ValueGuest[] valueGuests = new ValueGuest[1000];
    public static int nextValueGuest = 0;

    // Constructors
    public ValueGuest(String username, String password, String guestName)
    {
        super(username, password, guestName);
        valueGuests[nextValueGuest++] = this;
    }

    // Methods
    public double getAmountSpentWithHotel()
    {
        return this.amountSpentWithHotel;
    }
    public int getNumberOfBookings()
    {
        return this.numberOfBookings;
    }
    public String getSavingsNumber()
    {
        return this.savingsNumber;
    }
    public static int nextSpot()
    {
        int position = 0;
        while (valueGuests[position + 1] != null)
        {
            position++;
        }
        return position;
    }
}
