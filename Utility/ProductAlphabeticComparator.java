/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.util.Comparator;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Joel
 */
public class ProductAlphabeticComparator implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
    
}
