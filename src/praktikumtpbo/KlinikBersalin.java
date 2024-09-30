
package praktikumtpbo;
import java.text.SimpleDateFormat;
//Class public
public class KlinikBersalin extends javax.swing.JFrame {
    int lminap;
    double	inap,	layanan,	persalinan,	totalbyr,	totalinap, totallayanan;

    public KlinikBersalin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtnmpasien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbKelas = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtbiayaSalin = new javax.swing.JTextField();
        rbDokter = new javax.swing.JRadioButton();
        rbBidan = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtbiayaInap = new javax.swing.JTextField();
        txtbiayaLayanan = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtlamaInap = new javax.swing.JTextField();
        dcMasuk = new com.toedter.calendar.JDateChooser();
        dcKeluar = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txttotalBiaya = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jButton2.setText("jButton2");

        jButton8.setText("jButton8");

        jButton13.setText("jButton13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("KLINIK BERSALIN SAHABAT SEHATI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 50, 290, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtnmpasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnmpasienActionPerformed(evt);
            }
        });

        jLabel2.setText("NAMA PASIEN");

        jLabel3.setText("KELAS");

        cbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilihan Kelas", "A", "B", "C", " " }));
        cbKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnmpasien))
                .addGap(17, 21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnmpasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 270, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("BIAYA PERSALINAN");

        txtbiayaSalin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbiayaSalinActionPerformed(evt);
            }
        });

        rbDokter.setText("Dokter");
        rbDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbDokterMouseClicked(evt);
            }
        });
        rbDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDokterActionPerformed(evt);
            }
        });

        rbBidan.setText("Bidan");
        rbBidan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbBidanMouseClicked(evt);
            }
        });
        rbBidan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBidanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbiayaSalin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbBidan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDokter)
                    .addComponent(rbBidan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtbiayaSalin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, 130));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("INAP");

        jLabel5.setText("LAYANAN");

        txtbiayaInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbiayaInapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbiayaLayanan, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtbiayaInap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtbiayaInap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtbiayaLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 280, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("MASUK");

        jLabel8.setText("KELUAR");

        jLabel9.setText("LAMA INAP");

        txtlamaInap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtlamaInapMouseClicked(evt);
            }
        });
        txtlamaInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlamaInapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtlamaInap, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dcMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(dcKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtlamaInap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 270, 140));

        jLabel10.setText("TOTAL PEMBAYARAN");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        txttotalBiaya.setBackground(new java.awt.Color(51, 255, 0));
        txttotalBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalBiayaActionPerformed(evt);
            }
        });
        getContentPane().add(txttotalBiaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 540, 100, 30));

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        btnBersih.setText("Bersihkan Kotak");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });
        getContentPane().add(btnBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                          

    private void txtnmpasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmpasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmpasienActionPerformed

    private void rbDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDokterActionPerformed
        // TODO add your handling code here:      
        if(rbDokter.isSelected()) {
        rbBidan.setSelected(false);
        persalinan=1000000;
        }
        txtbiayaSalin.setText(String.valueOf(persalinan));
    }//GEN-LAST:event_rbDokterActionPerformed

    private void cbKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKelasActionPerformed
     
    if(cbKelas.getSelectedItem().equals("Pilih Kelas")){
    txtbiayaInap.setText("");
    txtbiayaLayanan.setText("");
    }
    else if(cbKelas.getSelectedItem().equals("A")){
    inap=300000;
    layanan=100000;
    }
    else if(cbKelas.getSelectedItem().equals("B")){
    inap=200000;
    layanan=70000;
    }
    else {
    inap=100000;
    layanan=50000;
    }

    txtbiayaInap.setText(String.valueOf(inap));
    txtbiayaLayanan.setText(String.valueOf(layanan));
    }//GEN-LAST:event_cbKelasActionPerformed

    private void txtbiayaSalinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbiayaSalinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbiayaSalinActionPerformed

    private void txtbiayaInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbiayaInapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbiayaInapActionPerformed

    private void rbBidanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBidanActionPerformed
        // TODO add your handling code here:
    if(rbBidan.isSelected()) {
    rbDokter.setSelected(false);
    persalinan=750000;
    }
    txtbiayaSalin.setText(String.valueOf(persalinan));
    }//GEN-LAST:event_rbBidanActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        // TODO add your handling code here:
        txtnmpasien.setText("");
        cbKelas.setEnabled(false);
        rbDokter.setEnabled(false);
        rbBidan.setEnabled(false);
        txtbiayaInap.setText("");
        txtbiayaLayanan.setText("");
        txtbiayaSalin.setText("");
        dcMasuk.setEnabled(false);
        dcKeluar.setEnabled(false);
        txtlamaInap.setText("");
        txttotalBiaya.setText("");
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtlamaInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlamaInapActionPerformed
        // TODO add your handling code here:
        try{
        String tglmasuk, tglkeluar;
        SimpleDateFormat ft = new SimpleDateFormat("dd-MMM- yyyy");

        tglmasuk = ft.format(dcMasuk.getDate());
        int tm = Integer.parseInt(tglmasuk.substring(0,2));
        tglkeluar = ft.format(dcKeluar.getDate());
        int tk = Integer.parseInt(tglkeluar.substring(0,2));
        lminap = tk-tm;
        txtlamaInap.setText(String.valueOf(lminap));
        }catch(NumberFormatException ex){
        System.out.println(""+ex.getMessage());
        }
        totalinap=lminap*inap;
        totallayanan=lminap*layanan;

    }//GEN-LAST:event_txtlamaInapActionPerformed

    private void txttotalBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalBiayaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttotalBiayaActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
       totalbyr=persalinan+totallayanan+totalinap;
       txttotalBiaya.setText(String.valueOf(totalbyr));

    }//GEN-LAST:event_btnHitungActionPerformed

    private void rbDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDokterMouseClicked
        // TODO add your handling code here:
        if(rbDokter.isSelected()) {
        rbBidan.setSelected(false);
        persalinan=1000000;
        }
        txtbiayaSalin.setText(String.valueOf(persalinan));
        
    }//GEN-LAST:event_rbDokterMouseClicked

    private void rbBidanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbBidanMouseClicked
        // TODO add your handling code here:
    if(rbBidan.isSelected()) {
    rbDokter.setSelected(false);
    persalinan=750000;
    }
    txtbiayaSalin.setText(String.valueOf(persalinan));
        
    }//GEN-LAST:event_rbBidanMouseClicked

    private void txtlamaInapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtlamaInapMouseClicked
        // TODO add your handling code here:
        try{
        String tglmasuk, tglkeluar;
        SimpleDateFormat ft = new SimpleDateFormat("dd-MMM- yyyy");

        tglmasuk = ft.format(dcMasuk.getDate());
        int tm = Integer.parseInt(tglmasuk.substring(0,2));
        tglkeluar = ft.format(dcKeluar.getDate());
        int tk = Integer.parseInt(tglkeluar.substring(0,2));
        lminap = tk-tm;
        txtlamaInap.setText(String.valueOf(lminap));
        }catch(NumberFormatException ex){
        System.out.println(""+ex.getMessage());
        }
        totalinap=lminap*inap;
        totallayanan=lminap*layanan;
    }//GEN-LAST:event_txtlamaInapMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        // Mendaftarkan Pilihan Kelas
        cbKelas.setSelectedItem("Pilih Kelas");
        cbKelas.addItem("Pilih Kelas");
        cbKelas.addItem("A");
        cbKelas.addItem("B");
        cbKelas.addItem("C");
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
        new KlinikBersalin().setVisible(true);
         });
        } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JComboBox<String> cbKelas;
    private com.toedter.calendar.JDateChooser dcKeluar;
    private com.toedter.calendar.JDateChooser dcMasuk;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButton rbBidan;
    private javax.swing.JRadioButton rbDokter;
    private javax.swing.JTextField txtbiayaInap;
    private javax.swing.JTextField txtbiayaLayanan;
    private javax.swing.JTextField txtbiayaSalin;
    private javax.swing.JTextField txtlamaInap;
    private javax.swing.JTextField txtnmpasien;
    private javax.swing.JTextField txttotalBiaya;
    // End of variables declaration//GEN-END:variables
}
