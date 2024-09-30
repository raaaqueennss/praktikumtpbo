
package praktikumtpbo;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PembayaranUangKuliahApplet extends Applet implements ActionListener {
    
    Label labelNama = new Label("Nama Mahasiswa:");
    TextField textFieldNama = new TextField(10);

    Label labelNPM = new Label("NPM:");
    TextField textFieldNPM = new TextField(10);

    Label labelKode = new Label("Kode:");
    TextField textFieldKode = new TextField(10);

    Label labelPembayaranKe = new Label("Pembayaran Ke:");
    TextField textFieldPembayaranKe = new TextField(10);

    Label labelJurusan = new Label("Jurusan:");
    TextField textFieldJurusan = new TextField(20);

    Label labelPembayaranAwal = new Label("Pembayaran Awal (Rp):");
    TextField textFieldPembayaranAwal = new TextField(10);

    Label labelJumlahCicilan = new Label("Jumlah Cicilan:");
    TextField textFieldJumlahCicilan = new TextField(10);

    Label labelBesarCicilan = new Label("Besar Cicilan (Rp):");
    TextField textFieldBesarCicilan = new TextField(10);

    Label labelUangKuliah = new Label("Uang Kuliah (Rp):");
    TextField textFieldUangKuliah = new TextField(10);

    Label labelUangTerbayar = new Label("Uang Terbayar (Rp):");
    TextField textFieldUangTerbayar = new TextField(10);

    Label labelSisaUangKuliah = new Label("Sisa Uang Kuliah (Rp):");
    TextField textFieldSisaUangKuliah = new TextField(10);

    Button hitungButton = new Button("Hitung");

    
    public void init() {
        add(labelNama);
        add(textFieldNama);

        add(labelNPM);
        add(textFieldNPM);

        add(labelKode);
        add(textFieldKode);

        add(labelPembayaranKe);
        add(textFieldPembayaranKe);

        add(labelJurusan);
        add(textFieldJurusan);

        add(labelPembayaranAwal);
        add(textFieldPembayaranAwal);

        add(labelJumlahCicilan);
        add(textFieldJumlahCicilan);

        add(labelBesarCicilan);
        add(textFieldBesarCicilan);

        add(labelUangKuliah);
        add(textFieldUangKuliah);

        add(labelUangTerbayar);
        add(textFieldUangTerbayar);

        add(labelSisaUangKuliah);
        add(textFieldSisaUangKuliah);

        add(hitungButton);

        
        hitungButton.addActionListener(this);
    }

   
    public void actionPerformed(ActionEvent event) {
        
        String nama = textFieldNama.getText();
        String npm = textFieldNPM.getText();
        String kode = textFieldKode.getText();
        int pembayaranKe = Integer.parseInt(textFieldPembayaranKe.getText());

        
        String jurusan = "";
        double pembayaranAwal = 0;
        int jumlahCicilan = 0;
        double besarCicilan = 0;

        switch (kode.toUpperCase()) {
            case "SI":
                jurusan = "Sistem Informasi";
                pembayaranAwal = 2100000;
                jumlahCicilan = 7;
                besarCicilan = 300000;
                break;
            case "TI":
                jurusan = "Teknik Informatika";
                pembayaranAwal = 2500000;
                jumlahCicilan = 7;
                besarCicilan = 300000;
                break;
            case "KA":
                jurusan = "Komputer Akuntansi";
                pembayaranAwal = 1750000;
                jumlahCicilan = 6;
                besarCicilan = 200000;
                break;
            case "MI":
                jurusan = "Manajemen Informatika";
                pembayaranAwal = 1500000;
                jumlahCicilan = 6;
                besarCicilan = 250000;
                break;
            default:
                jurusan = "Kode tidak valid";
        }

       
        double uangKuliah = pembayaranAwal + (jumlahCicilan * besarCicilan);
        double uangTerbayar = pembayaranAwal + (pembayaranKe * besarCicilan);
        double sisaUangKuliah = uangKuliah - uangTerbayar;

       
        textFieldJurusan.setText(jurusan);
        textFieldPembayaranAwal.setText(String.valueOf(pembayaranAwal));
        textFieldJumlahCicilan.setText(String.valueOf(jumlahCicilan));
        textFieldBesarCicilan.setText(String.valueOf(besarCicilan));
        textFieldUangKuliah.setText(String.valueOf(uangKuliah));
        textFieldUangTerbayar.setText(String.valueOf(uangTerbayar));
        textFieldSisaUangKuliah.setText(String.valueOf(sisaUangKuliah));
    }
}


