
package GroupProject1;
// Class Definition File (CDF)

public class Room 
{
    // Data Fields
    public int bedOption;
    public int kitchenOption;
    public int coffeeOption;
    public int accessibleOption;
    public int roomNumber;
    private int roomID;
    private int roomBookedQuantity;
    private boolean roomBooked;
    public double roomCostPerNight;
    
    public static int nextID = 0;
    public static Room[] rooms = new Room[1000];
    public static int nextRoom = 0;

    // Constructors
    public Room(int bed, int kitch, int coffee, int accessibility, 
            int roomNumber)
    {
        this.roomID = nextID++;
        this.bedOption = bed;
        this.kitchenOption = kitch;
        this.coffeeOption = coffee;
        this.accessibleOption = accessibility;
        this.roomNumber = roomNumber;
        this.roomBooked = false;
        rooms[nextRoom++] = this;
    }

    // Methods
    public boolean isBooked()
    {
        if (this.roomBooked)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean bookRoom()
    {
        if (this.roomBooked == true)
        {
            return false;
        }
        else
        {
            this.roomBooked = true;
            return this.roomBooked;
        }
    }
    public void freeThisRoom()
    {
        this.roomBooked = false;
    }
    public int getRoomBookedQuantity()
    {
        return this.roomBookedQuantity;
    }
    public int getRoomID()
    {
        return this.roomID;
    }
    public int getRoomNumber()
    {
        return this.roomNumber;
    }
    public String roomAnalytics()
    {
        String answer = "";
        String booked = "";
        if (this.roomBooked)
        {
            booked = "Yes";
        }
        else
        {
            booked = "No";
        }
        answer += ("Room Number: " + this.getRoomNumber() 
                + "\nNumber of times booked: " + this.getRoomBookedQuantity()
                + "\nIs Room currently booked? " + booked); 
        return answer;
    }
    public String roomDescription()
    {
        String answer = "";
        answer += ("Room Number: " + this.getRoomNumber() 
                + "");
        return answer;
    }
    public boolean setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
        return false;
    }
    public static int nextSpot()
    {
        int position = 0;
        while (rooms[position + 1] != null)
        {
            position++;
        }
        return position;
    }
}
