/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam kelas Titik
 * Pembuat      : Raja Samuel Tarigan
 * Tanggal      : 
*/ 

public class Titik{
    private double absis;
    private double ordinat;
    private static int counterTitik; //menghitung objek titik

    public Titik(double a, double o){
        this.absis = a;
        this.ordinat = o;
    }

    public Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }

    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }
    
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX() {
        ordinat = -ordinat;
    }

    public void refleksiY() {
        absis = -absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

}