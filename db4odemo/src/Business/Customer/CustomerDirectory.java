/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer addCustomer(String name, Employee employee){
        Customer c = new Customer();
        c.setName(name);
        c.setEmployee(employee);
        customerList.add(c);
        return c;
        
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    
    public void deleteCustomer(Employee employee){
        Iterator<Customer> it = customerList.iterator();
        while(it.hasNext()){
            Customer c = it.next();
            if(c.getEmployee() == employee){
                it.remove();
            }
        }
    }
    
    public Customer searchCustomer(Employee employee){
        for(Customer c:customerList){
            if(c.getEmployee() == employee){
                return c;
            }
        }
        return null;
    }
}
