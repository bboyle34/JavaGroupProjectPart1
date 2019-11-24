//Description: A class that defines specific guest objects for the hotel. Contains methods
//to describe guests and also a method to check login credentials
//contributed by Brendan Boyle
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
    //checks to ensure that credentials sent in as username and password
    //match ones stored in memory upon creation of guest object.
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
    
    //getter for guest name
    public String getGuestName()
    {
        return this.guestName;
    }
    
    //getter for username
    public String getUsername()
    {
        return this.username;
    }
    
    //setter for guest name
    public void setGuestName(String guestName)
    {
        this.guestName = guestName;
    }
    
    //setter for guest password, requires old and new
    //password as parameters
    public int setPassword(String oldP, String newP)
    {
        if (this.password.equalsIgnoreCase(oldP))
        {
            this.password = newP;
        }
        return 0;
    }
    
    //method which returns as a string a description of a guest
    public String describeGuest()
    {
        String answer = "";
        answer += ("Guest Name: " + this.getGuestName() 
                + ", Guest Username: " + this.getUsername());
        return answer;
    }
}
