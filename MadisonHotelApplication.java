
package GroupProject1;
import java.util.Scanner;

public class MadisonHotelApplication 
{
    public static void main(String[] args) 
    {
        Employee test1 = new Employee("Adam", "pass", "adam hitchings");
        Guest test2 = new Guest("Brendan", "pass", "brendan boyle");
        Guest test3 = new Guest("John", "pass", "johnny guo");
        Employee test4 = new Employee("Isaac", "pass", "isaac gamble");
        
        login();
    }
    public static void guestMenu(int guest)
    {
        // give guests all options for their login and use switch case to 
        //direct them towards their choice
        // display information about they account they logged into
        System.out.println(Guest.guests[guest].describeGuest());
        System.out.println("---------------------------------------------");
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("(1) Book a room");
        System.out.println("(2) Room Report");
        System.out.println("(3) Edit personal information");
        System.out.println("(0) Back to Login");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        
        switch(choice)
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
        System.out.println(Employee.employees[employee].describeEmployee());
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("(1) Run booking report");
        System.out.println("(2) Check guest out");
        System.out.println("(3) Create a guest account");
        System.out.println("(4) Create new employee acount");
        System.out.println("(5) Create or edit a room");
        System.out.println("(0) Back to Login");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        
        switch(choice)
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
                System.out.println("Please enter a valid option (y/n)");
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
            System.out.print("Please enter username: ");
            String username = in.next();
            System.out.print("Please enter password: ");
            String password = in.next();
            for (int i = 0; i <= Employee.nextSpot(); i++)
            {
                if (Employee.employees[i].checkCredentials(username, password))
                {
                    employeeMenu(i);
                    operator = false;
                    break;
                }
            }
            for (int i = 0; i <= Guest.nextSpot(); i++)
            {
                if (Guest.guests[i].checkCredentials(username, password))
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
        System.out.println(" - Kitchen Options"
                + "\n\t(0) Microwave"
                + "\n\t(1) Fridge and Microwave"
                + "\nWhat is your Kitchen Choice?");
        int kitch = in.nextInt();
        System.out.println(" - Coffee Options"
                + "\n\t(0) 1-Cup Std. Coffee Machine"
                + "\n\t(1) Keurig Hot K200 Machine"
                + "\nWhat is your Coffee Choice?");
        int coffee = in.nextInt();
        System.out.println(" - Accessibility Options"
                + "\n\t(0) Standard Room"
                + "\n\t(1) Enhanced Accessibilty Room"
                + "\nWhat is your Accessibility Choice?");
        int accessibility = in.nextInt();
        System.out.println("What is your room number?");
        int roomNumber = in.nextInt();

        Room r = new Room(bed, kitch, coffee, accessibility, roomNumber);
        System.out.println(r.roomAnalytics());
        guestMenu(guest);
    }
    public static void roomReport(int guest)
    {
        
    }
    public static void editGuestInfo(int guest)
    {
        
    }
    
    // Employee Menu Choices
    public static void bookingReport(int employee)
    {
        
    }
    public static void checkGuestOut(int employee)
    {
        
    }
    public static void createGuestAccount(int employee)
    {
        
    }
    public static void createEmployeeAccount(int employee)
    {
        
    }
    public static void createOrEditRoom(int employee)
    {
        
    }
}
