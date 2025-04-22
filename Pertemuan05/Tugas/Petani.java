/**
 * Filename: Petani.java
 * Description: Class untuk Petani
 * Author: Raja Samule Tarigan
 * Date: April 22, 2025
 */

 import java.time.LocalDate;
 import java.time.Period;
 
 public class Petani extends Manusia {
     private String lokasiBertani;
     private static int counterPetani = 0;
     
     // Assuming the 12th digit of your NIM is 9 (replace with your actual digit)
     private final int C = 9;
     
     public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String lokasiBertani) {
         super(nama, tglMulaiKerja, alamat, pendapatan);
         this.lokasiBertani = lokasiBertani;
         counterPetani++;
     }
     
     public Petani(String nama, LocalDate tglMulaiKerja, double pendapatan, String lokasiBertani) {
         super(nama, tglMulaiKerja, pendapatan);
         this.lokasiBertani = lokasiBertani;
         counterPetani++;
     }
     
     public static int getCounterPetani() {
         return counterPetani;
     }
     
     public String getLokasiBertani() {
         return lokasiBertani;
     }
     
     public void setLokasiBertani(String lokasiBertani) {
         this.lokasiBertani = lokasiBertani;
     }
     
     @Override
     public double hitungMasaKerja() {
         LocalDate now = LocalDate.now();
         Period period = Period.between(tglMulaiKerja, now);
         return period.getYears() + period.getMonths() / 12.0 + period.getDays() / 365.0 + C;
     }
     
     @Override
     public double hitungPajak() {
         return 0; // Petani tidak dikenakan pajak
     }
     
     @Override
     public void cetakInfo() {
         super.cetakInfo();
         System.out.println("Lokasi Bertani: " + lokasiBertani);
         System.out.println("Tipe: Petani");
         System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
         System.out.println("Pajak: " + hitungPajak());
         System.out.println();
     }
 }