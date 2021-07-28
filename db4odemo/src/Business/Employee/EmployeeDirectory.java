/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.EcoSystem;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, Role role, EcoSystem ecosystem){
        Employee employee = new Employee(ecosystem);
        employee.setName(name);
        employee.setRole(role);
        employeeList.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee employee){
        Iterator<Employee> it = employeeList.iterator();
        while(it.hasNext()){
            Employee e = it.next();
            if(e == employee){
                it.remove();
            }
        }
    }
            
    public Employee searchEmployee(int id, Role role){
        for(Employee e: employeeList){
            if(e.getId() == id & e.getRole().getClass() == role.getClass()){
                return e;
            }
        }
        return null;
    }
}