public class Persegi extends BangunDatar {
    private double sisi;
    
    // Konstruktor default
    public Persegi() {
        super();
        this.setJmlSisi(4); // Persegi memiliki 4 sisi
    }
    
    // Konstruktor berparameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }
    
    // Method untuk menghitung luas persegi
    public double hitungLuas() {
        return sisi * sisi;
    }
    
    // Method untuk menghitung keliling persegi
    public double hitungKeliling() {
        return 4 * sisi;
    }
    
    // Override method printInfo() dari superclass
    @Override
    public void printInfo() {
        System.out.println("Bangun Persegi");
        super.printInfo(); // Memanggil method printInfo() dari superclass
        System.out.println("Sisi: " + this.sisi);
        System.out.println("Luas: " + this.hitungLuas());
        System.out.println("Keliling: " + this.hitungKeliling());
    }
    
    // Getter dan setter
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}