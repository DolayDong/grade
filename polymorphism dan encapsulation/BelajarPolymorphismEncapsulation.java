public class BelajarPolymorphism {

    public static void main(String[] args) {
        Pertambahan pertambahan = new Pertambahan();
        pertambahan.penjumlahan();
        pertambahan.penjumlahan(2, 2);
    }
}

class Pertambahan {
    // polymorphism(overloading) . kondisi dimana kita bisa memiliki 2 nama method
    // yang sama
    // dengan operasinya masing2.

    private int a = 5, b = 20; // encapsulation

    public void penjumlahan() {

        System.out.println("Hasil Pertambahann dari metod penjumlahan ke-1 = " + (a + b));
    }

    public void penjumlahan(int x, int y) {
        System.out.println("Hasil Pertambahann dari metod penjumlahan ke-2 = " + (x + y));

    }
}
