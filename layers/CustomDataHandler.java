package layers;

import java.util.List;
import se.chalmers.ait.dat215.project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class CustomDataHandler {
    
    private static final CustomDataHandler singelton = new CustomDataHandler();
    private final IMatDataHandler dataHandler;
    
    private CustomDataHandler(){
        dataHandler = IMatDataHandler.getInstance();
    }
    
    public static CustomDataHandler getInstance(){
        return singelton;
    }
    
    public void addFavorite(Product p){
        this.dataHandler.addFavorite(p);
    }
    
    public List<Product> favorites(){
        return dataHandler.favorites();
    }
    
    public void removeFavorite(Product p){
        this.dataHandler.removeFavorite(p);
    }
    
    public boolean isFavorite (Product p){
        return this.dataHandler.isFavorite(p);
    }
    
    public List<Product> findProducts(String s){
        return dataHandler.findProducts(s);
    }
    
    protected ShoppingCart getCart(){
        return this.dataHandler.getShoppingCart();
    }
    
    public CreditCard getCard(){
        return this.dataHandler.getCreditCard();
    }
    
    public Customer getCustomer(){
        return this.dataHandler.getCustomer();
    }
}
