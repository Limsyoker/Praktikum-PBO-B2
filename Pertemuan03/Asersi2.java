//class Lingkaran
    class Lingkaran {
        private double jariJari;
        public Lingkaran(double jariJari){
            this.jariJari = jariJari;
        }

        public double hitungKeliling(){
            double keliling = 2*Math.PI*jariJari;
            return keliling;
        }
    }

    //class Asersi2
    public class Asersi2{
        public static void main(String[] args){
            double jariJari = 0;
            assert(jariJari > 0):"jari jari tidak boleh nol!!!";
            Lingkaran l = new Lingkaran(jariJari);
            double kelilingLingkaran = l.hitungKeliling();
            System.out.println("keliling lingkaran = " + kelilingLingkaran);
        }
    }

//Masalah : Asersi seharusnya digunakan untuk memvalidasi asumsi dalam kode yang 
//          seharusnya selalu benar, bukan untuk menangani kesalahan input yang 
//          mungkin terjadi di program