/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.ShoppingCartListener;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Joel
 */
public class CartIconPanel extends javax.swing.JPanel 
implements ShoppingCartListener, ShoppingCartComponentListener{
    private final IMatModel mod;
    private ShoppingListPreview slp;
    private final MainFrame frame;
    private BufferedImage selectedImage, mouseOnImage, mouseOffImage;

    /**
     * Creates new form CartIconPanel
     */
    public CartIconPanel(IMatModel model, MainFrame frame) {
        this.mod = model;
        this.frame = frame;
        initComponents();
        this.numberLabel.setText("Antal produkter: " + mod.getItems().size());
        this.totCostLabel.setText("Kostnad: " + model.getTotalCost());
        this.slp = new ShoppingListPreview(imagePanel, model);
        this.mod.addCartListener(slp);
        try {
            this.mouseOffImage = ImageIO.read(getClass().getResource("/iMat.resources/whiteCart.png"));
            this.mouseOnImage  = ImageIO.read(getClass().getResource("/iMat.resources/whiteCartGlow.png"));
        } catch (IOException ex) {
            System.out.println("CartIcon image not found");
        }
        selectedImage = mouseOffImage;
        JPanel tempPanel = new JPanel() {
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(selectedImage, 0, 0, null);
                g.setFont(new Font("Tahoma", Font.PLAIN, 18));
                g.setColor(Constants.BACKGROUND_COLOR);
                if (mod.getItems().size() < 10)
                    g.drawString("" + (int)mod.getItems().size(), 10, 27);
                else if (mod.getItems().size() < 100)
                    g.drawString("" + (int)mod.getItems().size(), 5, 27);
                else
                    g.drawString("" + (int)mod.getItems().size(), 2, 27);
            }
             
        };
        tempPanel.setOpaque(false);
        this.imagePanel.add(tempPanel);
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
        imagePanel = new javax.swing.JPanel();

        iconPanel.setOpaque(false);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/whiteCart.png"))); // NOI18N
        iconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout iconPanelLayout = new javax.swing.GroupLayout(iconPanel);
        iconPanel.setLayout(iconPanelLayout);
        iconPanelLayout.setHorizontalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        iconPanelLayout.setVerticalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        numberLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberLabel.setText("jLabel1");

        setMinimumSize(new java.awt.Dimension(200, 70));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(200, 70));

        totCostLabel.setForeground(Constants.BACKGROUND_COLOR);
        totCostLabel.setText("jLabel2");

        imagePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagePanel.setMinimumSize(new java.awt.Dimension(100, 72));
        imagePanel.setOpaque(false);
        imagePanel.setPreferredSize(new java.awt.Dimension(100, 72));
        imagePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagePanelMouseExited(evt);
            }
        });
        imagePanel.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(totCostLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totCostLabel)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLabelMouseExited
        
    }//GEN-LAST:event_iconLabelMouseExited

    private void iconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLabelMouseEntered

    }//GEN-LAST:event_iconLabelMouseEntered

    private void iconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLabelMouseClicked
        
    }//GEN-LAST:event_iconLabelMouseClicked

    private void imagePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanelMouseEntered
        selectedImage = mouseOnImage;
        repaint();
        revalidate();
    }//GEN-LAST:event_imagePanelMouseEntered

    private void imagePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanelMouseExited
        selectedImage = mouseOffImage;
        repaint();
        revalidate();
    }//GEN-LAST:event_imagePanelMouseExited

    private void imagePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanelMouseClicked
        frame.setFeatureCard("shoppingCartCard");
        this.mod.reSetLastCategory();
    }//GEN-LAST:event_imagePanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLabel totCostLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        this.numberLabel.setText("Antal produkter: " + mod.getItems().size());
        this.totCostLabel.setText("Kostnad: " + mod.getTotalCost());
        repaint();
        revalidate();
    }

    @Override
    public void shoppingCartComponentChanged(ShoppingItem item, boolean itemAdded) {
        this.numberLabel.setText("Antal produkter: " + mod.getItems().size());
        this.totCostLabel.setText("Kostnad: " + mod.getTotalCost());
        repaint();
        revalidate();
    }
  
}
