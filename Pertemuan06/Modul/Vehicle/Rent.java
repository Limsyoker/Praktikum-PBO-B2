public class Rent {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
        
        System.out.println("\nDemonstrasi method hitungSewa:");
        hitungSewa(kendaraan);
        hitungSewa(mobil);
        hitungSewa(bis);
    }
    
    public static void hitungSewa(Vehicle v) {
        v.calRent(100, 500); 
    }
}

//Analisis Keuntungan Penggunaan Teknik Polimorfisme Inclusion

//Ketika kita membuat method hitungSewa(Vehicle v), 
//kita mendapatkan banyak manfaat dari polimorfisme inclusion. 
//Method ini bisa menerima semua jenis kendaraan, baik itu Vehicle biasa, Car, maupun Bus,
//tanpa perlu membuat method terpisah untuk masing-masing tipe. Yang menarik, method calRent() 
//yang dijalankan akan sesuai dengan jenis kendaraan sebenarnya, sehingga perhitungan sewa untuk 
//mobil akan berbeda dengan bus meskipun kita memanggil method yang sama. 
//Jika suatu saat kita ingin menambah jenis kendaraan baru seperti Motor, kita tidak perlu mengubah 
//method hitungSewa(). Pendekatan ini juga membuat kode kita lebih rapi dan 
//lebih mudah dikelola karena perubahan hanya perlu dilakukan di satu tempat, 
//bukan di banyak tempat berbeda.