/* Nama File    : Main.java
 * Deskripsi    : Berisi main untuk menggunakan dan melibatkan atribut dan method dari kelas Garis
 * Pembuat      : Raja Samuel Tarigan
 * Tanggal      : 
*/ 

public class Main {
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Titik t3;
        Titik t4;
        
        t1 = new Titik();

        t2 = new Titik();

        t3 = new Titik();

        t4 = new Titik();

        t1.setAbsis(6);
        t1.setOrdinat(4);
        t2.setAbsis(1);
        t2.setOrdinat(2);
        t3.setAbsis(3);
        t3.setOrdinat(3);
        t4.setAbsis(2);
        t4.setOrdinat(1);

        int counterTitik = Titik.getCounterTitik();

        System.out.printf("Jumlah objek titik : %d\n", counterTitik);
        System.out.printf("Titik t1 dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());

        // Menghitung jarak dari titik ke pusat
        System.out.println("Jarak Titik 1 ke Pusat: " + t1.getJarakPusat());
        System.out.println("Jarak Titik 2 ke Pusat: " + t2.getJarakPusat());

        // Melakukan refleksi X pada titik
        t1.refleksiX();
        System.out.println("Titik 1 setelah refleksi X: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        // Melakukan refleksi Y pada titik
        t2.refleksiY();
        System.out.println("Titik 2 setelah refleksi Y: (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");

        // Mendapatkan refleksi X dan Y dalam bentuk objek baru
        Titik refleksiXTitik1 = t1.getRefleksiX();
        Titik refleksiYTitik2 = t2.getRefleksiY();

        // Menampilkan hasil refleksi
        System.out.println("Refleksi X dari Titik 1: (" + refleksiXTitik1.getAbsis() + ", " + refleksiXTitik1.getOrdinat() + ")");
        System.out.println("Refleksi Y dari Titik 2: (" + refleksiYTitik2.getAbsis() + ", " + refleksiYTitik2.getOrdinat() + ")");
        
        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik());

        Garis garis1 = new Garis(t1, t2);
        Garis garis2 = new Garis(t3, t4);

        // Menampilkan panjang garis
        System.out.println("Panjang Garis 1: " + garis1.getPanjang());
        System.out.println("Panjang Garis 2: " + garis2.getPanjang());

        // Menampilkan gradien garis
        System.out.println("Gradien Garis 1: " + garis1.getGradien());
        System.out.println("Gradien Garis 2: " + garis2.getGradien());

        // Menampilkan titik tengah garis
        Titik titikTengahG1 = garis1.getTitikTengah(t1, t2);
        Titik titikTengahG2 = garis2.getTitikTengah(t3, t4);

        System.out.println("\nTitik Tengah Garis 1: (" + titikTengahG1.getAbsis() + ", " + titikTengahG1.getOrdinat() + ")");
        System.out.println("Titik Tengah Garis 2: (" + titikTengahG2.getAbsis() + ", " + titikTengahG2.getOrdinat() + ")");

        //Menentukan apakah dua garis sejajar atau tidak
        boolean sejajar = garis1.isSejajar(garis2);
        System.out.println("\nGaris 1 dan Garis 2 " + (sejajar ? "sejajar" : "tidak sejajar"));

        // Menentukan apakah dua garis tegak lurus
        boolean tegakLurus = garis1.isTegakLurus(garis2);
        System.out.println("Garis 1 dan Garis 2 " + (tegakLurus ? "tegak lurus" : "tidak tegak lurus"));

        // Menampilkan titik-titik garis
        System.out.println("\n=== Garis 1 ===");
        garis1.tampilkanTitik();
        System.out.println("=== Garis 2 ===");
        garis2.tampilkanTitik();

        // Menampilkan persamaan garis
        System.out.println("\nPersamaan Garis 1: " + garis1.getPersamaanGaris(t1, t2));
        System.out.println("Persamaan Garis 2: " + garis2.getPersamaanGaris(t3, t4));

    }
}

