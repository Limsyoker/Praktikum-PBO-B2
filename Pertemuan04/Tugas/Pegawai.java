import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Kelas Pegawai
 * Deskripsi: Kelas dasar untuk semua jenis pegawai perguruan tinggi
 * Tanggal: 14 Maret 2025
 */
public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;
    
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    
    // Calculate working period in years and months
    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }
    
    // Format date to "d MMMM yyyy" format
    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }
    
    // Calculate and return allowance
    public double hitungTunjangan() {
        return 0.0; // Will be overridden in subclasses
    }
    
    // Display employee information
    public void printInfo() {
        System.out.println("NIP            : " + nip);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + formatTanggal(tanggalLahir));
        System.out.println("TMT            : " + formatTanggal(tmt));
        
        Period masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja     : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        
        System.out.println("Gaji Pokok     : Rp " + String.format("%,.2f", gajiPokok));
    }
}