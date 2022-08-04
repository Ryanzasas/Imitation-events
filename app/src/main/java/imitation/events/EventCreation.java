/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package imitation.events;

import com.google.cloud.firestore.Firestore;


/**
 *
 * @author ryanzasas
 */
public class EventCreation extends javax.swing.JFrame {

    private static DatabaseOperations dbOperations;
    private static String userId;
    private static User user;
    /**
     * Creates new form EventCreation
     */
    public EventCreation(String uid) {

        initComponents();
        userId = uid;
        dbOperations = new DatabaseOperations();
        user = dbOperations.getUserData(uid);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEventName = new javax.swing.JLabel();
        txfEventName = new javax.swing.JTextField();
        lblEventLocation = new javax.swing.JLabel();
        txfEventLocation = new javax.swing.JTextField();
        lblEventPrice = new javax.swing.JLabel();
        txfEventPrice = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblEmptyFieldsError = new javax.swing.JLabel();
        btnBackToMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEventName.setText("Event Name");

        txfEventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEventNameActionPerformed(evt);
            }
        });

        lblEventLocation.setText("Event Location");

        txfEventLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEventLocationActionPerformed(evt);
            }
        });

        lblEventPrice.setText("Event Price");

        txfEventPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEventPriceActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit Event");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        lblEmptyFieldsError.setForeground(new java.awt.Color(255, 51, 51));
        lblEmptyFieldsError.setText("Please fill in all fields ");

        btnBackToMain.setText("Back");
        btnBackToMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackToMainMouseClicked(evt);
            }
        });
        btnBackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEventName)
                        .addGap(84, 84, 84)
                        .addComponent(txfEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEventLocation)
                        .addGap(69, 69, 69)
                        .addComponent(txfEventLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEventPrice)
                        .addGap(89, 89, 89)
                        .addComponent(txfEventPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSubmit)
                    .addComponent(lblEmptyFieldsError))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackToMain)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackToMain)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventName)
                    .addComponent(txfEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventLocation)
                    .addComponent(txfEventLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventPrice)
                    .addComponent(txfEventPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(lblEmptyFieldsError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblEventName, txfEventName});

        lblEmptyFieldsError.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfEventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEventNameActionPerformed

    private void txfEventLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEventLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEventLocationActionPerformed

    private void txfEventPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEventPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEventPriceActionPerformed

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // Handle submission of an event
        
        String eventName = txfEventName.getText();
        String eventLocation = txfEventLocation.getText();
        String eventPrice = txfEventPrice.getText();
        
        
        if(eventName.isEmpty() || eventLocation.isEmpty() || eventPrice.isEmpty()){
            lblEmptyFieldsError.setVisible(true);
        } else {
            dbOperations.addEvent(eventName,eventLocation, Double.parseDouble(eventPrice), user);
            txfEventName.setText("");
            txfEventLocation.setText("");
            txfEventPrice.setText("");
        }
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnBackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMainActionPerformed
        // route the user back to main screen
        setVisible(false);
        new Mainscreen(userId).setVisible(true);
    }//GEN-LAST:event_btnBackToMainActionPerformed

    private void btnBackToMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackToMainMouseClicked
    }//GEN-LAST:event_btnBackToMainMouseClicked

    
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
            java.util.logging.Logger.getLogger(EventCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventCreation(userId).setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToMain;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblEmptyFieldsError;
    private javax.swing.JLabel lblEventLocation;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblEventPrice;
    private javax.swing.JTextField txfEventLocation;
    private javax.swing.JTextField txfEventName;
    private javax.swing.JTextField txfEventPrice;
    // End of variables declaration//GEN-END:variables
}