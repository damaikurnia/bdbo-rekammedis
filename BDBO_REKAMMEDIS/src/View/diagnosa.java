/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Anamnesa.java
 *
 * Created on Oct 7, 2012, 3:41:24 PM
 */
package View;

import Controller.ControlData;
import Data.Dokter;
import Data.Pasien;
import Data.RekamMedisData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author a9uszT
 */
public class diagnosa extends javax.swing.JFrame {

    /**
     * Creates new form Anamnesa
     */
    public diagnosa() {
        initComponents();
        idDokter_TF.setEditable(false);
        idDokter_TF.setEnabled(false);
        enableEdit();
        anamnesa_TF.setEditable(false);
        anamnesa_TF.setEnabled(false);
        simpan_button.setEnabled(false);
        idpasienTF.setEditable(false);
        idpasienTF.setEnabled(false);
        GregorianCalendar gc = new GregorianCalendar();
        tanggal_periksa.setDate(gc.getTime());
        String kodePasien = RekamMedis.noRM_TF.getText();
        idpasienTF.setText(kodePasien);
        idRM.setText(RekamMedis.otomatis_rm.getText());
//        try {
//            String nama = Frame_dokter.Nama_label.getText();
//            String kode = ControlData.getKoneksi().cariKodeDokter(nama);
//            idDokter_TF.setText(kode);
//            String nm = ControlData.getKoneksi().cariNamaPasien(kodePasien);
//            namaPasienTF.setText(nm);
//            String anamnesa = ControlData.getKoneksi().cariAnamnesa(RekamMedis.otomatis_rm.getText());
//            anamnesa_TF.setText(anamnesa);
//        } catch (Exception ex) {
//            Logger.getLogger(Anamnesa.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        idpasienTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        namaPasienTF = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        anamnesa_TF = new javax.swing.JTextArea();
        tanggal_periksa = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idDokter_TF = new javax.swing.JTextField();
        idRM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosa_textarea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        simpan_button = new javax.swing.JButton();
        batal_button = new javax.swing.JButton();
        edit_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(595, 475));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel6.setText("idPasein");

        idpasienTF.setToolTipText("");
        idpasienTF.setEnabled(false);
        idpasienTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpasienTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel7.setText("namaPasien");

        namaPasienTF.setEnabled(false);

        anamnesa_TF.setColumns(20);
        anamnesa_TF.setRows(5);
        anamnesa_TF.setEnabled(false);
        jScrollPane3.setViewportView(anamnesa_TF);

        tanggal_periksa.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel8.setText("Tanggal");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setText("idDokter");

        idDokter_TF.setEnabled(false);
        idDokter_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDokter_TFActionPerformed(evt);
            }
        });

        idRM.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Anamnesa Pasien");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(idpasienTF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idRM, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idDokter_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaPasienTF, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(tanggal_periksa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idpasienTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(namaPasienTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(tanggal_periksa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(idDokter_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 750, 170));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnosa"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("isikan Diagnosa pasien");

        diagnosa_textarea.setColumns(20);
        diagnosa_textarea.setRows(5);
        diagnosa_textarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                diagnosa_textareaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(diagnosa_textarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 750, 220));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        simpan_button.setFont(new java.awt.Font("Tahoma", 1, 12));
        simpan_button.setText("Simpan");
        simpan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(simpan_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 107, 34));

        batal_button.setFont(new java.awt.Font("Tahoma", 1, 12));
        batal_button.setText("Batal");
        batal_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(batal_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 107, 34));

        edit_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_button.setText("Edit");
        jPanel4.add(edit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 34));

        exit_button.setFont(new java.awt.Font("Tahoma", 1, 12));
        exit_button.setText("Keluar");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 110, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 554, 750, 60));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistem Informasi Rekam Medis");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 490, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Poliklinik Sanata Dharma");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 28));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Jl. paingan, Maguwoharjo");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/usd.gif"))); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 140));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Vista_Blue_Withoutlogo_1600x1200.jpg"))); // NOI18N
        jLabel17.setText("jLabel10");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 170));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void batal_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_buttonActionPerformed
        empty();
    }//GEN-LAST:event_batal_buttonActionPerformed

    private void idpasienTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpasienTFActionPerformed
//        try {
//            String iddata = idpasienTF.getText();
//            PasienData b = ControlData.getKoneksi().getCariPasien(iddata);
//            if (b != null) {
//                String nama = b.getNama();
//                namaPasienTF.setText(nama);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(diagnosa.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_idpasienTFActionPerformed

    private void simpan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_buttonActionPerformed
        if (diagnosa_textarea.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Diagnosa masih Kosong\n Harap diisi dahulu",
                    "Error Diagnosa Kosong", JOptionPane.ERROR_MESSAGE);
        } else {
            String id = idRM.getText();
            String isiDag = diagnosa_textarea.getText();
            String idDokter = idDokter_TF.getText();
            Date tgl = tanggal_periksa.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
            String tglperiksa = sdf.format(tgl);
            RekamMedisData rmd = new RekamMedisData();
            Dokter dk = new Dokter();
            dk.setIdDokter(idDokter);
            rmd.setIdRekamMedis(id);
            rmd.setDiagnose(isiDag);
            rmd.setTanggal_RM(tglperiksa);
            rmd.setDokter(dk);
//            if (simpan_button.getText().startsWith("S")) {
//                try {
//                    ControlData.getKoneksi().updateRMDiagnosa(rmd);
//                    JOptionPane.showMessageDialog(rootPane, "sukses masuk");
//                    disableEdit();
//                    parent.tampilTableRM();
//                    RekamMedis.diagnosa_button.setEnabled(false);
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(rootPane, "error :" + ex.getMessage());
//                    Logger.getLogger(Anamnesa.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } else {
//                try {
//                    ControlData.getKoneksi().updateRMDiagnosa(rmd);
//                    JOptionPane.showMessageDialog(rootPane, "sukses update");
//                    disableEdit();
//                    parent.tampilTableRM();
//                    simpan_button.setText("Simpan");
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(rootPane, "error :" + ex.getMessage());
//                    Logger.getLogger(Anamnesa.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
        }

        parent.tampilTableRM();
    }//GEN-LAST:event_simpan_buttonActionPerformed

    private void idDokter_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDokter_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDokter_TFActionPerformed

    private void diagnosa_textareaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diagnosa_textareaKeyPressed
        simpan_button.setEnabled(true);
    }//GEN-LAST:event_diagnosa_textareaKeyPressed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        dispose();
        disable();
        RekamMedis.therapi_button.setEnabled(true);
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void empty() {
        idpasienTF.setText("");
        namaPasienTF.setText("");
        diagnosa_textarea.setText("");
    }

    private void enableEdit() {
        diagnosa_textarea.setEditable(true);
        diagnosa_textarea.setEnabled(true);
    }

    private void disableEdit() {
        diagnosa_textarea.setEditable(false);
        diagnosa_textarea.setEnabled(false);
    }

    @Override
    public void disable() {
        Menuowner.setEnabled(true);
    }

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new diagnosa().setVisible(true);
            }
        });
    }
    private RekamMedis Menuowner;
    private RekamMedis parent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea anamnesa_TF;
    private javax.swing.JButton batal_button;
    private javax.swing.JTextArea diagnosa_textarea;
    private javax.swing.JButton edit_button;
    private javax.swing.JButton exit_button;
    public static javax.swing.JTextField idDokter_TF;
    private javax.swing.JTextField idRM;
    private javax.swing.JTextField idpasienTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField namaPasienTF;
    private javax.swing.JButton simpan_button;
    private com.toedter.calendar.JDateChooser tanggal_periksa;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the Menuowner
     */
    public RekamMedis getMenuowner() {
        return Menuowner;
    }

    /**
     * @param Menuowner the Menuowner to set
     */
    public void setMenuowner(RekamMedis Menuowner) {
        this.Menuowner = Menuowner;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(RekamMedis parent) {
        this.parent = parent;
    }
}