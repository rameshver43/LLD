package org.example.lld.FacadeDesignPattern.EmployeeUseCase1;

public class Client {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee employee = employeeFacade.getEmployeeDetails(1212);
    }
}
