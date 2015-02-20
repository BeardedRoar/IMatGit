/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layers;

import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Joel
 */
public class CustomProduct {
    
    private Product p;
    
    public CustomProduct(){
        p = new Product();
    }
    
    public String getName(){
        return p.getName();
    }
    
    protected Product getProduct(){
        return this.p;
    }
    
}
