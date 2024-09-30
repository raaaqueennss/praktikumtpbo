
package TGSPRAK1;
public class MerekSepatu extends Sepatu {
    private boolean isRunningShoes;

    public MerekSepatu(String brand, String model, int size, String color, boolean isRunningShoes) {
        super(brand, model, size, color);
        this.isRunningShoes = isRunningShoes;
    }

    public boolean isRunningShoes() {
        return isRunningShoes;
    }

    public void setRunningShoes(boolean isRunningShoes) {
        this.isRunningShoes =isRunningShoes;
    }
}



    

