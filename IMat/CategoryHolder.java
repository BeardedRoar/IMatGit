/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author Joel
 */
public interface CategoryHolder {
    
    public String getName();
    public ProductCategory getCategory();
    public boolean isSub();
}
