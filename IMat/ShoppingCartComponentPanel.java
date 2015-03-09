/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.util.ArrayList;
import javax.swing.*;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author axel
 */
public class ShoppingCartComponentPanel extends javax.swing.JPanel {

    private final ShoppingItem shoppingItem;

    public ShoppingItem getShoppingItem() {
        return shoppingItem;
    }
    private ArrayList<ShoppingCartComponentListener> listenerList = new ArrayList();
    private ShoppingCartPanel shoppingCartPanel;
    /**
     * Creates new form shoppingCartComponentPanel
     */
    public ShoppingCartComponentPanel(ShoppingItem shoppingItem, ShoppingCartPanel shoppingCartPanel) {
        this.shoppingItem = shoppingItem;
        this.shoppingCartPanel=shoppingCartPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        accualProductLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        priceLabel = new javax.swing.JLabel();
        accualPriceLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cartPanel = new javax.swing.JPanel();
        nbrOfProductsTextfield = new javax.swing.JTextField();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        totalPriceLabel = new javax.swing.JLabel();
        accualTotalPriceLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        deleteLabel = new javax.swing.JLabel();

        setBackground(Constants.BACKGROUND_COLOR);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(900, 64));
        setMinimumSize(new java.awt.Dimension(900, 64));
        setPreferredSize(new java.awt.Dimension(900, 64));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new java.awt.GridLayout(1, 4));

        jPanel1.setOpaque(false);

        accualProductLabel.setBackground(new java.awt.Color(0, 0, 0));
        accualProductLabel.setFont(Constants.RESULT_FONT);
        accualProductLabel.setText(this.shoppingItem.getProduct().getName());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(accualProductLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accualProductLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);

        jPanel2.setOpaque(false);

        priceLabel.setFont(Constants.RESULT_FONT);
        priceLabel.setText("Pris");

        accualPriceLabel.setFont(Constants.RESULT_FONT);
        accualPriceLabel.setText(this.shoppingItem.getProduct().getPrice()+" "+this.shoppingItem.getProduct().getUnit());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accualPriceLabel)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(accualPriceLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2);

        jPanel3.setOpaque(false);

        cartPanel.setBackground(new java.awt.Color(255, 255, 255));
        cartPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        nbrOfProductsTextfield.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nbrOfProductsTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbrOfProductsTextfield.setText(Integer.toString((int) this.shoppingItem.getAmount()));
        nbrOfProductsTextfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        nbrOfProductsTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nbrOfProductsTextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nbrOfProductsTextfieldFocusLost(evt);
            }
        });
        nbrOfProductsTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrOfProductsTextfieldActionPerformed(evt);
            }
        });

        upButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/ArrowUpImage.png"))); // NOI18N
        upButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        upButton.setPreferredSize(new java.awt.Dimension(73, 26));
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        downButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/ArrowDownImage.png"))); // NOI18N
        downButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        downButton.setPreferredSize(new java.awt.Dimension(73, 26));
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(nbrOfProductsTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(downButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartPanelLayout.createSequentialGroup()
                        .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(nbrOfProductsTextfield)))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText(this.shoppingItem.getProduct().getUnitSuffix());
        jLabel1.setPreferredSize(new java.awt.Dimension(22, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel3);

        jPanel4.setOpaque(false);

        totalPriceLabel.setFont(Constants.RESULT_FONT);
        totalPriceLabel.setText("Totalpris");

        accualTotalPriceLabel.setFont(Constants.RESULT_FONT);
        accualTotalPriceLabel.setText(""+this.shoppingItem.getTotal() + " kr");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        deleteLabel.setBackground(Constants.BACKGROUND_COLOR);
        deleteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/x-2x.png"))); // NOI18N
        deleteLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteLabel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(deleteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accualTotalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPriceLabel)
                    .addComponent(accualTotalPriceLabel))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void nbrOfProductsTextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nbrOfProductsTextfieldFocusGained
        nbrOfProductsTextfield.selectAll();
    }//GEN-LAST:event_nbrOfProductsTextfieldFocusGained

    private void nbrOfProductsTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nbrOfProductsTextfieldFocusLost
        this.shoppingItem.setAmount(Integer.parseInt(nbrOfProductsTextfield.getText()));
    }//GEN-LAST:event_nbrOfProductsTextfieldFocusLost

    private void nbrOfProductsTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrOfProductsTextfieldActionPerformed
        try{
            if(Integer.parseInt(nbrOfProductsTextfield.getText())<1){
                nbrOfProductsTextfield.setText(Integer.toString((int) this.shoppingItem.getAmount()));
            }
            this.shoppingItem.setAmount(Integer.parseInt(nbrOfProductsTextfield.getText()));
            accualTotalPriceLabel.setText("" + this.shoppingItem.getTotal() + " kr");
            this.fireComponentChange(shoppingItem, false);
        }
        catch(NumberFormatException e){
            nbrOfProductsTextfield.setText(Integer.toString((int) this.shoppingItem.getAmount()));
        }
    }//GEN-LAST:event_nbrOfProductsTextfieldActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        if(this.shoppingItem.getAmount()>0){
            this.shoppingItem.setAmount(this.shoppingItem.getAmount()+1);
            nbrOfProductsTextfield.setText(Integer.toString((int) this.shoppingItem.getAmount()));
            accualTotalPriceLabel.setText("" + this.shoppingItem.getTotal() + " kr");
            this.fireComponentChange(shoppingItem, true);
        }
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        if(this.shoppingItem.getAmount()>1){
           this.shoppingItem.setAmount(this.shoppingItem.getAmount()-1);
           nbrOfProductsTextfield.setText(Integer.toString((int) this.shoppingItem.getAmount()));
           accualTotalPriceLabel.setText("" + this.shoppingItem.getTotal() + " kr");
           this.fireComponentChange(shoppingItem, false);
        }
    }//GEN-LAST:event_downButtonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        this.requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private void deleteLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseEntered
        deleteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/x-2xred.png")));
    }//GEN-LAST:event_deleteLabelMouseEntered

    private void deleteLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseExited
        deleteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/x-2x.png")));
    }//GEN-LAST:event_deleteLabelMouseExited

    private void deleteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseClicked
        shoppingCartPanel.removeCartComponentPanel(this);
        this.fireComponentChange(shoppingItem, false);
        shoppingCartPanel.DisableNextButtonIfCartIsEmpty();
    }//GEN-LAST:event_deleteLabelMouseClicked

    public void addShoppingCartComponentListener(ShoppingCartComponentListener sccl){
       this.listenerList.add(sccl); 
    }
    
    public void removeShoppingCartComponentListener(ShoppingCartComponentListener sccl){
       this.listenerList.remove(sccl); 
    }
    
    private void fireComponentChange(ShoppingItem item, boolean itemAdded){
        for (ShoppingCartComponentListener sccl : listenerList){
            sccl.shoppingCartComponentChanged(item, itemAdded);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accualPriceLabel;
    private javax.swing.JLabel accualProductLabel;
    private javax.swing.JLabel accualTotalPriceLabel;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JButton downButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nbrOfProductsTextfield;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}
