
package praktikumtpbo;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class applethitung extends Applet implements ActionListener {
    TextField namaField, golonganField, jamKerjaField, upahRegulerField, upahLemburField, totalUpahField;
    Button hitungButton;

    public void init() {
        // Inisialisasi komponen GUI
        Label labelNama = new Label("Nama Karyawan:");
        namaField = new TextField(20);
        Label labelGolongan = new Label("Golongan (A/B/C/D):");
        golonganField = new TextField(20);
        Label labelJamKerja = new Label("Jumlah Jam Kerja:");
        jamKerjaField = new TextField(20);
        Label labelUpahReguler = new Label("Upah Reguler:");
        upahRegulerField = new TextField(20);
        upahRegulerField.setEditable(false);
        Label labelUpahLembur = new Label("Upah Lembur:");
        upahLemburField = new TextField(20);
        upahLemburField.setEditable(false);
        Label labelTotalUpah = new Label("Total Upah:");
        totalUpahField = new TextField(20);
        totalUpahField.setEditable(false);

        hitungButton = new Button("Hitung Total Upah");
        hitungButton.addActionListener(this);

        // Menambahkan komponen ke Applet
        add(labelNama);
        add(namaField);
        add(labelGolongan);
        add(golonganField);
        add(labelJamKerja);
        add(jamKerjaField);
        add(hitungButton);
        add(labelUpahReguler);
        add(upahRegulerField);
        add(labelUpahLembur);
        add(upahLemburField);
        add(labelTotalUpah);
        add(totalUpahField);
    }

    public void actionPerformed(ActionEvent e) {
        // Memproses perhitungan saat tombol ditekan
        hitungTotalUpah();
    }

    private void hitungTotalUpah() {
        try {
            // Mendapatkan input dari pengguna
            String namaKaryawan = namaField.getText();
            String golongan = golonganField.getText();
            double jamKerja = Double.parseDouble(jamKerjaField.getText());

            // Menghitung upah reguler berdasarkan golongan
            double upahPerJam = 0;
            if (golongan.equals("A")) {
                upahPerJam = 5000;
            } else if (golongan.equals("B")) {
                upahPerJam = 6000;
            } else if (golongan.equals("C")) {
                upahPerJam = 7500;
            } else if (golongan.equals("D")) {
                upahPerJam = 9000;
            } else {
                totalUpahField.setText("Golongan tidak valid");
                return;
            }

            // Menghitung upah reguler dan lembur
            double upahRegular;
             if (jamKerja <= 150) {
            upahRegular = jamKerja * upahPerJam;
        } else {
            upahRegular = 150 * upahPerJam;
        }
            double upahLembur=0;
             if (jamKerja > 150) {
            double jamLembur = jamKerja - 150;
            upahLembur = jamLembur * (1.25 * upahPerJam);
        }
            // Menghitung total upah
            double totalUpah = upahRegular + upahLembur;

            // Menampilkan hasil ke field teks
            upahRegulerField.setText(String.valueOf(upahRegular));
            upahLemburField.setText(String.valueOf(upahLembur));
            totalUpahField.setText(String.valueOf(totalUpah));
        } catch (NumberFormatException ex) {
            totalUpahField.setText("Masukkan angka yang valid untuk jam kerja.");
        }
    }
}
 
    

