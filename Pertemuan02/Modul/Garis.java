/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam kelas Garis denfan melibatkan Titik
 * Pembuat      : Raja Samuel Tarigan
 * Tanggal      : 
*/ 

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }
    
    public double getPanjang(){
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAkhir.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getGradien(){
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAkhir.getOrdinat();
        if (deltaX != 0){
            return (double) deltaX/deltaY;
        }
        else{
            return 0;
        }
    }

    public Titik getTitikTengah(Titik titikAwal, Titik titikAkhir){
        double xMid = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yMid = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xMid, yMid);    
    }

    public boolean isSejajar(Garis G) {
        double gradien1 = this.getGradien();
        double gradienG = G.getGradien();
        return gradien1 == gradienG;
    }
    
    public boolean isTegakLurus(Garis G){
        double gradien1 = this.getGradien();
        double gradienG = G.getGradien();
        return gradien1 * gradienG == -1;
    }
    
    public void tampilkanTitik(){
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    public String getPersamaanGaris(Titik titikAwal, Titik titikAkhir) {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        
        if (deltaX == 0) {
            return "x = " + titikAwal.getAbsis(); // Persamaan garis vertikal
        }

        double m = deltaY / deltaX;
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        String hasil = "y = ";

        if (m == 1){
            hasil += "x";
        }
        else if (m == -1){
            hasil += "-x";
        }
        else {
            hasil += m + "x";
        }

        if (c > 0){
            hasil += " + " + c;
        }
        else if (c < 0){
            hasil += " - " + Math.abs(c);
        }

        return hasil;
    }
}

