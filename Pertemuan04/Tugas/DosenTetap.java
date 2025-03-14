import java.time.LocalDate;

/**
 * Kelas DosenTetap
 * Deskripsi: Kelas untuk jenis pegawai dosen tetap
 * Tanggal: 14 Maret 2025
 */
public class DosenTetap extends Dosen {
    private String nidn;
    private static final int BUP_TAHUN = 65;
    
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, 
                      LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }
    
    // Calculate BUP (retirement date)
    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP_TAHUN)
                .withDayOfMonth(1)
                .plusMonths(1);
    }
    
    @Override
    public double hitungTunjangan() {
        // 2% x masa kerja (tahun) x gaji pokok
        return 0.02 * hitungMasaKerja().getYears() * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN           : " + nidn);
        System.out.println("Jabatan        : Dosen Tetap");
        System.out.println("BUP            : " + formatTanggal(hitungBUP()));
        
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan      : 2% x " + hitungMasaKerja().getYears() + 
                          " x Rp " + String.format("%,.2f", gajiPokok) + 
                          " = Rp. " + String.format("%,.2f", tunjangan));
    }
}