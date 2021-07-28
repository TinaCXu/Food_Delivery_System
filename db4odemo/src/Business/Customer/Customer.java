/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.WorkQueue.LabTestWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    String name;
    Employee employee;
    ArrayList<LabTestWorkRequest> requestList;
    
    public Customer(){
        requestList = new ArrayList<LabTestWorkRequest>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<LabTestWorkRequest> getRequestList() {
        return requestList;
    }
    
    public void addRequest(LabTestWorkRequest ltwr){
        requestList.add(ltwr);
    }
    
}
