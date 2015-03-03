/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Joel
 */
interface ShoppingCartComponentListener {
    
    public void shoppingCartComponentChanged(ShoppingItem item, boolean itemAdded);
    
}
