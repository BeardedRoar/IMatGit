/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.List;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author axel
 */
public class ResultPanel extends javax.swing.JPanel {
    private IMatModel model;
    private ProductCategory pc;
    
    /**
     * Creates new form ResultPanel
     */
    public ResultPanel(ProductCategory pc, IMatModel model) {
        this.pc = pc;
        this.model = model;
        initComponents();
        
        List<ProductPanel> products = model.getProductPanels(pc);
        Iterator<ProductPanel> it = products.iterator();
        this.setLayout(new GridLayout(4, (products.size() +3)/4));
        while(it.hasNext()){
            this.add(it.next());
        }
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
