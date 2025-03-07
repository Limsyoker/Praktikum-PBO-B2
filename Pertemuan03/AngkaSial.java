public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//Masalah : 1.Baris 12 merujuk pada System.out.println(angka + "bukan angka sial");
//            Baris ini tidak akan dieksekusi ketika eksepsi terjadi. Saat angka==13 
//            kondisi terpenuhi, program akan melempar eksepsi AngkaSialException dan langsung
//            keluar dari metode cobaAngka() tanpa mengeksekusi baris selanjutnya. Eksekusi 
//            akan langsung melompat ke blok catch.
//          
//          2.Baris 21 sepertinya merujuk pada System.out.println("hati-hati memasukkan angka!!!"); 
//            di dalam blok catch. Baris ini akan dieksekusi. Ketika eksepsi terjadi 
//            saat memanggil as.cobaAngka(13), eksepsi AngkaSialException ditangkap oleh blok catch, 
//            lalu program mengeksekusi semua pernyataan dalam blok catch, 
//            termasuk baris 21 yang menampilkan pesan "hati-hati memasukkan angka!!!".