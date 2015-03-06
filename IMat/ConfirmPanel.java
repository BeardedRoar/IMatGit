/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.List;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author axel
 */
public class ConfirmPanel extends javax.swing.JPanel {

    private IMatModel model;
    private MainFrame frame;
    /**
     * Creates new form ConfirmPanel
     */
    public ConfirmPanel(IMatModel model) {
        
        this.model = model;
        initComponents();    
        this.setBackground(Constants.BACKGROUND_COLOR);
        
        List<ShoppingItem> items = model.getItems();
        this.shoppingCartPanel.setLayout(new GridLayout(Math.max(9,items.size()), 1));
        Iterator<ShoppingItem> it = items.iterator();
        while (it.hasNext()){
            this.shoppingCartPanel.add(new SmallShoppingCartComponentPanel(it.next()));
        }
        
        cardComboBox.setSelectedItem(model.getCardType());
        cardNumberTextLabel.setText(model.getCardNumber());
        yearTextLabel.setText(Integer.toString(model.getValidYear()));
        monthTextLabel.setText(Integer.toString(model.getValidMonth()));
        cvcTextLabel.setText(Integer.toString(model.getVerificationCode()));
        nameTextLabel.setText(model.getFirstName());
        nameTextLabel2.setText(model.getLastName());
        adressTextLabel.setText(model.getAdress());
        postalCodeTextLabel.setText(model.getPostCode());
        postalAdressTextLabel.setText(model.getPostAdress());
        emailTextLabel.setText(model.getEmail());
        phoneTextLabel.setText(model.getPhoneNumber());
        mobilePhoneTextLabel.setText(model.getMobilePhoneNumber());
        adressTextLabel2.setText(model.getAdress());
        postalCodeTextLabel2.setText(model.getPostCode());
        postalAdressTextLabel2.setText(model.getPostAdress());
    }
    
    public ConfirmPanel(IMatModel model, MainFrame frame){
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

        containerPanel = new javax.swing.JPanel();
        cardCustomerPanel = new javax.swing.JPanel();
        cardCustomerPanel2 = new javax.swing.JPanel();
        cardInformationLabel = new javax.swing.JLabel();
        deliveryInformationLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cvcLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        cardNumberLabel = new javax.swing.JLabel();
        cardComboBox = new javax.swing.JComboBox();
        cardLabel = new javax.swing.JLabel();
        cardNumberTextLabel = new javax.swing.JLabel();
        yearTextLabel = new javax.swing.JLabel();
        monthTextLabel = new javax.swing.JLabel();
        cvcTextLabel = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        adressLabel = new javax.swing.JLabel();
        sendToOtherAdressCheckBox = new javax.swing.JCheckBox();
        postalAdressLabel = new javax.swing.JLabel();
        sendToMailCheckBox = new javax.swing.JCheckBox();
        saveInformationCheckBox = new javax.swing.JCheckBox();
        nameTextLabel = new javax.swing.JLabel();
        nameTextLabel2 = new javax.swing.JLabel();
        adressTextLabel = new javax.swing.JLabel();
        postalCodeTextLabel = new javax.swing.JLabel();
        adressTextLabel2 = new javax.swing.JLabel();
        postalCodeTextLabel2 = new javax.swing.JLabel();
        postalAdressTextLabel2 = new javax.swing.JLabel();
        postalAdressTextLabel = new javax.swing.JLabel();
        postalCodeLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        mobilePhoneLabel = new javax.swing.JLabel();
        emailTextLabel = new javax.swing.JLabel();
        phoneTextLabel = new javax.swing.JLabel();
        mobilePhoneTextLabel = new javax.swing.JLabel();
        shoppingCartScrollPane = new javax.swing.JScrollPane();
        shoppingCartPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 600));

        containerPanel.setBackground(Constants.BACKGROUND_COLOR);
        containerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        containerPanel.setPreferredSize(new java.awt.Dimension(1000, 600));

        cardCustomerPanel2.setBackground(new java.awt.Color(255, 255, 255));
        cardCustomerPanel2.setPreferredSize(new java.awt.Dimension(1000, 600));
        cardCustomerPanel2.setRequestFocusEnabled(false);

        cardInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cardInformationLabel.setText("Kortuppgifter");

        deliveryInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deliveryInformationLabel.setText("Leveransuppgifter");

        jPanel3.setOpaque(false);

        cvcLabel.setText("CVC");

        dateLabel.setText("År");

        cardNumberLabel.setText("Kortnummer");

        cardComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "Mastercard" }));
        cardComboBox.setEnabled(false);

        cardLabel.setText("Kort");

        cardNumberTextLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardNumberTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        cardNumberTextLabel.setText("Kortnumret");
        cardNumberTextLabel.setOpaque(true);
        cardNumberTextLabel.setPreferredSize(new java.awt.Dimension(100, 17));

        yearTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        yearTextLabel.setText("År");
        yearTextLabel.setOpaque(true);

        monthTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        monthTextLabel.setText("Månad");
        monthTextLabel.setOpaque(true);

        cvcTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        cvcTextLabel.setText("jLabel1");
        cvcTextLabel.setOpaque(true);

        dateLabel1.setText("Månad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardLabel)
                            .addComponent(cardNumberLabel)
                            .addComponent(cvcLabel)
                            .addComponent(cvcTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yearTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monthTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(cardNumberTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardNumberTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                .addComponent(cvcLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cvcTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setOpaque(false);

        nameLabel.setText("Namn");

        adressLabel.setText("Adress");

        sendToOtherAdressCheckBox.setText("Leverera till annan adress");
        sendToOtherAdressCheckBox.setEnabled(false);
        sendToOtherAdressCheckBox.setOpaque(false);

        postalAdressLabel.setText("Postort");

        sendToMailCheckBox.setText("Skicka kvitto till min mail");
        sendToMailCheckBox.setEnabled(false);
        sendToMailCheckBox.setOpaque(false);

        saveInformationCheckBox.setText("Spara mina uppgifter");
        saveInformationCheckBox.setEnabled(false);
        saveInformationCheckBox.setOpaque(false);

        nameTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        nameTextLabel.setText("Förnamn");
        nameTextLabel.setOpaque(true);

        nameTextLabel2.setForeground(new java.awt.Color(150, 150, 150));
        nameTextLabel2.setText("Efternamn");
        nameTextLabel2.setOpaque(true);

        adressTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        adressTextLabel.setText("Tvärvägen 20");
        adressTextLabel.setOpaque(true);

        postalCodeTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        postalCodeTextLabel.setText("Postnummer");
        postalCodeTextLabel.setOpaque(true);

        adressTextLabel2.setForeground(new java.awt.Color(150, 150, 150));
        adressTextLabel2.setText("Tvärvägen 21");
        adressTextLabel2.setOpaque(true);

        postalCodeTextLabel2.setText("Postnummer");

        postalAdressTextLabel2.setText("Postort");

        postalAdressTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        postalAdressTextLabel.setText("Postort");
        postalAdressTextLabel.setOpaque(true);

        postalCodeLabel.setText("Postnummer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adressTextLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adressTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveInformationCheckBox)
                            .addComponent(nameLabel)
                            .addComponent(adressLabel)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(postalCodeLabel)
                                .addGap(10, 10, 10)
                                .addComponent(postalAdressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sendToOtherAdressCheckBox)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(postalCodeTextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(postalAdressTextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sendToMailCheckBox))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(postalCodeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postalAdressTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nameTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressLabel)
                .addGap(5, 5, 5)
                .addComponent(adressTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalAdressLabel)
                    .addComponent(postalCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalAdressTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postalCodeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendToOtherAdressCheckBox)
                .addGap(1, 1, 1)
                .addComponent(adressTextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeTextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postalAdressTextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendToMailCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveInformationCheckBox)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        emailLabel.setText("Email");

        phoneLabel.setText("Telefon");

        mobilePhoneLabel.setText("Mobiltelefon");

        emailTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        emailTextLabel.setText("example@mail.com");
        emailTextLabel.setOpaque(true);

        phoneTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        phoneTextLabel.setText("070-00000");
        phoneTextLabel.setOpaque(true);

        mobilePhoneTextLabel.setForeground(new java.awt.Color(150, 150, 150));
        mobilePhoneTextLabel.setText("070-00000");
        mobilePhoneTextLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailLabel)
                    .addComponent(phoneLabel)
                    .addComponent(mobilePhoneLabel)
                    .addComponent(emailTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(mobilePhoneTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(emailLabel)
                .addGap(5, 5, 5)
                .addComponent(emailTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneLabel)
                .addGap(5, 5, 5)
                .addComponent(phoneTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobilePhoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobilePhoneTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cardCustomerPanel2Layout = new javax.swing.GroupLayout(cardCustomerPanel2);
        cardCustomerPanel2.setLayout(cardCustomerPanel2Layout);
        cardCustomerPanel2Layout.setHorizontalGroup(
            cardCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCustomerPanel2Layout.createSequentialGroup()
                .addGroup(cardCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(cardCustomerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardInformationLabel)
                    .addComponent(deliveryInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        cardCustomerPanel2Layout.setVerticalGroup(
            cardCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCustomerPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cardInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deliveryInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout cardCustomerPanelLayout = new javax.swing.GroupLayout(cardCustomerPanel);
        cardCustomerPanel.setLayout(cardCustomerPanelLayout);
        cardCustomerPanelLayout.setHorizontalGroup(
            cardCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardCustomerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cardCustomerPanelLayout.setVerticalGroup(
            cardCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardCustomerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        shoppingCartScrollPane.setBackground(Constants.BACKGROUND_COLOR);
        shoppingCartScrollPane.setMinimumSize(new java.awt.Dimension(500, 600));
        shoppingCartScrollPane.setName(""); // NOI18N
        shoppingCartScrollPane.setPreferredSize(new java.awt.Dimension(500, 600));

        shoppingCartPanel.setBackground(Constants.BACKGROUND_COLOR);
        shoppingCartPanel.setMinimumSize(new java.awt.Dimension(500, 600));
        shoppingCartPanel.setPreferredSize(new java.awt.Dimension(500, 600));

        javax.swing.GroupLayout shoppingCartPanelLayout = new javax.swing.GroupLayout(shoppingCartPanel);
        shoppingCartPanel.setLayout(shoppingCartPanelLayout);
        shoppingCartPanelLayout.setHorizontalGroup(
            shoppingCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        shoppingCartPanelLayout.setVerticalGroup(
            shoppingCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        shoppingCartScrollPane.setViewportView(shoppingCartPanel);

        jPanel1.setBackground(Constants.BACKGROUND_COLOR);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 50));

        confirmButton.setBackground(Constants.HEADER_COLOR);
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Bekräfta");
        confirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmButton.setPreferredSize(new java.awt.Dimension(50, 25));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(363, Short.MAX_VALUE)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backButton.setBackground(Constants.HEADER_COLOR);
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Bakåt");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setPreferredSize(new java.awt.Dimension(50, 25));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(cardCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                    .addComponent(shoppingCartScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(shoppingCartScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        model.placeOrder(true);
        if(frame != null){
            this.shoppingCartPanel.removeAll();
            frame.setEndingCard("buy");
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        frame.setFeatureCard("checkoutCard");
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JLabel adressTextLabel;
    private javax.swing.JLabel adressTextLabel2;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox cardComboBox;
    private javax.swing.JPanel cardCustomerPanel;
    private javax.swing.JPanel cardCustomerPanel2;
    private javax.swing.JLabel cardInformationLabel;
    private javax.swing.JLabel cardLabel;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JLabel cardNumberTextLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JLabel cvcTextLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel deliveryInformationLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailTextLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel mobilePhoneLabel;
    private javax.swing.JLabel mobilePhoneTextLabel;
    private javax.swing.JLabel monthTextLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameTextLabel;
    private javax.swing.JLabel nameTextLabel2;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneTextLabel;
    private javax.swing.JLabel postalAdressLabel;
    private javax.swing.JLabel postalAdressTextLabel;
    private javax.swing.JLabel postalAdressTextLabel2;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JLabel postalCodeTextLabel;
    private javax.swing.JLabel postalCodeTextLabel2;
    private javax.swing.JCheckBox saveInformationCheckBox;
    private javax.swing.JCheckBox sendToMailCheckBox;
    private javax.swing.JCheckBox sendToOtherAdressCheckBox;
    private javax.swing.JPanel shoppingCartPanel;
    private javax.swing.JScrollPane shoppingCartScrollPane;
    private javax.swing.JLabel yearTextLabel;
    // End of variables declaration//GEN-END:variables
}
