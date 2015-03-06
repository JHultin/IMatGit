/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

/**
 *
 * @author Marcus
 */
public class EndingPanel extends javax.swing.JPanel {
    private IMatModel model;
    private MainFrame frame;
    
    
    /**
     * Creates new form EndingPanel
     */
    public EndingPanel(IMatModel model) {
        this.model = model;
        initComponents();
        this.setBackground(Constants.BACKGROUND_COLOR);
    }
    
    public EndingPanel(IMatModel model, MainFrame frame, String type) {
        this(model);
        this.frame = frame;
        if (type.equals("buy")){
            endingTextLabel.setText("Tack för ditt köp!");
        }else if (type.equals("register")){
            endingTextLabel.setText("Tack för din registrering!");
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

        endingTextLabel = new javax.swing.JLabel();
        endingButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setRequestFocusEnabled(false);

        endingTextLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        endingTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endingTextLabel.setText("Tack för ditt köp!");
        endingTextLabel.setMaximumSize(new java.awt.Dimension(600, 100));
        endingTextLabel.setMinimumSize(new java.awt.Dimension(600, 100));
        endingTextLabel.setPreferredSize(new java.awt.Dimension(600, 100));
        endingTextLabel.setRequestFocusEnabled(false);

        endingButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        endingButton.setText("Tillbaka till Start!");
        endingButton.setBackground(Constants.HEADER_COLOR);
        endingButton.setForeground(Constants.BACKGROUND_COLOR);
        endingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        endingButton.setMaximumSize(new java.awt.Dimension(100, 75));
        endingButton.setMinimumSize(new java.awt.Dimension(100, 75));
        endingButton.setPreferredSize(new java.awt.Dimension(150, 75));
        endingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(endingTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(endingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(endingTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(endingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void endingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endingButtonActionPerformed
        if (frame != null){
            frame.setFeatureCard("frontPageCard");
        }
    }//GEN-LAST:event_endingButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endingButton;
    private javax.swing.JLabel endingTextLabel;
    // End of variables declaration//GEN-END:variables
}
