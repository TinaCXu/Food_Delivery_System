/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;
    
    public RestaurantDirectory(){
        restaurantList = new ArrayList<Restaurant>();
    }
    
    public ArrayList<Restaurant> getRestaurantList(){
        return restaurantList;
    }
    
    public Restaurant addRestaurant(){
        Restaurant r = new Restaurant();
        restaurantList.add(r);
        return r;
    }
    
    public void deleteRestaurant(Restaurant r){
        restaurantList.remove(r);
    }
    
    public Restaurant searchRestaurant(String name){
        for(Restaurant r:restaurantList){
            if(r.getName().equals(name)){
                return r;
            }
        }
        return null;
    }
}
