/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import IMat.IMatModel;
import java.util.ArrayList;
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
        this.model = model;
        
        List<Order> orders = model.getOrders();
        List<Product> products = model.getProducts();
        int[] purchases = new int[products.size()];
        
        for (Order order : orders){
            for (ShoppingItem item : order.getItems()){
                purchases[item.getProduct().getProductId()] += item.getAmount();
            }
        }
        
        PriorityQueue<ProductPurchase> pQ = new PriorityQueue(products.size());
        for (int i = 0; i < products.size(); i++){
            pQ.add(new ProductPurchase(products.get(i), purchases[i]));
        }
        
        mostBought = new ArrayList(products.size());
        for (int i = 0; i < products.size(); i++){
            mostBought.add(pQ.poll());
        }
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
        int amount = boughtAtLeast;
        while(it.hasNext() && amount < boughtAtLeast && 
                retList.size() < numberOfProducts){
            ProductPurchase tempProduct = it.next();
            amount = tempProduct.amount;
            retList.add(tempProduct.product);
        }
        return retList;
    }
    
    private class ProductPurchase implements Comparable<ProductPurchase>{
        private final Product product;
        private final int amount;

        public ProductPurchase(Product p, int amount) {
            this.product = p;
            this.amount = amount;
        }

        @Override
        public int compareTo(ProductPurchase pp) {
            if (this.amount == pp.amount){
                return 0;
            } else {
                return (this.amount < pp.amount ? 1 : -1);
            }
        }

        
    }
}
