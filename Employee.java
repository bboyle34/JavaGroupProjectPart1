
package GroupProject1;
// Class Definition File (CDF)

public class Guest 
{
    // Data Fields
    private int guestID;
    private String username;
    private String password;
    private String guestName;
    
    public static int nextID = 0;

    // Constructors
    public Guest(String username, String password, String guestName)
    {
        this.guestID = nextID++;
        this.username = username;
        this.password = password;
        this.guestName = guestName;
    }

    // Methods
    public boolean checkCredentials(String username, String password)
    {
        if (this.username.equals(username) && this.password.equals(password))
        {
                return true;
        }
        else
        {
            return false;
        }
    }
    public String getGuestName()
    {
        return this.guestName;
    }
    public String getUsername()
    {
        return this.username;
    }
    public void setGuestName(String guestName)
    {
        this.guestName = guestName;
    }
    public int setPassword(String oldP, String newP)
    {
        if (this.password.equalsIgnoreCase(oldP))
        {
            this.password = newP;
        }
        return 0;
    }
    public String describeGuest()
    {
        String answer = "";
        answer += ("Guest Name: " + this.getGuestName() 
                + ", Guest Username: " + this.getUsername());
        return answer;
    }
}
