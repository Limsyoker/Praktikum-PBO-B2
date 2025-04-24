public class Main {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(3);
    }
}

/**
 * Output yang didapat dari eksekusi kode di atas adalah:
 * Now offline: Sally
 * Hasil ini didapatkan karena:
 * Ketika kode p.status(3) dijalankan, meskipun variabel p bertipe Person, 
 * objek yang sebenarnya adalah Student (karena p = new Student("Sally")). Saat method 
 * status() dipanggil, yang digunakan adalah method status() dari class Person karena method 
 * ini tidak di-override di class Student.
 * Di dalam method status(), terdapat pemanggilan this.isAsleep(hr). 
 * Kata kunci this pada saat runtime mengacu pada objek yang sebenarnya, yaitu objek Student. 
 * Inilah yang disebut dengan dynamic binding atau late binding. Jadi meskipun method status() milik class Person, 
 * ketika ada pemanggilan method lain di dalamnya (yaitu isAsleep()), yang digunakan adalah method dari objek sebenarnya.
 * Dalam kasus ini, isAsleep(3) milik Student yang dijalankan, bukan milik Person. Method isAsleep() di class Student mengembalikan true 
 * jika jam di antara 2 dan 8 (2 < hr && 8 > hr). Karena hr = 3, maka kondisi tersebut terpenuhi (true)java
*/ 