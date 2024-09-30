
package praktikumtpbo;
public class NilaiAkhir extends javax.swing.JFrame {

    static void setText(String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public NilaiAkhir() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        HITUNG = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NILAIHURUF = new javax.swing.JLabel();
        NAMAMHS = new javax.swing.JLabel();
        NAMATUGAS = new javax.swing.JLabel();
        NILAIMID = new javax.swing.JLabel();
        NILAIAKHIR = new javax.swing.JLabel();
        NIM = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        NILAISEMESTER = new javax.swing.JLabel();
        TAMPILKANDATA = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MENGHITUNG NILAI AKHIR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 220, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 90, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 90, -1));

        HITUNG.setText("HITUNG");
        HITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HITUNGActionPerformed(evt);
            }
        });
        getContentPane().add(HITUNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 310, -1));

        NILAIHURUF.setText("NILAI HURUF");
        getContentPane().add(NILAIHURUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        NAMAMHS.setText("NAMA MHS");
        getContentPane().add(NAMAMHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 20));

        NAMATUGAS.setText("NILAI TUGAS");
        getContentPane().add(NAMATUGAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));

        NILAIMID.setText("NILAI MID");
        getContentPane().add(NILAIMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, -1));

        NILAIAKHIR.setText("NILAI AKHIR");
        getContentPane().add(NILAIAKHIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 30));

        NIM.setText("NIM");
        getContentPane().add(NIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, 20));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 90, 30));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 90, 30));

        NILAISEMESTER.setText("NILAI SEMESTER");
        getContentPane().add(NILAISEMESTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        TAMPILKANDATA.setText("TAMPILKAN DATA");
        TAMPILKANDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAMPILKANDATAActionPerformed(evt);
            }
        });
        getContentPane().add(TAMPILKANDATA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 90, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 90, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA MHS", "NILAI TUGAS", "NILAI MID", "NILAI SEMESTER", "NILAI AKHIR", "NILAI HURUF"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 10, 540, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void HITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HITUNGActionPerformed
  // TODO add your handling code here:
  double nim,tugas,uts,uas,akhir;
  String nama,huruf;
  
  nim   = Integer.parseInt (nimmhs.getText());
  tugas = Integer.parseInt(NTGS.getText());
  uts   = Integer.parseInt(Nmid.getText());
  uas   = Integer.parseInt(Nsemester.getText());
  nama  = String.valueOf(Nma.getText());
  
  tugas = tugas * 20/100;
  uts = uts * 30/100;
  uas = uas * 50/100;
  akhir = tugas+uts+uas;
  
  Nakhir.setText (String.valueOf(akhir));
  
  if (akhir>90){
      huruf="A";     
  }
  else if (akhir>=80){
      huruf="B";
  }
  else if (akhir>=70){
      huruf="C";
  }
  else if (akhir>=41){
      huruf="D";
  } 
    }//GEN-LAST:event_HITUNGActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void TAMPILKANDATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAMPILKANDATAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TAMPILKANDATAActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(NilaiAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NilaiAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NilaiAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NilaiAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NilaiAkhir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HITUNG;
    private javax.swing.JLabel NAMAMHS;
    private javax.swing.JLabel NAMATUGAS;
    private javax.swing.JLabel NILAIAKHIR;
    private javax.swing.JLabel NILAIHURUF;
    private javax.swing.JLabel NILAIMID;
    private javax.swing.JLabel NILAISEMESTER;
    private javax.swing.JLabel NIM;
    private javax.swing.JButton TAMPILKANDATA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private static class nimmhs {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public nimmhs() {
        }
    }

    private static class NTGS {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public NTGS() {
        }
    }

    private static class Nmid {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Nmid() {
        }
    }

    private static class Nsemester {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Nsemester() {
        }
    }

    private static class Nma {

        private static Object getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Nma() {
        }
    }

    private static class Nakhir {

        private static void setText(String valueOf) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Nakhir() {
        }
    }
}
