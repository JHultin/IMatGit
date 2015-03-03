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
        this.shoppingCartPanel.setLayout(new GridLayout(items.size(), 1));
        Iterator<ShoppingItem> it = items.iterator();
        while (it.hasNext()){
            this.shoppingCartScrollPane.add(new ShoppingCartComponentPanel(it.next()));
        }
        
        cardComboBox.setSelectedItem(model.getCardType());
        cardNumberTextField.setText(model.getCardNumber());
        yearTextField.setText(Integer.toString(model.getValidYear()));
        monthTextField.setText(Integer.toString(model.getValidMonth()));
        cvcTextField.setText(Integer.toString(model.getVerificationCode()));
        nameTextField.setText(model.getFirstName());
        nameTextField2.setText(model.getLastName());
        adressTextField.setText(model.getAdress());
        postalCodeTextField.setText(model.getPostCode());
        postalAdressTextField.setText(model.getPostAdress());
        emailTextField.setText(model.getEmail());
        phoneTextField.setText(model.getPhoneNumber());
        mobilePhoneTextField.setText(model.getMobilePhoneNumber());
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
        cvcTextField = new javax.swing.JTextField();
        cvcLabel = new javax.swing.JLabel();
        monthTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        cardNumberLabel = new javax.swing.JLabel();
        cardComboBox = new javax.swing.JComboBox();
        cardLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
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
        postalCodeTextField1 = new javax.swing.JTextField();
        postalAdressTextField1 = new javax.swing.JTextField();
        sendToMailCheckBox = new javax.swing.JCheckBox();
        saveInformationCheckBox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        mobilePhoneLabel = new javax.swing.JLabel();
        mobilePhoneTextField = new javax.swing.JTextField();
        shoppingCartScrollPane = new javax.swing.JScrollPane();
        shoppingCartPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 600));

        containerPanel.setBackground(Constants.BACKGROUND_COLOR);
        containerPanel.setPreferredSize(new java.awt.Dimension(1000, 600));

        cardCustomerPanel2.setBackground(new java.awt.Color(255, 255, 255));
        cardCustomerPanel2.setPreferredSize(new java.awt.Dimension(1000, 600));
        cardCustomerPanel2.setRequestFocusEnabled(false);

        cardInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cardInformationLabel.setText("Kortuppgifter");

        deliveryInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deliveryInformationLabel.setText("Leveransuppgifter");

        jPanel3.setOpaque(false);

        cvcTextField.setText("123");
        cvcTextField.setEnabled(false);

        cvcLabel.setText("CVC");

        monthTextField.setText("02");
        monthTextField.setEnabled(false);

        yearTextField.setText("15");
        yearTextField.setEnabled(false);
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        dateLabel.setText("Datum");

        cardNumberTextField.setToolTipText("");
        cardNumberTextField.setEnabled(false);

        cardNumberLabel.setText("Kortnummer");

        cardComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "Mastercard" }));
        cardComboBox.setEnabled(false);
        cardComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardComboBoxActionPerformed(evt);
            }
        });

        cardLabel.setText("Kort");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardNumberTextField)
                    .addComponent(cardComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardLabel)
                            .addComponent(dateLabel)
                            .addComponent(cardNumberLabel)
                            .addComponent(cvcLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cvcTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(yearTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthTextField)))
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
                .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cvcLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cvcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setOpaque(false);

        nameLabel.setText("Namn");

        nameTextField.setText("Förnamn");
        nameTextField.setEnabled(false);

        nameTextField2.setText("Efternamn");
        nameTextField2.setEnabled(false);
        nameTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextField2ActionPerformed(evt);
            }
        });

        adressLabel.setText("Adress");

        adressTextField.setText("Tvärvägen 20");
        adressTextField.setEnabled(false);

        sendToOtherAdressCheckBox.setText("Leverera till annan adress");
        sendToOtherAdressCheckBox.setEnabled(false);
        sendToOtherAdressCheckBox.setOpaque(false);

        adressTextField2.setText("Tvärvägen 21");
        adressTextField2.setEnabled(false);

        postalCodeLabel.setText("Postnummer");

        postalCodeTextField.setText("Postnummer");
        postalCodeTextField.setEnabled(false);

        postalAdressTextField.setText("Postort");
        postalAdressTextField.setEnabled(false);

        postalAdressLabel.setText("Postort");

        postalCodeTextField1.setText("Postnummer");
        postalCodeTextField1.setEnabled(false);

        postalAdressTextField1.setText("Postort");
        postalAdressTextField1.setEnabled(false);

        sendToMailCheckBox.setText("Skicka kvitto till min mail");
        sendToMailCheckBox.setEnabled(false);
        sendToMailCheckBox.setOpaque(false);

        saveInformationCheckBox.setText("Spara mina uppgifter");
        saveInformationCheckBox.setEnabled(false);
        saveInformationCheckBox.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adressTextField)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postalAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveInformationCheckBox)
                            .addComponent(sendToMailCheckBox)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(nameLabel)
                                .addComponent(adressLabel)
                                .addComponent(adressTextField2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(postalCodeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(postalAdressLabel))
                            .addComponent(sendToOtherAdressCheckBox)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(postalCodeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postalAdressTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeLabel)
                    .addComponent(postalAdressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postalAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendToOtherAdressCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postalAdressTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendToMailCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveInformationCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        emailLabel.setText("Email");

        emailTextField.setText("example@mail.com");
        emailTextField.setEnabled(false);

        phoneLabel.setText("Telefon");

        phoneTextField.setText("070-00000");
        phoneTextField.setEnabled(false);
        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        mobilePhoneLabel.setText("Mobiltelefon");

        mobilePhoneTextField.setText("070-00001");
        mobilePhoneTextField.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneTextField)
                    .addComponent(mobilePhoneTextField)
                    .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(phoneLabel)
                            .addComponent(mobilePhoneLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
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

        javax.swing.GroupLayout cardCustomerPanel2Layout = new javax.swing.GroupLayout(cardCustomerPanel2);
        cardCustomerPanel2.setLayout(cardCustomerPanel2Layout);
        cardCustomerPanel2Layout.setHorizontalGroup(
            cardCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCustomerPanel2Layout.createSequentialGroup()
                .addGroup(cardCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(deliveryInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
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
            .addGroup(cardCustomerPanelLayout.createSequentialGroup()
                .addComponent(cardCustomerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cardCustomerPanelLayout.setVerticalGroup(
            cardCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardCustomerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        shoppingCartScrollPane.setBackground(Constants.BACKGROUND_COLOR);
        shoppingCartScrollPane.setPreferredSize(new java.awt.Dimension(500, 550));

        shoppingCartPanel.setBackground(Constants.BACKGROUND_COLOR);

        javax.swing.GroupLayout shoppingCartPanelLayout = new javax.swing.GroupLayout(shoppingCartPanel);
        shoppingCartPanel.setLayout(shoppingCartPanelLayout);
        shoppingCartPanelLayout.setHorizontalGroup(
            shoppingCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        shoppingCartPanelLayout.setVerticalGroup(
            shoppingCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        shoppingCartScrollPane.setViewportView(shoppingCartPanel);

        jPanel1.setBackground(Constants.BACKGROUND_COLOR);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 50));

        confirmButton.setBackground(Constants.HEADER_COLOR);
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Bekräfta");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(cardCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shoppingCartScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(shoppingCartScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardComboBoxActionPerformed

    private void nameTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextField2ActionPerformed

    }//GEN-LAST:event_nameTextField2ActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextFieldActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        model.placeOrder(true);
        if(frame != null){
            frame.setFeatureCard("endingPanelCard");
        }
    }//GEN-LAST:event_confirmButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JTextField adressTextField2;
    private javax.swing.JComboBox cardComboBox;
    private javax.swing.JPanel cardCustomerPanel;
    private javax.swing.JPanel cardCustomerPanel2;
    private javax.swing.JLabel cardInformationLabel;
    private javax.swing.JLabel cardLabel;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JTextField cvcTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel deliveryInformationLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel shoppingCartPanel;
    private javax.swing.JScrollPane shoppingCartScrollPane;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
