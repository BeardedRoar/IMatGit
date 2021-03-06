/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.ShoppingCartListener;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Joel
 */
public class ShoppingListPreview implements ShoppingCartListener {
    
    private JPopupMenu popup = new JPopupMenu();
    private final Component component;
    private final IMatModel model;

    /**
     * Creates new form AccountMenuPanel
     */
    public ShoppingListPreview(Component c, IMatModel model) {
        this.component = c;
        this.model = model;
        /*
        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }

        };
        */
        createList();
        
        PopupListener pl = new PopupListener();
        component.addMouseListener(pl);
        model.addCartListener(this);
    }

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        createList();
    }

    private class PopupListener extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            popup.show(component, 0, component.getHeight());
        }
        
        @Override
        public void mouseExited(MouseEvent e){
            popup.setVisible(false);
        }
    }
    
    private void createList(){
        popup.removeAll();
        Iterator<ShoppingItem> it = model.getItems().iterator();
        JMenuItem m;
        ShoppingItem tempItem;
        while (it.hasNext()){
            tempItem = it.next();
            m = new JMenuItem((tempItem.getProduct().getUnitSuffix().equals("kg") ?
                    tempItem.getAmount() : (int)tempItem.getAmount()) + " " + 
                    tempItem.getProduct().getUnitSuffix() + " " + 
                    tempItem.getProduct().getName());
            popup.add(m);
        }
    }
}
