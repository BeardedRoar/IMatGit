/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import IMat.ProductPanel;
import java.util.Comparator;

/**
 *
 * @author Joel
 */
public class ProductPanelAlphabeticComparator implements Comparator<ProductPanel> {

    @Override
    public int compare(ProductPanel pp1, ProductPanel pp2) {
        return pp1.getProduct().getName().compareTo(pp2.getProduct().getName());
    }
    
}
