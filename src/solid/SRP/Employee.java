package solid.SRP;

import java.util.Date;

public class Employee {

    private String employeName;
    private Date Dob;


    public Employee(String employeName, Date dob) {
        this.employeName = employeName;
        Dob = dob;

    }

//    public Employee() {
//    }

    public String getEmpInfo() {
        return "name " +  this.employeName + " date of birth  " + this.Dob.toString() ;
    }

    // here violates SRP RULE because in employe class should have only employee related things.
//    public int calculateBasicSalry() {
//        int tax = (int) (basicSalary * .25);
//        return this.basicSalary - tax;
//    }
}
