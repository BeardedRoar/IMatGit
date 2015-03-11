package IMat;

import javax.swing.JTextField;

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
        postalCodeTextField1.setVisible(false);
        postalAdressTextField1.setVisible(false);
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
        postalAdressTextField = new javax.swing.JTextField();
        postalAdressLabel = new javax.swing.JLabel();
        sendToMailCheckBox = new javax.swing.JCheckBox();
        saveInformationCheckBox = new javax.swing.JCheckBox();
        backButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        mobilePhoneLabel = new javax.swing.JLabel();
        mobilePhoneTextField = new javax.swing.JTextField();
        postalCodeTextField1 = new javax.swing.JTextField();
        postalAdressTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        buyButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setRequestFocusEnabled(false);

        cardInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cardInformationLabel.setText("Kortuppgifter");
        cardInformationLabel.setMaximumSize(new java.awt.Dimension(140, 30));
        cardInformationLabel.setMinimumSize(new java.awt.Dimension(140, 30));
        cardInformationLabel.setPreferredSize(new java.awt.Dimension(140, 30));

        deliveryInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deliveryInformationLabel.setText("Leveransuppgifter");

        jPanel2.setOpaque(false);

        cvcTextField.setFont(Constants.INPUT_FONT);
        cvcTextField.setText("123");
        cvcTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });
        cvcTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvcTextFieldActionPerformed(evt);
            }
        });

        cvcLabel.setFont(Constants.INPUT_FONT);
        cvcLabel.setText("CVC");

        monthTextField.setFont(Constants.INPUT_FONT);
        monthTextField.setText("02");
        monthTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        yearTextField.setFont(Constants.INPUT_FONT);
        yearTextField.setText("15");
        yearTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        dateLabel.setFont(Constants.INPUT_FONT);
        dateLabel.setText("Datum");

        cardNumberTextField.setFont(Constants.INPUT_FONT);
        cardNumberTextField.setToolTipText("");
        cardNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });
        cardNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTextFieldActionPerformed(evt);
            }
        });

        cardNumberLabel.setFont(Constants.INPUT_FONT);
        cardNumberLabel.setText("Kortnummer");

        cardComboBox.setFont(Constants.INPUT_FONT);
        cardComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "Mastercard" }));
        cardComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardComboBoxActionPerformed(evt);
            }
        });

        cardLabel.setFont(Constants.INPUT_FONT);
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

        nameLabel.setFont(Constants.INPUT_FONT);
        nameLabel.setText("Namn");

        nameTextField.setFont(Constants.INPUT_FONT);
        nameTextField.setText("Förnamn");
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        nameTextField2.setFont(Constants.INPUT_FONT);
        nameTextField2.setText("Efternamn");
        nameTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });
        nameTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextField2ActionPerformed(evt);
            }
        });

        adressLabel.setFont(Constants.INPUT_FONT);
        adressLabel.setText("Adress");

        adressTextField.setFont(Constants.INPUT_FONT);
        adressTextField.setText("Tvärvägen 20");
        adressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        sendToOtherAdressCheckBox.setFont(Constants.INPUT_FONT);
        sendToOtherAdressCheckBox.setText("Leverera till annan adress");
        sendToOtherAdressCheckBox.setOpaque(false);
        sendToOtherAdressCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sendToOtherAdressCheckBoxMousePressed(evt);
            }
        });

        adressTextField2.setFont(Constants.INPUT_FONT);
        adressTextField2.setText("Tvärvägen 21");
        adressTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        postalCodeLabel.setFont(Constants.INPUT_FONT);
        postalCodeLabel.setText("Postnummer");

        postalCodeTextField.setFont(Constants.INPUT_FONT);
        postalCodeTextField.setText("Postnummer");
        postalCodeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        postalAdressTextField.setFont(Constants.INPUT_FONT);
        postalAdressTextField.setText("Postort");
        postalAdressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        postalAdressLabel.setFont(Constants.INPUT_FONT);
        postalAdressLabel.setText("Postort");
        postalAdressLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        sendToMailCheckBox.setFont(Constants.INPUT_FONT);
        sendToMailCheckBox.setText("Skicka kvitto till min mail");
        sendToMailCheckBox.setOpaque(false);

        saveInformationCheckBox.setFont(Constants.INPUT_FONT);
        saveInformationCheckBox.setText("Spara mina uppgifter");
        saveInformationCheckBox.setOpaque(false);
        saveInformationCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveInformationCheckBoxMousePressed(evt);
            }
        });

        backButton.setBackground(Constants.HEADER_COLOR);
        backButton.setFont(Constants.BUTTON_FONT);
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Bakåt");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backButton.setPreferredSize(new java.awt.Dimension(50, 25));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adressTextField2)
                    .addComponent(adressTextField)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postalAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(saveInformationCheckBox)
                    .addComponent(sendToMailCheckBox)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField2))
                    .addComponent(nameLabel)
                    .addComponent(adressLabel)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(postalCodeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(postalAdressLabel))
                    .addComponent(sendToOtherAdressCheckBox)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveInformationCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setOpaque(false);

        emailLabel.setFont(Constants.INPUT_FONT);
        emailLabel.setText("Email");

        emailTextField.setFont(Constants.INPUT_FONT);
        emailTextField.setText("example@mail.com");
        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        phoneLabel.setFont(Constants.INPUT_FONT);
        phoneLabel.setText("Telefon");

        phoneTextField.setFont(Constants.INPUT_FONT);
        phoneTextField.setText("070-00000");
        phoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });
        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        mobilePhoneLabel.setFont(Constants.INPUT_FONT);
        mobilePhoneLabel.setText("Mobiltelefon");

        mobilePhoneTextField.setFont(Constants.INPUT_FONT);
        mobilePhoneTextField.setText("070-00001");
        mobilePhoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });

        postalCodeTextField1.setFont(Constants.INPUT_FONT);
        postalCodeTextField1.setText("Postnummer");

        postalAdressTextField1.setFont(Constants.INPUT_FONT);
        postalAdressTextField1.setText("Postort");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneTextField)
                    .addComponent(mobilePhoneTextField)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(phoneLabel)
                            .addComponent(mobilePhoneLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(postalCodeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postalAdressTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addComponent(emailTextField))
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
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postalAdressTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(cardInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cardInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        buyButton.setBackground(Constants.HEADER_COLOR);
        buyButton.setFont(Constants.BUTTON_FONT);
        buyButton.setForeground(Constants.BACKGROUND_COLOR);
        buyButton.setText("Gå Vidare");
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buyButton.setMinimumSize(new java.awt.Dimension(50, 25));
        buyButton.setPreferredSize(new java.awt.Dimension(50, 25));
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
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(0, 262, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
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
        }else{
            noFault = true;
        }
        
    }//GEN-LAST:event_cardNumberTextFieldActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        
    }//GEN-LAST:event_yearTextFieldActionPerformed

    private void nameTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextField2ActionPerformed
        
    }//GEN-LAST:event_nameTextField2ActionPerformed

    private void sendToOtherAdressCheckBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendToOtherAdressCheckBoxMousePressed
        adressTextField2.setVisible(!sendToOtherAdressCheckBox.isSelected());
        postalCodeTextField1.setVisible(!sendToOtherAdressCheckBox.isSelected());
        postalAdressTextField1.setVisible(!sendToOtherAdressCheckBox.isSelected());
        repaint();
        revalidate();
    }//GEN-LAST:event_sendToOtherAdressCheckBoxMousePressed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        if(noFault){      
            if(frame != null){
                frame.setFeatureCard("confirmPanelCard");
            }
        }else{
            errorLabel.setVisible(true);
        }        
    }//GEN-LAST:event_buyButtonActionPerformed

    private void saveInformationCheckBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveInformationCheckBoxMousePressed
        
        model.setCardNumber(cardNumberTextField.getText());
        model.setCardType((String)cardComboBox.getSelectedItem());
        model.setValidMonth(Integer.parseInt(monthTextField.getText()));
        model.setValidYear(Integer.parseInt(yearTextField.getText()));
        model.setVerificationCode(Integer.parseInt(cvcTextField.getText()));
        
        model.setFirstName(nameTextField.getText());
        model.setLastName(nameTextField2.getText());
        model.setAddress(adressTextField.getText());
        
        model.setPostCode(postalCodeLabel.getText());
        model.setPostAddress(postalAdressTextField.getText());
        
        model.setEmail(emailTextField.getText());
        model.setPhoneNumber(phoneTextField.getText());
        model.setMobilePhoneNumber(mobilePhoneTextField.getText());
    }//GEN-LAST:event_saveInformationCheckBoxMousePressed

    private void cvcTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvcTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvcTextFieldActionPerformed

    private void textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusGained
        JTextField field = (JTextField) evt.getSource();
        field.selectAll();
    }//GEN-LAST:event_textFieldFocusGained

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        frame.setFeatureCard("shoppingCartCard");
    }//GEN-LAST:event_backButtonActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JTextField adressTextField2;
    private javax.swing.JButton backButton;
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
    private javax.swing.JTextField postalAdressTextField1;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JTextField postalCodeTextField;
    private javax.swing.JTextField postalCodeTextField1;
    private javax.swing.JCheckBox saveInformationCheckBox;
    private javax.swing.JCheckBox sendToMailCheckBox;
    private javax.swing.JCheckBox sendToOtherAdressCheckBox;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
