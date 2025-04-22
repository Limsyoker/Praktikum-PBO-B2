/**
 * Filename: Persegi.java
 * Description: Kelas untuk Persegi
 * Author: Raja Samuel Tarigan
 * Date: April 22, 2025
 */

 public class Persegi extends BangunDatar implements IResize {
    private double sisi;
    
    public Persegi() {
        super();
        this.sisi = 1.0;
    }
    
    public Persegi(double sisi) {
        super();
        this.sisi = sisi;
    }
    
    public Persegi(double sisi, String warna, String border) {
        super(warna, border);
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double getLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
    
    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1;
    }
    
    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }
    
    @Override
    public void zoom(double factor) {
        this.sisi = this.sisi * factor;
    }
}