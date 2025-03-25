class Dosen extends Karyawan{
    private static int totalDosen = 0;
    private Fakultas fakultas;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas){
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        totalDosen++;
    }

    @Override
    public double hitungGaji(){
        return fakultas.gajiPokok() * (1 + (masaKerja * 0.01));
    }

    public static int getTotalDosen(){
        return totalDosen;
    }
    
    @Override
    public void tampilkanInformasi(){
        System.out.println("Informasi Dosen : ");
        System.out.println("Nama : " + nama);
        System.out.println("Email : " + email);
        System.out.println("NIP : " + nip);
        System.out.println("Masa Kerja : " + masaKerja + " Tahun");
        System.out.println("Fakultas : " + fakultas.getNamaFakultas());
        System.out.printf("Gaji : Rp%.2f%n", hitungGaji());
    }
}