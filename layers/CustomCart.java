/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layers;

import java.util.Iterator;
import java.util.List;
import se.chalmers.ait.dat215.project.*;

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
    
    public void addProduct(Product p){
        cart.addProduct(p);
    }
    
    public void addProduct(Product p, double d){
        ShoppingItem existingItem = this.getfromCart(p);
        if (existingItem == null)
            cart.addProduct(p, d);
        else
            existingItem.setAmount(existingItem.getAmount() + d);
    }
    
    private ShoppingItem getfromCart(Product p){
        Iterator<ShoppingItem> it = this.getItems().iterator();
        ShoppingItem temp;
        while(it.hasNext()){
            temp = it.next();
            if(temp.getProduct() == p)
                return temp;
        }
        return null;
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
