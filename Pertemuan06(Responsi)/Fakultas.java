class Fakultas {
    private String namaFakultas;
    private double tarifUKT;
    private double gajiPokok;    

    public Fakultas(String namaFakultas, double tarifUKT, double gajiPokok){
        this.namaFakultas = namaFakultas;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNamaFakultas(){
        return namaFakultas;
    }

    public double getTarifUKT(){
        return tarifUKT;
    }

    public double gajiPokok(){
        return gajiPokok;
    }
}
