/**
 * Filename: BangunDatar.java
 * Description: Kelas Abstrak yang merepresentasikan Bangun 2 Dimensi
 * Author: Raja Samuel Tarigan
 * Date: April 22, 2025
 */

 public abstract class BangunDatar {
    protected String warna;
    protected String border;
    
    public BangunDatar() {
        this.warna = "putih";
        this.border = "hitam";
    }
    
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getBorder() {
        return border;
    }
    
    public void setBorder(String border) {
        this.border = border;
    }
    
    public abstract double getLuas();
    public abstract double getKeliling();
    
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
    
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}