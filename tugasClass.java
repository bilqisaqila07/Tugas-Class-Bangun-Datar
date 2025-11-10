import java.nio.channels.Pipe.SourceChannel;

class Segitiga {
        private double alas;
        private double tinggi;
        private double sisiA, sisiB, sisiC;

        public Segitiga() {}

        public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC){
            this.alas=alas;
            this.tinggi = tinggi;
            this.sisiA= sisiA;
            this.sisiB= sisiB;
            this.sisiC= sisiC;
        }

        public double getAlas() {return alas;}
        public void setAlas(double alas) { this.alas = alas; }

        public double getTinggi() {return tinggi;}
        public void setTinggi(double tinggi) { this.tinggi = tinggi; }

        public double getSisiA() {return sisiA;}
        public void setSisiA(double sisiA) { this.sisiA = sisiA; }

        public double getSisiB() {return sisiB;}
        public void setSisiB(double sisiB) { this.sisiB = sisiB; }

        public double getLuas(){
            return 0.5*alas*tinggi;
        }

        public double getKeliling() {
            return sisiA + sisiB + sisiC;
        }
}

class Persegi{
    private double sisi;

    public Persegi(double sisi) {
        this.sisi=sisi;
    }

    public double getSisi() {return sisi; }
    public void setSisi(double sisi) {this.sisi = sisi; }

    public double getLuas() {
        return sisi*sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }
}

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double getjariJari() {return jariJari; }
    public void setjariJari(double jariJari) {this.jariJari = jariJari; }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI*jariJari;
    }
}

public class tugasClass{
    public static void main(String[] args){
    Segitiga sgt = new Segitiga(6, 4, 5, 6, 7);
    System.out.println("===Segitiga===");
    System.out.println("Luas: " +sgt.getLuas());
    System.out.println("Keliling: " +sgt.getKeliling());

    Persegi p = new Persegi(5);
    System.out.println("\n===Persegi===");
    System.out.println("Luas: " +p.getLuas());
    System.out.println("Keliling: " +p.getKeliling());

    Lingkaran l = new Lingkaran(7);
    System.out.println("\n===Lingkaran===");
     System.out.println("Luas: " +l.getLuas());
    System.out.println("Keliling: " +l.getKeliling());

    }
}
