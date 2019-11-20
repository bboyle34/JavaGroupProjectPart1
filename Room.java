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
    private String roomStatus;
    
    public static int nextID = 0;

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
        this.roomStatus = "Active";
    }

    // Methods
    public void setRoomActivity(String status)
    {
        this.roomStatus = status;
    } 
    
    public String getRoomActivity()
    {
        return this.roomStatus;
    }
    
    
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
            this.roomBookedQuantity++;
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
                + "\n" + "Bed is: " + this.printBedOption() +"\n"
                + "Kitchen is: " + this.printKitchOption() + "\n"
                + "Coffee machine is: " + this.printCoffeeOption() + "\n"
                + "Accessibility option is: " + this.printAccessOption() + "\n"
                + "Room booked status: " + this.printRoomBooked() + "\n"
                + "Room cost per night is: " + this.roomCostPerNight + "\n");    
        return answer;
    }
    public String printBedOption()
    {
        String bed = "";
        if(this.bedOption == 0)
            bed += "1 Queen bed";
        
        else if(this.bedOption == 1)
            bed+= "2 Queen beds";
        
        else if(this.bedOption == 2)
            bed+= "1 King bed";
        
        return bed;
    }
    
    public String printKitchOption()
    {
        String kitch = "";
        if(this.kitchenOption == 0)
            kitch += "Microwave";
        else if(this.kitchenOption == 1)
            kitch += "Fridge + Microwave";
        return kitch;
    }
    
    public String printCoffeeOption()
    {
        String coffee = "";
        if(this.coffeeOption == 0)
            coffee += "1-Cup Std. Coffee Machine";
        else if(this.coffeeOption == 1)
            coffee += "Keurig Hot K200 Machine";
        return coffee;
    }
    
    public String printAccessOption()
    {
        String access = "";
        if(this.accessibleOption == 0)
            access += "Standard Room";
        else if(this.accessibleOption == 1)
            access += "Enhanced Accessibility Room";
        return access;
    }
    
    public String printRoomBooked()
    {
        String check = "";
        if(roomBooked == false)
            check += "Room not booked";
        else if(roomBooked == true)
            check += "Room is booked";
        return check;
    }
    
    public boolean setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
        return false;
    }
}
