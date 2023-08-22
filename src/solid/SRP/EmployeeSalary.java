package solid.SRP;

public class EmployeeSalary {
    private int basicSalary;

    public EmployeeSalary() {
    }
    public EmployeeSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int calculateBasicSalry() {
        int tax = (int) (basicSalary * .25);
        return this.basicSalary - tax;
    }
}
