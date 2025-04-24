public class Bus extends Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price * 1.5f; // Asumsi harga bus lebih mahal karena lebih besar
        System.out.println("Harga sewa bus = " + fare);
    }
}