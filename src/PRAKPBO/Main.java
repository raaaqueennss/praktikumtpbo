
package PRAKPBO;
public class Main {
    public static void main(String[] args) {
       Belahketupat belahketupat = new Belahketupat belahketupat(5, 8, 4, 7, 6);
        System.out.println("Luas Belahketupat: " + belahketupat.hitungLuas());
        System.out.println("Keliling Belahketupat: " + belahketupat.hitungKeliling());

        Jajargenjang jajargenjang = new Jajargenjang(6, 9, 5, 5);
        System.out.println("Luas Jajargenjang: " + jajargenjang.hitungLuas());
        System.out.println("Keliling Jajargenjang: " + jajargenjang.hitungKeliling());
    }

}
JOptionPane.showMessageDialog(null, "Data Tersimpan");
            loadData();
int baris = jTable1.getRowCount();
            
            for (int i= 0; i < baris; i++){
                String sql = "INSERT INTO penjualanrinci (NoFaktur, ID_Barang, Nama_Barang, Jumlah, Harga, Total) VALUES('"
                        + jTable1.getValueAt(i, 0) +"','"+ jTable1.getValueAt(i, 1) +"','"+ jTable1.getValueAt(i, 2)
                        +"','"+ jTable1.getValueAt(i, 3) +"','"+ jTable1.getValueAt(i, 4) +"','"+ jTable1.getValueAt(i, 5)
                        +")'";
PreparedStatement p = c.prepareStatement(sql);                              
                p.executeUpdate();
                p.close();
    

