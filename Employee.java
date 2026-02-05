
/**
 * Write a description of class Employee here.
 *
 * @author (GROUP16)
 * @version (5/2/2026)
 */
public class Employee {

    private String employeeId;
    private String fullName;
    private String department;
    private double basicSalary;
    private int yearsOfService;

    public Employee() {
        this.employeeId = "Unknown";
        this.fullName = "Unknown";
        this.department = "Unknown";
        this.basicSalary = 500000;
        this.yearsOfService = 0;
    }


    public Employee(String employeeId, String fullName, String department, double basicSalary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.department = department;
        setBasicSalary(basicSalary);
        this.yearsOfService = 0;
    }

    
    public String getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    
    public void setBasicSalary(double basicSalary) {
        if (basicSalary >= 500000) {
            this.basicSalary = basicSalary;
        }
    }

    public void setYearsOfService(int yearsOfService) {
        if (yearsOfService >= 0) {
            this.yearsOfService = yearsOfService;
        }
    }

    
    public double calculateBonus() {
        double bonusPercentage = yearsOfService * 0.10;
        if (bonusPercentage > 0.50) {
            bonusPercentage = 0.50;
        }
        return basicSalary * bonusPercentage;
    }

    
    public double calculateNetSalary() {
        double bonus = calculateBonus();
        double tax = basicSalary * 0.15;
        return basicSalary + bonus - tax;
    }

    
    public void promote(String newDepartment, double salaryIncrease) {
        this.department = newDepartment;
        if (salaryIncrease > 0) {
            this.basicSalary += salaryIncrease;
        }
    }

    
    public void displayPayslip() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + fullName);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== Employee Payroll Exercise ===\n");

        Employee employee1 =
                new Employee("EMP001", "Ali Hassan", "IT", 1500000);

        Employee employee2 =
                new Employee("EMP002", "Fatma Said", "HR", 1200000);

        employee1.setYearsOfService(5);
        employee2.setYearsOfService(2);

        employee1.displayPayslip();
        employee2.displayPayslip();

        employee1.promote("Senior IT", 300000);

        System.out.println("After Promotion:\n");
        employee1.displayPayslip();

        System.out.println("=== Exercise Complete ===");
    }
}
