/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author amar__000
 */
public class ProductPanel extends javax.swing.JPanel {
    private Product product;
    private IMatModel model;
    private ImageIcon productImage;
    int currentNbrOfProducts=1;
    int nbrOfClicksOnFavouriteLabel=0;
    /**
     * Creates new form ProductPanel
     */
    public ProductPanel(Product p,IMatModel m) {
        product=p;
        model=m;
        
        //Creates an image for a specific product and scales it to an appropriate size.
        productImage=new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/images/" + p.getImageName()));
        Image scaledImage=productImage.getImage().getScaledInstance(143, 111, Image.SCALE_FAST);
        productImage=new ImageIcon(scaledImage);
        initComponents();
        
    }
    public ProductPanel() {}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productIcon = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        productPriceLabel = new javax.swing.JLabel();
        cartPanel = new javax.swing.JPanel();
        nbrOfProductsTextfield = new javax.swing.JTextField();
        cartButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        FavouritePanel = new javax.swing.JPanel();
        DisFavouriteLabel = new javax.swing.JLabel();
        EnbFavouriteLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(180, 240));

        productIcon.setIcon(productImage);
        productIcon.setText("productIcon");
        productIcon.setPreferredSize(new java.awt.Dimension(180, 111));

        productNameLabel.setText(product.getName());

        productPriceLabel.setText(product.getPrice() + " " + product.getUnit());

        cartPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        nbrOfProductsTextfield.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nbrOfProductsTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbrOfProductsTextfield.setText("1");
        nbrOfProductsTextfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        nbrOfProductsTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrOfProductsTextfieldActionPerformed(evt);
            }
        });

        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/Productcart.png"))); // NOI18N
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        upButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/ArrowUpImage.png"))); // NOI18N
        upButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        upButton.setPreferredSize(new java.awt.Dimension(73, 26));
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        downButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/ArrowDownImage.png"))); // NOI18N
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
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

        FavouritePanel.setBackground(new java.awt.Color(255, 255, 255));
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
        DisFavouriteLabel.setNextFocusableComponent(EnbFavouriteLabel);
        DisFavouriteLabel.setPreferredSize(new java.awt.Dimension(25, 28));
        FavouritePanel.add(DisFavouriteLabel);

        EnbFavouriteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/EnabledFavoriteIcon.png"))); // NOI18N
        FavouritePanel.add(EnbFavouriteLabel);
        EnbFavouriteLabel.setVisible(model.isFavorite(product));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(productIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(FavouritePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productPriceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productPriceLabel)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FavouritePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nbrOfProductsTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrOfProductsTextfieldActionPerformed
        try{
            if(Integer.parseInt(nbrOfProductsTextfield.getText())<1){
            nbrOfProductsTextfield.setText(Integer.toString(currentNbrOfProducts));
        }
            currentNbrOfProducts=Integer.parseInt(nbrOfProductsTextfield.getText());
        }
        catch(NumberFormatException e){
            nbrOfProductsTextfield.setText(Integer.toString(currentNbrOfProducts));
        }
    }//GEN-LAST:event_nbrOfProductsTextfieldActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        currentNbrOfProducts++;
        nbrOfProductsTextfield.setText(Integer.toString(currentNbrOfProducts));
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        if(currentNbrOfProducts>1){
            currentNbrOfProducts--;
            nbrOfProductsTextfield.setText(Integer.toString(currentNbrOfProducts));
        }
    }//GEN-LAST:event_downButtonActionPerformed

    private void FavouritePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FavouritePanelMouseClicked
        nbrOfClicksOnFavouriteLabel++;
        nbrOfClicksOnFavouriteLabel=nbrOfClicksOnFavouriteLabel%2;
        model.changeFavoriteStatus(product);
    }//GEN-LAST:event_FavouritePanelMouseClicked

    private void FavouritePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FavouritePanelMouseEntered
        if(DisFavouriteLabel.isVisible()){
          EnbFavouriteLabel.setVisible(true);
          DisFavouriteLabel.setVisible(false);   
        }
    }//GEN-LAST:event_FavouritePanelMouseEntered

    private void FavouritePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FavouritePanelMouseExited
        if(EnbFavouriteLabel.isVisible() && nbrOfClicksOnFavouriteLabel % 2 == 0){
           EnbFavouriteLabel.setVisible(false);
           DisFavouriteLabel.setVisible(true);
        }
        else{
           EnbFavouriteLabel.setVisible(true);
           DisFavouriteLabel.setVisible(false);
        }
    }//GEN-LAST:event_FavouritePanelMouseExited

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        int nbrOfProducts=Integer.parseInt(nbrOfProductsTextfield.getText());
        model.addProduct(product, nbrOfProducts);
    }//GEN-LAST:event_cartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisFavouriteLabel;
    private javax.swing.JLabel EnbFavouriteLabel;
    private javax.swing.JPanel FavouritePanel;
    private javax.swing.JButton cartButton;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JButton downButton;
    private javax.swing.JTextField nbrOfProductsTextfield;
    private javax.swing.JLabel productIcon;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel productPriceLabel;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}
