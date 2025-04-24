public class Anabul {
    private String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void gerak() {
        System.out.println(nama + " bergerak");
    }
    
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara");
    }
}