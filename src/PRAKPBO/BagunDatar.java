
package PRAKPBO;
public class BagunDatar {
    abstract class BangunDatar {
    abstract double hitungLuas();
    abstract double hitungKeliling();
}

class Belahketupat extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    public Belahketupat(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    double hitungLuas() {
        return 0.5 * (sisi1 + sisi2) * tinggi;
    }

    @Override
    double hitungKeliling() {
        return alas + sisi1 + sisi2 + sisi3;
    }
}

class Jajargenjang extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    
    public Jajargenjang(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    double hitungLuas() {
        return alas * tinggi;
    }

    @Override
    double hitungKeliling() {
        return 2 * (sisi1 + sisi2);
    }
}



 
    

