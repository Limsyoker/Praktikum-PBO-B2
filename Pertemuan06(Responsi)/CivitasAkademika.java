abstract class CivitasAkademika{
    private static int totalCivitas = 0;
    protected String nama;
    protected String email;

    public CivitasAkademika(String nama, String email){
        this.nama = nama;
        this.email = email;
        totalCivitas++;
    }

    public static int getTotalCivitas(){
        return totalCivitas;
    }

    public abstract void tampilkanInformasi();
}
