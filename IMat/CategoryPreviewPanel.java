/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author Joel
 */
public class CategoryPreviewPanel extends javax.swing.JPanel implements CategoryHolder{

    private final String name;
    private final IMatModel model;
    private ProductCategory pc;
    private ImageIcon image;
    private final MouseListener listener;
    private final boolean isSub;
    /**
     * Creates new form CategoryPreviewPanel
     */
    public CategoryPreviewPanel(String name, IMatModel m, MouseListener listener) {
        this.listener = listener;
        this.name = name;
        this.model = m;            
        initComponents();
        this.addMouseListener(listener);
        this.isSub = true;
    }
    
    public CategoryPreviewPanel(String name, ProductCategory pc, IMatModel m,
            MouseListener listener){
        this.listener = listener;
        this.name = name;
        this.model = m;
        this.pc = pc;
        image = model.getImageIcon(model.getProducts(pc).get(0), 138, 111);
        initComponents();
        this.addMouseListener(listener);
        this.isSub = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();

        setBackground(Constants.BACKGROUND_COLOR);
        setMaximumSize(new java.awt.Dimension(180, 240));
        setMinimumSize(new java.awt.Dimension(180, 240));
        setPreferredSize(new java.awt.Dimension(180, 240));

        nameLabel.setFont(Constants.RESULT_FONT);
        nameLabel.setText(pc == null ? "Alla " + name : name);

        iconLabel.setIcon(image);
        iconLabel.setMaximumSize(new java.awt.Dimension(138, 111));
        iconLabel.setMinimumSize(new java.awt.Dimension(138, 111));
        iconLabel.setPreferredSize(new java.awt.Dimension(138, 111));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(nameLabel)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public ProductCategory getCategory() {
        return pc;
    }

    @Override
    public boolean isSub() {
        return isSub;
    }
}
