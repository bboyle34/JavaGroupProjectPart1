package GroupProject1;
import java.util.*;

public class MadisonHotelApplication 
{
    static ArrayList<Employee> employees = new ArrayList<Employee>();
    static ArrayList<Guest> guests = new ArrayList<Guest>();
    static ArrayList<ValueGuest> valueGuests = new ArrayList<ValueGuest>();
    static ArrayList<Booking> bookings = new ArrayList<Booking>();
    static ArrayList<Room> rooms = new ArrayList<Room>();
    
    public static void main(String[] args) 
    {
        Employee employee1 = new Employee("Adam", "pass", "adam hitchings");
        employees.add(employee1);
        Guest guest1 = new Guest("Brendan", "pass", "brendan boyle");
        guests.add(guest1);
        Guest guest2 = new Guest("John", "pass", "johnny guo");
        guests.add(guest2);
        Employee employee2 = new Employee("Isaac", "pass", "isaac gamble");
        employees.add(employee2);
        Room room1 = new Room(0, 0, 0, 0, 100, 200.0);
        rooms.add(room1);
        Room room2 = new Room(1, 1, 1, 1, 201, 200.0);
        rooms.add(room2);
        Room room3 = new Room(2, 1, 0, 1, 302, 300.0);
        rooms.add(room3);
        ValueGuest valueGuest1 = new ValueGuest("George", "pass", "george moya");
        valueGuests.add(valueGuest1);
        Room room4 = new Room(2, 0, 0, 0, 308, 150.0);
        rooms.add(room4);
        Room room5 = new Room(1, 1, 1, 1, 400, 250.0);
        rooms.add(room5);
        
        
        login();
    }
    public static void guestMenu(int guest)
    {
        // give guests all options for their login and use switch case to 
        //direct them towards their choice
        // display information about they account they logged into
        System.out.println("---------------------------------------------");
        System.out.println("\tGUEST MENU");
        System.out.println(guests.get(guest).describeGuest());
        Scanner in = new Scanner(System.in);
        print();
        System.out.println("(1) Book a room");
        System.out.println("(2) Room Report");
        System.out.println("(3) Edit personal information");
        System.out.println("(0) Back to Login");
        System.out.print("Enter your choice: ");
        int guestChoice = in.nextInt();
        while (guestChoice < 0 || guestChoice > 3)
        {
            System.out.print("Please select a valid option: ");
            guestChoice = in.nextInt();
        }
        switch(guestChoice)
        {
            case 0: login();
                break;
            case 1: bookRoom(guest); 
                break;
            case 2: roomReport(guest) ;
                break;
            case 3: editGuestInfo(guest);
                break;
            default: System.out.println("Please enter a valid option.");                
        }
    }
    public static void employeeMenu(int employee)
    {
        // give employees all options for their login and use switch case
        //to direct them towards their choice
        // display informaiton about the account they logged into
        System.out.println("---------------------------------------------");
        System.out.println("\tEMPLOYEE MENU");
        System.out.println(employees.get(employee).describeEmployee());
        Scanner in = new Scanner(System.in);
        print();
        System.out.println("(1) Run booking report");
        System.out.println("(2) Check guest out");
        System.out.println("(3) Create a guest account");
        System.out.println("(4) Create new employee acount");
        System.out.println("(5) Create or edit a room");
        System.out.println("(0) Back to Login");
        System.out.print("Enter your choice: ");
        int employeeChoice = in.nextInt();
        while (employeeChoice < 0 || employeeChoice > 5)
        {
            System.out.print("Please select a valid option: ");
            employeeChoice = in.nextInt();
        }
        switch(employeeChoice)
        {
            case 0: login();
                break;
            case 1: bookingReport(employee); 
                break;
            case 2: checkGuestOut(employee);
                break;
            case 3: createGuestAccount(employee);
                break;
            case 4: createEmployeeAccount(employee);
                break;
            case 5: createOrEditRoom(employee);
                break;
            default: System.out.println("Please enter a valid option.");                
        }
    }
    public static void login()
    {
        // ask if they want to login
        // use data validation to make sure they either put y or n
        Scanner in = new Scanner(System.in);
        boolean operator = true;
        while (operator)
        {
            System.out.println("Login? (y/n)");
            String login  = in.next();
            if (login.equalsIgnoreCase("y"))
            {
                operator = true;
                break;
            }
            else if (login.equalsIgnoreCase("n"))
            {
                operator = false;
                System.out.println("System exiting . . . ");
            }
            else
            {
                System.out.println("Please enter a valid option");
            }
        }
        // user will input a username and password and the program must loop
        //through the entire employee and guest list using check credentials
        //to see if the username and password they input works with any of the
        //accounts
        while(operator)
        {
            System.out.println("---------------------------------------------");
            System.out.println("\tGUEST AND EMPLOYEE LOGIN");
            print();
            System.out.print("Please enter username: ");
            String username = in.next();
            System.out.print("Please enter password: ");
            String password = in.next();
            for (int i = 0; i < employees.size(); i++)
            {
                if (employees.get(i).checkCredentials(username, password))
                {
                    employeeMenu(i);
                    operator = false;
                    break;
                }
            }
            for (int i = 0; i < guests.size(); i++)
            {
                if (guests.get(i).checkCredentials(username, password))
                {
                    guestMenu(i);
                    operator = false;
                    break;
                }
            }
            for (int i = 0; i < valueGuests.size(); i++)
            {
                if (valueGuests.get(i).checkCredentials(username, password))
                {
                    guestMenu(i);
                    operator = false;
                    break;
                }
            }
        }
    }
    
    // Guest Menu Choices
    public static void bookRoom(int guest)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Here are your room options:"
                + "\n - Bed Options"
                + "\n\t(0) 1 Queen Bed"
                + "\n\t(1) 2 Queen Beds"
                + "\n\t(2) 1 King Bed"
                + "\nWhat is your Bed Choice?");
        int bed = in.nextInt();
        while (bed < 0 || bed > 2)
        {
            System.out.print("Please select a valid option: ");
            bed = in.nextInt();
        }
        System.out.println(" - Kitchen Options"
                + "\n\t(0) Microwave"
                + "\n\t(1) Fridge and Microwave"
                + "\nWhat is your Kitchen Choice?");
        int kitch = in.nextInt();
        while (kitch < 0 || kitch > 1)
        {
            System.out.print("Please select a valid option: ");
            kitch = in.nextInt();
        }
        System.out.println(" - Coffee Options"
                + "\n\t(0) 1-Cup Std. Coffee Machine"
                + "\n\t(1) Keurig Hot K200 Machine"
                + "\nWhat is your Coffee Choice?");
        int coffee = in.nextInt();
        while (coffee < 0 || coffee > 1)
        {
            System.out.print("Please select a valid option: ");
            coffee = in.nextInt();
        }
        System.out.println(" - Accessibility Options"
                + "\n\t(0) Standard Room"
                + "\n\t(1) Enhanced Accessibilty Room"
                + "\nWhat is your Accessibility Choice?");
        int accessibility = in.nextInt();
        while (accessibility < 0 || accessibility > 1)
        {
            System.out.print("Please select a valid option: ");
            accessibility = in.nextInt();
        }
        System.out.println("Here are the available rooms with your specifications: ");
        boolean roomSaver = availableRooms(bed, kitch, coffee, accessibility);
        if (roomSaver)
        {
            System.out.print("Which room number would you like? ");
            int roomNumber = in.nextInt();
            for (int i = 0; i < rooms.size(); i++)
            {
                int temp = rooms.get(i).getRoomNumber();
                if (temp == roomNumber)
                {
                    rooms.get(i).bookRoom();
                    Booking b = new Booking(guests.get(guest), rooms.get(i), 2019, i + 10, i + 20);
                    bookings.add(b);
                }
            }
            System.out.println("Room " + roomNumber + " has succesfully been booked");
        }
        guestMenu(guest);
    }
    public static void availableRooms(int bed, int kitch, int coffee, int accessibility)
    {
        boolean real = true;
        for (int i = 0; i < rooms.size(); i++)
        {
            if ((rooms.get(i).bedOption == bed) 
                    && (rooms.get(i).kitchenOption == kitch) 
                    && (rooms.get(i).coffeeOption == coffee) 
                    && (rooms.get(i).accessibleOption == accessibility)
                    && (rooms.get(i).isBooked() == false)
                    && (rooms.get(i).getRoomActivity().equalsIgnoreCase("Active")))
            {
                System.out.println(rooms.get(i).getRoomNumber());
                real = false;            
            }          
        }
        if (real)
        {
            System.out.println("There are currently no rooms with your specifications");
            return false;
        }
        else
        {
            return true;
        }
    }
    public static boolean availableRoomNumber(int roomnumber) 
    {
        boolean available = true;
        for (int i=0; i< rooms.size(); i++) {
        if (rooms.get(i).roomNumber == roomnumber) {
            available = false;
        }
        }
        return available;
    }    
    public static void roomReport(int guest)
    {
         Scanner in = new Scanner(System.in);
        System.out.println("Select a Room:");

        for (int i = 0; i < rooms.size(); i++)
        {
            System.out.println("[" + i + "] " + rooms.get(i).roomNumber);
        }
        System.out.println("Select: ");
        int temp = in.nextInt();

        if (temp > 0 && temp < rooms.size())
        {
            for (int j = 0; j < rooms.size(); j++)
            {
                if (temp == j)
                {
                    System.out.println("[" + j + "] " + rooms.get(j).roomNumber);
                    // trying to figure out how to describe the room
                }
            }
        }
    }
    public static void editGuestInfo(int guest)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("\tEDIT GUEST INFORMATION");
        System.out.println("Please select what you would like to edit: ");
        print();
        System.out.println("(1) View guest Username");
        System.out.println("(2) Change guest Name");
        System.out.println("(0) Back to Guest Menu");
        System.out.print("Enter your choice: ");
        int infoChoice = in.nextInt();
        while (infoChoice < 0 || infoChoice > 2)
        {
            System.out.print("Please select a valid option: ");
            infoChoice = in.nextInt();
        }
        switch(infoChoice)
        {
            case 0: guestMenu(guest);
            case 1: System.out.println("Guest Username: " + guests.get(guest).getUsername());
                break;
            case 2: System.out.println("Old Guest Name: " + guests.get(guest).getGuestName());
                System.out.print("New Guest Name: ");
                String name = in.next();
                guests.get(guest).setGuestName(name);
                System.out.println("Change confirmed.");
                break;
            default: System.out.println("Please enter a valid option.");
        }
        guestMenu(guest);
        
    }
    // Employee Menu Choices
    public static void bookingReport(int employee)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("RUN A BOOKING REPORT");
        System.out.print("Enter the username of the guest who's account is under the booking: ");
        String username = in.nextLine();
        int guestSpot = 0;
        for (int i = 0; i < guests.size(); i++)
        {
            if (guests.get(i).getUsername().equalsIgnoreCase(username))
            {
                guestSpot = i;
            }
        }
        for (int i = 0; i < bookings.size(); i++)
        {
            if (bookings.get(i).bookingGuest.equals(guests.get(guestSpot)))
            {
                System.out.println(bookings.get(i).describeBooking());
            }
        }
        employeeMenu(employee);
    }
    public static void checkGuestOut(int employee)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the username of the guest you would like to check out: ");
        String username = in.next();
        System.out.print("Please enter the room number they are checking out of: ");
        int roomNumber = in.nextInt();
        int guestSpot = 0;
        for (int i = 0; i < guests.size(); i++)
        {
            if (guests.get(i).getUsername().equalsIgnoreCase(username))
            {
                guestSpot = i;
            }
        }
        int roomSpot = 0;
        for (int i = 0; i < rooms.size(); i++)
        {
            if (rooms.get(i).getRoomNumber() == roomNumber)
            {
                roomSpot = i;
            }
        }
        for (int i = 0; i < bookings.size(); i++)
        {
            if (bookings.get(i).bookingGuest.equals(guests.get(guestSpot))
                    && bookings.get(i).bookedRoom.equals(rooms.get(roomSpot)))
            {
                rooms.get(roomSpot).freeThisRoom();
                bookings.remove(i);
            }
        }        
        employeeMenu(employee);
    }
    public static void createGuestAccount(int employee)
    {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 if you are a Guest or 2 if you are a ValueGuest");
        int value = in.nextInt();
           while (value < 1 || value > 2)
        {
            System.out.print("Please select a valid option: ");
            value = in.nextInt();
        }
        if(value == 1)
        {//For regular guest
            System.out.print("What is the guest's name? ");
            String guestName = in.next();
            System.out.print("What is the guest's username? ");
            String username = in.next();
            System.out.print("What is the guest's password? ");
            String password = in.next();
            Guest g = new Guest(username, password, guestName);
            guests.add(g);
            System.out.println("Guest has been created");
            employeeMenu(employee);
        }
        
        else if(value == 2)
        {//For Valueguest creation
            System.out.print("What is the guest's name? ");
            String guestName = in.next();
            System.out.print("What is the guest's username? ");
            String username = in.next();
            System.out.print("What is the guest's password? ");
            String password = in.next();
            ValueGuest v = new ValueGuest(username, password, guestName);
            valueGuests.add(v);
            System.out.println("ValueGuest has been created");
            employeeMenu(employee);
        }        
    }
    public static void createEmployeeAccount(int employee)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the employee's name? ");
        String employeeName = in.next();
        System.out.print("What is the employee's username? ");
        String username = in.next();
        System.out.print("What is the guest's password? ");
        String password = in.next();
        Employee e = new Employee(username, password, employeeName);
        employees.add(e);
        System.out.println("Guest has been created");
        employeeMenu(employee);
    }
    //in progress by AT
    public static void createOrEditRoom(int employee)
    {
     Scanner in = new Scanner(System.in);
        System.out.print("Create or edit room?");
        print();
        System.out.print("(1) Create\n");
        System.out.print("(2) Edit\n");
        System.out.print("(0) Return to menu");
        print();
        int choice;
        choice = in.nextInt();
        switch(choice) {
            case 1: 
                System.out.print("Enter bed size: \n(0) 1 Queen Bed\n(1) 2 Queen Beds"
                        + "\n(2) 1 King Bed");
                print();
                int bedchoice = in.nextInt();
                System.out.print("Enter Kitchen Option: \n(0) Microwave \n"
                        + "(1) Fridge + Microwave");
                print();
                int kitchenchoice = in.nextInt();
                System.out.print("Enter coffee option: \n(0) 1-Cup Std. Coffee Machine"
                        + "\n(1) Keurig Hot K200 Machine");
                print();
                int coffeechoice = in.nextInt();
                System.out.print("Enter Accessibility Option: \n(0) Standard Room"
                        + "\n(1) Enhanced Accessibility Room");
                print();
                int accesschoice = in.nextInt();
                System.out.print("Enter room number: ");
                int roomnumberchoice = in.nextInt();
                //check to ensure entered room # is available
                while (!(availableRoomNumber(roomnumberchoice))) {
                    print();
                    System.out.print("Sorry, that room number is taken! Enter valid room #: ");
                    roomnumberchoice = in.nextInt();
                }
                Room newRoom = new Room(bedchoice, kitchenchoice, coffeechoice,
                accesschoice, roomnumberchoice);
                rooms.add(newRoom);
                System.out.println("Success, room created!");
                createOrEditRoom(employee);
                break;
        
        case 2: 
            System.out.print("Please select room you would like to edit");
            print();
            for (int i=0; i< rooms.size(); i++) {
                System.out.println("("+rooms.get(i).getRoomID()+") " + rooms.get(i).roomNumber);
            }
            int editChoice = in.nextInt();
            for (int i=0; i<rooms.size(); i++) {
                if (editChoice == rooms.get(i).getRoomID()) {
                    editRoom(rooms.get(i), employee);
                }
            }
            
            
        } 
    }
    
    //add input validation
    public static void editRoom(Room room, int employee) {
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to change?");
        int choice;
        System.out.print(" (1) Bed \n (2) Kitchen\n (3) Coffee\n (4) Accessibility\n "
                + "(5) Room Number \n (0) Done editing, return to previous menu\n");
        choice = in.nextInt();
        switch (choice) {
            case 1: 
                System.out.print("Enter new bed size: \n(0) 1 Queen Bed\n(1) 2 Queen Beds"
                        + "\n(2) 1 King Bed");
                print();
                int bedchoice = in.nextInt();
                room.bedOption = bedchoice;
                System.out.println("Successfully updated bed option!");
                editRoom(room, employee);
                break;
            case 2:
                System.out.print("Enter new Kitchen Option: \n(0) Microwave \n"
                        + "(1) Fridge + Microwave");
                print();
                int kitchenchoice = in.nextInt();
                room.kitchenOption = kitchenchoice;
                System.out.println("Successfully updated kitchen option!");
                editRoom(room, employee);
                break;
            case 3: 
                System.out.print("Enter coffee option: \n(0) 1-Cup Std. Coffee Machine"
                        + "\n(1) Keurig Hot K200 Machine");
                print();
                int coffeechoice = in.nextInt();
                room.coffeeOption = coffeechoice;
                System.out.println("Successfully updated coffee option!");
                editRoom(room, employee);
                break;
            case 4: 
                System.out.print("Enter Accessibility Option: \n(0) Standard Room"
                        + "\n(1) Enhanced Accessibility Room");
                print();
                int accesschoice = in.nextInt();
                room.accessibleOption = accesschoice;
                System.out.println("Successfully updated Accessibility option!");
                editRoom(room, employee);
                break;
            case 5:
                System.out.print("Enter new room number: ");
                int roomnumberchoice = in.nextInt();
                //check to ensure entered room # is available
                while (!(availableRoomNumber(roomnumberchoice))) {
                    print();
                    System.out.print("Sorry, that room number is taken! Enter valid room #: ");
                    roomnumberchoice = in.nextInt();
                }
                room.roomNumber = roomnumberchoice;
                editRoom(room, employee);
                break;
            case 0:
                createOrEditRoom(employee);
                break;
            default:
                System.out.print("Sorry, invalid option entered!");
                editRoom(room, employee);
                break;
        }
        
    }
    public static void print()
    {
        System.out.println(" ");
    }
}
