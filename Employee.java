
package GroupProject1;
// Class Definition File (CDF) - Mark Kilgore and George Moya
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
    
    //getter for employeeID
    public int getEmployeeID()
    {
        return this.employeeID;
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

    //modified set password method to account for new requirements      
    public int setPassword(String oldP, String newP)
    {
     
        int count = 0;
        
        if(Character.isDigit(newP.charAt(0))||oldP.matches(newP))
        {
            count = 1; 
            return count;
        }
             
       for(int i = 0; i < newP.length(); i++)
        {
            if(Character.isUpperCase(newP.charAt(i)))
            {
                count = 0;
                break;
            } 
            else{
                count = 1;
                return count;
                
            }     
        }
        
        
        for(int i = 1; i < newP.length(); i++)
        {
            if(Character.isDigit(newP.charAt(i)))
            {
                count = 0;
                return count;
            }
            else{
                count = 1;
               // return count;
            }
            
        }
        return count;
    }
    
    //getter for password
    public String getPassword()
    {
        return this.password;
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
