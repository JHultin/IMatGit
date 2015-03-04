package IMat;

import java.awt.*;
import java.awt.event.*;
import se.chalmers.ait.dat215.project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joel
 */
public class MainFrame extends javax.swing.JFrame {

    private IMatModel model;
    private CardLayout card;
    private CartIconPanel iconPanel;
    private MouseListener categoryListener;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    public MainFrame(IMatModel model) {
        this();
        this.model = model;
        iconPanel = new CartIconPanel(model, this);
        this.cartIconPanelHolder.add(iconPanel);
        model.addCartListener(iconPanel);
        this.categoryListener = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                MainFrame.this.categoryClicked(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        };

        this.createCategories();

        this.card = (CardLayout) this.featurePanel.getLayout();
        
        this.checkoutPanelHolder.add(new CheckoutPanel(model, this));
        this.endingPanelHolder.add(new EndingPanel(model, this));
        
        this.frontPagePanel.add(new FrontPageFeaturePanel(ProductCategory.FRUIT, model, "Ofta Köpta"));
        this.frontPagePanel.add(new FrontPageFeaturePanel(ProductCategory.FLOUR_SUGAR_SALT, model, "Veckans varor"));
        this.frontPagePanel.add(new ShoppingListFeaturePanel(model));
        this.frontPagePanel.add(new RecipeFeaturePanel());
        
        card.show(this.featurePanel, "frontPageCard");
        
        this.accountMenuHolderPanel.add(new AccountMenuPanel(this, model));
        
        repaint();
        revalidate();
    }

    private void createCategories() {
        this.favoritePanel.add(new CategoryPanel("Mina Favoriter", categoryListener));
        this.favoritePanel.add(new CategoryPanel("Ofta Köpta", categoryListener));
        this.featureHeaderPanel.add(new CategoryPanel("Populära Varor", categoryListener));
        this.featureHeaderPanel.add(new CategoryPanel("Inköpslista", categoryListener));
        this.featureHeaderPanel.add(new CategoryPanel("Veckans Varor", categoryListener));
        this.featureHeaderPanel.add(new CategoryPanel("Veckans Recept", categoryListener));
        model.makeCategoryPanel(this.categoryPanel, "Start", categoryListener);

    }

    public IMatModel getModel() {
        return model;
    }

    public void setFeatureCard(String cardName) {
        card.show(this.featurePanel, cardName);
        if ("historyCard".equals(cardName)){
            this.historyPanelHolder.removeAll();
            this.historyPanelHolder.add(new HistoryPanel(model));
        } else if("shoppingCartCard".equals(cardName)){
            this.shoppingCartPanelHolder.removeAll();
            this.shoppingCartPanelHolder.add(new ShoppingCartPanel(model, iconPanel, this));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        accountPanel = new javax.swing.JPanel();
        myPagePanel = new javax.swing.JPanel();
        accountMenuHolderPanel = new javax.swing.JPanel();
        cartIconPanelHolder = new javax.swing.JPanel();
        browseScrollPanel = new javax.swing.JScrollPane();
        browsePanel = new javax.swing.JPanel();
        startTextPanel = new javax.swing.JPanel();
        startLabel = new javax.swing.JLabel();
        favoritePanel = new javax.swing.JPanel();
        featureHeaderPanel = new javax.swing.JPanel();
        categoryPanel = new javax.swing.JPanel();
        featurePanel = new javax.swing.JPanel();
        historyPanelHolder = new javax.swing.JPanel();
        shoppingCartPanelHolder = new javax.swing.JPanel();
        frontPagePanel = new javax.swing.JPanel();
        resultPanelHolder = new javax.swing.JPanel();
        checkoutPanelHolder = new javax.swing.JPanel();
        confirmPanelHolder = new javax.swing.JPanel();
        endingPanelHolder = new javax.swing.JPanel();
        logInPanelHolder = new javax.swing.JPanel();
        menuBarPanel = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        headerPanel.setBackground(Constants.HEADER_COLOR);
        headerPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        headerPanel.setMinimumSize(new java.awt.Dimension(932, 99));
        headerPanel.setPreferredSize(new java.awt.Dimension(1060, 99));

        logoLabel.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setText("iMat");
        logoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                startTextPanelMousePressed(evt);
            }
        });

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchPanel.setPreferredSize(new java.awt.Dimension(162, 30));

        searchTextField.setText("Sök...");
        searchTextField.setBorder(null);
        searchTextField.setPreferredSize(new java.awt.Dimension(124, 29));
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });

        searchIcon.setBackground(new java.awt.Color(255, 255, 255));
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/magnifier.png"))); // NOI18N
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchIcon.setMaximumSize(new java.awt.Dimension(30, 30));
        searchIcon.setMinimumSize(new java.awt.Dimension(30, 30));
        searchIcon.setPreferredSize(new java.awt.Dimension(30, 30));
        searchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(searchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        accountPanel.setOpaque(false);
        accountPanel.setLayout(new java.awt.GridLayout());

        myPagePanel.setOpaque(false);

        accountMenuHolderPanel.setOpaque(false);
        accountMenuHolderPanel.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout myPagePanelLayout = new javax.swing.GroupLayout(myPagePanel);
        myPagePanel.setLayout(myPagePanelLayout);
        myPagePanelLayout.setHorizontalGroup(
            myPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPagePanelLayout.createSequentialGroup()
                .addComponent(accountMenuHolderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );
        myPagePanelLayout.setVerticalGroup(
            myPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPagePanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(accountMenuHolderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        accountPanel.add(myPagePanel);

        cartIconPanelHolder.setMinimumSize(new java.awt.Dimension(300, 89));
        cartIconPanelHolder.setOpaque(false);
        cartIconPanelHolder.setPreferredSize(new java.awt.Dimension(300, 89));
        cartIconPanelHolder.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartIconPanelHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(cartIconPanelHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        browseScrollPanel.setOpaque(false);

        browsePanel.setBackground(Constants.BACKGROUND_COLOR);
        browsePanel.setPreferredSize(new java.awt.Dimension(190, 600));
        browsePanel.setRequestFocusEnabled(false);

        startTextPanel.setBackground(Constants.HEADER_COLOR);
        startTextPanel.setBorder(new javax.swing.border.MatteBorder(null));
        startTextPanel.setPreferredSize(new java.awt.Dimension(125, 70));
        startTextPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                startTextPanelMousePressed(evt);
            }
        });

        startLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        startLabel.setForeground(Constants.BACKGROUND_COLOR);
        startLabel.setText("Start");
        startLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout startTextPanelLayout = new javax.swing.GroupLayout(startTextPanel);
        startTextPanel.setLayout(startTextPanelLayout);
        startTextPanelLayout.setHorizontalGroup(
            startTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        startTextPanelLayout.setVerticalGroup(
            startTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        favoritePanel.setOpaque(false);
        favoritePanel.setPreferredSize(new java.awt.Dimension(150, 0));
        favoritePanel.setRequestFocusEnabled(false);
        favoritePanel.setVerifyInputWhenFocusTarget(false);
        favoritePanel.setLayout(new java.awt.GridLayout(2, 0));

        featureHeaderPanel.setOpaque(false);
        featureHeaderPanel.setPreferredSize(new java.awt.Dimension(150, 0));
        featureHeaderPanel.setRequestFocusEnabled(false);
        featureHeaderPanel.setLayout(new java.awt.GridLayout(4, 0));

        categoryPanel.setOpaque(false);
        categoryPanel.setPreferredSize(new java.awt.Dimension(160, 0));
        categoryPanel.setLayout(new java.awt.GridLayout(11, 0));

        javax.swing.GroupLayout browsePanelLayout = new javax.swing.GroupLayout(browsePanel);
        browsePanel.setLayout(browsePanelLayout);
        browsePanelLayout.setHorizontalGroup(
            browsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startTextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addGroup(browsePanelLayout.createSequentialGroup()
                .addGroup(browsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(categoryPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(favoritePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(featureHeaderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        browsePanelLayout.setVerticalGroup(
            browsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(browsePanelLayout.createSequentialGroup()
                .addComponent(startTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(favoritePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addGap(18, 30, Short.MAX_VALUE)
                .addComponent(featureHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(categoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addGap(0, 495, Short.MAX_VALUE))
        );

        browseScrollPanel.setViewportView(browsePanel);

        featurePanel.setBackground(Constants.BACKGROUND_COLOR);
        featurePanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        featurePanel.setPreferredSize(new java.awt.Dimension(993, 600));
        featurePanel.setLayout(new java.awt.CardLayout());

        historyPanelHolder.setOpaque(false);
        historyPanelHolder.setLayout(new java.awt.GridLayout(1, 0));
        featurePanel.add(historyPanelHolder, "historyCard");

        shoppingCartPanelHolder.setOpaque(false);
        shoppingCartPanelHolder.setLayout(new java.awt.GridLayout(1, 0));
        featurePanel.add(shoppingCartPanelHolder, "shoppingCartCard");

        frontPagePanel.setOpaque(false);
        frontPagePanel.setLayout(new java.awt.GridLayout(2, 2, 5, 5));
        featurePanel.add(frontPagePanel, "frontPageCard");

        resultPanelHolder.setOpaque(false);
        resultPanelHolder.setLayout(new java.awt.GridLayout(1, 0));
        featurePanel.add(resultPanelHolder, "resultCard");

        checkoutPanelHolder.setOpaque(false);
        checkoutPanelHolder.setLayout(new java.awt.GridLayout(1, 0));
        featurePanel.add(checkoutPanelHolder, "checkoutCard");

        confirmPanelHolder.setLayout(new java.awt.GridLayout(1, 0));
        featurePanel.add(confirmPanelHolder, "confirmPanelCard");

        endingPanelHolder.setLayout(new java.awt.GridLayout(1, 0));
        featurePanel.add(endingPanelHolder, "endingPanelCard");

        logInPanelHolder.setLayout(new java.awt.GridLayout());
        featurePanel.add(logInPanelHolder, "logInCard");

        jMenu1.setText("File");
        menuBarPanel.add(jMenu1);

        jMenu2.setText("Edit");
        menuBarPanel.add(jMenu2);

        setJMenuBar(menuBarPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(browseScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(featurePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(featurePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addComponent(browseScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTextPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startTextPanelMousePressed
        card.show(this.featurePanel, "frontPageCard");
    }//GEN-LAST:event_startTextPanelMousePressed

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        if (searchTextField.getText().equals("Sök...")) {
            searchTextField.setText("");
        } else {
            searchTextField.selectAll();
        }
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if (searchTextField.getText().equals("")) {
            searchTextField.setText("Sök...");
        }
    }//GEN-LAST:event_searchTextFieldFocusLost

    private void searchIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseClicked
        this.doSearch();
    }//GEN-LAST:event_searchIconMouseClicked

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            this.doSearch();
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private void logIn(){
        /*if(this.model.logIn(this.userNameTextField.getText(),
                this.passwordField.getPassword()))
            logInCard.show(this.accountPanel, "inCard");
        */
    }
    
    public void logOut(){
        model.logOut();
    }
    
    private void doSearch(){
        this.resultPanelHolder.removeAll();
        if (model.getCategory(this.searchTextField.getText()) != null)
            this.resultPanelHolder.add(new ResultPanel(model.getCategory(this.searchTextField.getText()), model));
        else
            this.resultPanelHolder.add(new ResultPanel(model.getProductPanels(this.searchTextField.getText()), model));
        card.show(this.featurePanel, "resultCard");
        repaint();
        revalidate();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountMenuHolderPanel;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JPanel browsePanel;
    private javax.swing.JScrollPane browseScrollPanel;
    private javax.swing.JPanel cartIconPanelHolder;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JPanel checkoutPanelHolder;
    private javax.swing.JPanel confirmPanelHolder;
    private javax.swing.JPanel endingPanelHolder;
    private javax.swing.JPanel favoritePanel;
    private javax.swing.JPanel featureHeaderPanel;
    private javax.swing.JPanel featurePanel;
    private javax.swing.JPanel frontPagePanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel historyPanelHolder;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel logInPanelHolder;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JMenuBar menuBarPanel;
    private javax.swing.JPanel myPagePanel;
    private javax.swing.JPanel resultPanelHolder;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JPanel shoppingCartPanelHolder;
    private javax.swing.JLabel startLabel;
    private javax.swing.JPanel startTextPanel;
    // End of variables declaration//GEN-END:variables

    private void categoryClicked(MouseEvent e) {
        CategoryHolder panel = (CategoryHolder) e.getSource();
        if (!panel.isSub()) {
            model.makeCategoryPanel(this.categoryPanel, panel.getName(), categoryListener);
        }
        if (panel.getCategory() == null) {
            if (panel instanceof CategoryPanel) {
                if (panel.getName().equals("Mina Favoriter")) {
                    this.resultPanelHolder.removeAll();
                    this.resultPanelHolder.add(new ResultPanel(model.getFavoritePanels(), model));
                    card.show(this.featurePanel, "resultCard");
                } else if (panel.getName().equals("Ofta Köpta")) {
                    this.historyPanelHolder.removeAll();
                    this.historyPanelHolder.add(new HistoryPanel(model));
                    card.show(this.featurePanel, "historyCard");
                } else {
                    this.resultPanelHolder.removeAll();
                    this.resultPanelHolder.add(new ResultPanel(model.getCategoryPreviewPanels(panel.getName(), model, categoryListener), model));
                    card.show(this.featurePanel, "resultCard");
                }
            } else if (panel instanceof CategoryPreviewPanel){
                this.resultPanelHolder.removeAll();
                this.resultPanelHolder.add(new ResultPanel(model.getProductPanels(panel.getName()), model));
            }
            repaint();
            revalidate();
        } else {
            this.resultPanelHolder.removeAll();
            this.resultPanelHolder.add(new ResultPanel(panel.getCategory(), model));
            card.show(this.featurePanel, "resultCard");
            repaint();
            revalidate();
        }
    }
}
