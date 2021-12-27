/**
 *
 * @author Joseph Charland
 * LabAssign3_Charland
 */
public class LabAssign3_Charland {
    //variables
    private double salary, livingExpenses, savings;
    
    public LabAssign3_Charland(){
        salary = 0;
        livingExpenses = 0;
        
        savings = calculateSavings();
    }
    public LabAssign3_Charland(double s, double le){
        salary = s;
        livingExpenses = le;
        
        savings = calculateSavings();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLivingExpenses() {
        return livingExpenses;
    }

    public void setLivingExpenses(double livingExpenses) {
        this.livingExpenses = livingExpenses;
    }
    public double calculateSavings(){
        return salary - livingExpenses; 
    }
}
