
package praktikumtpbo;
import java.util.Scanner;
public class prakperulangan {
    public static void main(String[] args) {
        boolean running = true;
         int barang;
         double dapat = 0,jasa = 0,total;
         String salesman;
         
         Scanner inputuser = new Scanner (System.in);
         
         System.out.println("Nama karyawan");
         salesman = inputuser.nextLine();
         while(running){
         System.out.println("Menjual Barang:");
         barang = inputuser.nextInt();
         
             
            if (barang>=250000 && barang <= 700000){
                jasa = 15000;
                dapat = 0.1*barang;
                
            }
            else if (barang >=700000){
                jasa = 40000;
                dapat = 0.15*barang;                
            }
            else if (barang >= 1000000){
                jasa = 700000;
                dapat = 0.2*barang;
            }
            else {
                System.out.println("Anda salah masukan input");
            }
            total = jasa+dapat;
            System.out.println("uang jasa" + (int)jasa);
            System.out.println("uang komisi:" + (int)dapat);
            System.out.println("uang total:"+ (int)total);
            
            
            
             System.out.println("Apakah anda ingin mengulang");
             System.out.println("Jawab [iya/tidak");
             String jawab = inputuser.next();
             if (!jawab.equalsIgnoreCase ("ya")){
                 running = false;
             }
            }
         
         
        
    }
    
}
