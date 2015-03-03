/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author axel
 */
public class SmallShoppingCartComponentPanel extends javax.swing.JPanel {

    ShoppingItem shoppingItem;
    /**
     * Creates new form shoppingCartComponentPanel
     */
    public SmallShoppingCartComponentPanel(ShoppingItem shoppingItem) {
        this.shoppingItem = shoppingItem;
        
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

        jPanel1 = new javax.swing.JPanel();
        accualProductLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        priceLabel = new javax.swing.JLabel();
        accualPriceLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        accualTotalPriceLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(475, 60));
        setMinimumSize(new java.awt.Dimension(475, 60));
        setPreferredSize(new java.awt.Dimension(475, 60));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new java.awt.GridLayout(1, 4));

        jPanel1.setMinimumSize(new java.awt.Dimension(150, 55));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 55));

        accualProductLabel.setBackground(new java.awt.Color(0, 0, 0));
        accualProductLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accualProductLabel.setText(this.shoppingItem.getProduct().getName());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accualProductLabel)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(accualProductLabel)
                .addContainerGap())
        );

        add(jPanel1);

        jPanel2.setOpaque(false);

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLabel.setText("Pris");

        accualPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accualPriceLabel.setText(this.shoppingItem.getProduct().getPrice()+" "+this.shoppingItem.getProduct().getUnit());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accualPriceLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(accualPriceLabel))
                .addContainerGap())
        );

        add(jPanel2);

        jPanel4.setOpaque(false);

        accualTotalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accualTotalPriceLabel.setText(""+this.shoppingItem.getTotal() + " kr");

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalPriceLabel.setText("Totalpris");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(totalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accualTotalPriceLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPriceLabel)
                    .addComponent(accualTotalPriceLabel))
                .addContainerGap())
        );

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        this.requestFocus();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accualPriceLabel;
    private javax.swing.JLabel accualProductLabel;
    private javax.swing.JLabel accualTotalPriceLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
