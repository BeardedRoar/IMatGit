/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import IMat.IMatModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import se.chalmers.ait.dat215.project.Order;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Joel
 */
public class PopularCounter {
    
    private final IMatModel model;
    private final ArrayList<ProductPurchase> mostBought;

    public PopularCounter(IMatModel model){
        
        System.out.println("counting most often bought...");
        this.model = model;
        
        List<Order> orders = model.getOrders();
        List<Product> products = model.getProducts();
        mostBought = new ArrayList(products.size());
        
        for (int i = 0; i < products.size(); i++){
            mostBought.add(new ProductPurchase(products.get(i), 0));
        }
        
        for (Order order : orders){
            for (ShoppingItem item : order.getItems()){
                mostBought.get(item.getProduct().getProductId()-1).amount =+ 
                        (int)item.getAmount();
            }
        }
        
        Collections.sort(mostBought, Collections.reverseOrder());
    }
    
    public List<Product> getMostBought(){
        return getMostBought(-1, mostBought.size());
    }
    
    public List<Product> getMostBought(int boughtAtLeast){
        return getMostBought(boughtAtLeast, mostBought.size());
    }
    
    public List<Product> getMostBought(int boughtAtLeast, int numberOfProducts){
        LinkedList retList = new LinkedList ();
        Iterator<ProductPurchase> it = mostBought.iterator();
        if (it.hasNext()) {
            ProductPurchase tempProduct = it.next();
            int amount = tempProduct.amount;
            while (it.hasNext() && amount >= boughtAtLeast
                    && retList.size() <= numberOfProducts) {
                retList.add(tempProduct.product);
                tempProduct = it.next();
                amount = tempProduct.amount;
            }
        }
        return retList;
    }
    
    private class ProductPurchase implements Comparable<ProductPurchase>{
        private final Product product;
        private int amount;

        public ProductPurchase(Product p, int amount) {
            this.product = p;
            this.amount = amount;
        }

        @Override
        public int compareTo(ProductPurchase pp) {
            return (this.amount - pp.amount);
        }

        
    }
}
