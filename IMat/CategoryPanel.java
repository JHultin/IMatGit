package IMat;

import java.awt.event.MouseListener;
import se.chalmers.ait.dat215.project.ProductCategory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class CategoryPanel extends javax.swing.JPanel {
    private String labelText;
    private MouseListener listener;
    private ProductCategory category = null;
    /**
     * Creates new form CategoryPanel
     */
    public CategoryPanel() {
        initComponents();
    }
    
    public CategoryPanel(String text, MouseListener listener){
        this.listener = listener;
        labelText = text;
        initComponents();
        this.addMouseListener(listener);

    }
    
    public CategoryPanel(String text, ProductCategory pc, MouseListener listener){
        this(text, listener);
        this.category = pc;
        this.listener = listener;
    }
    
    public String getName(){
        return labelText;
    }
    
    public ProductCategory getCategory(){
        return this.category;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(100, 20));
        setPreferredSize(new java.awt.Dimension(100, 20));

        textLabel.setText(labelText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textLabel)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("default");
        getAccessibleContext().setAccessibleDescription("default");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables
}
