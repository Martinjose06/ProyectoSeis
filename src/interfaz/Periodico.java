/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author LUCYLEONOR
 */
public class Periodico extends javax.swing.JFrame {

    /**
     * Creates new form Periodico
     */
    public Periodico() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Periodico");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Periodico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 90, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setText("Núm. Palabras");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtNP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNPKeyTyped(evt);
            }
        });
        jPanel1.add(txtNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setText("Núm. Colores");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        txtNC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNCKeyTyped(evt);
            }
        });
        jPanel1.add(txtNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 80, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel4.setText("Centimetros");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });
        jPanel1.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel5.setText("Total a Pagar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        lblT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 120, 30));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 90, -1));

        cmdRestaurar.setText("Restaurar");
        cmdRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        if (txtNC.getText().trim().isEmpty() && txtNP.getText().trim().isEmpty() && txtC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Ha Ingresado Los Datos Anteriormente Pedidos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNP.requestFocusInWindow();
        } else if (txtNC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Ha Ingresado El Numero De Colores", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNC.requestFocusInWindow();
        } else if (txtNP.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Ha Ingresado El Numero De Palabras", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNP.requestFocusInWindow();
        } else if (txtC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Ha Ingresado Los Centimetros", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtC.requestFocusInWindow();
        } else {

            String res;
            double c, p, co, t;

            co = Double.parseDouble(txtNC.getText());
            p = Double.parseDouble(txtNP.getText());
            c = Double.parseDouble(txtC.getText());

            t = (co * 25000) + (p * 20000) + (c * 15000);

            res = String.valueOf(t);

            lblT.setText("$ " + res);

        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestaurarActionPerformed

        txtNC.setText("");
        txtC.setText("");
        txtNP.setText("");
        lblT.setText("");
        txtNP.requestFocusInWindow();
        
    }//GEN-LAST:event_cmdRestaurarActionPerformed

    private void txtCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtNC.getText().trim().isEmpty() && txtNP.getText().trim().isEmpty() && txtC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado Los Datos Anteriormente Pedidos", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNP.requestFocusInWindow();
            } else if (txtNC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado El Numero De Colores", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNC.requestFocusInWindow();
            } else if (txtNP.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado El Numero De Palabras", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNP.requestFocusInWindow();
            } else if (txtC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado Los Centimetros", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtC.requestFocusInWindow();
            } else {

                String res;
                double c, p, co, t;

                co = Double.parseDouble(txtNC.getText());
                p = Double.parseDouble(txtNP.getText());
                c = Double.parseDouble(txtC.getText());

                t = (co * 25000) + (p * 20000) + (c * 15000);

                res = String.valueOf(t);

                lblT.setText("$ " + res);

            }

        }


    }//GEN-LAST:event_txtCKeyPressed

    private void txtNPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNPKeyTyped

    private void txtNCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNCKeyTyped

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void txtNPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtNC.getText().trim().isEmpty() && txtNP.getText().trim().isEmpty() && txtC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado Los Datos Anteriormente Pedidos", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNP.requestFocusInWindow();
            } else if (txtNC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado El Numero De Colores", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNC.requestFocusInWindow();
            } else if (txtNP.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado El Numero De Palabras", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNP.requestFocusInWindow();
            } else if (txtC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado Los Centimetros", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtC.requestFocusInWindow();
            } else {

                String res;
                double c, p, co, t;

                co = Double.parseDouble(txtNC.getText());
                p = Double.parseDouble(txtNP.getText());
                c = Double.parseDouble(txtC.getText());

                t = (co * 25000) + (p * 20000) + (c * 15000);

                res = String.valueOf(t);

                lblT.setText("$ " + res);

            }

        }
    }//GEN-LAST:event_txtNPKeyPressed

    private void txtNCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtNC.getText().trim().isEmpty() && txtNP.getText().trim().isEmpty() && txtC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado Los Datos Anteriormente Pedidos", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNP.requestFocusInWindow();
            } else if (txtNC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado El Numero De Colores", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNC.requestFocusInWindow();
            } else if (txtNP.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado El Numero De Palabras", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtNP.requestFocusInWindow();
            } else if (txtC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ha Ingresado Los Centimetros", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtC.requestFocusInWindow();
            } else {

                String res;
                double c, p, co, t;

                co = Double.parseDouble(txtNC.getText());
                p = Double.parseDouble(txtNP.getText());
                c = Double.parseDouble(txtC.getText());

                t = (co * 25000) + (p * 20000) + (c * 15000);

                res = String.valueOf(t);

                lblT.setText("$ " + res);

            }

        }
    }//GEN-LAST:event_txtNCKeyPressed

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
            java.util.logging.Logger.getLogger(Periodico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Periodico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Periodico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Periodico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Periodico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdRestaurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblT;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtNC;
    private javax.swing.JTextField txtNP;
    // End of variables declaration//GEN-END:variables
}
