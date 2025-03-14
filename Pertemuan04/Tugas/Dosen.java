import java.time.LocalDate;

/**
 * Kelas Dosen
 * Deskripsi: Kelas abstrak untuk jenis pegawai dosen
 * Tanggal: 14 Maret 2025
 */
public abstract class Dosen extends Pegawai {
    protected String fakultas;
    
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas       : " + fakultas);
    }
} 
    

