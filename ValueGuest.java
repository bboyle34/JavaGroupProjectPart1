
package GroupProject1;
// Class Definition File (CDF)

public class ValueGuest extends Guest
{
    // Data Fields
    private String savingsNumber;
    private int numberOfBookings;
    private double amountSpentWithHotel;

    // Constructors
    public ValueGuest(String username, String password, String guestName)
    {
        super(username, password, guestName);
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
}
