/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uh.atm;

/**
 *
 * @author dhenarraerine
 */
import javax.swing.JOptionPane; 
public class Main extends javax.swing.JFrame {
    

    /**
     * Creates new form Main
     */
    int tabungan = 50000;
    public Main() {
        initComponents();
        
    }
    public Main(int tabungan) {
        this.tabungan = tabungan;
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

        jLabel1 = new javax.swing.JLabel();
        jbCek = new javax.swing.JButton();
        jbKeluar = new javax.swing.JButton();
        jbSetor = new javax.swing.JButton();
        jbTarik = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("ATM BANK JATIM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 300, 60);

        jbCek.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jbCek.setText("Cek Saldo");
        jbCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCekActionPerformed(evt);
            }
        });
        getContentPane().add(jbCek);
        jbCek.setBounds(20, 60, 310, 60);

        jbKeluar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jbKeluar.setText("Keluar");
        jbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(jbKeluar);
        jbKeluar.setBounds(20, 300, 310, 60);

        jbSetor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jbSetor.setText("Penyetoran");
        jbSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSetorActionPerformed(evt);
            }
        });
        getContentPane().add(jbSetor);
        jbSetor.setBounds(20, 140, 310, 60);

        jbTarik.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jbTarik.setText("Penarikan");
        jbTarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTarikActionPerformed(evt);
            }
        });
        getContentPane().add(jbTarik);
        jbTarik.setBounds(20, 220, 310, 60);

        setBounds(0, 0, 367, 424);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCekActionPerformed
        // TODO add your handling code here:
        new Cek(tabungan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCekActionPerformed

    private void jbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKeluarActionPerformed
        // TODO add your handling code here:
         dispose();
         JOptionPane.showMessageDialog(null, "Terimakasih telah bertransaksi di ATM Bank Jatim", "Informasi", 1);
    }//GEN-LAST:event_jbKeluarActionPerformed

    private void jbSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSetorActionPerformed
        // TODO add your handling code here:
         new Setor(tabungan).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jbSetorActionPerformed

    private void jbTarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTarikActionPerformed
        // TODO add your handling code here:
         new Tarik(tabungan).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jbTarikActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        String str, str1;
        int choice, z, pin = 1234, counter = 0, a = 3;
        int t, s, tab = 50000;

        /* Create and display the form */
        
       JOptionPane.showMessageDialog(null, "Selamat Datang\n ANJUNGAN TUNAI MANDIRI \n BANK Jatim \n\nMasukkan 4 Digit PIN Anda !", "WELCOME", 1); 
       try {
            
                str = JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda:",
                        "ATM BNI SYARIAH-BOJONEGORO", 0);
                pin = Integer.parseInt(str);
                counter += 1;
                if (pin == 1234)//cek pin
                {
                        java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                        new Main().setVisible(true);
                        }
                        });
                }   
                else if (counter < 3) {   //jika pin salah
                    a--; //menghitung kesalahan login dan memberikan kesempatan login
                    JOptionPane.showMessageDialog(null, "Pin Salah !\nPastikan PIN yang anda masukkan benar", "ERROR", 0);
                    JOptionPane.showMessageDialog(null, "\nKesempatan login " +
                            a + " kali lagi" + "\n");
                } else {
                    JOptionPane.showMessageDialog(null, "Untuk bantuan nasabah,\nsilahkan menghubungi call center 555123 (Gratis)", "Kartu ATM anda diblokir!", 0);
                    System.exit(0);
                }
               
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan !\nPastikan kode yang anda masukkan berformat benar! \nPROGRAM KELUAR! \nTerimakasih", "ERROR", 0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCek;
    private javax.swing.JButton jbKeluar;
    private javax.swing.JButton jbSetor;
    private javax.swing.JButton jbTarik;
    // End of variables declaration//GEN-END:variables
}
