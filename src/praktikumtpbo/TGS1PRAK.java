
package praktikumtpbo;
import java.util.Scanner;
public class TGS1PRAK {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = input.nextLine();

        System.out.print("Masukkan golongan (A/B/C/D): ");
        char golongan = input.next().charAt(0);

        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();

        double upahPerJam = 0;
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
                System.out.println("Golongan tidak valid.");
                return;
        }

        double upahRegular = upahPerJam * jamKerja;
        double upahLembur = 0;

        if (jamKerja > 150) {
            int jamLembur = jamKerja - 150;
            upahLembur = upahPerJam * 0.25 * jamLembur;
        }

        double totalUpah = upahRegular + upahLembur;

        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Upah Regular: " + upahRegular + " Rp");
        System.out.println("Upah Lembur: " + upahLembur + " Rp");
        System.out.println("Total Upah: " + totalUpah + " Rp");
    }
}

