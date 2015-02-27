package IMat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axel
 */
public class CheckoutPanel extends javax.swing.JPanel {

    private IMatModel model;
    private MainFrame frame;
    private boolean noFault = true;
    /**
     * Creates new form CheckoutPanel
     */
    public CheckoutPanel(IMatModel model) {
        this.model = model;    
        
        initComponents();
        
        adressTextField2.setVisible(false);
        errorLabel.setVisible(false);
        
        if(!model.getCardNumber().equals("")){ 
            cardNumberTextField.setText(model.getCardNumber());
        }
        if(model.getValidYear() != 0){
            yearTextField.setText(Integer.toString(model.getValidYear()));
        }    
        if(model.getValidMonth() < 12 && model.getValidMonth() > 0){
            monthTextField.setText(Integer.toString(model.getValidMonth()));
        }
        if(model.getVerificationCode() != 0){
            cvcTextField.setText(Integer.toString(model.getVerificationCode()));
        }
        if(!model.getCardType().equals("")){
            cardComboBox.setSelectedItem(model.getCardType());
        }
        if(!(model.getFirstName().equals("") && model.getLastName().equals(""))){
            nameTextField.setText(model.getFirstName());
            nameTextField2.setText(model.getLastName());
        }
        if(!model.getAdress().equals("")){
            adressTextField.setText(model.getAdress());
            adressTextField2.setText(model.getAdress());
        }
        if(!model.getPostCode().equals("") && model.getPostAdress().equals("")){
            postalCodeTextField.setText(model.getPostCode());
            postalAdressTextField.setText(model.getPostAdress());
        }
        if(!model.getEmail().equals("")){
            emailTextField.setText(model.getEmail());
        }
        if(!model.getPhoneNumber().equals("") && 
            model.getMobilePhoneNumber().equals("")){
            phoneTextField.setText(model.getPhoneNumber());
            mobilePhoneTextField.setText(model.getMobilePhoneNumber());
        }
    }    
    
    public CheckoutPanel(IMatModel model, MainFrame frame){
        this(model);
        this.frame = frame;
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
        cardInformationLabel = new javax.swing.JLabel();
        deliveryInformationLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cvcTextField = new javax.swing.JTextField();
        cvcLabel = new javax.swing.JLabel();
        monthTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        cardNumberLabel = new javax.swing.JLabel();
        cardComboBox = new javax.swing.JComboBox();
        cardLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nameTextField2 = new javax.swing.JTextField();
        adressLabel = new javax.swing.JLabel();
        adressTextField = new javax.swing.JTextField();
        sendToOtherAdressCheckBox = new javax.swing.JCheckBox();
        adressTextField2 = new javax.swing.JTextField();
        postalCodeLabel = new javax.swing.JLabel();
        postalCodeTextField = new javax.swing.JTextField();
        sendToMailCheckBox = new javax.swing.JCheckBox();
        postalAdressTextField = new javax.swing.JTextField();
        postalAdressLabel = new javax.swing.JLabel();
        saveInformationCheckBox = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        mobilePhoneLabel = new javax.swing.JLabel();
        mobilePhoneTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        buyButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setRequestFocusEnabled(false);

        cardInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cardInformationLabel.setText("Kortuppgifter");

        deliveryInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deliveryInformationLabel.setText("Leveransuppgifter");

        jPanel2.setOpaque(false);

        cvcTextField.setText("***");

        cvcLabel.setText("CVC");

        monthTextField.setText("02");

        yearTextField.setText("15");
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        dateLabel.setText("Datum");

        cardNumberTextField.setToolTipText("");
        cardNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTextFieldActionPerformed(evt);
            }
        });

        cardNumberLabel.setText("Kortnummer");

        cardComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "Mastercard" }));
        cardComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardComboBoxActionPerformed(evt);
            }
        });

        cardLabel.setText("Kort");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardNumberTextField)
                    .addComponent(cardComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardLabel)
                            .addComponent(dateLabel)
                            .addComponent(cardNumberLabel)
                            .addComponent(cvcLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cvcTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(yearTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthTextField)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cvcLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cvcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setOpaque(false);

        nameLabel.setText("Namn");

        nameTextField.setText("Förnamn");

        nameTextField2.setText("Efternamn");
        nameTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextField2ActionPerformed(evt);
            }
        });

        adressLabel.setText("Adress");

        adressTextField.setText("Tvärvägen 20");

        sendToOtherAdressCheckBox.setText("Leverera till annan adress");
        sendToOtherAdressCheckBox.setOpaque(false);
        sendToOtherAdressCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sendToOtherAdressCheckBoxMousePressed(evt);
            }
        });

        adressTextField2.setText("Tvärvägen 21");

        postalCodeLabel.setText("Postnummer");

        postalCodeTextField.setText("Postnummer");

        sendToMailCheckBox.setText("Skicka kvitto till min mail");
        sendToMailCheckBox.setOpaque(false);

        postalAdressTextField.setText("Postort");

        postalAdressLabel.setText("Postort");

        saveInformationCheckBox.setText("Spara mina uppgifter");
        saveInformationCheckBox.setOpaque(false);
        saveInformationCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveInformationCheckBoxMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adressTextField)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postalAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveInformationCheckBox)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(nameLabel)
                                .addComponent(adressLabel)
                                .addComponent(sendToMailCheckBox)
                                .addComponent(adressTextField2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(postalCodeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(postalAdressLabel))
                            .addComponent(sendToOtherAdressCheckBox))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeLabel)
                    .addComponent(postalAdressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postalAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendToOtherAdressCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendToMailCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveInformationCheckBox)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);

        emailLabel.setText("Email");

        emailTextField.setText("Enter Email Here");

        phoneLabel.setText("Telefon");

        phoneTextField.setText("070-00000");
        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        mobilePhoneLabel.setText("Mobiltelefon");

        mobilePhoneTextField.setText("070-00001");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(phoneLabel)
                            .addComponent(mobilePhoneLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(phoneTextField)
                    .addComponent(mobilePhoneTextField)
                    .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobilePhoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobilePhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardInformationLabel)
                            .addComponent(deliveryInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cardInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deliveryInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        buyButton.setBackground(new java.awt.Color(255, 102, 102));
        buyButton.setText("Köp");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        errorLabel.setText("Fel! Du har skrivit in fel värde!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardComboBoxActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void cardNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTextFieldActionPerformed
        if(cardNumberTextField.getText().length() != 16){
            noFault = false;
        }
    }//GEN-LAST:event_cardNumberTextFieldActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        
    }//GEN-LAST:event_yearTextFieldActionPerformed

    private void nameTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextField2ActionPerformed
        
    }//GEN-LAST:event_nameTextField2ActionPerformed

    private void sendToOtherAdressCheckBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendToOtherAdressCheckBoxMousePressed
        adressTextField2.setVisible(!sendToOtherAdressCheckBox.isSelected());
            repaint();
            revalidate();
    }//GEN-LAST:event_sendToOtherAdressCheckBoxMousePressed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        
        if(noFault){
            model.placeOrder(true);
            if(frame != null){
            frame.setFeatureCard("frontPageCard");
            }
        }else{
            errorLabel.setVisible(true);
        }        
    }//GEN-LAST:event_buyButtonActionPerformed

    private void saveInformationCheckBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveInformationCheckBoxMousePressed
        model.setCardNumber(cardNumberTextField.getText());
        //model.setCardType(cardComboBox.);
        model.setValidMonth(Integer.parseInt(monthTextField.getText()));
        model.setValidYear(Integer.parseInt(yearTextField.getText()));
        model.setVerificationCode(Integer.parseInt(cvcTextField.getText()));
        
        model.setFirstName(nameTextField.getText());
        model.setLastName(nameTextField.getText());
        model.setAddress(adressTextField.getText());
        
        model.setPostCode(postalCodeLabel.getText());
        
        
    }//GEN-LAST:event_saveInformationCheckBoxMousePressed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JTextField adressTextField2;
    private javax.swing.JButton buyButton;
    private javax.swing.JComboBox cardComboBox;
    private javax.swing.JLabel cardInformationLabel;
    private javax.swing.JLabel cardLabel;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JTextField cvcTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel deliveryInformationLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel mobilePhoneLabel;
    private javax.swing.JTextField mobilePhoneTextField;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nameTextField2;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel postalAdressLabel;
    private javax.swing.JTextField postalAdressTextField;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JTextField postalCodeTextField;
    private javax.swing.JCheckBox saveInformationCheckBox;
    private javax.swing.JCheckBox sendToMailCheckBox;
    private javax.swing.JCheckBox sendToOtherAdressCheckBox;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
