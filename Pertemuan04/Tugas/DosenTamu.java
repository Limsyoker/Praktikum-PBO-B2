import java.time.LocalDate;
import java.time.Period;

/**
 * Kelas DosenTamu
 * Deskripsi: Kelas untuk jenis pegawai dosen tamu
 * Tanggal: 14 Maret 2025
 */
public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;
    
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, 
                     LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    // Calculate remaining contract months
    public Period hitungMasaKontrakTersisa() {
        return Period.between(LocalDate.now(), tanggalBerakhirKontrak);
    }
    
    @Override
    public double hitungTunjangan() {
        // 2.5% x gaji pokok
        return 0.025 * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK           : " + nidk);
        System.out.println("Jabatan        : Dosen Tamu");
        
        Period masaKontrak = hitungMasaKontrakTersisa();
        System.out.println("Kontrak Berakhir: " + formatTanggal(tanggalBerakhirKontrak));
        System.out.println("Sisa Kontrak   : " + masaKontrak.getYears() + " tahun " + masaKontrak.getMonths() + " bulan");
        
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan      : 2.5% x Rp " + String.format("%,.2f", gajiPokok) + 
                          " = Rp. " + String.format("%,.2f", tunjangan));
    }
}