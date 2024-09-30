
package praktikumtpbo;
import java.util.Scanner;
public class praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan pendapatan penjualan Barang: Rp.");
        double pendapatan = scanner.nextDouble();
        
        double uangjasa = 0;
        double komisi = 0;
        
        if (pendapatan >= 250000 && pendapatan <= 700000){
            uangjasa = 15000;
            komisi = pendapatan *0.1;
       
        } else if (pendapatan > 700000 && pendapatan <= 1000000){
            uangjasa = 40000;
            komisi = pendapatan *0.15;
            
        } else if (pendapatan >= 1000000){
            uangjasa = 70000;
            komisi = pendapatan *0.2;
            
        }
        double totalpendapatan = uangjasa + komisi;
        System.out.println("uang jasa :Rp." + uangjasa);
        System.out.println("komisi:Rp." + totalpendapatan);
        
        
        
 
    }
    
}
