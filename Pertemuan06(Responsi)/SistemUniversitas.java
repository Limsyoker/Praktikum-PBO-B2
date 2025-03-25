public class SistemUniversitas {
    public static void main(String[] args){
       Fakultas fti = new Fakultas("Fakultas Teknologi Informasi", 15_000_000, 10_000_000);
       Fakultas feb = new Fakultas("Fakultas Ekonomi dan Bisnis", 12_000_000, 8_000_000);

       Mahasiswa mahasiswa1 = new Mahasiswa("Raja Samuel", "raja@example.com", "2301001", 3, fti);
       Mahasiswa mahasiswa2 = new Mahasiswa("Gracia Tiffany", "gracia@example.com", "2301029", 5, feb);

       Dosen dosen1 = new Dosen("Dr. Kartika Wijaya", "kartika@example.com", "D001", 5, fti);
       Dosen dosen2 = new Dosen("Prof. La Labiru", "lalabiru@example.com", "D002", 10, feb);

       TenagaPendidikan tendik1 = new TenagaPendidikan("Ki Kiru", "kiki@example.com", "T001", 3);
       TenagaPendidikan tendik2 = new TenagaPendidikan("Jae Jae", "jae@example.com", "T002", 7);

       System.out.println("==== Informasi Mahasiswa ====");
       mahasiswa1.tampilkanInformasi();
       System.out.println();
       mahasiswa2.tampilkanInformasi();

       System.out.println("\n==== Informasi Dosen ====");
       dosen1.tampilkanInformasi();
       System.out.println();
       dosen2.tampilkanInformasi();

       System.out.println("\n==== Informasi Tenaga Pendidikan ====");
       tendik1.tampilkanInformasi();
       System.out.println();
       tendik2.tampilkanInformasi();

       System.out.println("\n==== Statistik ====");
       System.out.println("Total Civitas Akademika : " + CivitasAkademika.getTotalCivitas());
       System.out.println("Total Mahasiswa : " + Mahasiswa.getTotalMahasiswa());
       System.out.println("Total Karyawan : " + Karyawan.getTotalKaryawan());
       System.out.println("Total Dosen : " + Dosen.getTotalDosen());
       System.out.println("Total Tenaga Pendidikan : " + TenagaPendidikan.getTotalTenagaPendidikan());        
    }
}
 
                                                                                                                                                                                          //