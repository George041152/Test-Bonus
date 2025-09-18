/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
        
        //Get int yearOfBirth;
        //Set boolean onLeave
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // to be completed
        //1 Get employee age
        //2 set age greater than or equal to 16
        //      output canDrive
        //3 set age to less than 16
        //      output CanNotDrive 
        if (age >= 16){
            System.out.println("Can drive");
            return true;
        }else{
            System.out.println("You need to wait"+ " " + (16 - age) + " ");
            return false;
            
            
            
        }
            
            
            
    
        } 
    
    

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
        double deductions = 0.70;
        double netPay = (unpaidHours * hourlyWage) - deductions;
        return netPay;
        
    
    
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
        // 1 set 6 
        double netpay = calculatePay();
        System.out.println( fullname + " " + "has received a wire 
        transfer of" + " " + netPay );
    
        unpaidHours = 0; 
        
    }
}
