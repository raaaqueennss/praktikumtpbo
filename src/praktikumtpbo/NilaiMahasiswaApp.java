
package praktikumtpbo;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NilaiMahasiswaApp extends JFrame {
    private JTextField tfNilaiTugas, tfNilaiMid, tfNilaiSemester, tfNilaiAkhir;
    private JButton btnHitung;
    private JTable table;

    public NilaiMahasiswaApp() {
        setTitle("Aplikasi Nilai Mahasiswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);

        // Komponen
        tfNilaiTugas = new JTextField();
        tfNilaiMid = new JTextField();
        tfNilaiSemester = new JTextField();
        tfNilaiAkhir = new JTextField();
        btnHitung = new JButton("Hitung");
        table = new JTable();

        // Letakkan komponen
        tfNilaiTugas.setBounds(20, 20, 150, 20);
        tfNilaiMid.setBounds(20, 50, 150, 20);
        tfNilaiSemester.setBounds(20, 80, 150, 20);
        tfNilaiAkhir.setBounds(20, 110, 150, 20);
        btnHitung.setBounds(20, 140, 80, 20);
        table.setBounds(200, 20, 150, 120);

        // Tambahkan ke frame
        add(tfNilaiTugas);
        add(tfNilaiMid);
        add(tfNilaiSemester);
        add(tfNilaiAkhir);
        add(btnHitung);
        add(new JScrollPane(table));

        // Event handler
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungNilai();
            }
        });

        setVisible(true);
    }

    private void hitungNilai() {
        double nilaiTugas = Double.parseDouble(tfNilaiTugas.getText());
        double nilaiMid = Double.parseDouble(tfNilaiMid.getText());
        double nilaiSemester = Double.parseDouble(tfNilaiSemester.getText());

        // Hitung nilai akhir sesuai formula Anda
        double nilaiAkhir = (nilaiTugas + nilaiMid + nilaiSemester) / 3;

        // Tampilkan nilai akhir di JTextField
        tfNilaiAkhir.setText(String.valueOf(nilaiAkhir));

        // Tampilkan hasil di tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Keterangan");
        model.addColumn("Nilai");

        model.addRow(new Object[]{"Nilai Tugas", nilaiTugas});
        model.addRow(new Object[]{"Nilai Mid", nilaiMid});
        model.addRow(new Object[]{"Nilai Semester", nilaiSemester});
        model.addRow(new Object[]{"Nilai Akhir", nilaiAkhir});

        table.setModel(model);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NilaiMahasiswaApp();
            }
        });
    }
}
