/**
 * Filename: Manusia.java
 * Description: Class Abstract untuk manusia
 * Author: Raja Samuel Tarigan
 * Date: April 22, 2025
 */

 import java.time.LocalDate;
 import java.time.Period;
 import java.time.format.DateTimeFormatter;
 
 public abstract class Manusia {
     protected String nama;
     protected LocalDate tglMulaiKerja;
     protected String alamat;
     protected double pendapatan;
     
     private static int counterMns = 0;
     
     public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
         this.nama = nama;
         this.tglMulaiKerja = tglMulaiKerja;
         this.alamat = alamat;
         this.pendapatan = pendapatan;
         counterMns++;
     }
     
     public Manusia(String nama, LocalDate tglMulaiKerja, double pendapatan) {
         this(nama, tglMulaiKerja, "Belum diisi", pendapatan);
     }
     
     public static int getCounterMns() {
         return counterMns;
     }
     
     public String getNama() {
         return nama;
     }
     
     public void setNama(String nama) {
         this.nama = nama;
     }
     
     public LocalDate getTglMulaiKerja() {
         return tglMulaiKerja;
     }
     
     public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
         this.tglMulaiKerja = tglMulaiKerja;
     }
     
     public String getAlamat() {
         return alamat;
     }
     
     public void setAlamat(String alamat) {
         this.alamat = alamat;
     }
     
     public double getPendapatan() {
         return pendapatan;
     }
     
     public void setPendapatan(double pendapatan) {
         this.pendapatan = pendapatan;
     }
     
     public abstract double hitungMasaKerja();
     
     public abstract double hitungPajak();
     
     public void cetakInfo() {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         System.out.println("Nama: " + nama);
         System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja.format(formatter));
         System.out.println("Alamat: " + alamat);
         System.out.println("Pendapatan: " + pendapatan);
     }
 }