public class GanjilGenap {
    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);

        String hasil = nilai % 2 == 0 ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(nilai + " Adalah " + hasil);
    }
}