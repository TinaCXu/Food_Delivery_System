/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author changxu
 */
public class MenuDirectory {
    Restaurant restaurnat;
    ArrayList<Menu> menuList;
    
    public MenuDirectory(){
        menuList = new ArrayList<Menu>();
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }

    public Restaurant getRestaurnat() {
        return restaurnat;
    }

    public void setRestaurnat(Restaurant restaurnat) {
        this.restaurnat = restaurnat;
    }
    
    public Menu addMenu (String name){
        Menu m = new Menu();
        m.setName(name);
        menuList.add(m);
        return m;
    }
    
    public void deleteMenu(Menu m){
        menuList.remove(m);
    }
    
    public Menu searchMenu(String name){
        for(Menu m:menuList){
            if(m.getName().equals(name)){
                return m;
            }
        }
        return null;
    }
}
