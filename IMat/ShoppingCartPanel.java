/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Joel
 */
public class ShoppingCartPanel extends javax.swing.JPanel {
    
    private final IMatModel model;
    private MainFrame frame;

    /**
     * Creates new form ShoppingCartPanel
     */
    public ShoppingCartPanel(IMatModel model) {
        this.model = model;
        initComponents();
        
        List<ShoppingItem> items = model.getItems();
        this.itemPanel.setLayout(new GridLayout(items.size(), 1));
        Iterator<ShoppingItem> it = items.iterator();
        while (it.hasNext()){
            this.itemPanel.add(new ShoppingCartComponentPanel(it.next()));
        }
        
        this.costLabel.setText(model.getTotalCost() + " kr");
    }
    
    public ShoppingCartPanel(IMatModel model, MainFrame frame) {
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

        itemScrollPanel = new javax.swing.JScrollPane();
        itemPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        totLabel = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(993, 600));

        javax.swing.GroupLayout itemPanelLayout = new javax.swing.GroupLayout(itemPanel);
        itemPanel.setLayout(itemPanelLayout);
        itemPanelLayout.setHorizontalGroup(
            itemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 967, Short.MAX_VALUE)
        );
        itemPanelLayout.setVerticalGroup(
            itemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        itemScrollPanel.setViewportView(itemPanel);

        nextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        totLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totLabel.setText("Totalt:");

        costLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        costLabel.setText("cost");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addComponent(totLabel)
                        .addGap(69, 69, 69)
                        .addComponent(costLabel)))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costLabel)
                    .addComponent(totLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemScrollPanel)
                .addContainerGap())
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (frame != null)
            frame.setFeatureCard("checkoutCard");
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel costLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel itemPanel;
    private javax.swing.JScrollPane itemScrollPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel totLabel;
    // End of variables declaration//GEN-END:variables
}
