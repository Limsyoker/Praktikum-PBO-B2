import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        System.out.println("Output Polimorfisme Fun:");
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/**
 * Manfaat Polimorfismenya
 * 
 * Polimorfisme dalam kasus ini memberikan manfaat penting dengan memungkinkan berbagai jenis pegawai (Manajer dan Programmer) 
 * diperlakukan sebagai objek dari kelas induk yang sama (Pegawai), sehingga bisa disimpan dalam satu collection dan diproses 
 * menggunakan loop yang sama tanpa harus mengetahui tipe spesifik objek tersebut. Saat method tampilData() dipanggil, Java 
 * secara otomatis memilih implementasi yang sesuai berdasarkan tipe objek sebenarnya, menghasilkan output yang berbeda sesuai dengan 
 * karakteristik masing-masing kelas, membuat kode lebih ringkas, mudah dipelihara, dan fleksibel untuk pengembangan lebih lanjut seperti 
 * penambahan tipe pegawai baru tanpa perlu mengubah struktur utama program.
 * 
 * 
 * 
 * Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! 
 * Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
 * 
 * Jika program tidak menggunakan polimorfisme dan kita perlu menambahkan pegawai4 dan pegawai5, permasalahan yang akan muncul adalah
 * kompleksitas dan redundansi kode yang signifikan. Tanpa polimorfisme, kita tidak bisa memanfaatkan satu struktur data untuk menyimpan 
 * berbagai tipe pegawai, sehingga harus membuat variabel terpisah untuk setiap objek dan menangani setiap tipe secara eksplisit dengan 
 * banyak kode kondisional (if-else). Kita juga perlu mengetahui tipe dari setiap objek pegawai secara spesifik dan melakukan 
 * type casting ketika akan memanggil method khusus dari kelas turunan. Hal ini membuat kode sulit dikelola, rentan terhadap error, 
 * dan tidak efisien ketika program berkembang dengan penambahan tipe pegawai baru, karena setiap perubahan akan mengharuskan modifikasi
 * di banyak bagian kode.
 */