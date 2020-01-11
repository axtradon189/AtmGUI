package bank;

import javax.swing.JOptionPane;

public class Ambil extends javax.swing.JFrame {
    MiniDatabase ambil = new MiniDatabase();

    public Ambil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGlogin1 = new Background.BGlogin();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNominal = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("ATM Blackpay");

        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Silahkan Masukkan Nominal");

        txtNominal.setBackground(new java.awt.Color(0, 0, 0));
        txtNominal.setForeground(new java.awt.Color(255, 255, 255));
        txtNominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNominalActionPerformed(evt);
            }
        });

        btnProses.setBackground(new java.awt.Color(0, 0, 0));
        btnProses.setForeground(new java.awt.Color(255, 255, 255));
        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bGlogin1Layout = new javax.swing.GroupLayout(bGlogin1);
        bGlogin1.setLayout(bGlogin1Layout);
        bGlogin1Layout.setHorizontalGroup(
            bGlogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bGlogin1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bGlogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bGlogin1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bGlogin1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(bGlogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bGlogin1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(141, 141, 141))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bGlogin1Layout.createSequentialGroup()
                                .addComponent(btnProses)
                                .addGap(29, 29, 29)
                                .addComponent(btnCancel)
                                .addGap(30, 30, 30))))))
        );
        bGlogin1Layout.setVerticalGroup(
            bGlogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bGlogin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(bGlogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(bGlogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProses)
                    .addComponent(btnCancel))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bGlogin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bGlogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNominalActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new BankATM().show();
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
      int masukan = Integer.parseInt(txtNominal.getText());
        if (ambil.saldo>=masukan){
        ambil.hasil = ambil.saldo - masukan;
        ambil.saldo=ambil.hasil;
        ambil.answer = String.format(" %,.2f ", ambil.hasil);
        JOptionPane.showMessageDialog(rootPane, "Ambil Uang Berhasil Sebesar"+masukan+ "\nSilahkan Cek Saldo Anda Kembali");
        new BankATM().show();
        this.dispose();
        }
        else if (ambil.saldo <= masukan) {
        JOptionPane.showMessageDialog(rootPane,"Maaf Saldo Anda Kurang !");
        int jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Lanjut?");
        switch (jawab)
        {
            case 0: JOptionPane.showMessageDialog(null, "Silahkan Masukan Nominal Kembali");
                return;
            case 1: JOptionPane.showMessageDialog(null, "Silahkan Isi Saldo Anda Terlebih Dahulu");
                new BankATM().show();
                this.dispose();
                break;
            case 2: JOptionPane.showMessageDialog(null, "Silahkan Pilih Menu Lain");
                new BankATM().show();
                this.dispose();
                break;
        }

        }
    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Ambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ambil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.BGlogin bGlogin1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnProses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNominal;
    // End of variables declaration//GEN-END:variables
}
