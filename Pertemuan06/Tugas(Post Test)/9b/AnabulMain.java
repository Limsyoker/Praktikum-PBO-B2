import java.util.ArrayList;

public class AnabulMain {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Meow");
        Anabul anjing = new Anjing("Doggo");
        Anabul burung = new Burung("Tweety");
        
        ArrayList<Anabul> daftarAnabul = new ArrayList<>();
        daftarAnabul.add(kucing);
        daftarAnabul.add(anjing);
        daftarAnabul.add(burung);
        
        System.out.println("=== Simulasi Hewan Peliharaan ===");
        for (Anabul hewan : daftarAnabul) {
            System.out.println("\nNama: " + hewan.getNama());
            hewan.gerak();
            hewan.bersuara();
        }
    }
}