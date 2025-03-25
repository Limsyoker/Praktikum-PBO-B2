class TenagaPendidikan extends Karyawan{
    private static int totalTenagaPendidikan = 0;

    public TenagaPendidikan(String nama, String email, String nip, int masaKerja){
        super(nama, email, nip, masaKerja);
        totalTenagaPendidikan++;
    }

    @Override
    public double hitungGaji(){
        return 4_000_000 * (1 +(masaKerja * 0.01));
    }

    public static int getTotalTenagaPendidikan(){
        return totalTenagaPendidikan;
    }

    @Override
    public void tampilkanInformasi(){
        System.out.println("Informasi Tenaga Pendidik : ");
        System.out.println("Nama : " + nama);
        System.out.println("Email : " + email);
        System.out.println("NIP : " + nip);
        System.out.println("Masa Kerja : " + masaKerja + " Tahun");
        System.out.printf("Gaji : Rp%.2f%n", hitungGaji());
    }
}
