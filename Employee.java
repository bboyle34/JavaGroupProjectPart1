
package GroupProject1;
// Class Definition File (CDF)

public class Employee 
{
    // Data Fields
    private int employeeID;
    private String username;
    private String password;
    private String employeeName;
    
    public static int nextID = 0;    
    public static Employee[] employees = new Employee[1000];
    public static int nextEmployee = 0;

    // Constructors
    public Employee(String username, String password, String employeeName)
    {
        this.employeeID = nextID++;
        this.username = username;
        this.password = password;
        this.employeeName = employeeName;
        employees[nextEmployee++] = this;
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
    public String getEmployeeName()
    {
        return this.employeeName;
    }
    public String getUsername()
    {
        return this.username;
    }
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }
    public int setPassword(String oldP, String newP)
    {
        if (this.password.equalsIgnoreCase(oldP))
        {
            this.password = newP;
        }
        return 0;
    }
    public String describeEmployee()
    {
        String answer = "";
        answer += ("Employee Name: " + this.getEmployeeName() 
                + ", Employee Username: " + this.getUsername());
        return answer;
    }
    public static int nextSpot()
    {
        int position = 0;
        while (employees[position + 1] != null)
        {
            position++;
        }
        return position;
    }
}
