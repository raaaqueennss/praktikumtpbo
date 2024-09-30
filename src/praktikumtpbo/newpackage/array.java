
package praktikumtpbo.newpackage;
import java.util.Scanner;
public class array {
      public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); 

       
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        String[] npm = new String[jumlahMahasiswa];
        String[] kode = new String[jumlahMahasiswa];
        int[] pembayaranKe = new int[jumlahMahasiswa];
        String[] jurusan = new String[jumlahMahasiswa];
        int[] pembayaranAwal = new int[jumlahMahasiswa];
        int[] jumlahCicilan = new int[jumlahMahasiswa];
        int[] besarcicilan = new int[jumlahMahasiswa];
        int[] uangKuliah = new int[jumlahMahasiswa];
        int[] uangKuliahTerbayar = new int[jumlahMahasiswa];
        int[] sisaUangKuliah = new int[jumlahMahasiswa];

       
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            System.out.print("Masukkan NPM ke-" + (i + 1) + ": ");
            npm[i] = scanner.nextLine();
            System.out.print("Masukkan Kode ke-" + (i + 1) + ": ");
            kode[i] = scanner.nextLine();
            System.out.print("Masukkan Pembayaran Ke ke-" + (i + 1) + ": ");
            pembayaranKe[i] = scanner.nextInt();
            scanner.nextLine(); 

           
            if (kode[i].equals("SI")) {
                pembayaranAwal[i] = 2100000;
                jumlahCicilan[i] = 7;
                jurusan[i] = "Sistem Informasi";
                besarcicilan[i] = 300000;
                uangKuliah[i] = pembayaranAwal[i] + (jumlahCicilan[i] * 300000);
                uangKuliahTerbayar[i] = pembayaranAwal[i] + (pembayaranKe[i] * 300000);
            } else if (kode[i].equals("TI")) {
                pembayaranAwal[i] = 2500000;
                jumlahCicilan[i] = 7;
                besarcicilan[i] = 300000;
                jurusan[i] = "Teknik Informatika";
                uangKuliah[i] = pembayaranAwal[i] + (jumlahCicilan[i] * 300000);
                uangKuliahTerbayar[i] = 2500000 + (pembayaranKe[i] * 300000);
            } else if (kode[i].equals("KA")) {
                pembayaranAwal[i] = 1750000;
                jumlahCicilan[i] = 6;
                besarcicilan[i] = 200000;
                jurusan[i] = "Komputer Akuntansi";
                uangKuliah[i] = pembayaranAwal[i] + (jumlahCicilan[i] * 200000);
                uangKuliahTerbayar[i] = 1750000 + (pembayaranKe[i] * 200000);
            } else if (kode[i].equals("MI")) {
                pembayaranAwal[i] = 1500000;
                jumlahCicilan[i] = 6;
                besarcicilan[i] = 250000;
                jurusan[i] = "Manajemen Informatika";
                uangKuliah[i] = 1500000 + (jumlahCicilan[i] * 250000);
                uangKuliahTerbayar[i] = 1500000 + (pembayaranKe[i] * 250000);
            } else {
                System.out.println("Kode jurusan tidak valid.");
                return;
            }

            
            sisaUangKuliah[i] = uangKuliah[i] - uangKuliahTerbayar[i];
        }

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nNama Mahasiswa: " + namaMahasiswa[i]);
            System.out.println("NPM: " + npm[i]);
            System.out.println("Kode: " + kode[i]);
            System.out.println("Jurusan: " + jurusan[i]);
            System.out.println("Pembayaran Awal: " + pembayaranAwal[i]);
            System.out.println("Jumlah Cicilan: " + jumlahCicilan[i]);
            System.out.println("Besar Cicilan Rp: " + besarcicilan[i]);
            System.out.println("Pembayaran Ke: " + pembayaranKe[i]);
            System.out.println("Uang Kuliah Rp: " + uangKuliah[i]);
            System.out.println("Uang Kuliah Terbayar: " + uangKuliahTerbayar[i]);
            System.out.println("Sisa Uang Kuliah: " + sisaUangKuliah[i]);
        }
    }
}