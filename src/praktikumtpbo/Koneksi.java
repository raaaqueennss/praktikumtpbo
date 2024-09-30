
package praktikumtpbo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getkoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/penjualan";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,password);
                System.out.println("Berhasil");
            } catch (Exception e){
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    public static void main(String args[]){
    getkoneksi();    
    }
}