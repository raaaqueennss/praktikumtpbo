
package praktikumtpbo;
public class praktikumm {
    public static void main(String[] args) {
        // TODO code application logic here
        new tugaspercabangan1(600000);
    }
}
class tugaspercabangan1{
    public tugaspercabangan1(int komisi){
        System.out.println("================ KOMISI PADA SALES MEN ==============");
        System.out.println("=====================================================");
        System.out.println("Jika dapat menjual barang Rp 50000 sampai Rp 200000");
        System.out.println("Maka akan mendapat uang jasa Rp 20000 + 10% penjualan");
        System.out.println("=====================================================");
        System.out.println("Jika dapat menjual barang Rp 200000 sampai Rp 500000");
        System.out.println("Maka akan mendapat uang jasa Rp 30000 + 15% penjualan");
        System.out.println("====================================================");
        System.out.println("Jika dapat menjual barang Rp 500000 keatas");
        System.out.println("Maka akan mendapat uang jasa Rp 50000 + 20% penjualan");
        System.out.println("=====================================================");
        System.out.println("Total penjualan pada sales men = Rp " + komisi +" -");
        if (komisi >=500000){
            int hasil = (komisi*20/100)+50000;
            System.out.println("Total pendapatan sales men = Rp " + hasil +" -");
        }else if (komisi > 200000 && komisi <=500000){
            int hasil = (komisi*15/100)+30000;
            System.out.println("Total pendapatan sales men = Rp " + hasil +" -");
        }else if (komisi > 50000 && komisi <=200000){
            int hasil = (komisi*10/100)+20000;
            System.out.println("Total pendapatan sales men = Rp " + hasil +" -");
        }
    }
}

   
