class Mahasiswa extends CivitasAkademika{
    private static int totalMahasiswa = 0;
    private String nim;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas){
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        totalMahasiswa++;
    }

    public double hitungUKT(){
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    public static int getTotalMahasiswa(){
        return totalMahasiswa;
    }

    @Override
    public void tampilkanInformasi(){
        System.out.println("Informasi Mahasiswa :");
        System.out.println("Nama : " + nama);
        System.out.println("Email : " + email);
        System.out.println("NIM : " + nim);
        System.out.println("Semester : " + semester);
        System.out.println("Fakultas : " + fakultas);
        System.out.printf("Biaya UKT : Rp%.2f%n", hitungUKT());
    }
}
