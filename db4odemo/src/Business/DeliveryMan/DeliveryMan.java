/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    String name;
    Restaurant restaurant;
    Employee employee;
    ArrayList<WorkRequest> requestList;

    public DeliveryMan(){
        requestList = new ArrayList<WorkRequest>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }
    
    public void addRequest(LabTestWorkRequest ltwr){
        requestList.add(ltwr);
    }
    
    @Override
    public String toString(){
        return name;
    }
}
