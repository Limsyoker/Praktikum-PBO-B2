public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void printDosen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printDosen'");
    }

}
