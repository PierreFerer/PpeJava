/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.logiciel;

import com.karimandco.logiciel.Parametres;
import com.karimandco.mdp.JPanelConnexionNum;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author pierr
 */
public class Logiciel extends javax.swing.JFrame {

    /**
     * Creates new form Logiciel
     */
    public Logiciel() {
        initComponents();
        //creationDuCV1.setIdUtilisateur(com.karimandco.auth.Utilisateur.getInstance().id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelConnexionNum1 = new com.karimandco.mdp.JPanelConnexionNum();
        panneauFormInscription1 = new com.karimandco.auth.PanneauFormInscription();
        creationDuCV1 = new com.karimandco.cv.CreationDuCV();
        voirPdf1 = new com.karimandco.pdf.VoirPdf();
        choisirImage1 = new com.karimandco.image.ChoisirImage();
        panneauAdministration1 = new com.karimandco.admin.PanneauAdministration();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelConnexionNum1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelConnexionNum1MouseMoved(evt);
            }
        });
        jTabbedPane1.addTab("Connexion", jPanelConnexionNum1);
        jTabbedPane1.addTab("Inscription", panneauFormInscription1);
        jTabbedPane1.addTab("Création CV", creationDuCV1);
        jTabbedPane1.addTab("Voir CV", voirPdf1);
        jTabbedPane1.addTab("Image", choisirImage1);
        jTabbedPane1.addTab("Admin", panneauAdministration1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelConnexionNum1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConnexionNum1MouseMoved
        // TODO add your handling code here:
        Integer id = com.karimandco.auth.Utilisateur.getInstance().id;
        Integer stat = com.karimandco.auth.Utilisateur.getInstance().statut;
        System.out.println(id);
        if (id == null) {
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(4, false);
            jTabbedPane1.setEnabledAt(5, false);

        } else if (stat == 1) {
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(3, true);
            jTabbedPane1.setEnabledAt(4, true);
            jTabbedPane1.setEnabledAt(5, true);
            creationDuCV1.setIdUtilisateur(com.karimandco.auth.Utilisateur.getInstance().id);
            choisirImage1.setIdUtilisateur(com.karimandco.auth.Utilisateur.getInstance().id);
        } else {
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(3, true);
            jTabbedPane1.setEnabledAt(4, true);
            jTabbedPane1.setEnabledAt(5, false);
            
            creationDuCV1.setIdUtilisateur(com.karimandco.auth.Utilisateur.getInstance().id);
            choisirImage1.setIdUtilisateur(com.karimandco.auth.Utilisateur.getInstance().id);

        }

    }//GEN-LAST:event_jPanelConnexionNum1MouseMoved

//    public void refresh() {
//        jPanelConnexionNum1.getjButtonConfirmerConnexion().addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//            }
//        });
//    }
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
            java.util.logging.Logger.getLogger(Logiciel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logiciel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logiciel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logiciel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logiciel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.image.ChoisirImage choisirImage1;
    private com.karimandco.cv.CreationDuCV creationDuCV1;
    private com.karimandco.mdp.JPanelConnexionNum jPanelConnexionNum1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.karimandco.admin.PanneauAdministration panneauAdministration1;
    private com.karimandco.auth.PanneauFormInscription panneauFormInscription1;
    private com.karimandco.pdf.VoirPdf voirPdf1;
    // End of variables declaration//GEN-END:variables
}
