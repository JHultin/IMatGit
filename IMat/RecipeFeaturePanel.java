/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author axel
 */
public class RecipeFeaturePanel extends javax.swing.JPanel {
    private ArrayList<ShoppingItem> items;
    private final IMatModel model;
    private final MainFrame frame;

    /**
     * Creates new form RecepeFeaturePanel
     */
    public RecipeFeaturePanel(IMatModel model, MainFrame frame) {
        this.model = model;
        this.frame = frame;
        
        initComponents();
        
        try {
            FileReader fr = new FileReader(("IMatGit/iMat.resources/VeckansRecept.txt"));
            BufferedReader br = new BufferedReader(fr);
            ArrayList<Integer> volume = new ArrayList(10);
            ArrayList<Product> products = new ArrayList(10);
            
            String str;
            this.titelLabel.setText(br.readLine());
            while ((str = br.readLine()) != null){
                volume.add(Integer.parseInt(str));
                products.add(model.findProducts(br.readLine()).get(0));
            }
            
            this.items = new ArrayList<ShoppingItem>(products.size());
            StringBuilder sb = new StringBuilder();
            sb.append("<html>Ingredienser:\n");
            for (int i = 0; i < volume.size(); i++){
                items.add(new ShoppingItem(products.get(i), volume.get(i)));
                
                sb.append("<p>");
                sb.append(volume.get(i));
                sb.append(" ");
                sb.append(products.get(i).getUnitSuffix());
                sb.append(" ");
                sb.append(products.get(i).getName());
                sb.append("</p> \n");
            }
            this.ingredientsLabel.setText(sb.toString());
            
            
        } catch (IOException e){
            System.out.println("Veckans Recept ej funnet");
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

        jLabel1 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        containerPanel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        descriptionPanel = new javax.swing.JPanel();
        titelLabel = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        ingredientsPanel = new javax.swing.JPanel();
        ingredientsLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(475, 275));
        setPreferredSize(new java.awt.Dimension(475, 275));

        headerPanel.setBackground(Constants.HEADER_COLOR);
        headerPanel.setBorder(new javax.swing.border.MatteBorder(null));
        headerPanel.setMinimumSize(new java.awt.Dimension(473, 70));
        headerPanel.setPreferredSize(new java.awt.Dimension(473, 70));

        headerLabel.setFont(Constants.FRONT_HEADER_FONT);
        headerLabel.setForeground(Constants.BACKGROUND_COLOR);
        headerLabel.setText("Veckans Recept");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        containerPanel.setBackground(Constants.BACKGROUND_COLOR);

        imagePanel.setMaximumSize(new java.awt.Dimension(203, 203));
        imagePanel.setMinimumSize(new java.awt.Dimension(203, 203));
        imagePanel.setOpaque(false);
        imagePanel.setPreferredSize(new java.awt.Dimension(203, 203));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/VeckansRecept.jpg"))); // NOI18N

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        descriptionPanel.setOpaque(false);

        titelLabel.setText("Veckans Recept ej funnet");

        buyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMat.resources/Productcart.png"))); // NOI18N
        buyButton.setToolTipText("Lägg till i kundvagn");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        ingredientsPanel.setOpaque(false);

        javax.swing.GroupLayout ingredientsPanelLayout = new javax.swing.GroupLayout(ingredientsPanel);
        ingredientsPanel.setLayout(ingredientsPanelLayout);
        ingredientsPanelLayout.setHorizontalGroup(
            ingredientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredientsPanelLayout.createSequentialGroup()
                .addComponent(ingredientsLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ingredientsPanelLayout.setVerticalGroup(
            ingredientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredientsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingredientsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Gå till instruktioner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout descriptionPanelLayout = new javax.swing.GroupLayout(descriptionPanel);
        descriptionPanel.setLayout(descriptionPanelLayout);
        descriptionPanelLayout.setHorizontalGroup(
            descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingredientsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, descriptionPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buyButton))
                    .addGroup(descriptionPanelLayout.createSequentialGroup()
                        .addComponent(titelLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        descriptionPanelLayout.setVerticalGroup(
            descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingredientsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(descriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        for(ShoppingItem shi : items){
            model.addItem(shi);
        }
    }//GEN-LAST:event_buyButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frame.setFeatureCard("recipeCard");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel ingredientsLabel;
    private javax.swing.JPanel ingredientsPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titelLabel;
    // End of variables declaration//GEN-END:variables
}
