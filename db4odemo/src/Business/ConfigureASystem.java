package Business;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        //create directories
//        RestaurantDirectory restaurantDirectory = new RestaurantDirectory();
//        CustomerDirectory customerDirectory = new CustomerDirectory();
//        DeliveryManDirectory deliveryManDirectory = new DeliveryManDirectory();
        
        //create an employee as system admin role
        Role newRole1 = new SystemAdminRole();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH",newRole1,system);
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, newRole1);
        
        //create an employee as restaurant admin role
//        Role newRole2 = new AdminRole();        
//        Employee restAdmin1 = system.getEmployeeDirectory().createEmployee("restAdmin1",newRole2);
//        UserAccount restAdminAcc1 = system.getUserAccountDirectory().createUserAccount("restAdmin1", "restAdmin1", restAdmin1, newRole2);
        
        //create an employee as Delivery Man role
//        Role newRole3 = new DeliverManRole();
//        Employee delivery1 = system.getEmployeeDirectory().createEmployee("delivery1",newRole3);
//        UserAccount deliveryAcc1 = system.getUserAccountDirectory().createUserAccount("delivery1", "delivery1", delivery1, newRole3);
        
        
        return system;
    }
    
}
