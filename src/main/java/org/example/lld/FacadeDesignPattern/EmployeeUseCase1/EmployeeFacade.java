package org.example.lld.FacadeDesignPattern.EmployeeUseCase1;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;
    public EmployeeFacade(){
        employeeDAO = new EmployeeDAO();
    }

    public void insert(){
        employeeDAO.insert();
    }

    public Employee getEmployeeDetails(int empID){
        return employeeDAO.getEmployeeDetails(empID);
    }
}
