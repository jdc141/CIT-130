/**
 *
 * @author Joseph Charland
 * LabAssign3_Charland
 */
public class budgetCalculator {
    //variables
    private double salary, livingExpenses, savings;
    
    //default
    public budgetCalculator(){
        salary = 0;
        livingExpenses = 0;
        
        savings = calculateSavings();
    }
    //constructor
    public budgetCalculator(double s, double le){
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
    
    @Override
    public String toString(){
    return ("A End of year savings with a salary of " + salary +
            "/n and a cost of living of " + livingExpenses + 
            "/n would equal a yearly savings of " + savings);
    }
}
