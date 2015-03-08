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
        
        cart.fireShoppingCartChanged(sci, true);
        ShoppingItem existingItem = this.getFromCart(sci.getProduct());
        if (existingItem == null){
            cart.addItem(sci);
            cart.fireShoppingCartChanged(sci, true);
        } else{
            existingItem.setAmount(existingItem.getAmount() + sci.getAmount());
            cart.fireShoppingCartChanged(existingItem, true);
        }
    }
    
    public void addProduct(Product p){
        cart.addProduct(p);
        cart.fireShoppingCartChanged(getFromCart(p), true);
    }
    
    public void addProduct(Product p, double d){
        ShoppingItem existingItem = this.getFromCart(p);
        if (existingItem == null){
            cart.addProduct(p, d);
            cart.fireShoppingCartChanged(getFromCart(p), true);
        } else{
            existingItem.setAmount(existingItem.getAmount() + d);
            cart.fireShoppingCartChanged(existingItem, true);
        }
    }
    
    private ShoppingItem getFromCart(Product p){
        Iterator<ShoppingItem> it = this.getItems().iterator();
        ShoppingItem temp;
        while(it.hasNext()){
            temp = it.next();
            if(temp.getProduct() == p)
                return temp;
        }
        return null;
    }
    
    public void addOrderToCart(Order order){
        Iterator<ShoppingItem> it = order.getItems().iterator();
        while (it.hasNext()){
            this.addItem(it.next());
        }
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
        cart.fireShoppingCartChanged(sci, false);
    }
    
    public void removeProduct(Product p){
        this.removeItem(this.getFromCart(p));
    }
    
    public void addCartListener(ShoppingCartListener scl){
        cart.addShoppingCartListener(scl);
    }
    
    public void removeCartListener(ShoppingCartListener scl){
        cart.removeShoppingCartListener(scl);
    }

    public void setItemAmount(ShoppingItem sci, double newAmount) {
        double oldAmount = sci.getAmount();
        sci.setAmount(newAmount);
        cart.fireShoppingCartChanged(sci, newAmount > oldAmount);
    }
}
