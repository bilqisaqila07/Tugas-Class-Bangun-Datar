public class mainClass{
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