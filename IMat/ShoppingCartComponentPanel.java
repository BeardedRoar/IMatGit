/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

/**
 *
 * @author axel
 */
public class ShoppingCartComponentPanel extends javax.swing.JPanel {

    /**
     * Creates new form shoppingCartComponentPanel
     */
    public ShoppingCartComponentPanel() {
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

        productLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        nrOfProductsTextField = new javax.swing.JTextField();
        totalPriceLabel = new javax.swing.JLabel();
        increaseLabel = new javax.swing.JLabel();
        decreaseLabel = new javax.swing.JLabel();
        removeLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        productLabel.setBackground(new java.awt.Color(0, 0, 0));
        productLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        productLabel.setText("Produkt");

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        priceLabel.setText("Pris");

        nrOfProductsTextField.setText("Nr Of Products");

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalPriceLabel.setText("Totalpris");

        increaseLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\axel\\Documents\\NetBeansProjects\\IMat\\IMatGit\\iMat.resources\\plus-2x.png")); // NOI18N

        decreaseLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\axel\\Documents\\NetBeansProjects\\IMat\\IMatGit\\iMat.resources\\minus-2x.png")); // NOI18N

        removeLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\axel\\Documents\\NetBeansProjects\\IMat\\IMatGit\\iMat.resources\\x-2x.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productLabel)
                .addGap(155, 155, 155)
                .addComponent(priceLabel)
                .addGap(132, 132, 132)
                .addComponent(decreaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nrOfProductsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(increaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(totalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(removeLabel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(productLabel)
                                    .addComponent(priceLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nrOfProductsTextField)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(increaseLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalPriceLabel)
                            .addComponent(removeLabel))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(decreaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel decreaseLabel;
    private javax.swing.JLabel increaseLabel;
    private javax.swing.JTextField nrOfProductsTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel productLabel;
    private javax.swing.JLabel removeLabel;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
