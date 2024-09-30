
package TGSPRAK1;
public class Sepatu {
    private String brand;
    private String model;
    private int size;
    private String color;

    public Sepatu(String brand, String model, int size, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Sepatu
        Sepatu myShoes = new Sepatu("Nike", "Air Max", 10, "Black");
        Sepatu shoe1 = new Sepatu("Nike", "Air Max", 9, "Black");
        Sepatu shoe2 = new Sepatu("Adidas", "UltraBoost", 10, "White");
        Sepatu shoe3 = new Sepatu("Puma", "RS-X", 8, "Red");
        Sepatu shoe4 = new Sepatu("Reebok", "Classic", 7, "Blue");
        Sepatu shoe5 = new Sepatu("Converse", "Chuck Taylor", 8, "Green");

        MerekSepatu mereksepatulari = new MerekSepatu("puma", "EnzoEvo", 10, "Black", true);

        System.out.println("Sepatu 1: " + shoe1.getBrand() + " " + shoe1.getModel() + ", Ukuran " + shoe1.getSize() + ", Warna " + shoe1.getColor());
        System.out.println("Sepatu 2: " + shoe2.getBrand() + " " + shoe2.getModel() + ", Ukuran " + shoe2.getSize() + ", Warna " + shoe2.getColor());
        System.out.println("Sepatu 3: " + shoe3.getBrand() + " " + shoe3.getModel() + ", Ukuran " + shoe3.getSize() + ", Warna " + shoe3.getColor());
        System.out.println("Sepatu 4: " + shoe4.getBrand() + " " + shoe4.getModel() + ", Ukuran " + shoe4.getSize() + ", Warna " + shoe4.getColor());
        System.out.println("Sepatu 5: " + shoe5.getBrand() + " " + shoe5.getModel() + ", Ukuran " + shoe5.getSize() + ", Warna " + shoe5.getColor());
        System.out.println("MerekSepatuLari:" + mereksepatulari.getBrand() + " " + mereksepatulari.getModel() + " Ukuran " + mereksepatulari.getSize() + " Warna " + mereksepatulari.getColor() + " Is Running Shoes: " + mereksepatulari.isRunningShoes());
    }
}

    

