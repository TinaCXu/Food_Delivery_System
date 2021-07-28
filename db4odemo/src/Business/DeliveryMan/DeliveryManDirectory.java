/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    ArrayList<DeliveryMan> deliveryManList;
    
    public DeliveryManDirectory(){
        deliveryManList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }
    
    public DeliveryMan addDeliveryMan(String name, Employee employee){
        DeliveryMan dm = new DeliveryMan();
        dm.setName(name);
        dm.setEmployee(employee);
        deliveryManList.add(dm);
        return dm;
    }
    
    public void deleteDeliveryMan(DeliveryMan dm){
        deliveryManList.remove(dm);
    }
    
    public DeliveryMan searchDeliveryMan(Employee employee){
        for(DeliveryMan dm:deliveryManList){
            if(dm.getEmployee() == employee){
                return dm;
            }
        }
        return null;
    }
    
}
