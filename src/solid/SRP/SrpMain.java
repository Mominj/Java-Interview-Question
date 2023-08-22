package solid.SRP;

import java.util.Date;

public class SrpMain {
    public static void main(String[] args) {
        Employee employee = new Employee("ddd", new Date());

        System.out.println(employee.getEmpInfo());

        //calcualte salary after resolve srp


        EmployeeSalary employeeSalary = new EmployeeSalary(123);

        System.out.println(employeeSalary.calculateBasicSalry());


    }
}
