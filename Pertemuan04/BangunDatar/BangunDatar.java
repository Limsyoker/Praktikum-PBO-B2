/**
 * Kelas BangunDatar
 * Deskripsi: Kelas dasar untuk berbagai bentuk bangun datar
 * Tanggal: 14 Maret 2025
 */
public class BangunDatar {
    // Protected attributes
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0; // Static attribute for counting objects
    
    // Default constructor
    public BangunDatar() {
        this.jmlSisi = 0;
        this.warna = "Putih";
        this.border = "Hitam";
        counterBangunDatar++; // Increment counter when a new object is created
    }
    
    // Parameterized constructor
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++; // Increment counter when a new object is created
    }
    
    // Method to print information about the object
    public void printInfo() {
        System.out.println("Bangun datar dengan " + this.jmlSisi + " sisi");
        System.out.println("Warna: " + this.warna);
        System.out.println("Border: " + this.border);
    }
    
    // Static method to print the counter
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar yang telah dibuat: " + counterBangunDatar);
    }
    
    // Getter and setter methods
    public int getJmlSisi() {
        return jmlSisi;
    }
    
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getBorder() {
        return border;
    }
    
    public void setBorder(String border) {
        this.border = border;
    }
}