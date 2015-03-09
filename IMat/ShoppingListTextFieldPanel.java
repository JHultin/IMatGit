/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Joel
 */
public class ShoppingListTextFieldPanel extends javax.swing.JPanel {
    private final IMatModel model;
    private ShoppingItem item;
    private JPopupMenu popup = new JPopupMenu();

    /**
     * Creates new form ShoppingListTextFieldPanel
     */
    public ShoppingListTextFieldPanel(IMatModel model) {
        this.model = model;
        initComponents();
    }
    
    public ShoppingListTextFieldPanel(IMatModel model, ShoppingItem item) {
        this.model = model;
        this.item = item;
        initComponents();
        this.textField.setText(item.getProduct().getName());
        this.numberTextField.setText("" + item.getAmount());
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
        textField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        numberTextField = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(473, 22));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(473, 22));

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(196, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textField.setText("Skriv produkt här för att lägga till i kundvagnen");
        textField.setOpaque(false);
        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
        });
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldKeyPressed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setText("X");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        numberTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberTextField.setText("#");
        numberTextField.setOpaque(false);
        numberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numberTextFieldFocusGained(evt);
            }
        });
        numberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numberTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            //this.addProduct();
            createPopup();
        }
    }//GEN-LAST:event_textFieldKeyPressed

    private void textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusGained
        textField.selectAll();
    }//GEN-LAST:event_textFieldFocusGained

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (item != null)
            this.model.removeItemFromCart(item);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void numberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
                model.setItemAmount(item, Double.parseDouble(numberTextField.getText()));
            } catch (Exception e){
                
            }
            textField.requestFocus();
        }
    }//GEN-LAST:event_numberTextFieldKeyPressed

    private void numberTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberTextFieldFocusGained
        numberTextField.selectAll();
    }//GEN-LAST:event_numberTextFieldFocusGained
    
    public void giveFocus(){
        numberTextField.requestFocus();
    }
    
    public void unnableToFind(){
        textField.selectAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables

    private void addProduct(Product p) {
        double number;
        try{
            number = Double.parseDouble(this.numberTextField.getText());
        } catch (Exception e) {
            number = 1.0;
        }
            this.model.addProduct(p, number);
    }
    
    private void createPopup(){
        List<Product> products = model.findProducts(this.textField.getText());
        if (products.size() == 1){
            this.addProduct(products.get(0));
        } else if (products.size() > 1){
        popup.removeAll();
        
        Iterator<Product> it = products.iterator();
        ProductMenuItem m;
        Product tempItem;
        while (it.hasNext()){
            tempItem = it.next();
            m = new ProductMenuItem(tempItem);
            popup.add(m);

        }
        popup.show(this, this.getWidth(), 0);
        } else if (products.size() == 0){
            this.unnableToFind();
        }
    
    }
    
    private class ProductMenuItem extends JMenuItem implements ActionListener{
        private final Product product;
        
        public ProductMenuItem(Product product){
            super(product.getName());
            this.product = product;
            super.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ShoppingListTextFieldPanel.this.addProduct(product);
            System.out.println(product.getName());
        }
    }
}
