/**
 * Filename: PNS.java
 * Description: Class untuk PNS
 * Author: Raja Samuel Tarigan
 * Date: April 22, 2025
 */

 import java.time.LocalDate;
 import java.time.Period;
 
 public class PNS extends Manusia {
     private String nip;
     private static int counterPNS = 0;
     
     // Assuming the 14th digit of your NIM is 4 (replace with your actual digit)
     private final int A = 4;
     
     public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
         super(nama, tglMulaiKerja, alamat, pendapatan);
         this.nip = nip;
         counterPNS++;
     }
     
     public PNS(String nama, LocalDate tglMulaiKerja, double pendapatan, String nip) {
         super(nama, tglMulaiKerja, pendapatan);
         this.nip = nip;
         counterPNS++;
     }
     
     public static int getCounterPNS() {
         return counterPNS;
     }
     
     public String getNip() {
         return nip;
     }
     
     public void setNip(String nip) {
         this.nip = nip;
     }
     
     @Override
     public double hitungMasaKerja() {
         LocalDate now = LocalDate.now();
         Period period = Period.between(tglMulaiKerja, now);
         return period.getYears() + period.getMonths() / 12.0 + period.getDays() / 365.0 + A;
     }
     
     @Override
     public double hitungPajak() {
         return 0.10 * pendapatan;
     }
     
     @Override
     public void cetakInfo() {
         super.cetakInfo();
         System.out.println("NIP: " + nip);
         System.out.println("Tipe: PNS");
         System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
         System.out.println("Pajak: " + hitungPajak());
         System.out.println();
     }
 }