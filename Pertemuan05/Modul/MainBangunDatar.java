/**
 * Filename: MainBangunDatar.java
 * Description: Main class to test BangunDatar, Persegi, and Lingkaran
 * Author: Raja Samuel Tarigan
 * Date: April 22, 2025
 */

 public class MainBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); // This will cause error since BangunDatar is abstract
        
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);
        
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Keliling P1: " + P1.getKeliling());
        
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling P2: " + P2.getKeliling());
        
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Keliling L1: " + L1.getKeliling());
        
        System.out.println("Luas L2: " + L2.getLuas());
        System.out.println("Keliling L2: " + L2.getKeliling());
        
        // Checking equality of area and perimeter
        System.out.println("P1 equal luas with P2? " + P1.isEqualLuas(P2));
        System.out.println("P1 equal keliling with P2? " + P1.isEqualKeliling(P2));
        
        System.out.println("L1 equal luas with L2? " + L1.isEqualLuas(L2));
        System.out.println("L1 equal keliling with L2? " + L1.isEqualKeliling(L2));
        
        // Comparing different shapes
        System.out.println("P1 equal luas with L1? " + P1.isEqualLuas(L1));
        System.out.println("P1 equal keliling with L1? " + P1.isEqualKeliling(L1));
        
        // Testing IResize interface
        System.out.println("\nTesting IResize Interface:");
        System.out.println("P2 sisi before: " + P2.getSisi());
        P2.zoomIn();
        System.out.println("P2 sisi after zoomIn: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("P2 sisi after zoomOut: " + P2.getSisi());
        P2.zoom(2.0);
        System.out.println("P2 sisi after zoom(2.0): " + P2.getSisi());
        
        System.out.println("L2 jariJari before: " + L2.getJariJari());
        L2.zoomIn();
        System.out.println("L2 jariJari after zoomIn: " + L2.getJariJari());
        L2.zoomOut();
        System.out.println("L2 jariJari after zoomOut: " + L2.getJariJari());
        L2.zoom(2.0);
        System.out.println("L2 jariJari after zoom(2.0): " + L2.getJariJari());
    }
}