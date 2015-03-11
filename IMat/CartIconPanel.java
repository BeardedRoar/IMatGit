/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.ShoppingCartListener;

/**
 *
 * @author Joel
 */
public class CartIconPanel extends javax.swing.JPanel implements ShoppingCartListener{
    private final IMatModel mod;
    private ShoppingListPreview slp;
    private final MainFrame frame;
    private BufferedImage selectedImage, mouseOnImage, mouseOffImage;
    private Timer timer;

    /**
     * Creates new form CartIconPanel
     */
    public CartIconPanel(IMatModel model, MainFrame frame) {
        this.mod = model;
        this.frame = frame;
        initComponents();
        this.totCostLabel.setText("Kostnad: " + ((int)(model.getTotalCost()*100))/100.0 + " kr");
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
                g.drawImage(selectedImage, 0, 7, null);
                g.setFont(new Font("Tahoma", Font.PLAIN, 18));
                g.setColor(Constants.BACKGROUND_COLOR);
                if (mod.getItems().size() < 10)
                    g.drawString("" + (int)mod.getItems().size(), 10, 34);
                else if (mod.getItems().size() < 100)
                    g.drawString("" + (int)mod.getItems().size(), 5, 34);
                else
                    g.drawString("" + (int)mod.getItems().size(), 2, 34);
            }
             
        };
        tempPanel.setOpaque(false);
        this.imagePanel.add(tempPanel);
        
        this.validationInLabel.setVisible(false);
        this.validationNameLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totCostLabel = new javax.swing.JLabel();
        imagePanel = new javax.swing.JPanel();
        validationNameLabel = new javax.swing.JLabel();
        validationInLabel = new javax.swing.JLabel();

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

        validationNameLabel.setForeground(Constants.BACKGROUND_COLOR);
        validationNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        validationNameLabel.setText("jLabel1");

        validationInLabel.setForeground(Constants.BACKGROUND_COLOR);
        validationInLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        validationInLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totCostLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(validationInLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(validationNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(validationNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validationInLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totCostLabel)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel totCostLabel;
    private javax.swing.JLabel validationInLabel;
    private javax.swing.JLabel validationNameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        this.totCostLabel.setText("Kostnad: " + ((int)(mod.getTotalCost()*100))/100.0 + " kr");
        if (ce.getShoppingItem() != null) {
            this.validationInLabel.setVisible(true);
            this.validationNameLabel.setVisible(true);
            this.validationNameLabel.setText(ce.getShoppingItem().getProduct().getName());
            this.validationInLabel.setText((ce.isAddEvent() ? "lades i" : "togs bort ut") + " kundvagnen.");
        }
        if (this.timer != null)
            this.timer.stop();
        this.timer = new Timer(2500, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                CartIconPanel.this.validationInLabel.setVisible(false);
                CartIconPanel.this.validationNameLabel.setVisible(false);
                CartIconPanel.this.timer.stop();
            }
            
        });
        this.timer.start();
        repaint();
        revalidate();
    }
  
}
