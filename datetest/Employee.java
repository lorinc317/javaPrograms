package datetest;


public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    
    public Employee(String f, String l, Date b)
    {
        this.firstName = f;
        this.lastName = l;
        this.birthDate = b;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Firstname: ");
        sb.append(firstName + "\n");
        sb.append("LastName: ");
        sb.append(lastName + "\n");
        sb.append("Date of birth: ");
        sb.append(birthDate + "\n");
        
        return sb.toString();              
    }
    
    public void displayEmployee()
    {
        System.out.println(this.toString());
    }
}
