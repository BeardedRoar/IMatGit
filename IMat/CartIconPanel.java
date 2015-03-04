/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.ShoppingCartListener;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Joel
 */
public class CartIconPanel extends javax.swing.JPanel 
implements ShoppingCartListener, ShoppingCartComponentListener{
    private final IMatModel model;
    private ShoppingListPreview slp;
    private final MainFrame frame;

    /**
     * Creates new form CartIconPanel
     */
    public CartIconPanel(IMatModel model, MainFrame frame) {
        this.model = model;
        this.frame = frame;
        initComponents();
        this.numberLabel.setText("Antal produkter: " + model.getItems().size());
        this.totCostLabel.setText("Kostnad: " + model.getTotalCost());
        this.slp = new ShoppingListPreview(iconPanel, model);
        this.model.addCartListener(slp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconPanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        totCostLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(200, 70));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(300, 70));

        iconPanel.setOpaque(false);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/cart.png"))); // NOI18N
        iconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout iconPanelLayout = new javax.swing.GroupLayout(iconPanel);
        iconPanel.setLayout(iconPanelLayout);
        iconPanelLayout.setHorizontalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        iconPanelLayout.setVerticalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        numberLabel.setText("jLabel1");

        totCostLabel.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberLabel)
                    .addComponent(totCostLabel))
                .addGap(0, 154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totCostLabel)
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLabelMouseClicked
        frame.setFeatureCard("shoppingCartCard");
    }//GEN-LAST:event_iconLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLabel totCostLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        this.numberLabel.setText("Antal produkter: " + model.getItems().size());
        this.totCostLabel.setText("Kostnad: " + model.getTotalCost());
    }

    @Override
    public void shoppingCartComponentChanged(ShoppingItem item, boolean itemAdded) {
        this.numberLabel.setText("Antal produkter: " + model.getItems().size());
        this.totCostLabel.setText("Kostnad: " + model.getTotalCost());
    }
}
