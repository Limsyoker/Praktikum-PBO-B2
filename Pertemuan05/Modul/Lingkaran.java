/**
 * Filename: Lingkaran.java
 * Description: Class untuk bentuk lingkaran
 * Author: Raja Samuel Tarigan
 * Date: April 22, 2025
 */

 public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;
    
    public Lingkaran() {
        super();
        this.jariJari = 1.0;
    }
    
    public Lingkaran(double jariJari) {
        super();
        this.jariJari = jariJari;
    }
    
    public Lingkaran(double jariJari, String warna, String border) {
        super(warna, border);
        this.jariJari = jariJari;
    }
    
    public double getJariJari() {
        return jariJari;
    }
    
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }
    
    @Override
    public void zoomIn() {
        this.jariJari = this.jariJari * 1.1;
    }
    
    @Override
    public void zoomOut() {
        this.jariJari = this.jariJari * 0.9;
    }
    
    @Override
    public void zoom(double factor) {
        this.jariJari = this.jariJari * factor;
    }
}