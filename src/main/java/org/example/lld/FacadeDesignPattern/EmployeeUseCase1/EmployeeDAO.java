package org.example.lld.FacadeDesignPattern.EmployeeUseCase1;

public class EmployeeDAO {
    public void insert(){
        System.out.println("Insert employee");
    }

    public void updateEmployeeName(){
        System.out.println("Update Employee Name");
    }

    public Employee getEmployeeDetails(String emialID){
        return new Employee();
    }

    public Employee getEmployeeDetails(int empID){
        return new Employee();
    }
}
