
package TGSPRAK1;
import java.util.Scanner;
public class JAVA {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan golongan (A/B/C/D): ");
        char golongan = input.next().charAt(0);
        
        System.out.print("Masukkan jumlah jam kerja per bulan: ");
        int jamKerja = input.nextInt();
        
        double upahPerJam;
        
        switch (golongan) {
            case 'A':
                upahPerJam = 5000;
                break;
            case 'B':
                upahPerJam = 6000;
                break;
            case 'C':
                upahPerJam = 7500;
                break;
            case 'D':
                upahPerJam = 9000;
                break;
            default:
                upahPerJam = 0;
                System.out.println("Golongan tidak valid.");
                System.exit(0);
        }
        
        double upahRegular = jamKerja * upahPerJam;
        double upahLembur = 0;
        
        if (jamKerja > 150) {
            upahLembur = (jamKerja - 150) * upahPerJam * 0.25;
        }
        
        double totalUpah = upahRegular + upahLembur;
        
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Upah Regular: " + upahRegular + " Rp");
        System.out.println("Upah Lembur: " + upahLembur + " Rp");
        System.out.println("Total Upah: " + totalUpah + " Rp");
    }
}
    

