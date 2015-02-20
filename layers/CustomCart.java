/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layers;

import java.util.List;
import se.chalmers.ait.dat215.project.ShoppingCart;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Joel
 */
public class CustomCart {
    
    private static final CustomCart singelton = new CustomCart();
    private final ShoppingCart cart;
    
    private CustomCart(){
        cart = CustomDataHandler.getInstance().getCart();
    }
    
    public static CustomCart getCart(){
        return singelton;
    }
    
    public void addItem(ShoppingItem sci){
        cart.addItem(sci);
    }
    
    public void addProduct(CustomProduct p){
        cart.addProduct(p.getProduct());
    }
    
    public void addProduct(CustomProduct p, double d){
        cart.addProduct(p.getProduct(), d);
    }
    
    public void clear(){
        cart.clear();
    }
    
    public List<ShoppingItem> getItems(){
        return cart.getItems();
    }
    
    public double getTotal(){
        return cart.getTotal();
    }
    
    public void removeItem(int index){
        cart.removeItem(index);
    }
    
    public void removeItem(ShoppingItem sci){
        cart.removeItem(sci);
    }
}
