
package praktikumtpbo;
import javax.swing.table.DefaultTableModel;
public class ContohNIlai extends javax.swing.JFrame {
       private final DefaultTableModel model;
    /**
     * Creates new form ContohNIlai
     */
    public ContohNIlai() {
        
        initComponents();
        model = new DefaultTableModel();
        tampildata.setModel(model);
        //mengisi nama column pada table1.
        model.addColumn("Panjang");
        model.addColumn("Lebar");
        model.addColumn("Tinggi");
         model.addColumn("hasil");
    }
private void BhitungActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int p = Integer.parseInt(Npanjang.getText());
        int l = Integer.parseInt(Nlebar.getText());
        int t = Integer.parseInt(Ntinggi.getText());
        int volume = p*l*t;
        Nvolume.setText(String.valueOf(volume));
               
    }           
private void TAMPILActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
         tampildata.getModel();
           String data[] = {Npanjang.getText(),Nlebar.getText(),Ntinggi.getText(),Nvolume.getText()};
           model.addRow(data);    

    }
private void NvolumeMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        int p = Integer.parseInt(Npanjang.getText());
        int l = Integer.parseInt(Nlebar.getText());
        int t = Integer.parseInt(Ntinggi.getText());
        int volume = p*l*t;
        Nvolume.setText(String.valueOf(volume));
    }               
private void bKELUARActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
    } 

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class tampildata {

        private static void setModel(DefaultTableModel model) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void getModel() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public tampildata() {
        }
    }

    private static class Npanjang {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Npanjang() {
        }
    }

    private static class Nlebar {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Nlebar() {
        }
    }

    private static class Ntinggi {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Ntinggi() {
        }
    }

    private static class Nvolume {

        private static void setText(String valueOf) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Nvolume() {
        }
    }
}

    

