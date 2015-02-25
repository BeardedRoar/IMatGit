package IMat;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import layers.CustomCart;
import layers.CustomDataHandler;
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
public class IMatModel {
    
    private final CustomDataHandler handler = CustomDataHandler.getInstance();
    private final CustomCart cart = CustomCart.getCart();
    private final CreditCard card = handler.getCard();
    
    public IMatModel(){
        
    }
    
    
    //cart methods
    public void addItem(ShoppingItem sci){
        cart.addItem(sci);
    }
    
    public void addProduct(Product p){
        cart.addProduct(p);
    }
    
    public void addProduct(Product p, double d){
        cart.addProduct(p, d);
    }

    public void clearCart(){
        cart.clear();
    }
    
    // This should return a list of created visual items instead when they are made
    public List<ShoppingItem> getItems(){
        return cart.getItems();
    }
    
    public double getTotalCost(){
        return cart.getTotal();
    }
    
    public void removeItemFromCart(int index){
        cart.removeItem(index);
    }
    
    public void removeItemFromCart(ShoppingItem sci){
        cart.removeItem(sci);

    }  
    
    //card methods
    
    public String getCardNumber(){
        return card.getCardNumber();
    }    
    
    public void setCardNumber(String cardNumber){
        card.setCardNumber(cardNumber);
    }
    
    public String getCardType(){
        return card.getCardType();
    }
    
    public void setCardType(String cardType){
        card.setCardType(cardType);
    }
    
    public String getHoldersName(){
        return card.getHoldersName();
    }
    
    public void setHoldersName(String holdersName){
        card.setHoldersName(holdersName);
    }
    
    public int getValidMonth(){
        return card.getValidMonth();
    } 
    
    public void setValidMonth(int validMonth){
        card.setValidMonth(validMonth);
    }
    
    public int getValidYear(){
        return card.getValidYear();
    }
    
    public void setValidYear(int validYear){
        card.setValidYear(validYear);
    }
    
    public int getVerificationCode(){
        return card.getVerificationCode();
    }
    
     public void setVerificationCode(int verificationCode){
         card.setVerificationCode(verificationCode);
     }
    
    //end of card methods 
     
     public boolean isFavorite(Product p){
         return this.handler.isFavorite(p);
     }
     
     public boolean changeFavoriteStatus(Product p){
         boolean becomeFavorite = !isFavorite(p);
         if(becomeFavorite)
             handler.addFavorite(p);
         else
             handler.removeFavorite(p);
         return becomeFavorite;
     }
     
      public  List<Product> getProducts(ProductCategory pc){
        return handler.getProducts(pc);
    }
      public List<ProductPanel> getProductPanels(ProductCategory pc) {
          List<Product> products = handler.getProducts(pc);
          ArrayList<ProductPanel> panels = new ArrayList(products.size());
          Iterator<Product> it = products.iterator();
            while(it.hasNext()){
                panels.add(new ProductPanel(it.next(), this));
            }
        return panels;
      }

}
