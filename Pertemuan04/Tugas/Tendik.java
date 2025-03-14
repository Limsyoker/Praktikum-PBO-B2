import java.time.LocalDate;

/**
 * Kelas Tendik
 * Deskripsi: Kelas untuk jenis pegawai tenaga kependidikan
 * Tanggal: 14 Maret 2025
 */
public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP_TAHUN = 55;
    
    public Tendik(String nip, String nama, LocalDate tanggalLahir, 
                 LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    
    // Calculate BUP (retirement date)
    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP_TAHUN)
                .withDayOfMonth(1)
                .plusMonths(1);
    }
    
    @Override
    public double hitungTunjangan() {
        // 1% x masa kerja (tahun) x gaji pokok
        return 0.01 * hitungMasaKerja().getYears() * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan        : Tenaga Kependidikan");
        System.out.println("Bidang         : " + bidang);
        System.out.println("BUP            : " + formatTanggal(hitungBUP()));
        
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan      : 1% x " + hitungMasaKerja().getYears() + 
                          " x Rp " + String.format("%,.2f", gajiPokok) + 
                          " = Rp. " + String.format("%,.2f", tunjangan));
    }
}