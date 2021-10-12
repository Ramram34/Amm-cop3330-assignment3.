import java.util.Date;
import java.util.TreeMap;

public class Employee {
    //Map variable
    static TreeMap<Integer, Employee> employees = new TreeMap<>();

    //private instance variables
    private String firstName;
    private String lasstName;
    private String position;
    private Date separationDate;

    //Constructor
    public Employee(String firstName, String lasstName, String position) {
        this.firstName = firstName;
        this.lasstName = lasstName;
        this.position = position;
    }
    public Employee(String firstName, String lasstName, String position, Date separationDate) {
        this.firstName = firstName;
        this.lasstName = lasstName;
        this.position = position;
        this.separationDate = separationDate;
    }

    //Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLasstName() { return lasstName; }
    public void setLasstName(String lasstName) { this.lasstName = lasstName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public Date getSeparationDate() { return separationDate; }
    public void setSeparationDate(Date separationDate) { this.separationDate = separationDate; }

    //toString() method
    @Override
    public String toString() {
        return "Employee[ " + "firstName=" + firstName + ", lasstName=" + lasstName
                + ", position=" + position + ", separationDate=" + separationDate + " ]";
    }

//method to search
    /**
     * Takes a given string and searches it against employees first or last name
     * @param name Given name to search
     * @return number of matched records
     */
    public static int search(String name){
        int count = 0;
        for(int k : employees.keySet()){
            if(employees.get(k).getFirstName().equalsIgnoreCase(name) || employees.get(k).getLasstName().equalsIgnoreCase(name)){
                count++;
                System.out.println(employees.get(k));
            }
        }
        return count;
    }
}
