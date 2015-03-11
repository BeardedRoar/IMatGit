/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author amar__000
 */
public class StartProductPanel extends javax.swing.JPanel {
    private Product product;
    private IMatModel model;
    double currentNbrOfProducts = 1;
    /**
     * Creates new form StartProductPanel
     */
    public StartProductPanel(Product p,IMatModel m) {
        product=p;
        model=m;
        
        initComponents();
        
        if(model.isFavorite(product)){
          EnbFavouriteLabel.setVisible(true);
          DisFavouriteLabel.setVisible(false);   
        }
    }
    public StartProductPanel(){}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        cartPanel = new javax.swing.JPanel();
        nbrOfProductsTextfield = new javax.swing.JTextField();
        cartButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FavouritePanel = new javax.swing.JPanel();
        DisFavouriteLabel = new javax.swing.JLabel();
        EnbFavouriteLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(Constants.BACKGROUND_COLOR);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        containerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        containerPanel.setOpaque(false);

        cartPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        nbrOfProductsTextfield.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nbrOfProductsTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbrOfProductsTextfield.setText("1");
        nbrOfProductsTextfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
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

        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/Productcart.png"))); // NOI18N
        cartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
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
                .addComponent(nbrOfProductsTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(downButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbrOfProductsTextfield, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartPanelLayout.createSequentialGroup()
                        .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(cartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jLabel3.setFont(Constants.FRONT_RESULT_FONT);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(product.getPrice() + " " + product.getUnit());

        jLabel2.setFont(Constants.FRONT_RESULT_FONT);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(product.getName());

        FavouritePanel.setBackground(new java.awt.Color(255, 255, 255));
        FavouritePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FavouritePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FavouritePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FavouritePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FavouritePanelMouseExited(evt);
            }
        });
        FavouritePanel.setLayout(new javax.swing.OverlayLayout(FavouritePanel));

        DisFavouriteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/DisabledFavoriteIcon.png"))); // NOI18N
        DisFavouriteLabel.setPreferredSize(new java.awt.Dimension(25, 28));
        FavouritePanel.add(DisFavouriteLabel);

        EnbFavouriteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/EnabledFavoriteIcon.png"))); // NOI18N
        FavouritePanel.add(EnbFavouriteLabel);
        EnbFavouriteLabel.setVisible(false);

        jLabel1.setIcon(model.getImageIcon(product, 138, 100));
        jLabel1.setMaximumSize(new java.awt.Dimension(72, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(72, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(72, 100));

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerPanelLayout.createSequentialGroup()
                            .addComponent(cartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FavouritePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerPanelLayout.createSequentialGroup()
                    .addContainerGap(107, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FavouritePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        add(containerPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void nbrOfProductsTextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nbrOfProductsTextfieldFocusGained
        nbrOfProductsTextfield.selectAll();
    }//GEN-LAST:event_nbrOfProductsTextfieldFocusGained

    private void nbrOfProductsTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nbrOfProductsTextfieldFocusLost
        currentNbrOfProducts = getAmount();
    }//GEN-LAST:event_nbrOfProductsTextfieldFocusLost

    private void nbrOfProductsTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrOfProductsTextfieldActionPerformed
        try{
            if(Double.parseDouble(nbrOfProductsTextfield.getText())<=0){
                nbrOfProductsTextfield.setText(getText());
            } else {
                currentNbrOfProducts = getAmount();
                nbrOfProductsTextfield.setText(getText());
            }
        }
        catch(NumberFormatException e){
            nbrOfProductsTextfield.setText(getText());
        }
    }//GEN-LAST:event_nbrOfProductsTextfieldActionPerformed

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        
        model.addProduct(product, getAmount());
    }//GEN-LAST:event_cartButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        currentNbrOfProducts++;
        nbrOfProductsTextfield.setText(getText());
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        if(currentNbrOfProducts>1){
            currentNbrOfProducts--;
            nbrOfProductsTextfield.setText(getText());
        }
    }//GEN-LAST:event_downButtonActionPerformed

    private void FavouritePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FavouritePanelMouseClicked
        model.changeFavoriteStatus(product);
        if(!model.isFavorite(product)){
            EnbFavouriteLabel.setVisible(false);
            DisFavouriteLabel.setVisible(true);
        }
    }//GEN-LAST:event_FavouritePanelMouseClicked

    private void FavouritePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FavouritePanelMouseEntered
        if(!model.isFavorite(product)){
            EnbFavouriteLabel.setVisible(true);
            DisFavouriteLabel.setVisible(false);
        }
    }//GEN-LAST:event_FavouritePanelMouseEntered

    private void FavouritePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FavouritePanelMouseExited
        if(!model.isFavorite(product)){
            EnbFavouriteLabel.setVisible(false);
            DisFavouriteLabel.setVisible(true);
        }
        else{
            EnbFavouriteLabel.setVisible(true);
            DisFavouriteLabel.setVisible(false);
        }
    }//GEN-LAST:event_FavouritePanelMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        this.requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private double getAmount(){
        if ("kg".equals(this.product.getUnitSuffix())) {
            return Double.parseDouble(nbrOfProductsTextfield.getText());
        } else {
            return (int)Double.parseDouble(nbrOfProductsTextfield.getText());
        }
    }
    
    private String getText(){
        if ("kg".equals(this.product.getUnitSuffix())) {
            return Double.toString(currentNbrOfProducts);
        } else {
            return Integer.toString((int)currentNbrOfProducts);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisFavouriteLabel;
    private javax.swing.JLabel EnbFavouriteLabel;
    private javax.swing.JPanel FavouritePanel;
    private javax.swing.JButton cartButton;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JButton downButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nbrOfProductsTextfield;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}
