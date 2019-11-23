
package GroupProject1;
// Class Definition File (CDF) - Mark Kilgore

public class Employee 
{
    // Data Fields
    private int employeeID;
    private String username;
    private String password;
    private String employeeName;
    
    public static int nextID = 0;    

    // Full Constructor
    public Employee(String username, String password, String employeeName)
    {
        this.employeeID = nextID++;
        this.username = username;
        this.password = password;
        this.employeeName = employeeName;
    }

    // Methods
    
    //Method to validate login for employee.
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
    
    //Method to get the employee's name.
    public String getEmployeeName()
    {
        return this.employeeName;
    }
    
    //Method to get the employee's username.
    public String getUsername()
    {
        return this.username;
    }
    
    //Method to set the employee's username.
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }
    
    //Method to set the employee's password.
    public int setPassword(String oldP, String newP)
    {
        if (this.password.equalsIgnoreCase(oldP))
        {
            this.password = newP;
        }
        return 0;
    }
    
    //Method to return a description of a specified employee object.
    public String describeEmployee()
    {
        String answer = "";
        answer += ("Employee Name: " + this.getEmployeeName() 
                + ", Employee Username: " + this.getUsername());
        return answer;
    }
}
