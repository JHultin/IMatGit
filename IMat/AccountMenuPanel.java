/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Joel
 */
public class AccountMenuPanel extends javax.swing.JPanel {

    private JPopupMenu popup = new JPopupMenu();
    private final MainFrame frame;
    private final IMatModel model;

    /**
     * Creates new form AccountMenuPanel
     */
    public AccountMenuPanel(final MainFrame frame, final IMatModel model) {
        this.frame = frame;
        this.model = model;
        initComponents();
        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                switch (((JMenuItem) e.getSource()).getText()){
                    case "Historik":
                        AccountMenuPanel.this.frame.setFeatureCard("historyCard");
                        break;
                    case "Logga ut":
                        frame.logOut();
                        break;
                    case "Mina Favoriter":
                        AccountMenuPanel.this.frame.setFeatureCard("resultCard");
                        break;
                }
            }

        };
       
        JMenuItem m = new JMenuItem("Historik");
        m.addActionListener(al);
        popup.add(m);
        m = new JMenuItem("Mina Favoriter");
        m.addActionListener(al);
        popup.add(m);
        m = new JMenuItem("Logga ut");
        m.addActionListener(al);
        popup.add(m);
        PopupListener pl = new PopupListener();
        jButton1.addMouseListener(pl);
    }

    class PopupListener extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
        if(model.isLoggedIn()){
        popup.show(AccountMenuPanel.this, 0, 25);
        }else{
            frame.setFeatureCard("logInCard");
        }            
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

        mainPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(Constants.HEADER_COLOR);
        setLayout(new java.awt.BorderLayout());

        mainPanel.setOpaque(false);

        jButton1.setText("Mina Sidor");
        jButton1.setInheritsPopupMenu(true);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
