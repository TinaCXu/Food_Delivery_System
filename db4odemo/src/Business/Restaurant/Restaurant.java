/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Menu.MenuDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harold
 */
public class Restaurant {
    String name;
    String address;
    String phone;
    Employee adminEmployee;
    MenuDirectory menuDirectory;
    WorkQueue workQueue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Employee getAdminEmployee() {
        return adminEmployee;
    }

    public void setAdminEmployee(Employee adminEmployee) {
        this.adminEmployee = adminEmployee;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
        
    
    @Override
    public String toString(){
        return name;
    }
}
