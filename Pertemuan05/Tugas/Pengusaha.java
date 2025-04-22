/**
 * Filename: Pengusaha.java
 * Description: Class untuk Pengusaha
 * Author: Raja Samuel Tarigan
 * Date: April 22, 2025
 */

 import java.time.LocalDate;
 import java.time.Period;
 
 public class Pengusaha extends Manusia {
     private String npwp;
     private static int counterPengusaha = 0;
     
     // Assuming the 13th digit of your NIM is 2 (replace with your actual digit)
     private final int B = 2;
     
     public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
         super(nama, tglMulaiKerja, alamat, pendapatan);
         this.npwp = npwp;
         counterPengusaha++;
     }
     
     public Pengusaha(String nama, LocalDate tglMulaiKerja, double pendapatan, String npwp) {
         super(nama, tglMulaiKerja, pendapatan);
         this.npwp = npwp;
         counterPengusaha++;
     }
     
     public static int getCounterPengusaha() {
         return counterPengusaha;
     }
     
     public String getNpwp() {
         return npwp;
     }
     
     public void setNpwp(String npwp) {
         this.npwp = npwp;
     }
     
     @Override
     public double hitungMasaKerja() {
         LocalDate now = LocalDate.now();
         Period period = Period.between(tglMulaiKerja, now);
         return period.getYears() + period.getMonths() / 12.0 + period.getDays() / 365.0 + B;
     }
     
     @Override
     public double hitungPajak() {
         return 0.15 * pendapatan;
     }
     
     @Override
     public void cetakInfo() {
         super.cetakInfo();
         System.out.println("NPWP: " + npwp);
         System.out.println("Tipe: Pengusaha");
         System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
         System.out.println("Pajak: " + hitungPajak());
         System.out.println();
     }
 }