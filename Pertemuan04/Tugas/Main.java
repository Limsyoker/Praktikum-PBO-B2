import java.time.LocalDate;

/**
 * Kelas Main
 * Deskripsi: Driver class untuk menguji sistem pegawai perguruan tinggi
 * Tanggal: 14 Maret 2025
 */
public class Main {
    public static void main(String[] args) {
        // Tanggal saat ini diasumsikan 10 Maret 2025 sesuai contoh
        // Buat objek dosen tetap seperti contoh
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548",
            "78647324",
            "Andi",
            LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1),
            5000000.0,
            "Fakultas Sains dan Matematika"
        );
        
        // Buat objek dosen tamu
        DosenTamu dosenTamu = new DosenTamu(
            "9545647549",
            "78647325",
            "Budi",
            LocalDate.of(1985, 8, 15),
            LocalDate.of(2020, 1, 1),
            4500000.0,
            "Fakultas Teknik",
            LocalDate.of(2026, 12, 31)
        );
        
        // Buat objek tendik
        Tendik tendik = new Tendik(
            "9545647550",
            "Citra",
            LocalDate.of(1988, 3, 22),
            LocalDate.of(2018, 6, 1),
            3500000.0,
            "Akademik"
        );
        
        // Tampilkan informasi semua pegawai
        System.out.println("===== INFORMASI DOSEN TETAP =====");
        dosenTetap.printInfo();
        
        System.out.println("\n===== INFORMASI DOSEN TAMU =====");
        dosenTamu.printInfo();
        
        System.out.println("\n===== INFORMASI TENDIK =====");
        tendik.printInfo();
    }
}