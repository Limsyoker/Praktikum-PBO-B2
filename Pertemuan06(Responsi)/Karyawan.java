abstract class Karyawan extends CivitasAkademika{
    private static int totalKaryawan = 0;
    protected String nip;
    protected int masaKerja;

    public Karyawan(String nama, String email, String nip, int masaKerja){
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
        totalKaryawan++;
    }

    public static int getTotalKaryawan(){
        return totalKaryawan;
    }

    public abstract double hitungGaji();
}
