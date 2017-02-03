/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author cscherbert1
 */
public class EmployeeStartup {
    
    public static void main(String[] args) {
        Employee employee = new Employee("Collin", "Scherbert", "123456789");
        
        employee.doFirstTimeOrientation("12345");
    }
    
}
